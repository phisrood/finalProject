package com.korea.memberManage.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberManageDAOImpl implements MemberManageDAO{

	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public String getStuInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStuInfo(Map<String, String> studentMap) {
		int resultUser = sqlSession.insert("member.insertUser",studentMap);
		int resultStudent = sqlSession.insert("member.insertStudent", studentMap);
		int resultMajor = sqlSession.insert("member.insertMajor", studentMap);
		int reusltReg = sqlSession.insert("member.insertReg",studentMap);
		int resultCRC = sqlSession.insert("member.insertCRC",studentMap);
		return resultUser;
	}

	@Override
	public String updateStuInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStuInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertProInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateproInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmpInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmpInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

}
