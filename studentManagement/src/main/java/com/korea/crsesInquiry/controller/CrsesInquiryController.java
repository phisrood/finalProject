package com.korea.crsesInquiry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrsesInquiryController {

	//현재학기 수강내역조회
	@RequestMapping(value="/stu/crsesInquiryList", method=RequestMethod.GET)
	public String crsesInquiryList(){
		String url="";
		
		return url;
	}
	
	//강의계획서 열람 ClassSYL 패키지 강의계획서 조회
	
	@RequestMapping(value="/stu/cyberCamMove", method=RequestMethod.GET)
	public String cyberCamMove(){
		String url="";
		
		return url;
	}

	
	
}
