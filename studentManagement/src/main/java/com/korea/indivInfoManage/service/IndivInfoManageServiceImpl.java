package com.korea.indivInfoManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.StudentVO;
import com.korea.indivInfoManage.dao.IndivInfoManageDAO;

@Service
public class IndivInfoManageServiceImpl implements IndivInfoManageService{

	@Autowired
	private IndivInfoManageDAO indivInfoManageDAO;
	
	@Override
	public StudentVO getIndivInfo(String id) {
		return indivInfoManageDAO.getIndivInfo(id);
		
	}

	@Override
	public String updateIndiv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColleageChangeList() {
		// TODO Auto-generated method stub
		return null;
	}

}
