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

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.UsersVO;
import com.korea.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
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
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//메인
	@RequestMapping({"/stu/main","/pro/main","/emp/main"})
	public String main(){
		String url ="/common/main";
				
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
		
		service.getLoginPwdSearch(id, birth);
		
		
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
