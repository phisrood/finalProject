package com.korea.memberManage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorDetailViewVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.ProfessorViewVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;
import com.korea.memberManage.service.MemberManageService;

/**
 * @Class Name : MemberManageController.java
 * @Description : 구성원 정보 조회 / 등록 / 수정 / 비활성화
 * @Modification Information
 * @author 조현욱
 * @since 2016.08.29.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 *    2016.08.29.	김양문			학생등록
 *    2016.08.29.	이수정			교수등록
 *    2016.08.30.	이수정			교수조회
 *    2016.08.30.	이수정			교수수정
 *    2016.08.31.	이수정			교수비활성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */

@Controller
public class MemberManageController {

	@Autowired
	private MemberManageService memberManagerService;

	// 학생정보조회
	/**
	 * 학생 정보 조회화면 이동
	 * 
	 * @param
	 * @return
	 * @throws
	 */

	@RequestMapping(value = "/emp/stuInfoList", method = RequestMethod.GET)
	public String stuInfoList(Model model, HttpServletResponse response) {

		String url = "redirect:/emp/proInfoList";

		List<StudentVO> studentList = memberManagerService.getStuInfoList();
		model.addAttribute("studentList", studentList);

		return url;
	}
	/**
	 * 학생 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	
	@RequestMapping(value = "/emp/stuInfo", method = RequestMethod.GET)
	public void stuInfo(Model model, HttpServletResponse response) {
		
		List<StudentVO> studentList = memberManagerService.getStuInfoList();
		ObjectMapper jsonObject = new ObjectMapper();
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(studentList);
			response.getWriter().print(str);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 학생 정보 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */

	// 학생정보등록
	@RequestMapping(value = "/emp/stuInfoInsert", method = RequestMethod.POST)
	public String stuInfoInsert(MultipartHttpServletRequest request) {

		String url = "/emp/stuInfoList";
		MultipartFile file = request.getFile("studentList");
		memberManagerService.insertStuInfo(file);

		return url;
	}

	/**
	 * 학생 정보 등록 ( 신입생 엑셀 등록 )
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/emp/stuInfoInsertExcel", method = RequestMethod.GET)
	public String stuInfoInsertExcel() {
		String url = "";

		return url;
	}
	
	
	

	/**
	 * 학생 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/emp/stuInfoUpdate", method = RequestMethod.GET)
	public String stuInfoUpdate() {
		String url = "";

		return url;
	}

	/**
	 * 학생 정보 비활성화 ( on / off )
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@RequestMapping(value = "/emp/proInfoOnOff", method = RequestMethod.POST)
	public String stuInfoOnOff(String[] pro_use_id) {
		String url = "redirect:/emp/proInfoList";
		
		for (int i = 0; i < pro_use_id.length; i++) {
			System.out.println(pro_use_id[i]);
			memberManagerService.updateProInfoOnOff(pro_use_id[i]);
		}

		return url;
	}

	// /////////////////////////교수/////////////////////////

	/**
	 * 교수 정보 전체조회
	 * 
	 * @param Model
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/proInfoList", method = RequestMethod.GET)
	public String proInfoList(Model model) {
		String url = "/emp/stuInfoList";

		List<ProfessorViewVO> professorList = memberManagerService.getProInfoList();
		model.addAttribute("professorList", professorList);

		return url;
	}
	

	/**
	 * 교수정보등록Form, 학과번호 콤보박스list
	 * 
	 * @param Model
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/proInfoInsertForm", method = RequestMethod.GET)
	public String proInfoInsertForm(Model model) {
		String url = "/emp/proInfoInsert";

		List<DepartmentVO> departmentList = memberManagerService.getDepartmentList();

		model.addAttribute("departmentList", departmentList);

		return url;
	}

	/**
	 * 교수 정보 등록
	 * 
	 * @param String,ProfessorVO
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/proInfoInsert", method = RequestMethod.POST)
	public String proInfoInsert(UsersVO usersVO, ProfessorVO professorVO) {
		String url = "redirect:/emp/stuInfoList";
		
		memberManagerService.insertProInfo(professorVO, usersVO);

		return url;
	}
	/**
	 * 교수 정보 상세보기
	 * 
	 * @param Model,String
	 * @return String
	 * @throws
	 */
	@RequestMapping(value = "/emp/proInfoDetail", method = RequestMethod.GET)
	public String proInfoDetail(@RequestParam(value="pro_use_id", defaultValue = "")String pro_use_id,Model model) {
		String url = "/emp/proInfoUpdate";
		
		
		ProfessorDetailViewVO professorDetailViewVO = memberManagerService.getDetailProInfo(pro_use_id);
		List<DepartmentVO> departmentList = memberManagerService
				.getDepartmentList();

		model.addAttribute("departmentList", departmentList);
		model.addAttribute("professorDetailViewVO",professorDetailViewVO);
		
		
		return url;
	}
	/**
	 * 교수 정보 수정,비활성화
	 * 
	 * @param String, ProfessorVO
	 * @return String
	 * @throws 
	 */
	@RequestMapping(value = "/emp/proInfoUpdate", method = RequestMethod.POST)
	public String proInfoUpdate(UsersVO usersVO, ProfessorVO professorVO) {
		String url = "redirect:/emp/stuInfoList";
		
		memberManagerService.updateProInfo(professorVO, usersVO);
		
		return url;
	}
	
	


}
