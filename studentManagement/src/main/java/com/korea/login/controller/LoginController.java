package com.korea.login.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.MessageVO;
import com.korea.dto.Period;
import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.UsersVO;
import com.korea.indivInfoManage.service.IndivInfoManageService;
import com.korea.login.service.LoginService;
import com.korea.message.service.MessageService;
import com.korea.notice.service.NoticeService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@Autowired
	MessageService messageService;
	
	@Autowired
	NoticeService noticeService;
	
	@Autowired
	IndivInfoManageService indivInfoManageService;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 0
	 * @throws 
	 */
	//메인실행 로그인폼
	@RequestMapping(value="/common/loginForm")
	public String loginForm(HttpSession session){
		String url = "/error";
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		
		//로그인이 되어있으면 로그인폼 못감.
		if(usersVO != null){
			if(usersVO.getUse_kind().equals("student")){
				url="redirect:/stu/main";
			}else if(usersVO.getUse_kind().equals("professor")){
				url="redirect:/pro/main";
			}else if(usersVO.getUse_kind().equals("employee")){
				url="redirect:/emp/main";
			}
		}else{
			url = "/common/loginForm";
		}
		
		
		return url;
	}
	/**
	 * 메인화면
	 * @param
	 * @return 
	 * @throws 
	 */
	//메인
	@SuppressWarnings("unused")
	@RequestMapping({"/stu/main","/pro/main","/emp/main"})
	public String main(HttpSession session, Model model){
		String url ="/common/main";

		//세션정보
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String id = null;
		String authority = null;
		Student_InfoViewVO studentInfo = null;
		Professor_InfoViewVO professorInfo = null;
		School_PersonInfoViewVO employeeInfo = null;
		
		List<MessageVO> messageNewList = null;
		List<Colleage_NoticeVO> noticeNewList = null;
		int messageCount = 0;
		try {
			//개인정보아이디
			id = usersVO.getUse_id();
			//권한
			authority = usersVO.getAuthority();
			
			if(usersVO != null){
				//메인 로딩될때 메시지 리스트 출력
				messageNewList = messageService.getMessageNewList(usersVO);
				//메인 로딩될때 공지사항 리스트 출력
				noticeNewList = noticeService.getNoticeNewList();
				if(authority.equals("ROLE_STU")){
					studentInfo = indivInfoManageService.getIndivInfo(id);				
				}else if(authority.equals("ROLE_PRO")){
					professorInfo = service.getProdivInfo(id);
				}else if(authority.equals("ROLE_EMP")){
					employeeInfo = service.getEmpdivInfo(id);
				}
			}else{
				url = "redirect:/common/loginForm";
			}
			
			messageCount = messageNewList.size();
		} catch (Exception e) {
			e.printStackTrace();
			url = "redirect:/common/loginForm";
		}
		
		model.addAttribute("messageNewList", messageNewList);
		model.addAttribute("noticeNewList", noticeNewList);
		model.addAttribute("loginUser", usersVO);
		session.setAttribute("studentInfo", studentInfo);
		session.setAttribute("professorInfo", professorInfo);
		session.setAttribute("employeeInfo", employeeInfo);
		session.setAttribute("messageCount", messageCount);
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//로그아웃
	@RequestMapping(value="/common/logout")
	public String logout(HttpSession session){
		String url="redirect:/common/loginForm";
		
		if(session != null){
			session.invalidate();
		}
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//로그인 액터별 화면분기
	@RequestMapping(value="/common/login")
	public String login(HttpSession session) throws IOException{
		String url = "redirect:/common/login_error";
		
		//로그인되고
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UsersVO usersVO = new UsersVO();
		
		//id 가져와서
		String id = auth.getName();
		
		//usersVO에 접속정보담고
		usersVO = service.getLoginInfo(id);
		Period period = service.getPeriodAll();	
		//session에 넣고
		session.setAttribute("loginUser", usersVO);
		session.setAttribute("period", period);
		//화면분기
		if(usersVO.getAuthority().equals("ROLE_STU")){
			url="redirect:/stu/main";
		}else if(usersVO.getAuthority().equals("ROLE_PRO")){
			url="redirect:/pro/main";
		}else if(usersVO.getAuthority().equals("ROLE_EMP")){
			url="redirect:/emp/main";
		}
		
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//비밀번호찾기 폼
	@RequestMapping(value="/common/pwdSearchForm")
	public String pwdSearchForm(){
		String url="/common/searchPwd";
		
		return url;
	}
	
	//비밀번호찾기 이메일 구현
	@RequestMapping(value="/common/pwdSearch", method=RequestMethod.POST)
	public String pwdSearch(@RequestParam(value="id", defaultValue="")String id,
							@RequestParam(value="birth", defaultValue="")String birth, HttpServletResponse response) throws IOException{
		String url="/common/loginForm";
		int index = service.updateLoginPwdSearch(id, birth);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(index == 0){
			//아이디 학생 8자리 교수 7자리 행정 6자리의 만족을 일치하지 않음
		     out.println("<script type='text/javascript'>");
		     out.println("alert('[학번불일치]학번을 올바르게 작성해주세요.');");
		     out.println("history.back();");
		     out.println("</script>");
		     out.flush();
		}else if(index == 1){
			//아이디와 생년월일에 일치하는 회원이 없음
			out.println("<script type='text/javascript'>");
			out.println("alert('[학번/이메일 불일치]아이디와 생년월일에 일치하는 회원정보가 없습니다.');");
			out.println("history.back();");
			out.println("</script>");
			out.flush();
			url="/common/searchPwd";
		}else if(index == 2){
			//임시비밀번호 초기화 완료
			out.println("<script type='text/javascript'>");
			out.println("alert('임시비밀번호로 초기화가 완료되었습니다.');");
			out.println("</script>");
			out.flush();
		}else if(index ==3){
			//이메일 잘못됨
			out.println("<script type='text/javascript'>");
			out.println("alert('이메일정보가 잘못되었습니다. 학사팀으로 연락해주세요.(042-000-0000)');");
			out.println("history.back();");
			out.println("</script>");
			out.flush();
		}
		
		
		return url;
	}
	
	//에러
	@RequestMapping(value="/common/error")
	public String error(){
		String url="/error";
		
		return url;
	}
	
	//로그인에러
	@RequestMapping(value="/common/login_error")
	public String login_error(){
		String url="/login_error";
		
		return url;
	}
	//접근권한에러
	@RequestMapping(value="/common/auth_error")
	public String auth_error(){
		String url="/auth_error";
		
		return url;
	}
	
	@RequestMapping(value="/common/loginCheck")
	@ResponseBody
	public String loginCheck(@RequestParam(value="use_id")String id, @RequestParam(value="use_pwd")String pwd,
							HttpServletResponse response){
		String message = "";
		response.setContentType("text/html; charset=UTF-8;");
		Map<String, String> checkMap = new HashMap<String, String>();
		checkMap.put("id", id);
		checkMap.put("pwd", pwd);
		
		UsersVO loginUser = service.getLoginCheck(checkMap);
		
		if(loginUser == null){
			message = "error";
		}else{
			message = "success";
		}
		
		return message;
	}
}
