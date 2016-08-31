package com.korea.crsesBook.controller;
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
public class CrsesBookController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람조회
	@RequestMapping(value="/stu/crsesBookList", method=RequestMethod.GET)
	public String crsesBookList(){
		String url="/stu/crsesBookList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람등록
	@RequestMapping(value="/pro/crsesBookInsert", method=RequestMethod.GET)
	public String crsesBookInsert(){
		String url="/pro/crsesBookInsert";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람수정
	@RequestMapping(value="/pro/crsesBookUpdate", method=RequestMethod.GET)
	public String crsesBookUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강편람승인/반려
	@RequestMapping(value="/emp/crsesBookDecide", method=RequestMethod.GET)
	public String crsesBookDecide(){
		String url="/emp/crsesBookDecide";
		
		return url;
	}
}
