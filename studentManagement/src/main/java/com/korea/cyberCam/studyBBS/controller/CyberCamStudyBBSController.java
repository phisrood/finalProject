package com.korea.cyberCam.studyBBS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CyberCamStudyBBSController {

	//학습게시판 리스트
	@RequestMapping(value="/common/studyBBSList", method=RequestMethod.GET)
	public String studyBBSList(){
		String url="";
		
		return url;
	}
	//학습게시판 상세보기
	@RequestMapping(value="/common/studyBBSDetail", method=RequestMethod.GET)
	public String studyBBSDetail(){
		String url = "";
		
		return url;
	}
	
	//학습게시판 등록
	@RequestMapping(value="/common/studyBBSInsert", method=RequestMethod.GET)
	public String studyBBSInsert(){
		String url="";
		
		return url;
	}
	//학습게시판삭제
	@RequestMapping(value="/common/studyBBSDelete", method=RequestMethod.GET)
	public String studyBBSDelete(){
		String url="";
		
		return url;
	}
	//학습게시판수정
	@RequestMapping(value="/common/studyBBSUpdate", method=RequestMethod.GET)
	public String studyBBSUpdate(){
		String url="";
		
		return url;
	}
	
	//학습게시판 파일다운로드
	@RequestMapping(value="/common/studyBBSFileDown", method=RequestMethod.GET)
	public String studyBBSFileDown(){
		String url ="";
		
		return url;
	}
}
