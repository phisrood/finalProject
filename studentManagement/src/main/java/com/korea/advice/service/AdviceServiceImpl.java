package com.korea.advice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.advice.dao.AdviceDAO;
import com.korea.dto.AdviceVO;
import com.korea.dto.Advice_BoardVO;
import com.korea.dto.ProfessorVO;

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
@Service
public class AdviceServiceImpl implements AdviceService {

	@Autowired
	AdviceDAO adviceDAO;

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<AdviceVO> getAdviceResponsList(String pro_use_id) {
		List<AdviceVO> adviceResList = adviceDAO.getAdviceResponsList(pro_use_id);
		return adviceResList;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<AdviceVO> getAdviceRequestList(String stud_use_id) {
		List<AdviceVO> adviceReqList = adviceDAO.getAdviceRequestList(stud_use_id);
		return adviceReqList;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertAdviceREQ(AdviceVO adviceVO) {
		adviceDAO.insertAdviceREQ(adviceVO);
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void deleteAdviceREQ() {
		// TODO Auto-generated method stub

	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public AdviceVO updateAdviceConfirmForm(int ad_no) {
		AdviceVO adviceVO = adviceDAO.updateAdviceConfirmForm(ad_no);
		return adviceVO;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public AdviceVO updateAdviceConfirm(int ad_no) {
		AdviceVO adviceVO = adviceDAO.updateAdviceConfirm(ad_no);
		return adviceVO;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	public void updateAdviceDelay(AdviceVO adviceVO) {
		adviceDAO.updateAdviceDelay(adviceVO);
	}
	
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertAdviceReply() {
		// TODO Auto-generated method stub

	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertAdviceDate() {
		// TODO Auto-generated method stub

	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<Advice_BoardVO> getAdviceBoardList() {
		List<Advice_BoardVO> adviceBoardList = adviceDAO.getAdviceBoardList();
		return adviceBoardList;
	}

	@Override
	public List<ProfessorVO> getProfessorList(String stud_use_id) {
		List<ProfessorVO> professorList = adviceDAO.getProfessorList(stud_use_id);
		return professorList;
	}

}
