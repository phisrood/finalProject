package com.korea.acadeCal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AcadeCalController {

	//학사일정 조회
	@RequestMapping(value={"/stu/acadeCalList","/emp/acadeCalList","/pro/acadeCalList"}, method=RequestMethod.GET)
	public String acadeCalList(){
		String url="/common/acadeCalList";
		
		return url;
	}
	//학사일정 등록
	@RequestMapping(value="/emp/acadeCalInsert", method=RequestMethod.GET)
	public String acadeCalInsert(){
		String url="";
		
		return url;
	}
	//학사일정 수정
	@RequestMapping(value="/emp/acadeCalUpdate", method=RequestMethod.GET)
	public String acadeCalUpdate(){
		String url="";
		
		return url;
	}
	//학사일정 삭제
	@RequestMapping(value="/emp/acadeCalDelete", method=RequestMethod.GET)
	public String acadeCalDelete(){
		String url="";
		
		return url;
	}
	
	//학사일정 상세보기
	@RequestMapping(value="/common/acadeDetail", method=RequestMethod.GET)
	public String acadeCalDetail(){
		String url="";
		
		return url;
	}
	
	
	
}
