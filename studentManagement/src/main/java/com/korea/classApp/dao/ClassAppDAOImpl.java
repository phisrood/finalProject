package com.korea.classApp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Appraisal_ManageVO;

/**
 * @Class Name : ClassAppDAOImpl.java
 * @Description : 수업평가 관련 dao
 * @Modification Information
 * @author 한돈희
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일      		수정자          수정내용
 *    -------      -------     -------------------
 *   2016.09.05		김양문		수업평가항목관리
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Repository
public class ClassAppDAOImpl implements ClassAppDAO{
	@Autowired
	private SqlSession sqlSession;
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertClassApp() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
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
	@Override
	public void InsertClassAppInput() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Appraisal_ManageVO> getClassAppList() {
		return sqlSession.selectList("classApp.getClassAppList");
	}

}
