package com.korea.majorREQ.service;

import java.util.List;
import java.util.Map;

import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.SubmitVO;

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
public interface MajorREQService {

	///////////////////////부전공///////////////////////
	
	/**
	 * @param selec 
	 * @param submitVO 
	 * @param studentInfo 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//부전공 신청
	public void insertBelongMinorREQ(Student_InfoViewVO studentInfo, SubmitVO submitVO, int selec);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 부전공 신청내역 출력
	public String getBelongMinorREQList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 부전공 신청 승인/반려
	public String updateBelongMinorREQDecide();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 부전공 신청내역 출력
	public String getOthorsMinorREQList();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 부전공 신청 승인/반려
	public String getOthorsMinorREQDecide();
	
	///////////////////////다전공///////////////////////
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//다전공 신청
	public String insertBelongMajorREQ();
	/**
	 * @param depno 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 신청내역 출력
	public List<SubmitVO> getBelongMajorREQList(String depno);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 다전공 신청 승인/반려
	public String updateBelongMajorREQDecide();
	/**
	 * @param depno 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 신청내역 출력
	public List<SubmitVO> getOthorsMajorREQList(String depno);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 다전공 신청 승인/반려
	public String getOthorsMajorREQDecide();
	
	//점수
	public Map<String, Object> getScore(String id);
	//부/다전공 신청리스트출력
	public List<SubmitVO> getReqList(String id);
}
