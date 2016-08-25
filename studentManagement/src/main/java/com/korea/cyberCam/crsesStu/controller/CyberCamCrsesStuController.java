package com.korea.cyberCam.crsesStu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamCrsesStuController {

	//수강생조회
	@RequestMapping(value="/pro/cyberCrsesStuList", method=RequestMethod.GET)
	public String cyberCrsesStuList(){
		String url="";
		
		return url;
	}
	
	//출석관리
	@RequestMapping(value="/pro/cyberCrsesStuAttend", method=RequestMethod.GET)
	public String cyberCrsesStuAttend(){
		String url="";
		
		return url;
	}
}
