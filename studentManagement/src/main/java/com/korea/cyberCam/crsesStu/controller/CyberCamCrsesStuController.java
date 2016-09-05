package com.korea.cyberCam.crsesStu.controller;
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
public class CyberCamCrsesStuController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강생조회
	@RequestMapping(value={"/cyberCampus/stu/cyberCrsesStuList","/cyberCampus/pro/cyberCrsesStuList"}, method=RequestMethod.GET)
	public String cyberCrsesStuList(){
		String url="cyberCampus/stu/cyberCrsesStuList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//출석관리
	@RequestMapping(value={"/cyberCampus/stu/cyberCrsesStuAttend","/cyberCampus/pro/cyberCrsesStuAttend"}, method=RequestMethod.GET)
	public String cyberCrsesStuAttend(){
		String url="cyberCampus/common/cyberCrsesStuAttend";
		
		return url;
	}
}
