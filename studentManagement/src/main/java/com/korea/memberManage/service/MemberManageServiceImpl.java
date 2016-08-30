package com.korea.memberManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.UsersVO;
import com.korea.memberManage.dao.MemberManageDAO;

@Service
public class MemberManageServiceImpl implements MemberManageService{

	@Autowired
	private MemberManageDAO memberManageDAO; 
	
	@Override
	public String getStuInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertStuInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStuInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStuInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProInfoList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String updateProInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateproInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmpInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmpInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentVO> getDepartmentList() {
		// TODO Auto-generated method stub
		return memberManageDAO.getDepartmentList();
	}

	@Override
	public void insertProInfo(ProfessorVO professorVO, String name) {
		
		
		UsersVO usersVO = new UsersVO();
		usersVO.setAuthority("ROLE_PRO");
		usersVO.setUse_kind("professor");
		usersVO.setUse_name(name);
		usersVO.setUse_pwd(professorVO.getPro_regno1());
		usersVO=memberManageDAO.insertUserProInfo(usersVO);
		professorVO.setPro_use_id(usersVO.getUse_id());
		memberManageDAO.insertProInfo(professorVO);
		

		
	}

}
