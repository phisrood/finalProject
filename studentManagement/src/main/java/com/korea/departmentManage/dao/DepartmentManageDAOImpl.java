package com.korea.departmentManage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.DepartmentVO;

@Repository
public class DepartmentManageDAOImpl implements DepartmentManageDAO {
	// SqlSessionTemplate 빈 등록
	@Autowired
	private SqlSessionTemplate sqlSession;

	// 학과 전체 리스트 조회
	@Override
	public List<DepartmentVO> getDepartmentInfoList() {
		List<DepartmentVO> departmentList = (List<DepartmentVO>) sqlSession
				.selectList("departmentDAO.getDepartmentList");
		return departmentList;
	}

	// 하나의 학과정보 조회
	@Override
	public DepartmentVO getDepartmentInfo(int dep_no) {
		DepartmentVO department = (DepartmentVO) sqlSession.selectOne(
				"departmentDAO.getDepartment", dep_no);
		return department;
	}

	// 학과정보 입력
	@Override
	public void insertDepartmentInfo(DepartmentVO departmentVO) {
		sqlSession.insert("departmentDAO.insertDepartment", departmentVO);
	}

	// 학과정보 수정
	@Override
	public void updateDepartmentInfo(DepartmentVO departmentVO) {
		sqlSession.update("departmentDAO.updateDepartment", departmentVO);
	}

	// 학과 폐지여부 수정
	@Override
	public void updateDepartmentOnOff(int dep_no) {
		sqlSession.update("departmentDAO.updateDepartmentRevoke", dep_no);
	}

}
