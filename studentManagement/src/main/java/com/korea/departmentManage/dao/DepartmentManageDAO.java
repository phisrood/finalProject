package com.korea.departmentManage.dao;

import java.util.List;

import com.korea.dto.DepartmentVO;

public interface DepartmentManageDAO {

	/**
	 * 학과 전체 정보 SELECT
	 * 
	 * @param
	 * @return List<DepartmentVO>
	 * @throws
	 */
	public List<DepartmentVO> getDepartmentInfoList();

	/**
	 * 학과 하나의 정보 SELECT
	 * 
	 * @param int
	 * @return DepartmentVO
	 * @throws
	 */
	public DepartmentVO getDepartmentInfo(int dep_no);

	/**
	 * 학과개설 정보 INSERT
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
	 * 학과 폐지정보 UPDATE
	 * 
	 * @param int
	 * @return
	 * @throws
	 */
	public void updateDepartmentOnOff(int dep_no);
}
