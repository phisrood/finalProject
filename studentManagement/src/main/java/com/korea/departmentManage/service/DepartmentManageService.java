package com.korea.departmentManage.service;

public interface DepartmentManageService {

	//학과 정보 조회
	public String getDepartmentInfoList();
	
	//신설학과 등록
	public String insertDepartmentInfo();
	
	//학과 정보 수정
	public String updateDepartmentInfo();
	
	//학과 폐지(onoff)
	public String updateDepartmentOnOff();
}
