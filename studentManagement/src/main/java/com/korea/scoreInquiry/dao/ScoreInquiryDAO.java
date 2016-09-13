package com.korea.scoreInquiry.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.ScoreViewVO;

/**
 * @Interface Name : IndivInfoManageDAO.java
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
public interface ScoreInquiryDAO {
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//전체 성적 조회
	public void getScoreListAll();
	/**
	 * @param params 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//현재학기 성적조회
	public List<ScoreViewVO> getScoreListNow(Map<String, String> params);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학과생 성적조회
	public void getScoreListDepartment();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수강생 성적조회
	public void getScoreListPro();
}
