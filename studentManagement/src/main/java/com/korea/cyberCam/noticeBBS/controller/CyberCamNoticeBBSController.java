package com.korea.cyberCam.noticeBBS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamNoticeBBSController {
	
	//공지사항게시판 리스트
	@RequestMapping(value={"/stu/cyberNoticeList","/pro/cyberNoticeList"}, method=RequestMethod.GET)
	public String noticeBBSList(){
		String url="/cyberCampus/common/cyberNoticeList";
		
		return url;
	}
	//공지사항게시판 상세보기
	@RequestMapping(value="/common/cyberNoticeDetail", method=RequestMethod.GET)
	public String noticeBBSDetail(){
		String url = "";
		
		return url;
	}
	
	//공지사항게시판 등록
	@RequestMapping(value="/common/cyberNoticeInsert", method=RequestMethod.GET)
	public String noticeBBSInsert(){
		String url="";
		
		return url;
	}
	//공지사항게시판 삭제
	@RequestMapping(value="/common/cyberNoticeDelete", method=RequestMethod.GET)
	public String noticeBBSDelete(){
		String url="";
		
		return url;
	}
	//공지사항게시판수정
	@RequestMapping(value="/common/cyberNoticeUpdate", method=RequestMethod.GET)
	public String noticeBBSUpdate(){
		String url="";
		
		return url;
	}
	
	//파일다운로드
	@RequestMapping(value="/common/cyberNoticeFileDown", method=RequestMethod.GET)
	public String noticeBBSFileDown(){
		String url="";
		
		return url;
	}
}
