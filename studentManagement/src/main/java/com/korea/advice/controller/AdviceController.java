package com.korea.advice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdviceController {

	//받은 상담 신청 조회(교수)
	@RequestMapping(value="/pro/adviceResponsList", method=RequestMethod.GET)
	public String adviceResponsList(){
		String url="";
		
		return url;
	}
	
	//보낸 상담 신청 조회(학생)
	@RequestMapping(value="/stu/adviceRequestList", method=RequestMethod.GET)
	public String adviceRequestList(){
		String url="";
		
		return url;
	}
	
	//상담신청
	@RequestMapping(value="/stu/adviceREQ", method=RequestMethod.GET)
	public String adviceREQ(){
		String url="";
		
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
	
	//상담 신청 삭제
	@RequestMapping(value="/stu/adviceREQUpdate", method=RequestMethod.GET)
	public String adviceREQUpdate(){
		String url="";
		
		return url;
	}
	
	////////////////////////////////화상상담추가//////////////////////////////
}
