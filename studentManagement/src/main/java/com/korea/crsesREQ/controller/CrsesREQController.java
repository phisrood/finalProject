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

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.UsersVO;

@Controller
public class CrsesREQController {
	/**
	 * 수강리스트조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/crses/stu/crsesList", method=RequestMethod.GET)
	public String crsesList(){
		String url="/stu/crsesList";
		
		return url;
	}
	/**
	 * 수강검색
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/crses/stu/crsesSearch", method=RequestMethod.GET)
	public String crsesSearch(){
		String url="";
		
		return url;
	}
	/**
	 * 수강신청
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/crses/stu/crsesREQ", method=RequestMethod.GET)
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
	public String crsesLogin(HttpSession session, @RequestParam("id")String id, @RequestParam("pwd")String pwd){
		String url="redirect:/crses/stu/crsesREQ";
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String chkId = null;
		String chkPwd = null;
		try {
			chkId = usersVO.getUse_id();
			chkPwd = usersVO.getUse_pwd();
			
		} catch (Exception e) {
			url="redirect:/common/loginForm";
		}
		
		if(id.equals(chkId)&&pwd.equals(chkPwd)){
			System.out.println("일치");
		}else{
			System.out.println("불일치");
		}
		
		return url;
	}
	/**
	 * 수강신청취소
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/crses/stu/crsesDelete", method=RequestMethod.GET)
	public String crsesDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 수강신청한리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/crses/stu/crsesREQList", method=RequestMethod.GET)
	public String crsesREQList(){
		String url="";
		
		return url;
	}
	/**
	 * 수강시간표 조회(중복배제)
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/crses/stu/crsesREQTimeTablePDF", method=RequestMethod.GET)
	public String crsesREQTimeTablePDF(){
		String url="";
		
		return url;
	}
	/**
	 * 수강신청기간설정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/crsesREQPeriod", method=RequestMethod.GET)
	public String crsesREQPeriod(){
		String url="";
		
		return url;
	}
	/**
	 * 수강신청기간예외페이지
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/stu/crsesREQPeriodError", method=RequestMethod.GET)
	public String crsesREQPeriodError(){
		String url="/stu/crsesREQPeriodError";
		
		return url;
	}

	

	
	
}
