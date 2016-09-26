package com.korea.certificate.service;

import com.korea.dto.Student_InfoViewVO;

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
public interface CertificateService {
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//학생 정보 가져오기
	public void getStuInfo();
	
	/**
	 * @return 
	 * @param id 
	 * 학생 재학증명서 정보
	 * @param
	 * @return 
	 * @throws 
	 */
	public Student_InfoViewVO getStuAttendInfo(String use_id);
}
