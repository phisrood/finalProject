package com.korea.acadeCal.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.acadeCal.service.AcadeCalService;
import com.korea.dto.CalendarVO;
import com.korea.dto.Colleage_CalendarVO;
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
	//학사일정 조회(행정)
	@RequestMapping(value="/emp/acadeCalList", method=RequestMethod.GET)
	public String acadeCalEmpList(){
		String url="/emp/acadeCalEmpList";
		
		return url;
	}
	//학사일정 조회(학생, 교수)
	@RequestMapping(value={"/stu/acadeCalList","/pro/acadeCalList"}, method=RequestMethod.GET)
	public String acadeCalList(){
		String url="/common/acadeCalList";
		
		return url;
	}
	/**
	 * 학사일정 json 리턴
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 조회 json
	@RequestMapping(value={"/emp/acadeCalAjax","/pro/acadeCalAjax","/stu/acadeCalAjax","/common/acadeCalAjax"}, method=RequestMethod.GET)
	public void acadeCalListAjax(HttpServletResponse response){
		
		List<Colleage_CalendarVO> acadeList = service.getAcadeCalList();
		List<CalendarVO> calendarList = new ArrayList<CalendarVO>();
		
		for (int i = 0; i < acadeList.size(); i++) {
			CalendarVO calendarVO = new CalendarVO();
			calendarVO.setId(acadeList.get(i).getCc_no());
			calendarVO.setTitle(acadeList.get(i).getCc_title());
			calendarVO.setContent(acadeList.get(i).getCc_content());
			calendarVO.setStart(acadeList.get(i).getCc_start_date());
			calendarVO.setEnd(acadeList.get(i).getCc_end_date());
			calendarList.add(i, calendarVO);
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
	@RequestMapping(value="/emp/acadeCalInsert", method=RequestMethod.GET)
	public void acadeCalInsertAjax(CalendarVO calendarVO, HttpServletResponse response){
		service.insertAcadeCal(calendarVO);
		
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(calendarVO);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}

	}

	/**
	 * 학사일정 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/acadeCalUpdate", method=RequestMethod.GET)
	public void acadeCalUpdate(CalendarVO calendarVO){
		service.updateAcadeCal(calendarVO);
		
	}
	/**
	 * 학사일정 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/acadeCalDelete", method=RequestMethod.GET)
	public void acadeCalDelete(@RequestParam(value="id")String id){
		service.deleteAcadeCal(id);
	}
	/**
	 * 학사일정 드랍업데이트
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/acadeCalDropUpdate", method=RequestMethod.GET)
	public void acadeCalDropUpdate(CalendarVO calendarVO){
		service.updateAcadeDropCal(calendarVO);
	}
	
	/**
	 * 학사일정 리사이즈 업데이트
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/acadeCalResizeUpdate", method=RequestMethod.GET)
	public void acadeCalResize(CalendarVO calendarVO){
		service.updateAcadeResizeCal(calendarVO);
	}
	
	
	
}
