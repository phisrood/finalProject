package com.korea.graduRequire.dao;

public interface GraduRequireDAO {

	//졸업요건 불러오기
	public String getGraduRequireInfo();
	
	//졸업요건 등록
	public String insertGraduRequireInfo();
	
	//졸업요건 승인/반려
	public String updateGraduRequire();
}
