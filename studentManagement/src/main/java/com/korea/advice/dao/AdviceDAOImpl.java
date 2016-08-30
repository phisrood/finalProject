package com.korea.advice.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.AdviceVO;

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
public class AdviceDAOImpl implements AdviceDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getAdviceResponsList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<AdviceVO> getAdviceRequestList() {
		List<AdviceVO> adviceReqList = (List<AdviceVO>) sqlSession.selectList("adviceDAO.selectReqList");
		return adviceReqList;
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertAdviceREQ(AdviceVO adviceVO) {
		sqlSession.insert("adviceDAO.insertAdvice", adviceVO);
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteAdviceREQ() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateAdviceREQ() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertAdviceReply() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 교수가 받은 상담신청조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertAdviceDate() {
		// TODO Auto-generated method stub
		
	}

}
