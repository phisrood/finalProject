package com.korea.graduRequire.controller;
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
public class GraduRequireController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업요건불러오기
	@RequestMapping(value="/pro/graduRequireInfo", method=RequestMethod.GET)
	public String graduRequireInfo(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업요건등록
	@RequestMapping(value="/pro/graduRequireInfoInsert", method=RequestMethod.GET)
	public String graduRequireInfoInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업요건승인/반려
	@RequestMapping(value="/emp/graduRequireDecide", method=RequestMethod.GET)
	public String graduRequireDecide(){
		String url="";
		
		return url;
	}
}
