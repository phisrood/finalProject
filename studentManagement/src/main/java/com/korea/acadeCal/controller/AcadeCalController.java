package com.korea.acadeCal.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.acadeCal.service.AcadeCalService;
import com.korea.dto.CalendarVO;
import com.korea.dto.Colleage_CalendarVO;
import com.korea.dto.MessageViewVO;
/**
 * @Class Name : AcadeCalController.java
 * @Description : 학사일정 관련 컨트롤러
 * @Modification Information
 * @author 
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
public class AcadeCalController {

	@Autowired
	AcadeCalService service;
	
	/**
	 * 학사일정 가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 조회
	@RequestMapping(value={"/stu/acadeCalList","/emp/acadeCalList","/pro/acadeCalList"}, method=RequestMethod.GET)
	public String acadeCalList(){
		String url="/common/acadeCalList2";
		
		return url;
	}
	//학사일정 조회 json
	@RequestMapping(value="/common/acadeCalAjax", method=RequestMethod.GET)
	public void acadeCalListAjax(HttpServletResponse response){
		
		List<Colleage_CalendarVO> acadeList = service.getAcadeCalList();
		List<CalendarVO> calendarList = new ArrayList<CalendarVO>();
		CalendarVO calendarVO = new CalendarVO();
		
		for (int i = 0; i < acadeList.size(); i++) {
			calendarVO.setId(acadeList.get(i).getCc_no());
			calendarVO.setTitle(acadeList.get(i).getCc_title());
			calendarVO.setContent(acadeList.get(i).getCc_content());
			calendarVO.setStart(acadeList.get(i).getCc_start_date());
			calendarVO.setEnd(acadeList.get(i).getCc_end_date());
			calendarList.add(calendarVO);
		}
		
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(calendarList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 학사일정 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 등록
	@RequestMapping(value="/emp/acadeCalInsert", method=RequestMethod.GET)
	public String acadeCalInsert(){
		String url="";
		
		return url;
	}
	/**
	 * 학사일정 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 수정
	@RequestMapping(value="/emp/acadeCalUpdate", method=RequestMethod.GET)
	public String acadeCalUpdate(){
		String url="";
		
		return url;
	}
	/**
	 * 학사일정 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 삭제
	@RequestMapping(value="/emp/acadeCalDelete", method=RequestMethod.GET)
	public String acadeCalDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 학사일정 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 상세보기
	@RequestMapping(value="/common/acadeDetail", method=RequestMethod.GET)
	public String acadeCalDetail(){
		String url="";
		
		return url;
	}
	
	
	
}
