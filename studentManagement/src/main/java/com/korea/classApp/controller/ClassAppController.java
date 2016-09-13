package com.korea.classApp.controller;

import java.io.IOException;
import java.util.List;

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
	@RequestMapping(value={"/emp/classAppList","/stu/classAppList"}, method=RequestMethod.GET)
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
	public String classAppInput(HttpSession session){
		String url="/stu/classAppInput";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();
		
		List<AppLecture_ViewVO> lectureList = classAppService.getLectureList(id);
		
		return url;
	}
}
