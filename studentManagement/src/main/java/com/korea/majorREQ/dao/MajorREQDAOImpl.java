package com.korea.majorREQ.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Major_AssignVO;
import com.korea.dto.ScoreViewVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.SubmitVO;

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
@Repository
public class MajorREQDAOImpl implements MajorREQDAO{
	
	@Autowired
	private SqlSession session;
	
	/**
	 * 부/다전공 신청
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertBelongMinorREQ(SubmitVO submitVO) {
		session.insert("Major.submitInsert",submitVO);
	}

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<SubmitVO> getBelongMajorREQList(String dep_no) {
		return session.selectList("Major.getBelongREQList", dep_no);
	}

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<SubmitVO> getOthorsMajorREQList(String dep_no) {
		return session.selectList("Major.getOthorsREQList", dep_no);
	}
	
	/**
	 * 전체성적구하기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<ScoreViewVO> getScoreList(String id) {
		return session.selectList("Major.getScoreView", id);
	}
	@Override
	public List<SubmitVO> getReqList(String id) {
		return session.selectList("Major.getReqList", id);
	}

	@Override
	public Student_InfoViewVO getREQPersonInfo(String id) {
		return (Student_InfoViewVO) session.selectOne("Major.getReqStuList", id);
	}

	@Override
	public SubmitVO getReqStuInfo(String sb_no) {
		return (SubmitVO) session.selectOne("Major.getReqStuInfo", sb_no);
	}

	@Override
	public void updateReqBelongDecide(Map<String, Object> params) {
		session.update("Major.updateReqBelong", params);
	}

	@Override
	public void updateReqOthersDecide(Map<String, Object> params) {
		session.update("Major.updateReqOthers", params);
	}

	@Override
	public void insertMajor_Assign(Major_AssignVO major_AssignVO) {
		session.insert("Major.insertMajor", major_AssignVO);
	}

}
