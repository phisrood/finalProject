package com.korea.certificate.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
@Repository
public class CertificateDAOImpl implements CertificateDAO{
	@Autowired 
	SqlSession sqlSession;
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public Student_InfoViewVO getStuAttendInfo(String use_id) {
		System.out.println(use_id+"DAODAODAODAODAODAODAO");
		
		return (Student_InfoViewVO) sqlSession.selectOne("Certificate.getAttendCertificate",use_id);
		
	}

}
