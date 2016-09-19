package com.korea.scoreInquiry.controller;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.dto.ScoreViewVO;
import com.korea.dto.UsersVO;
import com.korea.scoreInquiry.service.ScoreInquiryService;

@Controller
public class ScoreInquiryController {
	
	@Autowired
	ScoreInquiryService service;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체성적조회
	@RequestMapping(value="/stu/scoreListAll", method=RequestMethod.GET)
	public String scoreListAll(HttpSession session,Model model){
		String url="/stu/scoreListAll";
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		Map<Object,Object> scoreMap = service.getScoreListAll(user.getUse_id());
		model.addAttribute("scoreMap", scoreMap);
		System.out.println(scoreMap.get("totalScore"));
		System.out.println(scoreMap.get("totalCredit"));
		System.out.println((scoreMap.get(((ArrayList)scoreMap.get("scoreList")).get(0))));
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//현재 학기 성적조회
	@RequestMapping(value="/stu/scoreListNow", method=RequestMethod.GET)
	public String scoreListNow(HttpSession session, Model model){
		String url="/stu/scoreListNow";
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();
		
		List<ScoreViewVO> scoreList = service.getScoreListNow(id);
		
		Map<String, Object> scoreInfo = service.getScoreCalcu(scoreList);
		
		model.addAttribute("scoreList", scoreList);
		model.addAttribute("scoreInfo", scoreInfo);
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과생 성적조회
	@RequestMapping(value="/pro/scoreListDepartment", method=RequestMethod.GET)
	public String scoreListDepartment(){
		String url="/pro/scoreListDepartment";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강생 성적조회
	@RequestMapping(value="/pro/scoreListPro", method=RequestMethod.GET)
	public String scoreListPro(){
		String url="";
		
		return url;
	}
}
