package com.korea.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NoticeController {
	
	//공지사항 게시판 리스트 Select 최신 20개만
	@RequestMapping(value="/stu/noticeNewList", method=RequestMethod.GET)
	public String noticeNewList(){
		String url="";
		
		return url;
	}
	
	//공지사항 미리보기 Select
	@RequestMapping(value="/stu/noticeInfo", method=RequestMethod.POST)
	public String noticeContentInfo(){
		String url="";
		
		
		return url;
	}
	
	//공지사항 더보기 url Select 제이쿼리구현/페이징, 학생화면
	@RequestMapping(value="/stu/noticeAllList", method=RequestMethod.GET)
	public String noticeAllList(){
		String url="/common/noticeAllList";
		
		
		return url;
	}
	
	//공지사항 디테일, 학생화면
	@RequestMapping(value="/stu/noticeDetail", method=RequestMethod.GET)
	public String noticeDetail(){
		String url="/common/noticeDetail";
		
		
		return url;
	}
	
	
	//공지사항 조회 Select
	@RequestMapping(value="/stu/noticeInquiry", method=RequestMethod.POST)
	public String noticeInquiry(){
		String url="";
		
		
		return url;
	}
	
	//공지사항 수정
	@RequestMapping(value="/stu/noticeUpdate", method=RequestMethod.POST)
	public String noticeUpdate(){
		String url="";
		
		
		return url;
	}
	
	//공지사항 삭제
	@RequestMapping(value="/stu/noticeDelete", method=RequestMethod.POST)
	public String noticeDelete(){
		String url="";
		
		
		return url;
	}
	
	//공지사항 등록 + 파일첨부
	@RequestMapping(value="/stu/noticeInsert", method=RequestMethod.POST)
	public String noticeInsert(){
		String url="";
		
		//파일첨부 구현
		
		return url;
	}
	
	//파일다운로드
	@RequestMapping(value="/stu/noticeFileDown", method=RequestMethod.GET)
	public String noticeFileDown(){
		String url="";
		
		return url;
	}
	
	
	
}
