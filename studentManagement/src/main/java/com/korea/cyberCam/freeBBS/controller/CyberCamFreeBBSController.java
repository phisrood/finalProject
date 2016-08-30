package com.korea.cyberCam.freeBBS.controller;
/**
 * @Class Name : CyberCamFreeBBSController.java
 * @Description : 사이버 캠퍼스 자유 게시판 글 리스트 출력 / 등록 / 삭제 / 수정 / 상세보기 및 답글 등록 / 삭제 / 수정
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
public class CyberCamFreeBBSController {
	
	/**
	 * 사이버 캠퍼스 자유 게시판 글 리스트 출력
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value={"/cyberCampus/stu/freeBBSList","/cyberCampus/pro/freeBBSList"}, method=RequestMethod.GET)
	public String freeBBSList(){
		String url="/cyberCampus/common/freeBBSList";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 글 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value={"/cyberCampus/stu/freeBBSDetail","/cyberCampus/pro/freeBBSDetail"}, method=RequestMethod.GET)
	public String freeBBSDetail(){
		String url = "/cyberCampus/common/freeBBSDetail";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 글 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value={"/cyberCampus/stu/freeBBSInsert","/cyberCampus/pro/freeBBSInsert"}, method=RequestMethod.GET)
	public String freeBBSInsert(){
		String url="/cyberCampus/common/freeBBSInsert";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 글 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/common/freeBBSDelete", method=RequestMethod.GET)
	public String freeBBSDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 글 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/common/freeBBSUpdate", method=RequestMethod.GET)
	public String freeBBSUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 답글 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/pro/freeBBSReplyReg", method=RequestMethod.GET)
	public String freeBBSReplyReg(){
		String url="";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 답글 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/pro/freeBBSReplyDelete", method=RequestMethod.GET)
	public String freeBBSReplyDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 사이버 캠퍼스 자유 게시판 답글 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/pro/freeBBSReplyUpdate", method=RequestMethod.GET)
	public String freeBBSReplyUpdate(){
		String url="";
		
		return url;
	}
}
