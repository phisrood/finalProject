package com.korea.classSYL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClassSYLController {

	//강의계획서 등록
	@RequestMapping(value="/pro/classSYLInsert", method=RequestMethod.GET)
	public String classSYLInsert(){
		String url="";
		
		return url;
	}
	//강의계획서 수정
	@RequestMapping(value="/pro/classSYLUpdate", method=RequestMethod.GET)
	public String classSYLUpdate(){
		String url="";
		
		return url;
	}
	//강의계획서 삭제
	@RequestMapping(value="/pro/classSYLDelete", method=RequestMethod.GET)
	public String classSYLDelete(){
		String url="";
		
		return url;
	}
	//강의계획서 조회
	@RequestMapping(value="/pro/classSYLInfo", method=RequestMethod.GET)
	public String classSYLInfo(){
		String url="";
		
		return url;
	}
}
