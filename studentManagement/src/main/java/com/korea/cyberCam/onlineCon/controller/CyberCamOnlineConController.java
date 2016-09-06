package com.korea.cyberCam.onlineCon.controller;
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
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.korea.cyberCam.onlineCon.service.CyberCamOnlineConService;
import com.korea.dto.Online_ContentsVO;

@Controller
public class CyberCamOnlineConController {
	
	@Autowired
	CyberCamOnlineConService cyberCamOnlineConService;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 등록
	@RequestMapping(value="/pro/onlineConReg", method=RequestMethod.POST)
	public String onlineConReg(Online_ContentsVO onlineContentsVO,HttpServletRequest request){
		String url = "/cyberCampus/pro/onlineConList";
		cyberCamOnlineConService.insertOnlineCon(onlineContentsVO);
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/onlineContentsAF");
		
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 수정
	@RequestMapping(value="/pro/onlineConUpdate", method=RequestMethod.GET)
	public String onlineConUpdate(){
		String url = "";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 삭제
	@RequestMapping(value="/pro/onlineConDelete", method=RequestMethod.GET)
	public String onlineConDelete(){
		String url = "";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 조회(학생)
	@RequestMapping(value={"/cyberCampus/stu/onlineConList"}, method=RequestMethod.GET)
	public String onlineConListStu(){
		String url = "/cyberCampus/stu/onlineConList";
		
		return url;
	}
	

	//온라인콘텐츠 조회(학과)
	@RequestMapping(value={"/cyberCampus/pro/onlineConList"}, method=RequestMethod.GET)
	public String onlineConListPro(){
		String url = "/cyberCampus/pro/onlineConList";
		
		return url;
	}
	
	//온라인콘텐츠 진도체크
	//온라인콘텐츠 학습기한
}
