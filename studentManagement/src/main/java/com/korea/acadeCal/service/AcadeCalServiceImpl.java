package com.korea.acadeCal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.acadeCal.dao.AcadeCalDAO;
import com.korea.dto.Colleage_CalendarVO;

/**
 * @Class Name : AcadeCalServiceImpl.java
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
@Service
public class AcadeCalServiceImpl implements AcadeCalService{
	
	@Autowired
	AcadeCalDAO acadeCalDAO;
	
	
	/**
	 * 학사일정 가져오기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Colleage_CalendarVO> getAcadeCalList() {
		
		return acadeCalDAO.getAcadeCalList();
	}
	/**
	 * 학사일정 입력
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String insertAcadeCal() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학사일정 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateAcadeCal() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학사일정 삭제
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String deleteAcadeCal() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학사일정 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getAcadeDetail() {
		// TODO Auto-generated method stub
		
	}

}
