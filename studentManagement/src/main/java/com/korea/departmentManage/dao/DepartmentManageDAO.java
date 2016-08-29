package com.korea.departmentManage.dao;

import java.util.List;

import com.korea.dto.DepartmentVO;

public interface DepartmentManageDAO {

	// 학과 정보 전체 조회
	public List<DepartmentVO> getDepartmentInfoList();

	// 학과 정보 조회
	public DepartmentVO getDepartmentInfo(int dep_no);

	// 신설학과 등록
	public void insertDepartmentInfo(DepartmentVO departmentVO);

	// 학과 정보 수정
	public void updateDepartmentInfo(DepartmentVO departmentVO);

	// 학과 폐지(onoff)
	public void updateDepartmentOnOff(int dep_no);
}
