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
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//메인실행 로그인폼
	@RequestMapping(value="/common/loginForm")
	public String loginForm(){
		String url = "/common/loginForm";
		
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
	public String login(@RequestParam(value="id", defaultValue="")String id,
						@RequestParam(value="password", defaultValue="")String password,
						HttpSession session) throws IOException{
		String url = "";
		
		TestVO loginUser = service.getLoginInfo(id);
		if(loginUser == null){
			url = "redirect:/common/loginForm";
		}else if(id.equals("1234567")){
			session.setAttribute("loginUser", loginUser);
			url= "redirect:/pro/main";
		}else if(id.equals("123456")){
			session.setAttribute("loginUser", loginUser);
			url= "redirect:/emp/main";
		}else{
			session.setAttribute("loginUser", loginUser);
			url= "redirect:/stu/main";
		}
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//비밀번호찾기 이메일 구현
	@RequestMapping(value="/common/pwdSearch")
	public String pwdSearch(){
		String url="/common/searchPwd";
		
		return url;
	}
}
