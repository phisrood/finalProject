package com.korea.cyberCam.task.controller;
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
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.korea.cyberCam.task.service.CyberCamTaskService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.HomeworkAllList_ViewVO;
import com.korea.dto.HomeworkVO;
import com.korea.dto.Homework_ViewVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamTaskController {

	
	@Autowired
	CyberCamTaskService cyberCamTaskService;
	
	
	
	//교수 과제등록
	@RequestMapping(value="/cyberCampus/pro/taskSubmitInsert", method=RequestMethod.POST)
	public String taskReg(HttpSession session,HttpServletRequest req,
			
			
			@RequestParam(value="testDatepickerStart")String testDatepickerStart,
			@RequestParam(value="testDatepickerEnd")String testDatepickerEnd,
			@RequestParam(value="file")MultipartFile multipartFile,
			@RequestParam(value="title")String title,
			@RequestParam(value="content")String content
			
			
			)throws IOException{
		String url = "redirect:/cyberCampus/pro/taskSubmitListPro";
	
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String proId = loginUser.getUse_id();
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		String uploadPath = req.getSession().getServletContext().getRealPath("resources/pro/cyAF");
		
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		HomeworkVO homeworkVO = new HomeworkVO();

		if(!multipartFile.isEmpty()){
			File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);	
			attachment_FileVO.setAf_aftername(file.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
			
			
			//첨부파일 등록 및 첨부파일번호 가져오기
			int af_no = cyberCamTaskService.insertTaskReg(attachment_FileVO);
			
	
			homeworkVO.setHw_af_no(af_no);
			homeworkVO.setHw_lec_no(Integer.parseInt(pro_lec_no));
			homeworkVO.setHw_pro_use_id(proId);
			homeworkVO.setHw_title(title);
			homeworkVO.setHw_content(content);
			homeworkVO.setHw_startdate(testDatepickerStart);
			homeworkVO.setHw_enddate(testDatepickerEnd);
			//게시글 등록
			cyberCamTaskService.insertTaskWrite(homeworkVO);
			
		
			return url;
		
		}
		
		//첨부파일이 없을시
		homeworkVO.setHw_lec_no(Integer.parseInt(pro_lec_no));
		homeworkVO.setHw_pro_use_id(proId);
		homeworkVO.setHw_title(title);
		homeworkVO.setHw_content(content);
		homeworkVO.setHw_startdate(testDatepickerStart);
		homeworkVO.setHw_enddate(testDatepickerEnd);
		cyberCamTaskService.insertTaskWriteNotFile(homeworkVO);
		
		
		
		return url;
	}


	//과제제출리스트(학생)
	@RequestMapping(value="/cyberCampus/stu/taskSubmitListStu", method=RequestMethod.GET)
	public String taskSubmitListStu(HttpSession session, Model model){
		String url = "redirect:/cyberCampus/pro/taskSubmitList";
		
		int pro_lec_no = (int) session.getAttribute("stu_lec_no");
		

		List<HomeworkAllList_ViewVO> homeworkAllList_ViewVO = cyberCamTaskService.getTaskListStu(pro_lec_no);
		model.addAttribute("homeworkAllList_ViewVO",homeworkAllList_ViewVO);
		
		
		return url;
	}
	//과제제출리스트(교수)
	@RequestMapping(value="/cyberCampus/pro/taskSubmitListPro", method=RequestMethod.GET)
	public String taskSubmitListPro(HttpSession session, Model model){
		String url = "cyberCampus/pro/taskSubmitListPro";
		
	
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		List<HomeworkAllList_ViewVO> homeworkAllList_ViewVO = cyberCamTaskService.getTaskListPro(pro_lec_no);
		model.addAttribute("homeworkAllList_ViewVO",homeworkAllList_ViewVO);
		
		
		return url;
	}
	
	//과제게시판 상세페이지(교수)
	@RequestMapping(value="/cyberCampus/pro/taskSubmitListDetail", method=RequestMethod.GET)
	public String taskInsertListPro(@RequestParam(value="hw_no")String hw_no,
									HttpSession session, Model model) {
		String url = "cyberCampus/pro/taskListDetailPro";
		
		HomeworkAllList_ViewVO homeworkAllList_ViewVO = cyberCamTaskService.getTaskListProDetail(hw_no);
		model.addAttribute("homeworkAllList_ViewVO",homeworkAllList_ViewVO);
		
		
		return url;
	}
	
	
	//과제등록페이지 이동(교수)
	@RequestMapping(value="/cyberCampus/pro/taskSubmitListMove", method=RequestMethod.GET)
	public String taskSubmit(){
		String url = "/cyberCampus/pro/taskListInsert";
		
		return url;
		
		
		
	}

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//과제수정
	@RequestMapping(value="/stu/taskUpdate", method=RequestMethod.GET)
	public String taskUpdate(){
		String url ="";
		
		return url;
	}
}
