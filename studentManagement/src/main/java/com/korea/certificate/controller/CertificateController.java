package com.korea.certificate.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.certificate.service.CertificateService;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.TimeTableViewVO;
import com.korea.dto.UsersVO;
/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class CertificateController {
	@Autowired
	private CertificateService certificateService;
	
	
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//세션으로 학생정보 가져오기
	@RequestMapping(value="/stu/stuInfo", method=RequestMethod.GET)
	public String stuInfo(){
		String url = "";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//재학증명서 조회
	@RequestMapping(value="/stu/attendCertificateInfo", method=RequestMethod.GET)
	public String attendCertificateInfo(HttpSession session, Model model){
		String url="/stu/attendCertificate";
		
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String id = user.getUse_id();
		System.out.println(id);
		Student_InfoViewVO student_InfoViewVO =  certificateService.getStuAttendInfo(id);
		model.addAttribute("Student_InfoViewVO", student_InfoViewVO);
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//재학증명서 출력
	@RequestMapping(value="/stu/attendCertificateInfoPDF", method=RequestMethod.GET)
	public String attendCertificateInfoPDF(){
		String url="";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//성적증명서 조회
	@RequestMapping(value="/stu/gradeCertificateInfo", method=RequestMethod.GET)
	public String gradeCertificateInfo(){
		String url="/stu/gradeCertificate";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */

	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업증명서 조회
	@RequestMapping(value="/stu/graduteCertificateInfo", method=RequestMethod.GET)
	public String graduteCertificateInfo(){
		String url="/stu/graduteCertificate";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업증명서 출력
	@RequestMapping(value="/stu/graduteCertificateInfoPDF", method=RequestMethod.GET)
	public String graduteCertificateInfoPDF(){
		String url="";
		
		return url;
	}
}
