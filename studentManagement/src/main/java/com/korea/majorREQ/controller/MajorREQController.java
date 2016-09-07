package com.korea.majorREQ.controller;
/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.departmentManage.service.DepartmentManageService;
import com.korea.dto.DepartmentVO;
import com.korea.dto.Student_InfoViewVO;
import com.korea.dto.SubmitVO;
import com.korea.dto.UsersVO;
import com.korea.majorREQ.service.MajorREQService;

@Controller
public class MajorREQController {
	
	@Autowired
	private DepartmentManageService departmentManageService;
	@Autowired
	private MajorREQService majorREQService;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//부/다전공신청 메인
	@RequestMapping(value="/stu/minorMain", method=RequestMethod.GET)
	public String minorREQMain(){
		String url="/stu/majorREQList";
		
		return url;
	}
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//부전공 신청양식 출력
	@RequestMapping(value="/stu/minorModel", method=RequestMethod.GET)
	public String minorREQModel(Model model, HttpSession session){
		String url="/stu/minorModel";
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();	
		List<DepartmentVO> departmentList = departmentManageService.getDepartmentInfoList();
		Map<String, Object> result = majorREQService.getScore(id);
		float score = (float) result.get("score");
		int semes = (int) result.get("semes");
		
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("score", score);
		model.addAttribute("semes", semes);
		
		return url;
	}
	
	//부/다전공 신청 리스트 출력
	@RequestMapping(value="/stu/minorList", method=RequestMethod.GET)
	public void reqList(HttpSession session, HttpServletResponse response){
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();	
		
		List<SubmitVO> submitList = majorREQService.getReqList(id);
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(submitList);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	}
	///////////////////////// 부전공 ////////////////////////////
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//부전공 신청
	@RequestMapping(value="/stu/belongMinorREQ", method=RequestMethod.POST)
	public String belongMinorREQ(SubmitVO submitVO, @RequestParam("selec")int selec, HttpSession session,
			Model model){
		String url="/stu/majorREQList";
		Student_InfoViewVO studentInfo = (Student_InfoViewVO) session.getAttribute("studentInfo");
		int chk = 1;
		
		if(selec != 0){
			majorREQService.insertBelongMinorREQ(studentInfo, submitVO, selec);
		}
		
		model.addAttribute("chk", chk);
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 부전공 신청내역 출력
	@RequestMapping(value="/pro/belongMinorREQList", method=RequestMethod.GET)
	public String belongMinorREQList(){
		String url="/pro/belongMinorREQList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 부전공신청내역 승인/반려
	@RequestMapping(value="/pro/belongMinorREQDecide", method=RequestMethod.GET)
	public String belongMinorREQDecide(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 부전공 신청내역 출력
	@RequestMapping(value="/pro/othersMinorREQList", method=RequestMethod.GET)
	public String othersMinorREQList(){
		String url="/pro/othersMinorREQList";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 부전공신청내역 승인/반려
	@RequestMapping(value="/pro/othersMinorREQDecide", method=RequestMethod.GET)
	public String othersMinorREQDecide(){
		String url="";
		
		return url;
	}
	
	///////////////////////// 다전공 ////////////////////////////
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//다전공 신청
	@RequestMapping(value="/stu/belongMajorREQ", method=RequestMethod.GET)
	public String belongMajorREQ(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 다전공 신청내역 출력
	@RequestMapping(value="/pro/belongMajorREQList", method=RequestMethod.GET)
	public String belongMajorREQList(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 다전공신청내역 승인/반려
	@RequestMapping(value="/emp/belongMajorREQDecide", method=RequestMethod.GET)
	public String belongMajorREQDecide(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 다전공 신청내역 출력
	@RequestMapping(value="/pro/othersMajorREQList", method=RequestMethod.GET)
	public String othersMajorREQList(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 다전공신청내역 승인/반려
	@RequestMapping(value="/emp/othersMajorREQDecide", method=RequestMethod.GET)
	public String othersMajorREQDecide(){
		String url="";
		
		return url;
	}
}
