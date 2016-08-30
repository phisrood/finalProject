package com.korea.reg.controller;
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학생 등록 내역 조회
	@RequestMapping(value="/stu/regList", method=RequestMethod.GET)
	public String regList(){
		String url="/stu/regList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//재적생 등록 현황 조회
	@RequestMapping(value="/emp/regExpelList")
	public String a(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//등록금 납부처리(excel로 일괄,개별처리)
	@RequestMapping(value="/emp/regHandle")
	public String regHandle(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//등록금 고지서 pdf 출력
	@RequestMapping(value="/emp/regModelPDF")
	public String regModelPDF(){
		String url="";
		
		return url;
	}
	
}
