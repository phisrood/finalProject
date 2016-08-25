package com.korea.classApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClassAppController {
	
	//수업평가 항목 등록
	@RequestMapping(value="/emp/classAppInsert", method=RequestMethod.GET)
	public String classAppInsert(){
		String url="";
		
		return url;
	}
	
	//수업평가 조회
	@RequestMapping(value="/pro/classAppList", method=RequestMethod.GET)
	public String classAppProList(){
		String url="";
		
		return url;
	}
	
	//수업평가 통계
	@RequestMapping(value="/pro/classAppStat", method=RequestMethod.GET)
	public String classAppProStat(){
		String url="";
		
		return url;
	}
	
	//수업평가 입력
	@RequestMapping(value="/stu/classAppInput", method=RequestMethod.GET)
	public String classAppInput(){
		String url="/stu/classAppInput";
		
		return url;
	}
}
