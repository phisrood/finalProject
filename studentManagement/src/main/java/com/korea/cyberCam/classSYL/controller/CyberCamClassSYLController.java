package com.korea.cyberCam.classSYL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamClassSYLController {
	
	//강의계획서 조회
	@RequestMapping(value="stu/cyberClassSYLInfo", method=RequestMethod.GET)
	public String cyberClassSYLInfo(){
		String url="";
		
		return url;
	}
}
