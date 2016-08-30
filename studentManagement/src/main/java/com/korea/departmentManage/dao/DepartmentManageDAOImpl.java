package com.korea.departmentManage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.DepartmentVO;

@Repository
public class DepartmentManageDAOImpl implements DepartmentManageDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<DepartmentVO> getDepartmentInfoList() {
		List<DepartmentVO> departmentList = (List<DepartmentVO>) sqlSession
				.selectList("departmentDAO.getDepartmentList");
		return departmentList;
	}

	@Override
	public DepartmentVO getDepartmentInfo(int dep_no) {
		DepartmentVO department = (DepartmentVO) sqlSession.selectOne(
				"departmentDAO.getDepartment", dep_no);
		return department;
	}

	@Override
	public void insertDepartmentInfo(DepartmentVO departmentVO) {
		sqlSession.insert("departmentDAO.insertDepartment", departmentVO);
	}

	@Override
	public void updateDepartmentInfo(DepartmentVO departmentVO) {
		sqlSession.update("departmentDAO.updateDepartment", departmentVO);
	}

	@Override
	public void updateDepartmentOnOff(int dep_no) {
		sqlSession.update("departmentDAO.updateDepartmentRevoke",dep_no);
	}

}
