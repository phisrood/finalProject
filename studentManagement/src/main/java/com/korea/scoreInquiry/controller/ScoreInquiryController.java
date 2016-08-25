package com.korea.scoreInquiry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScoreInquiryController {

	//전체성적조회
	@RequestMapping(value="/stu/scoreListAll", method=RequestMethod.GET)
	public String scoreListAll(){
		String url="";
		
		return url;
	}
	
	//현재 학기 성적조회
	@RequestMapping(value="/stu/scoreListNow", method=RequestMethod.GET)
	public String scoreListNow(){
		String url="";
		
		return url;
	}
	
	//학과생 성적조회
	@RequestMapping(value="/pro/scoreListDepartment", method=RequestMethod.GET)
	public String scoreListDepartment(){
		String url="";
		
		return url;
	}
	
	//수강생 성적조회
	@RequestMapping(value="/pro/scoreListPro", method=RequestMethod.GET)
	public String scoreListPro(){
		String url="";
		
		return url;
	}
}
