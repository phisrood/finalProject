package com.korea.cyberCam.noticeBBS.controller;
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
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.dto.UsersVO;

@Controller
public class CyberCamNoticeBBSController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 리스트
	@RequestMapping(value="/cyberCampus/stu/cyberNoticeList", method=RequestMethod.GET)
	public String noticeBBSList(HttpSession session, Model model){
		
		String url="/cyberCampus/common/cyberNoticeList";
		
		UsersVO loginuser = (UsersVO) session.getAttribute("loginUser");
		String stuId = loginuser.getUse_id();
		// 사이버캠퍼스 이동시 CyberCamMainController 에 심어둔 lec_no를 가져온다.
		int stu_lec_no = (int) session.getAttribute("stu_lec_no");
		
		
		
		
		

	
		
		
		
		return url;
	}
	
	//공지사항게시판 리스트
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeList", method=RequestMethod.GET)
	public String noticeBBSListPro(){
		String url="/cyberCampus/common/cyberNoticeListPro";
		
		return url;
	}


	
	
	
	
	
	
	
	//공지사항게시판 상세보기
	@RequestMapping(value="/cyberCampus/stu/cyberNoticeDetail", method=RequestMethod.GET)
	public String noticeBBSDetail(){
		String url = "/cyberCampus/common/cyberNoticeDetail";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 등록
	@RequestMapping(value="/cyberCampus/emp/cyberNoticeInsert", method=RequestMethod.GET)
	public String noticeBBSInsert(){
		String url="/cyberCampus/emp/cyberNoticeInsert";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 삭제
	@RequestMapping(value="/cyberCampus/emp/cyberNoticeDelete", method=RequestMethod.GET)
	public String noticeBBSDelete(){
		String url="/cyberCampus/emp/cyberNoticeDelete";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판수정
	@RequestMapping(value="/cyberCampus/emp/cyberNoticeUpdate", method=RequestMethod.GET)
	public String noticeBBSUpdate(){
		String url="/cyberCampus/emp/cyberNoticeUpdate";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//파일다운로드
	@RequestMapping(value="/cyberCampus/common/cyberNoticeFileDown", method=RequestMethod.GET)
	public String noticeBBSFileDown(){
		String url="";
		
		return url;
	}
}
