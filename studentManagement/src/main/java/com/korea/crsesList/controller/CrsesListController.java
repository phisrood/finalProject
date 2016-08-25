package com.korea.crsesList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrsesListController {

	//수강명단조회
	@RequestMapping(value="pro/CrsesList", method=RequestMethod.GET)
	public String crsesList(){
		String url="";
		
		return url;
	}
}
