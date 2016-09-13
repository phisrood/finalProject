package com.korea.classApp.service;

import java.util.List;

import com.korea.dto.Appraisal_ManageVO;

/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
public interface ClassAppService {
	/**
	 * @param content 
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 등록
	public void insertClassApp(String content);
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 조회
	public void getClassAppProList();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 통계
	public void getClassAppProStat();
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	public void InsertClassAppInput();
	/**
	 * @return 
	 * 수업평가항목 조회
	 * @param
	 * @return List<Appraisal_ManageVO>
	 * @throws 
	 */
	public List<Appraisal_ManageVO> getClassAppList();
	
	//삭제
	public void deleteClassApp(String am_no);
	
	public void insertAppProSave();
}
