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
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.MessageVO;
import com.korea.dto.Professor_InfoViewVO;
import com.korea.dto.School_PersonInfoViewVO;
import com.korea.dto.School_PersonVO;
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
		
		//개인정보아이디
		String id = usersVO.getUse_id();
		//권한
		String authority = usersVO.getAuthority();
		
		Student_InfoViewVO studentInfo = null;
		Professor_InfoViewVO professorInfo = null;
		School_PersonInfoViewVO employeeInfo = null;
		
		List<MessageVO> messageNewList = null;
		List<Colleage_NoticeVO> noticeNewList = null;
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
		
		
		model.addAttribute("messageNewList", messageNewList);
		model.addAttribute("noticeNewList", noticeNewList);
		model.addAttribute("loginUser", usersVO);
		model.addAttribute("studentInfo",studentInfo );
		model.addAttribute("professorInfo",professorInfo );
		model.addAttribute("employeeInfo",employeeInfo );
		
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
			
		//session에 넣고
		session.setAttribute("loginUser", usersVO);
		
		//화면분기
		if(usersVO.getUse_kind().equals("student")){
			url="redirect:/stu/main";
		}else if(usersVO.getUse_kind().equals("professor")){
			url="redirect:/pro/main";
		}else if(usersVO.getUse_kind().equals("employee")){
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
							@RequestParam(value="birth", defaultValue="")String birth){
		String url="redirect:/common/loginForm";
		service.updateLoginPwdSearch(id, birth);
		
		
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
}
