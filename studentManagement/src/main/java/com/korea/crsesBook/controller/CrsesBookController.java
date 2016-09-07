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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.crsesBook.service.CrsesBookService;
import com.korea.dto.ClassRoom_InfoVO;
import com.korea.dto.ClassRoom_UsetimeVO;
import com.korea.dto.LectureVO;
import com.korea.dto.LectureViewVO;
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
	 * 수강편람 리스트
	 * 
	 * @param Model
	 * @return String
	 * @throws
	 */
	// 수강편람조회
	@RequestMapping(value = { "/pro/crsesBookList"}, method = RequestMethod.GET)
	public String getCrsesBookList(Model model) {
		String url = "/pro/crsesBookList";
		List<Lecture_BreakeDownVO> lbList = crsesBookService.getCrsesBookList();
		model.addAttribute("crsesBookList", lbList);
		return url;
	}

	/**
	 * 수강편람등록페이지 이동
	 * 
	 * @param HttpServletRequest
	 *            , Model
	 * @return String
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
	 * @param Lecture_BreakeDownVO
	 * @return String
	 * @throws
	 */
	// 수강편람등록
	@RequestMapping(value = "/pro/crsesBookInsert", method = RequestMethod.POST)
	public String insertCrsesBook(Lecture_BreakeDownVO lbVO) {
		String url = "redirect:/pro/crsesBookList";
		crsesBookService.insertCrsesBook(lbVO);

		return url;
	}

	/**
	 * 수강편람 수정페이지 이동
	 * 
	 * @param String
	 *            , Model
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/pro/crsesBookUpdatePage", method = RequestMethod.GET)
	public String crsesBookUpdatePage(String lb_no, Model model) {
		String url = "/pro/crsesBookUpdate";
		Lecture_BreakeDownVO lb = crsesBookService.getCrsesBook(lb_no);
		model.addAttribute("lb", lb);
		return url;
	}

	/**
	 * 수강편람 수정
	 * 
	 * @param Lecture_BreakeDownVO
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/pro/crsesBookUpdate", method = RequestMethod.GET)
	public String updateCrsesBook(Lecture_BreakeDownVO lb) {
		String url = "redirect:/pro/crsesBookList";
		crsesBookService.updateCrsesBook(lb);
		return url;
	}

	/**
	 * 수강편람 승인반려페이지
	 * 
	 * @param Model
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/crsesBookDecide", method = RequestMethod.GET)
	public String crsesBookDecidePage(Model model) {
		String url = "/emp/crsesBookDecide";
		List<Lecture_BreakeDownVO> lbList = crsesBookService
				.getCrsesBookListByEmp();
		model.addAttribute("crsesBookList", lbList);
		return url;
	}

	/**
	 * 수강편람 승인
	 * 
	 * @param String
	 *            , HttpServletResponse
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/emp/crsesBookDecide", method = RequestMethod.POST)
	public void updateCrsesBookDecide(String data, HttpServletResponse response) {
		String approve = "Y";
		int result = crsesBookService.updateCrsesBookDecide(data, approve);
		ObjectMapper json = new ObjectMapper();
		try {
			response.getWriter().print(json.writeValueAsString(result));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 수강편람 반려
	 * 
	 * @param String
	 *            , HttpServletResponse
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/emp/crsesBookDisapprove", method = RequestMethod.POST)
	public void updateCrsesBookDisapprove(String data,
			HttpServletResponse response) {
		String approve = "R";
		int result = crsesBookService.updateCrsesBookDecide(data, approve);
		ObjectMapper json = new ObjectMapper();
		try {
			response.getWriter().print(json.writeValueAsString(result));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 학수번호 검색
	 * 
	 * @param String
	 *            , HttpServletResponse
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/pro/lbNoSearch", method = RequestMethod.GET)
	public void getLbNoSearch(String lbNo, HttpServletResponse response) {
		boolean result = crsesBookService.getLbNoMatch(lbNo);
		ObjectMapper jsonObject = new ObjectMapper();
		try {
			response.getWriter().print(jsonObject.writeValueAsString(result));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 강의개설
	 * 
	 * @param String
	 *            , Model
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/pro/openLecturePage", method = RequestMethod.GET)
	public String openLecturePage(String lb_no, Model model) {
		String url = "/pro/openLecture";
		Lecture_BreakeDownVO lb = crsesBookService.getCrsesBook(lb_no);
		List<ClassRoom_InfoVO> classRoomInfo = crsesBookService
				.getClassroomInfo();
		model.addAttribute("lb", lb);
		model.addAttribute("classroom", classRoomInfo);
		return url;
	}

	/**
	 * 강의실 정보 가져오기
	 * 
	 * @param String
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/pro/getClassroomTime", method = RequestMethod.GET)
	public @ResponseBody Object getClassroomTime(String classroom, HttpServletResponse response) {
		List<ClassRoom_UsetimeVO> usetimeList = crsesBookService
				.getClassroomTime(classroom);
		Map<String, List> map = new HashMap<String, List>();
		map.put("data", usetimeList);
		return map;
	}

	/**
	 * 강의개설
	 * 
	 * @param String
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/pro/openLecture", method = RequestMethod.GET)
	public String insertLecture(LectureVO lecture,
			ClassRoom_UsetimeVO classroomUsetime) {
		String url = "redirect:/pro/crsesBookList";
		String lec_no = crsesBookService.insertLecture(lecture);
		classroomUsetime.setCu_lec_no(lec_no);
		crsesBookService.insertClassroomUsetime(classroomUsetime);
		return url;
	}
	/**
	 * 강의조회
	 * 
	 * @param String
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/pro/lectureList", method = RequestMethod.GET)
	public String getLectureList(Model model, HttpSession session) {
		String url = "/pro/lectureList";
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		List<LectureViewVO> list = crsesBookService.getLectureList(user.getUse_id());
		model.addAttribute("lectureList", list);
		
		return url;
	}
	/**
	 * 강의조회학생
	 * 
	 * @param String
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/lectureList", method = RequestMethod.GET)
	public String getLectureListByStu(Model model) {
		String url = "/common/lectureList";
		List<LectureViewVO> list = crsesBookService.getLectureListByStu();
		model.addAttribute("lectureList", list);
		
		return url;
	}
	
	
}
