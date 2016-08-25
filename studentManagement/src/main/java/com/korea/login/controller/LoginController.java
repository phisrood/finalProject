package com.korea.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.TestVO;
import com.korea.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;

	//메인실행 로그인폼
	@RequestMapping(value="/common/loginForm")
	public String loginForm(){
		String url = "loginForm";
		
		return url;
	}
	
	//메인
	@RequestMapping(value="/common/main")
	public String main(){
		String url ="main";
				
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
	public String login(@RequestParam(value="id", defaultValue="")String id,
						@RequestParam(value="password", defaultValue="")String password,
						HttpSession session) throws IOException{
		String url = "";
		
		TestVO loginUser = service.getLoginInfo(id);
		if(loginUser == null){
			url = "redirect:/common/loginForm";
		}else{
			session.setAttribute("loginUser", loginUser);
			url= "redirect:/common/main";
		}
		
		
		return url;
	}
	
	//비밀번호찾기 이메일 구현
	@RequestMapping(value="/common/pwdSearch")
	public String pwdSearch(){
		String url="searchPwd";
		
		return url;
	}
}
