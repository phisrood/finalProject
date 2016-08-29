package com.korea.cyberCam.qnaBBS.controller;
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
public class CyberCamQnaBBSController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 리스트
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSList","/cyberCampus/pro/qnaBBSList"}, method=RequestMethod.GET)
	public String qnaBBSList(){
		String url="/cyberCampus/common/qnaBBSList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 상세보기
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSDetail","/cyberCampus/pro/qnaBBSDetail"}, method=RequestMethod.GET)
	public String qnaBBSDetail(){
		String url = "/cyberCampus/common/qnaBBSDetail";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 등록
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSInsert","/cyberCampus/pro/qnaBBSInsert"}, method=RequestMethod.GET)
	public String qnaBBSInsert(){
		String url="/cyberCampus/common/qnaBBSInsert";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판삭제
	@RequestMapping(value="/common/qnaBBSDelete", method=RequestMethod.GET)
	public String qnaBBSDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판수정
	@RequestMapping(value="/common/qnaBBSUpdate", method=RequestMethod.GET)
	public String qnaBBSUpdate(){
		String url="";
		
		return url;
	}
}
