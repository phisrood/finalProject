package com.korea.departmentManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.departmentManage.service.DepartmentManageService;
import com.korea.dto.DepartmentVO;

/**
 * @Class Name : DepartmentManageController.java
 * @Description : 학과정보 관리 클래스
 * @Modification Information
 * @author 이건원
 * @since 2016.08.29.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Controller
public class DepartmentManageController {

	@Autowired
	private DepartmentManageService departmentManageService;

	/**
	 * 학과정보 전체 SELECT
	 * 
	 * @param
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/departmentInfoList")
	public String departmentInfoList(Model model) {
		String url = "/emp/departmentInfoList";

		List<DepartmentVO> departmentList = departmentManageService
				.getDepartmentInfoList();
		
		//화면상의 NO값을 위한 전체 길이
		model.addAttribute("departmentListSize", departmentList.size());
		model.addAttribute("departmentList", departmentList);

		return url;
	}

	/**
	 * 학과개설 등록 양식
	 * 
	 * @param
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/departmentInsertForm")
	public String departmentInsertForm() {
		String url = "/emp/departmentInsert";

		return url;
	}

	/**
	 * 학과개설 정보 INSERT
	 * 
	 * @param DepartmentVO
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/departmentInsert", method = RequestMethod.POST)
	public String departmentInsert(DepartmentVO departmentVO) {
		String url = "redirect:/emp/departmentInfoList";
		departmentManageService.insertDepartmentInfo(departmentVO);
		return url;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param int
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/departmentUpdateForm", method = RequestMethod.GET)
	public String departmentUpdateForm(Model model, int dep_no) {
		String url = "/emp/departmentUpdate";

		DepartmentVO department = departmentManageService
				.getDepartmentInfo(dep_no);

		model.addAttribute("department", department);
		return url;
	}

	/**
	 * 학과정보 UPDATE  
	 * 
	 * @param DepartmentVO
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/departmentUpdate", method = RequestMethod.POST)
	public String departmentUpdate(Model model, DepartmentVO departmentVO) {
		String url = "redirect:/emp/departmentInfoList";
		departmentManageService.updateDepartmentInfo(departmentVO);
		return url;
	}

	/**
	 * 학과 폐지여부 UPDATE
	 * 
	 * @param String[]
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/departmentOnOff", method = RequestMethod.POST)
	public String departmentOnOff(String[] dep_no, Model model) {
		String url = "redirect:/emp/departmentInfoList";
		
		//배열에 담긴 체크항목을 반복문을 통해 update
		for (int i = 0; i < dep_no.length; i++) {
			departmentManageService.updateDepartmentOnOff(Integer
					.parseInt(dep_no[i]));
		}

		return url;
	}
}
