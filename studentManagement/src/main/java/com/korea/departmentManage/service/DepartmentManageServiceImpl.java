package com.korea.departmentManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.departmentManage.dao.DepartmentManageDAO;
import com.korea.dto.DepartmentVO;

@Service
public class DepartmentManageServiceImpl implements DepartmentManageService {

	@Autowired
	DepartmentManageDAO departmentManageDAO;

	@Override
	public List<DepartmentVO> getDepartmentInfoList() {
		List<DepartmentVO> departmentList = departmentManageDAO
				.getDepartmentInfoList();
		return departmentList;
	}

	@Override
	public DepartmentVO getDepartmentInfo(int dep_no) {
		DepartmentVO department = departmentManageDAO.getDepartmentInfo(dep_no);
		return department;
	}

	@Override
	public void insertDepartmentInfo(DepartmentVO departmentVO) {
		departmentManageDAO.insertDepartmentInfo(departmentVO);
	}

	@Override
	public void updateDepartmentInfo(DepartmentVO departmentVO) {
		departmentManageDAO.updateDepartmentInfo(departmentVO);
	}

	@Override
	public void updateDepartmentOnOff(int dep_no) {
		departmentManageDAO.updateDepartmentOnOff(dep_no);
	}

}
