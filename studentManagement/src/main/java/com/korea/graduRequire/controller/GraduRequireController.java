package com.korea.graduRequire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GraduRequireController {

	//졸업요건불러오기
	@RequestMapping(value="/pro/graduRequireInfo", method=RequestMethod.GET)
	public String graduRequireInfo(){
		String url="";
		
		return url;
	}
	
	//졸업요건등록
	@RequestMapping(value="/pro/graduRequireInfoInsert", method=RequestMethod.GET)
	public String graduRequireInfoInsert(){
		String url="";
		
		return url;
	}
	
	//졸업요건승인/반려
	@RequestMapping(value="/emp/graduRequireDecide", method=RequestMethod.GET)
	public String graduRequireDecide(){
		String url="";
		
		return url;
	}
}
