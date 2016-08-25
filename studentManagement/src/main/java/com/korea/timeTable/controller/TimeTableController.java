package com.korea.timeTable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TimeTableController {

	//수업시간표 조회
	@RequestMapping(value="/stu/timeTableList", method=RequestMethod.GET)
	public String timeTableList(){
		String url="";
		
		return url;
	}
	
	//수업시간표 출력(pdf)
	@RequestMapping(value="/stu/timeTablePDF", method=RequestMethod.GET)
	public String timeTablePDF(){
		String url="";
		
		return url;
	}
}
