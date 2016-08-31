package com.korea.crsesBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.crsesBook.dao.CrsesBookDAO;
import com.korea.dto.Lecture_BreakeDownVO;

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
@Service
public class CrsesBookServiceImpl implements CrsesBookService{
	
	@Autowired
	private CrsesBookDAO crsesBookDAO;
	
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Lecture_BreakeDownVO> getCrsesBookList() {
		return crsesBookDAO.getCrsesBookList();
	}
	/**
	 * 수강편람 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertCrsesBook(Lecture_BreakeDownVO lbVO) {
		crsesBookDAO.insertCrsesBook(lbVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateCrsesBook() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateCrsesBookDecide(String lbNo) {
		String[] checkedlbNo =lbNo.split(",");
		crsesBookDAO.updateCrsesBookDecide(checkedlbNo);
	}
	@Override
	public boolean getLbNoMatch(String lbNo) {
		String getLbNo = crsesBookDAO.getLbNoMatch(lbNo);
		//true면 사용가능, false면 사용불가
		if(getLbNo==null || getLbNo.equals("null")){
			return true;
		}
		return false;
	}
	@Override
	public List<Lecture_BreakeDownVO> getCrsesBookListByEmp() {
		return crsesBookDAO.getCrsesBookListByEmp();
	}

}
