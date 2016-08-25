package com.korea.certificate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public String attendCertificateInfo(){
		String url="";
		
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
		String url="";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//성적증명서 출력
	@RequestMapping(value="/stu/gradeCertificateInfoPDF", method=RequestMethod.GET)
	public String gradeCertificateInfoPDF(){
		String url="";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//졸업증명서 조회
	@RequestMapping(value="/stu/graduteCertificateInfo", method=RequestMethod.GET)
	public String graduteCertificateInfo(){
		String url="";
		
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
