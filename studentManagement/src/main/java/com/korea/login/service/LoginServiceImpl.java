package com.korea.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.TestVO;
import com.korea.login.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO dao;

	@Override
	public void getLoginPwdSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TestVO getLoginInfo(String id) {
		
		
		return dao.getLoginInfo(id);
		
	}

}
