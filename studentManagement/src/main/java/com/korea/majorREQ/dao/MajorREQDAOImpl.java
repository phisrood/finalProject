package com.korea.majorREQ.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.ScoreViewVO;
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
	public String getBelongMinorREQList() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateBelongMinorREQDecide() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getOthorsMinorREQList() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getOthorsMinorREQDecide() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String insertBelongMajorREQ() {
		// TODO Auto-generated method stub
		return null;
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
	public String updateBelongMajorREQDecide() {
		// TODO Auto-generated method stub
		return null;
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
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getOthorsMajorREQDecide() {
		// TODO Auto-generated method stub
		return null;
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

}
