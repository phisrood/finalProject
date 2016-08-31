package com.korea.advice.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.advice.service.AdviceService;
import com.korea.dto.AdviceVO;
import com.korea.dto.Advice_BoardVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.UsersVO;

/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since 2016.08.25.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class AdviceController {
	@Autowired
	AdviceService adviceService;

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 받은 상담 신청 조회(교수)
	@RequestMapping(value = "/pro/adviceResponsList")
	public String adviceResponsList(Model model, HttpSession session) {
		String url = "/pro/adviceResponsList";

		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String pro_use_id = user.getUse_id();

		List<AdviceVO> adviceResList = adviceService
				.getAdviceResponsList(pro_use_id);

		model.addAttribute("adviceResList", adviceResList);

		return url;
	}

	/**
	 * 학생이 보낸 상담 신청 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 보낸 상담 신청 조회(학생)
	@RequestMapping(value = "/stu/adviceRequestList")
	public String adviceRequestList(Model model, HttpSession session) {
		String url = "/stu/adviceRequestList";

		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = user.getUse_id();

		List<AdviceVO> adviceReqList = adviceService
				.getAdviceRequestList(stud_use_id);
		List<ProfessorVO> professorList = adviceService
				.getProfessorList(stud_use_id);

		model.addAttribute("adviceReqList", adviceReqList);
		model.addAttribute("professorList", professorList);

		return url;
	}

	/**
	 * 상담신청
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담신청
	@RequestMapping(value = "/stu/adviceREQ", method = RequestMethod.POST)
	public String adviceREQ(AdviceVO adviceVO, HttpSession session) {
		String url = "redirect:adviceRequestList";

		// 세션
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		adviceVO.setAd_stud_use_id(user.getUse_id());

		adviceService.insertAdviceREQ(adviceVO);

		return url;
	}

	/**
	 * 상담답변
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 답변
	@RequestMapping(value = "/stu/adviceReply", method = RequestMethod.GET)
	public String adviceReply() {
		String url = "";

		return url;
	}

	/**
	 * 상담가능일자 입력
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 가능일자 입력
	@RequestMapping(value = "/pro/adviceDate", method = RequestMethod.GET)
	public String adviceDate() {
		String url = "";

		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	@RequestMapping(value = "/pro/updateAdviceConfirmForm", method = RequestMethod.GET)
	public String updateAdviceConfirmForm(int ad_no, Model model) {
		String url = "/pro/Consultation_RHP";
		AdviceVO adviceVO = adviceService.updateAdviceConfirmForm(ad_no);
		model.addAttribute("adviceVO", adviceVO);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	@RequestMapping(value = "/pro/updateAdviceConfirm", method = RequestMethod.POST)
	public String updateAdviceConfirm(int ad_no) {
		String url = "redirect:/pro/adviceResponsList";
		adviceService.updateAdviceConfirm(ad_no);
		return url;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	@RequestMapping(value = "/pro/updateAdviceDelay", method = RequestMethod.POST)
	public String updateAdviceDelay(AdviceVO adviceVO) {
		String url = "redirect:/pro/adviceResponsList";
		adviceService.updateAdviceDelay(adviceVO);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판
	@RequestMapping(value = { "/stu/adviceBoard", "/pro/adviceBoard" })
	public String adviceBoard(Model model) {
		String url = "/common/adviceBoard";
		List<Advice_BoardVO> adviceBoardList = adviceService.getAdviceBoardList();
		model.addAttribute("adviceBoardList", adviceBoardList);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 글 작성
	@RequestMapping(value = "/stu/adviceBoardWriteForm")
	public String adviceBoardWriteForm() {
		String url = "/stu/adviceBoardWrite";

		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 글 작성
	@RequestMapping(value = "/stu/adviceBoardWrite", method = RequestMethod.POST)
	public String adviceBoardWrite(Advice_BoardVO adviceBoardVO) {
		String url = "redirect:/common/adviceBoard";
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 게시판 답변 작성
	@RequestMapping(value = "/pro/adviceBoardReply", method = RequestMethod.GET)
	public String adviceREQUpdate() {
		String url = "/pro/adviceBoardReply";

		return url;
	}

	// //////////////////////////////화상상담추가//////////////////////////////

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/camAdvice", method = RequestMethod.GET)
	public String camAdvice() {
		String url = "/stu/cam_advice";

		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/stu/chatAdvice", method = RequestMethod.GET)
	public String chatAdvice() {
		String url = "/stu/chat_advice";

		return url;
	}
}
