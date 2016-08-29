package com.korea.login.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.dto.UsersVO;
import com.korea.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;

	//메인실행 로그인폼
	@RequestMapping(value="/common/loginForm")
	public String loginForm(){
		String url = "/common/loginForm";
		
		return url;
	}
	
	//메인
	@RequestMapping({"/stu/main","/pro/main","/emp/main"})
	public String main(){
		String url ="/common/main";
				
		return url;
	}
	
	//로그아웃
	@RequestMapping(value="/common/logout")
	public String logout(HttpSession session){
		String url="redirect:/common/loginForm";
		
		if(session != null){
			session.invalidate();
		}
		
		return url;
	}
	
	//로그인 액터별 화면분기
	@RequestMapping(value="/common/login")
	public String login(HttpSession session) throws IOException{
		String url = "redirect:/common/login_error";
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UsersVO usersVO = null;
		
		String id = auth.getName();
		
		usersVO = service.getLoginInfo(id);
			
		session.setAttribute("loginUser", usersVO);
		if(usersVO.getUse_kind().equals("student")){
			url="redirect:/stu/main";
		}else if(usersVO.getUse_kind().equals("professor")){
			url="redirect:/pro/main";
		}else if(usersVO.getUse_kind().equals("employee")){
			url="redirect:/emp/main";
		}
		
		
		
		return url;
	}
	
	//비밀번호찾기 이메일 구현
	@RequestMapping(value="/common/pwdSearch")
	public String pwdSearch(){
		String url="/common/searchPwd";
		
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
}
