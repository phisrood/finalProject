package com.korea.notice.controller;
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
public class NoticeController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 게시판 리스트 Select 최신 20개만
	@RequestMapping(value="/stu/noticeNewList", method=RequestMethod.GET)
	public String noticeNewList(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 미리보기 Select
	@RequestMapping(value="/stu/noticeInfo", method=RequestMethod.POST)
	public String noticeContentInfo(){
		String url="";
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 더보기 url Select 제이쿼리구현/페이징
	@RequestMapping(value={"/stu/noticeAllList","/pro/noticeAllList","/emp/noticeAllList"}, method=RequestMethod.GET)
	public String noticeAllList(){
		String url="/common/noticeAllList";
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 디테일
	@RequestMapping(value={"/stu/noticeDetail","/pro/noticeDetail"}, method=RequestMethod.GET)
	public String noticeDetail(){
		String url="/common/noticeDetail";
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 조회 Select
	@RequestMapping(value="/stu/noticeInquiry", method=RequestMethod.POST)
	public String noticeInquiry(){
		String url="";
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 수정
	@RequestMapping(value="/emp/noticeUpdate", method=RequestMethod.POST)
	public String noticeUpdate(){
		String url="";
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 삭제
	@RequestMapping(value="/emp/noticeDelete", method=RequestMethod.POST)
	public String noticeDelete(){
		String url="";
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항 등록 + 파일첨부
	@RequestMapping(value="/emp/noticeInsert", method=RequestMethod.POST)
	public String noticeInsert(){
		String url="/emp/noticeInsert";
		
		//파일첨부 구현
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//파일다운로드
	@RequestMapping(value="/stu/noticeFileDown", method=RequestMethod.GET)
	public String noticeFileDown(){
		String url="";
		
		return url;
	}
	
	
	
}
