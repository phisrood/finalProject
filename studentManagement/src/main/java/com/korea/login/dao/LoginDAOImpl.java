package com.korea.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.TestVO;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	SqlSession session;

	@Override
	public void getLoginPwdSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TestVO getLoginInfo(String id) {
		// TODO Auto-generated method stub
		return (TestVO) session.selectOne("Login.loginInfo", id);
	}

}
