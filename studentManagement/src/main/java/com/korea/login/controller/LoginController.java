package com.korea.login.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 로그인 컨트롤러
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	한돈희        		최초생성
 *    2016.09.06.   한돈희                  개발완료
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import java.io.IOException;
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import com.korea.period.service.PeriodService;
import com.korea.security.SecurityProcess;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@Autowired
	private MessageService messageService;
	
	@Autowired
	private NoticeService noticeService;
	
	@Autowired
	private IndivInfoManageService indivInfoManageService;
	
	@Autowired
	private PeriodService periodService;
	
	/**
	 * 메인실행 로그인폼
	 * @param session
	 * @return String
	 */
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
	 * 메인화면이동
	 * @param session, model
	 * @return String
	 */
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
	 * 로그아웃
	 * @param session
	 * @return String
	 */
	@RequestMapping(value="/common/logout")
	public String logout(HttpSession session){
		String url="redirect:/common/loginForm";
		
		if(session != null){
			session.invalidate();
		}
		
		return url;
	}
	/**
	 * 로그인 프로세스
	 * @param session
	 * @return String
	 * @throws IOException
	 */
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
		Period period = periodService.getPeriodAll();	
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
	 * 비밀번호찾기 폼이동
	 * @return String 
	 */
	@RequestMapping(value="/common/pwdSearchForm")
	public String pwdSearchForm(){
		String url="/common/searchPwd";
		
		return url;
	}
	/**
	 * 비밀번호찾기 이메일 구현
	 * @param id, birth, response, model
	 * @return String
	 * @throws IOException
	 */
	@RequestMapping(value="/common/pwdSearch", method=RequestMethod.POST)
	public String pwdSearch(@RequestParam(value="id", defaultValue="")String id,
							@RequestParam(value="birth", defaultValue="")String birth, HttpServletResponse response, Model model) throws IOException{
		String url="/common/searchPwd";
		int index = service.updateLoginPwdSearch(id, birth);
		
		model.addAttribute("index", index);
		
		return url;
	}
	
	/**
	 * 에러페이지
	 * @return String
	 */
	@RequestMapping(value="/common/error")
	public String error(){
		String url="/error";
		
		return url;
	}
	
	/**
	 * 로그인에러페이지
	 * @return String
	 */
	@RequestMapping(value="/common/login_error")
	public String login_error(){
		String url="/login_error";
		
		return url;
	}
	
	/**
	 * 접근권한에러페이지
	 * @return String
	 */
	@RequestMapping(value="/common/auth_error")
	public String auth_error(){
		String url="/auth_error";
		
		return url;
	}
	
	/**
	 * 로그인체크
	 * @param id, pwd, response
	 * @return void
	 */
	@RequestMapping(value="/common/loginCheck")
	public void loginCheck(@RequestParam(value="use_id")String id, @RequestParam(value="use_pwd")String pwd,
							HttpServletResponse response){
		String message = "";
		SecurityProcess sp = new SecurityProcess();
		String encPwd = "";
		try {
			encPwd = sp.encrypt(pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.setContentType("text/html; charset=UTF-8;");
		Map<String, String> checkMap = new HashMap<String, String>();
		checkMap.put("id", id);
		checkMap.put("pwd", encPwd);
		
		UsersVO loginUser = service.getLoginCheck(checkMap);
		
		if(loginUser == null){
			message = "error";
		}else{
			message = "success";
		}
		
		Map<String, String> loginCheck = new HashMap<String, String>();
		loginCheck.put("message", message);
		loginCheck.put("encPwd", encPwd);
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(loginCheck);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
		
	}
}
