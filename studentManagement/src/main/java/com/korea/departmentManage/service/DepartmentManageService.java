package com.korea.departmentManage.service;

import java.util.List;

import com.korea.dto.DepartmentVO;

public interface DepartmentManageService {

	/**
	 * 학과 전체 SELECT
	 * 
	 * @param 
	 * @return List<DepartmentVO>
	 * @throws
	 */
	public List<DepartmentVO> getDepartmentInfoList();

	/**
	 * 하나의 학과 정보  SELECT
	 * 
	 * @param int
	 * @return DepartmentVO
	 * @throws
	 */
	public DepartmentVO getDepartmentInfo(int dep_no);

	/**
	 * 학과 개설정보 UPDATE
	 * 
	 * @param DepartmentVO
	 * @return 
	 * @throws
	 */
	public void insertDepartmentInfo(DepartmentVO departmentVO);

	/**
	 * 학과정보 UPDATE
	 * 
	 * @param DepartmentVO
	 * @return 
	 * @throws
	 */
	public void updateDepartmentInfo(DepartmentVO departmentVO);

	/**
	 * 폐지여부 UPDATE
	 * 
	 * @param int
	 * @return
	 * @throws
	 */
	public void updateDepartmentOnOff(int dep_no);
}
