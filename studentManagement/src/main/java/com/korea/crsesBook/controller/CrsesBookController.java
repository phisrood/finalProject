package com.korea.crsesBook.controller;

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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.crsesBook.service.CrsesBookService;
import com.korea.dto.Lecture_BreakeDownVO;
import com.korea.dto.ProfessorDetailViewVO;
import com.korea.dto.UsersVO;
import com.korea.memberManage.service.MemberManageService;

@Controller
public class CrsesBookController {

	@Autowired
	private CrsesBookService crsesBookService;
	@Autowired
	private MemberManageService memberManageService;
	
	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 수강편람조회
	@RequestMapping(value = {"/pro/crsesBookList"}, method = RequestMethod.GET)
	public String crsesBookList(Model model) {
		String url = "/pro/crsesBookList";
		List<Lecture_BreakeDownVO> lbList = crsesBookService.getCrsesBookList();
		model.addAttribute("crsesBookList", lbList);
		return url;
	}

	/**
	 * 수강편람등록페이지 이동
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 수강편람등록페이지 이동
	@RequestMapping(value = "/pro/crsesBookInsert", method = RequestMethod.GET)
	public String crsesBookInsertPage(HttpServletRequest request, Model model) {
		String url = "/pro/crsesBookInsert";
		HttpSession session = request.getSession();
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		ProfessorDetailViewVO pro = memberManageService
				.getDetailProInfo(loginUser.getUse_id());
		model.addAttribute("pro", pro);
		return url;
	}

	/**
	 * 수강편람 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 수강편람등록
	@RequestMapping(value = "/pro/crsesBookInsert", method = RequestMethod.POST)
	public String crsesBookInsert(Lecture_BreakeDownVO lbVO) {
		String url = "redirect:/pro/crsesList";
		crsesBookService.insertCrsesBook(lbVO);

		return url;
	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 수강편람수정
	@RequestMapping(value = "/pro/crsesBookUpdate", method = RequestMethod.GET)
	public String crsesBookUpdate() {
		String url = "";

		return url;
	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 수강편람승인/반려
	@RequestMapping(value = "/emp/crsesBookDecide", method = RequestMethod.GET)
	public String crsesBookDecide(Model model) {
		String url = "/emp/crsesBookDecide";
		List<Lecture_BreakeDownVO> lbList =  crsesBookService.getCrsesBookListByEmp();
		model.addAttribute("crsesBookList",lbList);
		return url;
	}

	/**
	 * 학수번호 검색
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 수강편람승인/반려
	@RequestMapping(value = "/pro/lbNoSearch", method = RequestMethod.GET)
	public void lbNoSearch(String lbNo, HttpServletResponse response) {
		boolean result = crsesBookService.getLbNoMatch(lbNo);
		ObjectMapper jsonObject = new ObjectMapper();
		try {
			response.getWriter().print(jsonObject.writeValueAsString(result));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
