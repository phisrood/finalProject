package com.korea.timeTable.controller;
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
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.dto.TimeTableViewVO;
import com.korea.dto.UsersVO;
import com.korea.timeTable.service.TimeTableService;

@Controller
public class TimeTableController {
	@Autowired
	private TimeTableService timeTableService;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업시간표 조회
	@RequestMapping(value="/stu/timeTableList", method=RequestMethod.GET)
	public String timeTableList(HttpSession session, Model model){
		String url="/stu/timeTable";
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String id = user.getUse_id();
		List<TimeTableViewVO> timeTableList =  timeTableService.getTimeTableList(id);
		model.addAttribute("timetable", timeTableList);
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업시간표 출력(pdf)
	@RequestMapping(value="/stu/timeTablePDF", method=RequestMethod.GET)
	public String timeTablePDF(){
		String url="";
		
		return url;
	}
}
