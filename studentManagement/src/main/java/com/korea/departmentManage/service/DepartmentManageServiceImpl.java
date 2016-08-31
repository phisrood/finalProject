package com.korea.departmentManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.departmentManage.dao.DepartmentManageDAO;
import com.korea.dto.DepartmentVO;

@Service
public class DepartmentManageServiceImpl implements DepartmentManageService {
	// DepartmentManageDAO 빈 등록
	@Autowired
	DepartmentManageDAO departmentManageDAO;

	// 학과 전체 리스트 조회
	@Override
	public List<DepartmentVO> getDepartmentInfoList() {
		List<DepartmentVO> departmentList = departmentManageDAO
				.getDepartmentInfoList();
		return departmentList;
	}

	// 학과 하나의 정보 조회
	@Override
	public DepartmentVO getDepartmentInfo(int dep_no) {
		DepartmentVO department = departmentManageDAO.getDepartmentInfo(dep_no);
		return department;
	}

	// 학과정보 입력
	@Override
	public void insertDepartmentInfo(DepartmentVO departmentVO) {
		departmentManageDAO.insertDepartmentInfo(departmentVO);
	}

	// 학과정보 수정
	@Override
	public void updateDepartmentInfo(DepartmentVO departmentVO) {
		departmentManageDAO.updateDepartmentInfo(departmentVO);
	}

	// 학과 폐지여부 수정
	@Override
	public void updateDepartmentOnOff(int dep_no) {
		departmentManageDAO.updateDepartmentOnOff(dep_no);
	}

}
