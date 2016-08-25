package com.korea.colleageManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ColleageManageController {

	// 휴/복학 신청양식 출력
	@RequestMapping(value="/stu/schoolReModel", method=RequestMethod.GET)
	public String schoolReModel(){
		String url = "";
		
		
		return url;
	}
	
	// 휴/복학 신청
	@RequestMapping(value="/stu/schoolReREQ", method=RequestMethod.GET)
	public String schoolReREQ(){
		String url="";
		
		return url;
	}
	
	// 휴/복학 신청내역조회
	@RequestMapping(value="/emp/schoolReREQList", method=RequestMethod.GET)
	public String schoolReREQList(){
		String url="";
		
		return url;
	}
	
	// 휴/복학 신청승인/반려
	@RequestMapping(value="/emp/schoolReREQDecide", method=RequestMethod.GET)
	public String schoolReREQDecide(){
		String url="";
		
		return url;
	}
	
	
}
