package com.korea.semesScore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SemesScoreController {

	//학기 성적반영(학기끝나면 현재학기성적 -> 전체성적 서비스구현)
	@RequestMapping(value="/emp/semesScore", method=RequestMethod.GET)
	public String semesScore(){
		String url="";
		
		return url;
	}
	
	//성적 입력
	@RequestMapping(value="/pro/scoreInput", method=RequestMethod.GET)
	public String scoreInput(){
		String url="/pro/scoreInput";
		
		return url;
	}
	
}
