package com.korea.certificate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CertificateController {

	//세션으로 학생정보 가져오기
	@RequestMapping(value="/stu/stuInfo", method=RequestMethod.GET)
	public String stuInfo(){
		String url = "";
		
		return url;
	}
	
	//재학증명서 조회
	@RequestMapping(value="/stu/attendCertificateInfo", method=RequestMethod.GET)
	public String attendCertificateInfo(){
		String url="";
		
		return url;
	}
	
	//재학증명서 출력
	@RequestMapping(value="/stu/attendCertificateInfoPDF", method=RequestMethod.GET)
	public String attendCertificateInfoPDF(){
		String url="";
		
		return url;
	}
	
	//성적증명서 조회
	@RequestMapping(value="/stu/gradeCertificateInfo", method=RequestMethod.GET)
	public String gradeCertificateInfo(){
		String url="";
		
		return url;
	}
	
	//성적증명서 출력
	@RequestMapping(value="/stu/gradeCertificateInfoPDF", method=RequestMethod.GET)
	public String gradeCertificateInfoPDF(){
		String url="";
		
		return url;
	}
	
	//졸업증명서 조회
	@RequestMapping(value="/stu/graduteCertificateInfo", method=RequestMethod.GET)
	public String graduteCertificateInfo(){
		String url="";
		
		return url;
	}
	
	//졸업증명서 출력
	@RequestMapping(value="/stu/graduteCertificateInfoPDF", method=RequestMethod.GET)
	public String graduteCertificateInfoPDF(){
		String url="";
		
		return url;
	}
}
