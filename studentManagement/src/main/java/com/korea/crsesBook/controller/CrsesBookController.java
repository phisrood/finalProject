package com.korea.crsesBook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrsesBookController {

	//수강편람조회
	@RequestMapping(value="/stu/crsesBookList", method=RequestMethod.GET)
	public String crsesBookList(){
		String url="/stu/crsesBookList";
		
		return url;
	}
	
	//수강편람등록
	@RequestMapping(value="/pro/crsesBookInsert", method=RequestMethod.GET)
	public String crsesBookInsert(){
		String url="/pro/crsesBookInsert";
		
		return url;
	}
	
	//수강편람수정
	@RequestMapping(value="/pro/crsesBookUpdate", method=RequestMethod.GET)
	public String crsesBookUpdate(){
		String url="";
		
		return url;
	}
	
	//수강편람승인/반려
	@RequestMapping(value="/emp/crsesBookDecide", method=RequestMethod.GET)
	public String crsesBookDecide(){
		String url="/emp/crsesBookDecide";
		
		return url;
	}
}
