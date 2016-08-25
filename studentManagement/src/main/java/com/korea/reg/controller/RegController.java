package com.korea.reg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegController {

	//학생 등록 내역 조회
	@RequestMapping(value="/stu/regList", method=RequestMethod.GET)
	public String regList(){
		String url="";
		
		return url;
	}
	
	//재적생 등록 현황 조회
	@RequestMapping(value="/emp/regExpelList")
	public String a(){
		String url="";
		
		return url;
	}
	
	//등록금 납부처리(excel로 일괄,개별처리)
	@RequestMapping(value="/emp/regHandle")
	public String regHandle(){
		String url="";
		
		return url;
	}
	
	//등록금 고지서 pdf 출력
	@RequestMapping(value="/emp/regModelPDF")
	public String regModelPDF(){
		String url="";
		
		return url;
	}
	
}
