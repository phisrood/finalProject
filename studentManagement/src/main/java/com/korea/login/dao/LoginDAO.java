package com.korea.login.dao;

import com.korea.dto.TestVO;

public interface LoginDAO {

	//로그인 액터별 VO 분기
	public TestVO getLoginInfo(String id);
	
	//비밀번호찾기
	public void getLoginPwdSearch();
}
