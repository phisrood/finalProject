package com.korea.cyberCam.classSYL.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamClassSYLController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//강의계획서 조회
	@RequestMapping(value={"/cyberCampus/stu/cyberClassSYLInfo","/cyberCampus/pro/cyberClassSYLInfo"}, method=RequestMethod.GET)
	public String cyberClassSYLInfo(){
		String url="cyberCampus/stu/lectureList";
		
		return url;
	}
}
