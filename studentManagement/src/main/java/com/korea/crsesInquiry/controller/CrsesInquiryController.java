package com.korea.crsesInquiry.controller;
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
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.crsesInquiry.service.CrsesInquiryService;
import com.korea.dto.Student_InquiryList_ViewVO;
import com.korea.dto.UsersVO;

@Controller
public class CrsesInquiryController {

	@Autowired
	CrsesInquiryService crsesInquiryService;
	
	
	
	
	//현재학기 수강내역조회
	@RequestMapping(value="/stu/crsesInquiryList", method=RequestMethod.GET)
	public String crsesInquiryList(HttpSession session, Model model){
		String url="/common/crsesList";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
	
		
		
		
		
		List<Student_InquiryList_ViewVO> student_InquiryList_ViewVO = crsesInquiryService.getCrsesInquiryList(stud_use_id);
		
		
		
		model.addAttribute("student_InquiryList_ViewVO",student_InquiryList_ViewVO);
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//강의계획서 열람 ClassSYL 패키지 강의계획서 조회
	
	@RequestMapping(value="/stu/cyberCamMove", method=RequestMethod.GET)
	public String cyberCamMove(){
		String url="";
		
		return url;
	}

	
	
}
