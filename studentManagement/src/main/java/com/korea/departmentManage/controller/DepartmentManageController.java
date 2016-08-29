package com.korea.departmentManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.departmentManage.service.DepartmentManageService;
import com.korea.dto.DepartmentVO;

@Controller
public class DepartmentManageController {

	@Autowired
	private DepartmentManageService departmentManageService;

	// 학과정보조회
	@RequestMapping(value = "/emp/departmentInfoList")
	public String departmentInfoList(Model model) {
		String url = "/emp/departmentInfoList";

		List<DepartmentVO> departmentList = departmentManageService
				.getDepartmentInfoList();
		model.addAttribute("departmentListSize", departmentList.size());
		model.addAttribute("departmentList", departmentList);

		return url;
	}

	// 신설학과 등록 양식
	@RequestMapping(value = "/emp/departmentInsertForm", method = RequestMethod.GET)
	public String departmentInsertForm() {
		String url = "/emp/departmentInsert";

		return url;
	}

	// 신설학과 등록
	@RequestMapping(value = "/emp/departmentInsert", method = RequestMethod.POST)
	public String departmentInsert(DepartmentVO departmentVO) {
		String url = "redirect:/emp/departmentInfoList";
		departmentManageService.insertDepartmentInfo(departmentVO);
		return url;
	}

	// 학과정보 수정 양식
	@RequestMapping(value = "/emp/departmentUpdateForm", method = RequestMethod.GET)
	public String departmentUpdateForm(Model model, int dep_no) {
		String url = "/emp/departmentUpdate";

		DepartmentVO department = departmentManageService
				.getDepartmentInfo(dep_no);

		model.addAttribute("department", department);
		return url;
	}

	// 학과정보 수정
	@RequestMapping(value = "/emp/departmentUpdate", method = RequestMethod.POST)
	public String departmentUpdate(Model model, DepartmentVO departmentVO) {
		String url = "redirect:/emp/departmentInfoList";
		departmentManageService.updateDepartmentInfo(departmentVO);
		return url;
	}

	// 학과폐지
	@RequestMapping(value = "/emp/departmentOnOff", method = RequestMethod.POST)
	public String departmentOnOff(String[] dep_no, Model model) {
		String url = "redirect:/emp/departmentInfoList";

		for (int i = 0; i < dep_no.length; i++) {
			departmentManageService.updateDepartmentOnOff(Integer
					.parseInt(dep_no[i]));
		}

		return url;
	}
}
