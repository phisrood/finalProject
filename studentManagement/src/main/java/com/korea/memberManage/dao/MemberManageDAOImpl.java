package com.korea.memberManage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.UsersVO;

@Repository
public class MemberManageDAOImpl implements MemberManageDAO{

	@Autowired
	SqlSession session;
	
	@Override
	public String getStuInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertStuInfo() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public List<DepartmentVO> getDepartmentList() {
		return session.selectList("Department.departmentList");
	}
	
	@Override
	public void insertProInfo(ProfessorVO professorVO) {
		System.out.println(professorVO.getPro_use_id());
		session.insert("Professor.professorInsert",professorVO);
	}

	@Override
	public UsersVO insertUserProInfo(UsersVO usersVO) {
		session.insert("Professor.userProInsert",usersVO);
		
		return usersVO;
		
	}

}
