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
	 * @param depno 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 신청내역 출력
	public List<SubmitVO> getBelongMajorREQList(String depno);

	/**
	 * @param depno 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 신청내역 출력
	public List<SubmitVO> getOthorsMajorREQList(String depno);
	
	//점수
	public Map<String, Object> getScore(String id);
	//부/다전공 신청리스트출력
	public List<SubmitVO> getReqList(String id);

	//신청한 학생 정보 가져오기
	public Student_InfoViewVO getREQPersonInfo(String id);

	//신청정보 가져오기
	public SubmitVO getReqStuInfo(String sb_no);

	//
	public int updateReqDecide(String sb_no, int result);
}
