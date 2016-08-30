package com.korea.memberManage.service;

import java.util.List;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorVO;

public interface MemberManageService {
	
	//학생 정보 조회
	public String getStuInfoList();
	
	//학생 정보 등록
	public String insertStuInfo();
	
	//학생 정보 수정
	public String updateStuInfo();
	
	//학생 정보 비활성화
	public String updateStuInfoOnOff();
	
	
	
	//교수 정보 조회
	public String getProInfoList();
	
	//교수 정보 등록
	public void insertProInfo(ProfessorVO professorVO, String name);
	
	//교수 정보 수정
	public String updateProInfo();
	
	//교수 정보 비활성화
	public String updateproInfoOnOff();
	
	
	
	//교직원 정보 조회
	public String getEmpInfoList();
	
	//교직원 정보 등록
	public String insertEmpInfo();
	
	//교직원 정보 수정
	public String updateEmpInfo();
	
	//교직원 정보 비활성화
	public String updateEmpInfoOnOff();

	//학과정보 가져오기
	public List<DepartmentVO> getDepartmentList();

}
