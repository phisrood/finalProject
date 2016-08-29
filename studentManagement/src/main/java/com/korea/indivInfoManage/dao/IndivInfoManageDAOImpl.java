package com.korea.indivInfoManage.dao;

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
	
	
	@Override
	public StudentVO getIndivInfo(String id) {
		return (StudentVO) sqlSession.selectOne("indivInfoManageDAO.getIndivInfo",id);
	}

	@Override
	public String updateIndiv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColleageChangeList() {
		// TODO Auto-generated method stub
		return null;
	}

}
