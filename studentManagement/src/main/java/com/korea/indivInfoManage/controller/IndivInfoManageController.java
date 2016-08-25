package com.korea.indivInfoManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndivInfoManageController {
	
	//개인정보 조회
	@RequestMapping(value="/stu/indivInfo", method=RequestMethod.GET)
	public String indivInfo(){
		String url = "/stu/colleage/indivInfo";
		
		return url;
	}
	
	//개인정보 수정
	@RequestMapping(value="/stu/indivUpdate", method=RequestMethod.GET)
	public String indivUpdate(){
		String url = "";
		
		return url;
	}
	
	//학적변동현황
	@RequestMapping(value="/stu/colleageChangeList", method=RequestMethod.GET)
	public String colleageChangeList(){
		String url = "/stu/colleage/colleageChangeList";
		
		return url;
	}
}
