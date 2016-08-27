package com.korea.cyberCam.commonController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamMainController {
	
	//사이버캠퍼스 메인
	@RequestMapping(value={"/cyberCampus/stu/cyberClassMain","/cyberCampus/pro/cyberClassMain"}, method=RequestMethod.GET)
	public String cyberClassMainByPro(){
		String url="/cyberCampus/common/cyberClassMain";
		
		return url;
	}
	//
	
}
