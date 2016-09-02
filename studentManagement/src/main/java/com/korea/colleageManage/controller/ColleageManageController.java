package com.korea.colleageManage.controller;
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
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColleageManageController {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청양식 출력
	
	
	@RequestMapping(value="/stu/schoolReModel", method=RequestMethod.GET)
	public String schoolReModel(){
		String url = "/stu/schoolReModel";
		
		return url;
	}
	

	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청
	@RequestMapping(value="/stu/schoolReREQ", method=RequestMethod.POST)
	public String schoolReREQ(HttpSession session, Model model, @RequestParam(value="ad_reqdate_start", defaultValue="")String ad_reqdate_start,
			@RequestParam(value="ad_reqdate_end", defaultValue="")String ad_reqdate_end){
		
		System.out.println(ad_reqdate_start+"@@@@@@@@@@@@@@@@@@");
//		int start = Integer.parseInt(request.getParameter("ad_regdate_start"));
//		System.out.println(start);
//		int end = Integer.parseInt(request.getParameter("ad_regdate_end"));
//		System.out.println(end);
		
		
		String url="redirect:/stu/schoolReModel";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청내역조회
	@RequestMapping(value="/emp/schoolReREQList", method=RequestMethod.GET)
	public String schoolReREQList(){
		String url="/emp/schoolReREQList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	// 휴/복학 신청승인/반려
	@RequestMapping(value="/emp/schoolReREQDecide", method=RequestMethod.GET)
	public String schoolReREQDecide(){
		String url="";
		
		return url;
	}
	
	
}
