package com.korea.period.controller;
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
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.dto.Period;
import com.korea.period.service.PeriodService;

@Controller
public class PeriodController  {
	@Autowired
	private PeriodService periodService;
	
	//공지사항 수정 폼이동
	@RequestMapping(value="/emp/periodSetting", method=RequestMethod.GET)
	public String periodPage(){
		String url="emp/periodSetting";

		return url;
	}
	@RequestMapping(value={"/stu/Notperiod","/pro/Notperiod","/emp/Notperiod"}, method=RequestMethod.GET)
	public String notPeriodPage(){
		String url="/common/Notperiod";
		
		return url;
	}
	//공지사항 수정 폼이동
	@RequestMapping(value="/emp/updateCrsesInquiryPeriod", method=RequestMethod.GET)
	public void updateCrsesInquiryPeriod(String state,HttpSession session,HttpServletResponse response){
		periodService.updateCrsesInquiryPeriod(state);
		getPeriodAll(session,response);
		
	}
	@RequestMapping(value="/emp/appLecturePeriod", method=RequestMethod.GET)
	public void appLecturePeriod(String state,HttpSession session,HttpServletResponse response){
		periodService.updateappLecturePeriod(state);
		getPeriodAll(session,response);
	}
	@RequestMapping(value="/emp/scoreSummary", method=RequestMethod.GET)
	public void scoreSummary(){
		periodService.updateScoreSummary();
	}
	@RequestMapping(value="/emp/majorReqPeriod", method=RequestMethod.GET)
	public void majorReqPeriod(String state,HttpSession session,HttpServletResponse response){
		periodService.updateMajorReqPeriod(state);
		getPeriodAll(session,response);
	}
	@RequestMapping(value="/stu/allPeriod", method=RequestMethod.GET)
	public void allPeriod(String state,HttpSession session,HttpServletResponse response){
		getPeriodAll(session,response);
	}

	public void getPeriodAll(HttpSession session,HttpServletResponse response){
		Period period = periodService.getPeriodAll();
		session.setAttribute("period", period);
		ObjectMapper json = new ObjectMapper();
		try {
			response.setContentType("text/json; charset=utf-8");
			response.getWriter().print(json.writeValueAsString(period));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
