package com.korea.cyberCam.onlineCon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamOnlineConController {

	//온라인콘텐츠 등록
	@RequestMapping(value="/pro/onlineConReg", method=RequestMethod.GET)
	public String onlineConReg(){
		String url = "";
		
		return url;
	}
	
	//온라인콘텐츠 수정
	@RequestMapping(value="/pro/onlineConUpdate", method=RequestMethod.GET)
	public String onlineConUpdate(){
		String url = "";
		
		return url;
	}
	
	//온라인콘텐츠 삭제
	@RequestMapping(value="/pro/onlineConDelete", method=RequestMethod.GET)
	public String onlineConDelete(){
		String url = "";
		
		return url;
	}
	
	//온라인콘텐츠 조회
	@RequestMapping(value="/cyberCampus/stu/onlineConList", method=RequestMethod.GET)
	public String onlineConList(){
		String url = "/cyberCampus/stu/onlineConList";
		
		return url;
	}
	
	//온라인콘텐츠 진도체크
	//온라인콘텐츠 학습기한
}
