package com.korea.classApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.classApp.service.ClassAppService;
import com.korea.dto.Appraisal_ManageVO;
/**
 * @Class Name : ClassAppController.java
 * @Description : 수업평가 관련 컨트롤러
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일			수정자          수정내용
 *    -------      -------     -------------------
 *   2016.09.05		김양문		평가문항 조회
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class ClassAppController {
	
	@Autowired
	private ClassAppService classAppService;
	/**
	 * 수업평가 항목 관리
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 항목 등록
	@RequestMapping(value="/emp/classAppInsert", method=RequestMethod.GET)
	public String classAppInsertPage(Model model){
		String url="/emp/classAppInsert";
		List<Appraisal_ManageVO> appList= classAppService.getClassAppList();
		model.addAttribute("appraisalList", appList);
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 조회
	@RequestMapping(value="/pro/classAppList", method=RequestMethod.GET)
	public String classAppProList(){
		String url="";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 통계
	@RequestMapping(value="/pro/classAppStat", method=RequestMethod.GET)
	public String classAppProStat(){
		String url="/pro/classAppStat";
		
		return url;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	@RequestMapping(value="/stu/classAppInput", method=RequestMethod.GET)
	public String classAppInput(){
		String url="/stu/classAppInput";
		
		return url;
	}
}
