package com.korea.crsesREQ.controller;

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
import com.korea.crsesREQ.service.CrsesREQService;
import com.korea.dto.CrsesListViewVO;
import com.korea.dto.CrsesList_stu_ViewVO;
import com.korea.dto.Period;
import com.korea.dto.UsersVO;
import com.korea.period.service.PeriodService;
import com.korea.security.SecurityProcess;

@Controller
public class CrsesREQController {

	@Autowired
	private CrsesREQService crsesREQService;
	@Autowired
	private PeriodService periodService;

	/**
	 * 메인화면
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/crsesREQMain", method = RequestMethod.GET)
	public String crsesREQMain(Model model, HttpSession session) {
		String url = "/stu/crsesREQMain";
		String id = "";

		try {
			UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
			id = loginUser.getUse_id();

		} catch (Exception e) {
			// 세션 널값
			url = "redirect:/common/loginForm";
		}

		// 직전학기 성적조회
		float score = crsesREQService.getScoreCalcu(id);
		int semester = crsesREQService.getSemester(id);
		int limitSemes = crsesREQService.crsesLimit(score);

		model.addAttribute("score", score);
		model.addAttribute("limitSemes", limitSemes);
		model.addAttribute("semester", semester);
		return url;
	}

	/**
	 * 수강리스트조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/crsesAllList", method = RequestMethod.GET)
	public void crsesAllList(HttpServletResponse response) {

		List<CrsesListViewVO> crsesAllList = crsesREQService.getCrsesAllList();
		ObjectMapper jsonObject = new ObjectMapper();

		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(crsesAllList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei) {
			ei.printStackTrace();
		}
	}

	/**
	 * 수강검색
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/crsesSearch", method = RequestMethod.GET)
	public String crsesSearch() {
		String url = "";

		return url;
	}

	/**
	 * 수강신청 로그인폼
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/crsesLoginForm", method = RequestMethod.GET)
	public String crsesLoginForm() {
		String url = "/stu/crsesLogin";
		Period period = periodService.getPeriodAll();
		if(period.getPr_crses_inquiry().equals("off")){
			url="redirect:/stu/Notperiod";
		}
		return url;
	}

	/**
	 * @throws 수강신청
	 *             로그인
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/crsesLogin", method = RequestMethod.POST)
	public String crsesLogin(HttpSession session,
			@RequestParam("id") String id, @RequestParam("pwd") String pwd,
			HttpServletResponse response, Model model) {
		String url = "/stu/crsesLogin";
		
		SecurityProcess sp = new SecurityProcess();
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String pwdEncode = "";
		try {
			pwdEncode = sp.encrypt(pwd);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String chkId = "";
		String chkPwd = "";
		int chk = 1;
		try {
			chkId = usersVO.getUse_id();
			chkPwd = usersVO.getUse_pwd();

		} catch (Exception e) {
			url = "redirect:/common/loginForm";
		}

		if (id.equals(chkId) && pwdEncode.equals(chkPwd)) {
			chk = 2;
		} else {
			chk = 1;
		}

		model.addAttribute("chk", chk);

		return url;
	}

	/**
	 * 수강신청취소
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/delReqClass", method = RequestMethod.GET)
	public void crsesDelete(String lec_no, HttpSession session,HttpServletResponse response) {
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String id= user.getUse_id();
		crsesREQService.deleteCrsesREQ(lec_no, id);
		try {
			response.getWriter().print(new ObjectMapper().writeValueAsString("success"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 수강신청한리스트
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/crsesREQList", method = RequestMethod.GET)
	public String crsesREQList() {
		String url = "";

		return url;
	}

	/**
	 * 수강시간표 조회(중복배제)
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/crsesREQTimeTablePDF", method = RequestMethod.GET)
	public String crsesREQTimeTablePDF() {
		String url = "";

		return url;
	}

	/**
	 * 수강신청기간설정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/emp/crsesREQPeriod", method = RequestMethod.GET)
	public String crsesREQPeriod() {
		String url = "";

		return url;
	}

	/**
	 * 수강신청기간예외페이지
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/crsesREQPeriodError", method = RequestMethod.GET)
	public String crsesREQPeriodError() {
		String url = "/stu/crsesREQPeriodError";

		return url;
	}

	/**
	 * 수강신청하기
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/insertCrsesREQ", method = RequestMethod.GET)
	public void insertCrsesREQ(String lec_no,String lb_no,int credit, HttpSession session,
			HttpServletResponse response) {
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String lb_noFormat = String.format("%05d", Integer.parseInt(lb_no));
		crsesREQService.insertCrsesREQ(lec_no,lb_noFormat,credit, user.getUse_id(), response);
		
	}

	/**
	 * 수강신청내역 가져오기
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/crses/stu/getCrsesREQList", method = RequestMethod.GET)
	public void getCrsesREQList(HttpSession session,
			HttpServletResponse response) {
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		List<CrsesList_stu_ViewVO> courseList = crsesREQService
				.getCrsesREQList(user.getUse_id());
		ObjectMapper jsonObject = new ObjectMapper();

		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(courseList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei) {
			ei.printStackTrace();
		}
	}

}
