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
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.korea.cyberCam.onlineCon.service.CyberCamOnlineConService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Online_ContentsVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamOnlineConController {
	
	@Autowired
	CyberCamOnlineConService cyberCamOnlineConService;
	
	/**
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//온라인콘텐츠 등록
	@RequestMapping(value="/pro/onlineConReg", method=RequestMethod.POST)
	public String onlineConReg(Online_ContentsVO onlineContentsVO,HttpServletRequest request) throws IllegalStateException, IOException {
		String url = "/cyberCampus/pro/onlineConList";
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/common/onlineContentsAF");
		MultipartFile multipartFile = onlineContentsVO.getFile();
		
		if(!multipartFile.isEmpty()){
			String aftername=System.currentTimeMillis()+multipartFile.getOriginalFilename();
			File file = new File(uploadPath,aftername);
			multipartFile.transferTo(file);
			Attachment_FileVO attachFileVO = new Attachment_FileVO();
			attachFileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachFileVO.setAf_aftername(aftername);
			attachFileVO.setAf_path(uploadPath);
			int oc_af_no = cyberCamOnlineConService.insertOnlineConFile(attachFileVO);
			onlineContentsVO.setOc_af_no(oc_af_no);
		}
		
		cyberCamOnlineConService.insertOnlineCon(onlineContentsVO);
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
	@RequestMapping(value={"/cyberCampus/common/onlineConList"})
	public String onlineConListStu(HttpSession session){
		String url = "/cyberCampus/common/onlineConList";
		String lec_no  =  (String) session.getAttribute("pro_lec_no");
		
		List<Online_ContentsVO> onlineConList =  cyberCamOnlineConService.getOnlineConList(lec_no);		
		
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
