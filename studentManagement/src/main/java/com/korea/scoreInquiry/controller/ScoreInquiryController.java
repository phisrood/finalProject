package com.korea.scoreInquiry.controller;
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
public class ScoreInquiryController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체성적조회
	@RequestMapping(value="/stu/scoreListAll", method=RequestMethod.GET)
	public String scoreListAll(){
		String url="/stu/scoreListAll";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//현재 학기 성적조회
	@RequestMapping(value="/stu/scoreListNow", method=RequestMethod.GET)
	public String scoreListNow(){
		String url="/stu/scoreListNow";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과생 성적조회
	@RequestMapping(value="/pro/scoreListDepartment", method=RequestMethod.GET)
	public String scoreListDepartment(){
		String url="/pro/scoreListDepartment";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강생 성적조회
	@RequestMapping(value="/pro/scoreListPro", method=RequestMethod.GET)
	public String scoreListPro(){
		String url="";
		
		return url;
	}
}
