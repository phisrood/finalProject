package com.korea.indivInfoManage.dao;
/**
 * @Class Name : IndivInfoManageDAOImpl.java
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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.StudentVO;



@Repository
public class IndivInfoManageDAOImpl implements IndivInfoManageDAO{
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Autowired
	private SqlSession sqlSession;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public StudentVO getIndivInfo(String id) {
		return (StudentVO) sqlSession.selectOne("indivInfoManageDAO.getIndivInfo",id);
	}
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateIndiv() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getColleageChangeList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getIndivInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int checkId(String usrid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int re = 0;
		try{
			con = db.getConnection();
	    String selectSQL="select * from users where use_id=?";
	    pstmt = con.prepareStatement(selectSQL);
	    pstmt.setString(1,usrid);
	    ResultSet rs = pstmt.executeQuery();
	    if(rs.next()){
	    	re = 1;
	    }
		}finally{
		   	db.close(con,pstmt);
		}
		return re;
	}//end list()
	
}
