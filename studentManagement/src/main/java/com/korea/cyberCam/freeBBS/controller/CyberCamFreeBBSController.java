package com.korea.cyberCam.freeBBS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamFreeBBSController {

	//자유게시판 리스트
	@RequestMapping(value="/common/freeBBSList", method=RequestMethod.GET)
	public String freeBBSList(){
		String url="";
		
		return url;
	}
	//자유게시판 상세보기
	@RequestMapping(value="/common/freeBBSDetail", method=RequestMethod.GET)
	public String freeBBSDetail(){
		String url = "";
		
		return url;
	}
	
	//자유게시판 등록
	@RequestMapping(value="/common/freeBBSInsert", method=RequestMethod.GET)
	public String freeBBSInsert(){
		String url="";
		
		return url;
	}
	//자유게시판삭제
	@RequestMapping(value="/common/freeBBSDelete", method=RequestMethod.GET)
	public String freeBBSDelete(){
		String url="";
		
		return url;
	}
	//자유게시판수정
	@RequestMapping(value="/common/freeBBSUpdate", method=RequestMethod.GET)
	public String freeBBSUpdate(){
		String url="";
		
		return url;
	}
	
	//답글 등록
	@RequestMapping(value="/pro/freeBBSReplyReg", method=RequestMethod.GET)
	public String freeBBSReplyReg(){
		String url="";
		
		return url;
	}
	
	//답글 삭제
	@RequestMapping(value="/pro/freeBBSReplyDelete", method=RequestMethod.GET)
	public String freeBBSReplyDelete(){
		String url="";
		
		return url;
	}
	
	//답글 수정
	@RequestMapping(value="/pro/freeBBSReplyUpdate", method=RequestMethod.GET)
	public String freeBBSReplyUpdate(){
		String url="";
		
		return url;
	}
}
