package com.korea.crsesREQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrsesREQController {

	//수강리스트 조회
	@RequestMapping(value="/stu/crsesList", method=RequestMethod.GET)
	public String crsesList(){
		String url="/stu/crsesList";
		
		return url;
	}
	
	//수강 검색
	@RequestMapping(value="/stu/crsesSearch", method=RequestMethod.GET)
	public String crsesSearch(){
		String url="";
		
		return url;
	}
	
	//수강 신청
	@RequestMapping(value="/stu/crsesREQ", method=RequestMethod.GET)
	public String crsesREQ(){
		String url="/stu/crsesREQ";
		
		return url;
	}
	
	//수강 신청 로그인
	@RequestMapping(value="/stu/crsesLogin", method=RequestMethod.GET)
	public String crsesLogin(){
		String url="/stu/crsesLogin";
		
		return url;
	}
	
	//수강 신청취소
	@RequestMapping(value="/stu/crsesDelete", method=RequestMethod.GET)
	public String crsesDelete(){
		String url="";
		
		return url;
	}
	
	//수강 신청한 리스트조회
	@RequestMapping(value="/stu/crsesREQList", method=RequestMethod.GET)
	public String crsesREQList(){
		String url="";
		
		return url;
	}
	
	//신청한 수강시간표 조회(중복배제 service구현)
	@RequestMapping(value="/stu/crsesREQTimeTablePDF", method=RequestMethod.GET)
	public String crsesREQTimeTablePDF(){
		String url="";
		
		return url;
	}
	
	//수강신청 기간설정
	@RequestMapping(value="/emp/crsesREQPeriod", method=RequestMethod.GET)
	public String crsesREQPeriod(){
		String url="";
		
		return url;
	}

	

	
	
}
