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
import java.util.ArrayList;
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
import com.korea.dto.Professor_InfoViewVO;
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
		/*String semester = departmentManageService.getSemester(id);*/
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
	
	/**
	 * 신청
	 * @param
	 * @return 
	 * @throws 
	 */
	//부/다전공 신청
	@RequestMapping(value="/stu/belongMinorREQ", method=RequestMethod.POST)
	public String belongMinorREQ(SubmitVO submitVO, @RequestParam("selec")int selec, HttpSession session,
			Model model){
		String url="/stu/majorREQList";
		Student_InfoViewVO studentInfo = (Student_InfoViewVO) session.getAttribute("studentInfo");
		List<DepartmentVO> departmentList = departmentManageService.getDepartmentInfoList();
		//같은 과번호를 찾아서 넣어
		for (int i = 0; i < departmentList.size(); i++) {
			if(departmentList.get(i).getDep_no() == submitVO.getSb_dep_no()){
				submitVO.setSb_dep_name(departmentList.get(i).getDep_name());
			}
		}
		int chk = 1; //window.close()를 위한 변수
		
		if(selec != 1){//부전공/다전공 신청이면 가서 신청
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
	//소속학과 신청내역 출력
	@RequestMapping(value="/pro/belongMinorREQList", method=RequestMethod.GET)
	public String belongMinorREQList(HttpSession session, Model model){
		String url="/pro/belongREQList";
		
		Professor_InfoViewVO proInfo = (Professor_InfoViewVO) session.getAttribute("professorInfo");
		String depno = proInfo.getDep_no();//신청한 기본키가져와서
		List<SubmitVO> reqList =majorREQService.getBelongMajorREQList(depno); //소속학과 리스트를 꺼내온다 
		List<Student_InfoViewVO> reqStuList = new ArrayList<Student_InfoViewVO>();//신청한 학생의 정보를 담을 리스트
		for (int i = 0; i < reqList.size(); i++) { // 신청한 사이즈만큼 돌리는데
			String id = reqList.get(i).getSb_stud_use_id(); //아이디 빼서
			Student_InfoViewVO basket = new Student_InfoViewVO(); //학생정보 담을 곳
			basket = majorREQService.getREQPersonInfo(id); //담아
			basket.setAf_no(reqList.get(i).getSb_no()); //담고 임시로 신청 기본키 af_no에 삽입 @@@@ 중요
			reqStuList.add(i, basket); //리스트에 삽입 
		}
		
		model.addAttribute("reqStuList", reqStuList);
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//타학과 신청내역 출력
	@RequestMapping(value="/pro/othersMinorREQList", method=RequestMethod.GET)
	public String othersMinorREQList(HttpSession session, Model model){
		String url="/pro/othersREQList";
		
		Professor_InfoViewVO proInfo = (Professor_InfoViewVO) session.getAttribute("professorInfo");
		String depno = proInfo.getDep_no();
		List<SubmitVO> reqList =majorREQService.getOthorsMajorREQList(depno);
		List<Student_InfoViewVO> reqStuList = new ArrayList<Student_InfoViewVO>();
		for (int i = 0; i < reqList.size(); i++) {
			String id = reqList.get(i).getSb_stud_use_id();
			Student_InfoViewVO basket = new Student_InfoViewVO();
			basket = majorREQService.getREQPersonInfo(id);
			basket.setAf_no(reqList.get(i).getSb_no()); //담고 임시로 신청 기본키 af_no에 삽입 @@@@ 중요
			reqStuList.add(i, basket);
		}
		
		model.addAttribute("reqStuList", reqStuList);
		
		return url;
	}
	
	//신청정보확인
	@RequestMapping(value="/pro/reqInfoDetail", method=RequestMethod.GET)
	public void reqStuDetail(HttpServletResponse response, @RequestParam("sb_no")String sb_no){
		SubmitVO submitInfo = majorREQService.getReqStuInfo(sb_no);
		String id = submitInfo.getSb_stud_use_id();
		Map<String, Object> result = majorREQService.getScore(id);
		int semes = (int) result.get("semes");
		float score = (float) result.get("score");
		
		submitInfo.setSb_dep_no(semes);//임시 이수핛점
		submitInfo.setScore(score); //평균학점
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(submitInfo);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
		
	}
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//소속학과 부전공신청내역 승인/반려
	@RequestMapping(value="/pro/belongREQDecide", method=RequestMethod.GET)
	public String belongMinorREQDecide(@RequestParam("sb_no")String sb_no, 
										@RequestParam("result")int result, Model model){
		String url="redirect:/pro/belongMinorREQList";
		
		int resultChk = majorREQService.updateReqDecide(sb_no, result);
		
		model.addAttribute("resultChk", resultChk);
		
		return url;
	}
	//소속학과 부전공신청내역 승인/반려
	@RequestMapping(value="/pro/othersREQDecide", method=RequestMethod.GET)
	public String othersMinorREQDecide(@RequestParam("sb_no")String sb_no, 
			@RequestParam("result")int result, Model model){
		String url="redirect:/pro/othersMinorREQList";
		
		int resultChk = majorREQService.updateReqDecide(sb_no, result);
		
		model.addAttribute("resultChk", resultChk);
		
		return url;
	}
}
