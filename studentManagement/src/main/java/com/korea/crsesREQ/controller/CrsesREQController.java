package com.korea.crsesREQ.controller;
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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.UsersVO;

@Controller
public class CrsesREQController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강리스트 조회
	@RequestMapping(value="/stu/crsesList", method=RequestMethod.GET)
	public String crsesList(){
		String url="/stu/crsesList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강 검색
	@RequestMapping(value="/stu/crsesSearch", method=RequestMethod.GET)
	public String crsesSearch(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강 신청
	@RequestMapping(value="/stu/crsesREQ", method=RequestMethod.GET)
	public String crsesREQ(){
		String url="/stu/crsesREQ";
		
		return url;
	}
	/**
	 * 수강신청 로그인폼
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/crsesLoginForm", method=RequestMethod.GET)
	public String crsesLoginForm(){
		String url="/stu/crsesLogin";
		
		return url;
	}
	
	/**
	 * @throws IOException 
	 * 수강신청 로그인
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/crsesLogin", method=RequestMethod.POST)
	public String crsesLogin(HttpSession session, @RequestParam("id")String id, @RequestParam("pwd")String pwd,
			HttpServletResponse response) throws IOException{
		String url="/stu/crsesLogin";
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String chkId = null;
		String chkPwd = null;
		try {
			chkId = usersVO.getUse_id();
			chkPwd = usersVO.getUse_pwd();
			
		} catch (Exception e) {
			url="redirect:/common/loginForm";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		if(id.equals(chkId)&&pwd.equals(chkPwd)){
			
		}else{
			//여기 확인
			out.println("<script type='text/javascript'>");
			out.println("alert('학번/패스워드 불일치 다시 로그인해주세요'); location.href='/stu/crsesLoginForm';");
			out.println("</script>");
		}
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강 신청취소
	@RequestMapping(value="/stu/crsesDelete", method=RequestMethod.GET)
	public String crsesDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강 신청한 리스트조회
	@RequestMapping(value="/stu/crsesREQList", method=RequestMethod.GET)
	public String crsesREQList(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//신청한 수강시간표 조회(중복배제 service구현)
	@RequestMapping(value="/stu/crsesREQTimeTablePDF", method=RequestMethod.GET)
	public String crsesREQTimeTablePDF(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청 기간설정
	@RequestMapping(value="/emp/crsesREQPeriod", method=RequestMethod.GET)
	public String crsesREQPeriod(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강신청 기간설정
	@RequestMapping(value="/stu/crsesREQPeriodError", method=RequestMethod.GET)
	public String crsesREQPeriodError(){
		String url="/stu/crsesREQPeriodError";
		
		return url;
	}

	

	
	
}
