package com.korea.advice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.advice.service.AdviceService;
import com.korea.dto.AdviceVO;

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
	@RequestMapping(value = "/pro/adviceResponsList", method = RequestMethod.GET)
	public String adviceResponsList() {
		String url = "/pro/adviceResponsList";

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
	@RequestMapping(value = "/stu/adviceRequestList", method = RequestMethod.GET)
	public String adviceRequestList(Model model) {
		String url = "/stu/adviceRequestList";
		
		List<AdviceVO> adviceReqList = adviceService.getAdviceRequestList();
	//	for(int i = 0;i<adviceReqList.size();i++){
	//		System.out.println(adviceReqList.get(i).getAd_reqdate());
	//	}
		
		model.addAttribute("adviceReqList", adviceReqList);
		
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
	public String adviceREQ(AdviceVO adviceVO) {
		String url = "stu/adviceRequestList";
		
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
	@RequestMapping(value = "/stu/adviceREQDelete", method = RequestMethod.GET)
	public String adviceREQDelete() {
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
	// 상담 게시판
	@RequestMapping(value = { "/stu/adviceBoard", "/pro/adviceBoard" }, method = RequestMethod.GET)
	public String adviceBoard() {
		String url = "/common/adviceBoard";

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
	@RequestMapping(value = "/stu/adviceBoardWrite", method = RequestMethod.GET)
	public String adviceBoardWrite() {
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
