package com.korea.acadeCal.service;
/**
 * @interface Name : AcadeCalService.java
 * @Description : 학사일정관리 서비스 인터페이스
 * @Modification Information
 * @author 한돈희
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
public interface AcadeCalService {
	/**
	 * 학사일정 가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 조회
	public String getAcadeCalList();
	/**
	 * 학사일정 입력
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 등록
	public String insertAcadeCal();
	/**
	 * 학사일정 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 수정 
	public String updateAcadeCal();
	/**
	 * 학사일정 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 삭제
	public String deleteAcadeCal();
	/**
	 * 학사일정 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학사일정 상세보기
	public void getAcadeDetail();
}
