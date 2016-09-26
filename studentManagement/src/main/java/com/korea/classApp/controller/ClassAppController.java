package com.korea.classApp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.classApp.service.ClassAppService;
import com.korea.dto.AppLecture_ViewVO;
import com.korea.dto.Appraisal_ManageVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Lecture_ChartVO;
import com.korea.dto.Lecture_Chart_ViewVO;
import com.korea.dto.UsersVO;
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
	@RequestMapping(value="/emp/classAppInsertForm", method=RequestMethod.GET)
	public String classAppInsertPage(Model model){
		String url="/emp/classAppInsert";
		
		return url;
	}
	/**
	 * 수업평가 항목 관리
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 항목 등록
	@RequestMapping(value="/emp/classAppInsert", method=RequestMethod.GET)
	public void classAppInsert(HttpServletResponse response, @RequestParam("content")String content){
		
		classAppService.insertClassApp(content);
		
		List<Appraisal_ManageVO> appList = classAppService.getClassAppList();
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(appList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 리스트 ajax
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/emp/classAppList", method=RequestMethod.GET)
	public void classAppList(HttpServletResponse response){
		List<Appraisal_ManageVO> appList = classAppService.getClassAppList();
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(appList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	
	@RequestMapping(value="/stu/classAppList", method=RequestMethod.GET)
	public void classAppStuList(HttpServletResponse response, @RequestParam(value="lec_no")String lec_no){
		List<Lecture_ChartVO> appList = classAppService.getStuClassAppList(lec_no);
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(appList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	/**
	 * 삭제 ajax
	 * @param
	 * @return 
	 * @throws 
	 */
	
	@RequestMapping(value="/emp/classAppDelete", method=RequestMethod.GET)
	public void classAppDelete(HttpServletResponse response, @RequestParam("am_no")String am_no){
		
		classAppService.deleteClassApp(am_no);
		
		List<Appraisal_ManageVO> appList = classAppService.getClassAppList();
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(appList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	
	@RequestMapping(value="/emp/classAppSave")
	public String classAppSave(){
		
		String url = "redirect:/emp/classAppInsertForm";
		
		classAppService.insertAppProSave();
		
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
	//수업평가 차트 ajax
	@RequestMapping(value="/pro/classAppChart", method=RequestMethod.GET)
	public void classAppChart(HttpServletResponse response, HttpSession session,
							@RequestParam(value="lec_no")String lec_no){
		
		List<Lecture_Chart_ViewVO> appList = classAppService.getLectureChart(lec_no);
		
		List<Map<String, Object>> chartList = new ArrayList<Map<String,Object>>();
		int i = 1;
		for(Lecture_Chart_ViewVO chartVO : appList){
			Map<String, Object> chartMap = new HashMap<String, Object>();
			chartMap.put("list", i+"번문항");
			chartMap.put("score", chartVO.getLc_questionscore());
			chartList.add(chartMap);
			i++;
		}
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;"); 
			String str = jsonObject.writeValueAsString(chartList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	
	//수업평가 통계
	@RequestMapping(value="/pro/classAppStat", method=RequestMethod.GET)
	public String classAppProStat(HttpSession session, Model model){
		String url="/pro/classAppStat";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();
		
		List<LectureViewVO> lectureList = classAppService.getLectureListPro(id);
		
		model.addAttribute("lectureList", lectureList);
		
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
	public String classAppInput(HttpSession session, Model model){
		String url="/stu/classAppInput";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		
		String id = loginUser.getUse_id();
		
		List<AppLecture_ViewVO> lectureList = classAppService.getLectureList(id);
		
		model.addAttribute("lectureList", lectureList);
		
		return url;
	}
	/**
	 * 
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	@RequestMapping(value="/stu/classAppSave", method=RequestMethod.GET)
	public String classAppSave(@RequestParam(value="lec_no")String lec_no,
								@RequestParam(value="checkVal")int checkVal[],
								HttpSession session){
		String url="redirect:/stu/classAppInput";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();
		
		classAppService.InsertClassAppInput(lec_no, checkVal, id);
		
				
		return url;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 차트 ajax
	@RequestMapping(value="/pro/classAppQnaChart", method=RequestMethod.GET)
	public void classAppQnaChart(HttpServletResponse response, HttpSession session,
							@RequestParam(value="lec_no")String lec_no){
		
		List<Lecture_Chart_ViewVO> appList = classAppService.getLectureChart(lec_no);
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;"); 
			String str = jsonObject.writeValueAsString(appList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
}
