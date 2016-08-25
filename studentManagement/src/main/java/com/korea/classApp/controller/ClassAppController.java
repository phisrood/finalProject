package com.korea.classApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class ClassAppController {
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 항목 등록
	@RequestMapping(value="/emp/classAppInsert", method=RequestMethod.GET)
	public String classAppInsert(){
		String url="/emp/classAppInsert";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 조회
	@RequestMapping(value="/pro/classAppList", method=RequestMethod.GET)
	public String classAppProList(){
		String url="";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 통계
	@RequestMapping(value="/pro/classAppStat", method=RequestMethod.GET)
	public String classAppProStat(){
		String url="";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	@RequestMapping(value="/stu/classAppInput", method=RequestMethod.GET)
	public String classAppInput(){
		String url="/stu/classAppInput";
		
		return url;
	}
}
