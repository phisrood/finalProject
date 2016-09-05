package com.korea.cyberCam.task.controller;
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
public class CyberCamTaskController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제등록
	@RequestMapping(value="/pro/taskReg", method=RequestMethod.GET)
	public String taskReg(){
		String url = "";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제제출
	@RequestMapping(value="/stu/taskSubmit", method=RequestMethod.GET)
	public String taskSubmit(){
		String url = "";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제제출리스트(학생)
	@RequestMapping(value="/cyberCampus/stu/taskSubmitList", method=RequestMethod.GET)
	public String taskSubmitList(){
		String url = "cyberCampus/stu/taskSubmitList";
		
		return url;
	}
	
	//과제제출리스트(학과)
	@RequestMapping(value="/cyberCampus/pro/taskSubmitList", method=RequestMethod.GET)
	public String taskSubmitListPro(){
		String url = "cyberCampus/pro/taskSubmitList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제수정
	@RequestMapping(value="/stu/taskUpdate", method=RequestMethod.GET)
	public String taskUpdate(){
		String url ="";
		
		return url;
	}
}
