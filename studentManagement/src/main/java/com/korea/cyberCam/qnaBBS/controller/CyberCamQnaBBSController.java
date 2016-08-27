package com.korea.cyberCam.qnaBBS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamQnaBBSController {

	//qna게시판 리스트
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSList","/cyberCampus/pro/qnaBBSList"}, method=RequestMethod.GET)
	public String qnaBBSList(){
		String url="/cyberCampus/common/qnaBBSList";
		
		return url;
	}
	//qna게시판 상세보기
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSDetail","/cyberCampus/pro/qnaBBSDetail"}, method=RequestMethod.GET)
	public String qnaBBSDetail(){
		String url = "/cyberCampus/common/qnaBBSDetail";
		
		return url;
	}
	
	//qna게시판 등록
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSInsert","/cyberCampus/pro/qnaBBSInsert"}, method=RequestMethod.GET)
	public String qnaBBSInsert(){
		String url="/cyberCampus/common/qnaBBSInsert";
		
		return url;
	}
	//qna게시판삭제
	@RequestMapping(value="/common/qnaBBSDelete", method=RequestMethod.GET)
	public String qnaBBSDelete(){
		String url="";
		
		return url;
	}
	//qna게시판수정
	@RequestMapping(value="/common/qnaBBSUpdate", method=RequestMethod.GET)
	public String qnaBBSUpdate(){
		String url="";
		
		return url;
	}
}
