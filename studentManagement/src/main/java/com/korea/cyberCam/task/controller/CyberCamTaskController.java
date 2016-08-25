package com.korea.cyberCam.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamTaskController {

	//과제등록
	@RequestMapping(value="/pro/taskReg", method=RequestMethod.GET)
	public String taskReg(){
		String url = "";
		
		return url;
	}
	
	//과제제출
	@RequestMapping(value="/stu/taskSubmit", method=RequestMethod.GET)
	public String taskSubmit(){
		String url = "";
		
		return url;
	}
	
	//과제제출리스트
	@RequestMapping(value="/pro/taskSubmitList", method=RequestMethod.GET)
	public String taskSubmitList(){
		String url = "";
		
		return url;
	}
	
	//과제수정
	@RequestMapping(value="/stu/taskUpdate", method=RequestMethod.GET)
	public String taskUpdate(){
		String url ="";
		
		return url;
	}
}
