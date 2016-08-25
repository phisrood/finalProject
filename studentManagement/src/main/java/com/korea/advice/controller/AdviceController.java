package com.korea.advice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdviceController {

	//받은 상담 신청 조회(교수)
	@RequestMapping(value="/pro/adviceResponsList", method=RequestMethod.GET)
	public String adviceResponsList(){
		String url="/pro/adviceResponsList";
		
		return url;
	}
	
	//보낸 상담 신청 조회(학생)
	@RequestMapping(value="/stu/adviceRequestList", method=RequestMethod.GET)
	public String adviceRequestList(){
		String url="/stu/adviceRequestList";
		
		return url;
	}
	
	//상담신청
	@RequestMapping(value="/stu/adviceREQ", method=RequestMethod.GET)
	public String adviceREQ(){
		String url="/stu/adviceREQ";
		
		return url;
	}
	
	//상담 답변
	@RequestMapping(value="/stu/adviceReply", method=RequestMethod.GET)
	public String adviceReply(){
		String url="";
		
		return url;
	}
	
	//상담 가능일자 입력
	@RequestMapping(value="/pro/adviceDate", method=RequestMethod.GET)
	public String adviceDate(){
		String url="";
		
		return url;
	}
		
	//상담 신청 삭제
	@RequestMapping(value="/stu/adviceREQDelete", method=RequestMethod.GET)
	public String adviceREQDelete(){
		String url="";
		
		return url;
	}
	
	//상담 게시판
	@RequestMapping(value="/stu/adviceBoard", method=RequestMethod.GET)
	public String adviceBoard(){
		String url="/common/adviceBoard";
		
		return url;
	}
	//상담 게시판 글 작성
	@RequestMapping(value="/stu/adviceBoardWrite", method=RequestMethod.GET)
	public String adviceBoardWrite(){
		String url="";
		
		return url;
	}
	//상담 게시판 답변 작성
	@RequestMapping(value="/stu/adviceBoardReply", method=RequestMethod.GET)
	public String adviceREQUpdate(){
		String url="";
		
		return url;
	}
	
	////////////////////////////////화상상담추가//////////////////////////////
	@RequestMapping(value="/stu/camAdvice", method=RequestMethod.GET)
	public String camAdvice(){
		String url="/stu/cam_advice";
		
		return url;
	}
	@RequestMapping(value="/stu/chatAdvice", method=RequestMethod.GET)
	public String chatAdvice(){
		String url="/stu/chat_advice";
		
		return url;
	}
}
