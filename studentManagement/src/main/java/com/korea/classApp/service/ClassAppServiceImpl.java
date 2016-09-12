package com.korea.classApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.classApp.dao.ClassAppDAO;
import com.korea.dto.Appraisal_ManageVO;

/**
 * @Class Name : ClassAppServiceImpl.java
 * @Description : 수업평가 관련 서비스
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일     		수정자          수정내용
 *    -------      -------     -------------------
 *   2016.09.05		김양문		수업평가 항목관리
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Service
public class ClassAppServiceImpl implements ClassAppService{
	@Autowired
	private ClassAppDAO classAppDAO;
	
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 등록
	@Override
	public void insertClassApp(String content) {
		classAppDAO.insertClassApp(content);
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 조회
	@Override
	public void getClassAppProList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 통계
	@Override
	public void getClassAppProStat() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//수업평가 입력
	@Override
	public void InsertClassAppInput() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Appraisal_ManageVO> getClassAppList() {
		return classAppDAO.getClassAppList();
	}
	
	
	//수업평가 삭제
	@Override
	public void deleteClassApp(String am_no) {
		classAppDAO.deleteClassApp(am_no);
	}

}
