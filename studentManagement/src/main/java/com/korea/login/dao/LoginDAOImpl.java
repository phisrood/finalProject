package com.korea.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.UsersVO;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	SqlSession session;

	@Override
	public void getLoginPwdSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsersVO getLoginInfo(String id) {
		return (UsersVO) session.selectOne("Login.loginInfo", id);
	}



}
