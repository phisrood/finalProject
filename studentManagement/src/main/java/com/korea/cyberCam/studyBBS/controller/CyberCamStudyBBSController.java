package com.korea.cyberCam.studyBBS.controller;
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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.korea.cyberCam.studyBBS.service.CyberCamStudyBBSService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LearningRoomViewVO;
import com.korea.dto.Learning_RoomVO;
import com.korea.dto.NoticeViewVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamStudyBBSController implements ApplicationContextAware {
	
	
	@Autowired
	private CyberCamStudyBBSService cyberCamStudyBBSService;
	
	//파일다운로드
	private WebApplicationContext context= null;
	/**
	 * 학습자료실 리스트
	 * @param	Model ,session
	 * @return 	String
	 * @throws 
	 */
	@RequestMapping(value={"/cyberCampus/stu/studyBBSList","/cyberCampus/pro/studyBBSList"}, method=RequestMethod.GET)
	public String studyBBSList(Model model, HttpSession session){
		String url="/cyberCampus/common/studyBBSList";
		String lec_no = "";
		
		UsersVO user = (UsersVO) session.getAttribute("loginUser");
		if(user.getAuthority().equals("ROLE_STU")){
			int lec_no2 = 0;
			lec_no2 = (int) session.getAttribute("stu_lec_no");
			lec_no =  Integer.toString(lec_no2);
		}else if(user.getAuthority().equals("ROLE_PRO")){
			lec_no = (String) session.getAttribute("pro_lec_no");
			
		}
		
		List<LearningRoomViewVO> studyBBSList = cyberCamStudyBBSService.getStudyBBSList(lec_no);
		model.addAttribute("studyBBSList", studyBBSList);
		
		return url;
	}
	
	/**
	 * 학습게시판 등록FORM이동
	 * @param
	 * @return 	String
	 * @throws 
	 */
	@RequestMapping(value="/cyberCampus/pro/studyBBSInsertForm")
	public String studyBBSInsertForm(){
		String url="/cyberCampus/pro/studyBBSInsert";
	
		return url;
	}
	
	/**
	 * 학습게시판 등록
	 * @param
	 * @return  String
	 * @throws 
	 */
	//학습게시판 등록
	@RequestMapping(value="/cyberCampus/pro/studyBBSInsert", method=RequestMethod.POST)
	public String studyBBSInsert(Learning_RoomVO learning_RoomVO, Model model, HttpServletRequest request, HttpSession session,
			@RequestParam(value="file", defaultValue="")MultipartFile multipartFile) throws IOException{
		String url="redirect:/cyberCampus/pro/studyBBSList";
		
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/pro/studyBBSAF");
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		String id=usersVO.getUse_id();
		learning_RoomVO.setLr_pro_use_id(id);
		learning_RoomVO.setLr_lec_no(Integer.parseInt(pro_lec_no.trim()));
		
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		if(!multipartFile.isEmpty()){
			File studyBBSFile= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(studyBBSFile);	
			attachment_FileVO.setAf_aftername(studyBBSFile.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
		}
		
		cyberCamStudyBBSService.insertStudyBBS(learning_RoomVO,attachment_FileVO);
		
		return url;
	}
	
	/**
	 * 학습게시판 파일다운로드
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/cyberCampus/common/studyBBSFileDown", method=RequestMethod.GET)
	public ModelAndView download(@RequestParam(value="af_aftername") String af_aftername, HttpServletResponse response) throws IOException {
		File downloadFile = getFile(af_aftername);
		if(downloadFile == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		return new ModelAndView("download","downloadFile", downloadFile);
	}
	
	private File getFile(String fileId) {
		String baseDir = context.getServletContext().getRealPath("resources/pro/studyBBSAF");
			return new File(baseDir,fileId);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context=(WebApplicationContext)applicationContext;		
	}
	
	/**
	 * 학습게시판 상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	//학습게시판 상세보기
	@RequestMapping(value={"/cyberCampus/stu/studyBBSDetail","/cyberCampus/pro/studyBBSDetail"}, method=RequestMethod.GET)
	public String studyBBSDetail(int lr_no,Model model){
		String url = "/cyberCampus/common/studyBBSDetail";
		
		LearningRoomViewVO learningRoomViewVO = cyberCamStudyBBSService.getStudyBBSDetail(lr_no);
		
		model.addAttribute("learningRoomViewVO", learningRoomViewVO);
		
		return url;
	}
	
	/**
	 * 학습게시판수정 폼이동
	 * @param
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/cyberCampus/pro/studyBBSUpdateForm", method=RequestMethod.GET)
	public String updateStudyBBSForm(@RequestParam(value="studyBBS_no")String studyBBS_no, Model model){
		String url="/cyberCampus/pro/studyBBSUpdate";
		LearningRoomViewVO studyBBSVO= cyberCamStudyBBSService.getStudyBBSDetail(Integer.parseInt(studyBBS_no));
		
		model.addAttribute("studyBBSDetailViewVO", studyBBSVO);
		
		return url;
	}
	
	/**
	 * 학습게시판수정
	 * @param	learning_RoomVO,attachment_FileVO,file_no,request,session
	 * @return 
	 * @throws 
	 */
	@RequestMapping(value="/cyberCampus/pro/studyBBSUpdate", method=RequestMethod.POST)
	public String studyBBSUpdate(Learning_RoomVO learning_RoomVO, Attachment_FileVO attachment_FileVO,HttpServletRequest request, HttpSession session,
			@RequestParam(value="file", defaultValue="")MultipartFile multipartFile, @RequestParam(value="file_no", defaultValue="0")String file_no) throws IOException{
		String url="redirect:/cyberCampus/pro/studyBBSList";
		
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/pro/studyBBSAF");
		UsersVO usersVO = (UsersVO) session.getAttribute("loginUser");
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		String id= usersVO.getUse_id();
		
		learning_RoomVO.setLr_pro_use_id(id);
		learning_RoomVO.setLr_lec_no(Integer.parseInt(pro_lec_no.trim()));
		if(!multipartFile.isEmpty()){
			File studyBBSFile = new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(studyBBSFile);
			attachment_FileVO.setAf_aftername(studyBBSFile.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
		
		}
		
		cyberCamStudyBBSService.updateStudyBBS(learning_RoomVO, attachment_FileVO);
		
		return url;
	}
	
	
	/**
	 * 학습게시판삭제
	 * @param 	learning_RoomVO
	 * @return  String
	 * @throws 
	 */
	@RequestMapping(value="/cyberCompus/pro/studyBBSDelete", method=RequestMethod.GET)
	public String studyBBSDelete(Learning_RoomVO learning_RoomVO){
		String url="redirect:/cyberCampus/pro/studyBBSList";
		
		cyberCamStudyBBSService.deleteStudyBBS(learning_RoomVO);
		return url;
	}
	
	
	
}
