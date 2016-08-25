package com.korea.acadeCal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @Class Name : AcadeCalController.java
 * @Description : 학사일정 관련 컨트롤러
 * @Modification Information
 * @author 
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
public class AcadeCalController {

	/**
	 * 학사일정 가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 조회
	@RequestMapping(value={"/stu/acadeCalList","/emp/acadeCalList","/pro/acadeCalList"}, method=RequestMethod.GET)
	public String acadeCalList(){
		String url="/common/acadeCalList";
		
		return url;
	}
	/**
	 * 학사일정 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 등록
	@RequestMapping(value="/emp/acadeCalInsert", method=RequestMethod.GET)
	public String acadeCalInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 학사일정 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 수정
	@RequestMapping(value="/emp/acadeCalUpdate", method=RequestMethod.GET)
	public String acadeCalUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 학사일정 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 삭제
	@RequestMapping(value="/emp/acadeCalDelete", method=RequestMethod.GET)
	public String acadeCalDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 학사일정 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 상세보기
	@RequestMapping(value="/common/acadeDetail", method=RequestMethod.GET)
	public String acadeCalDetail(){
		String url="";
		
		return url;
	}
	
	
	
}
