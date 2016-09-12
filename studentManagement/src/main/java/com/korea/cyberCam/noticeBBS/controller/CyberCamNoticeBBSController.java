package com.korea.cyberCam.noticeBBS.controller;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.korea.cyberCam.noticeBBS.service.CyberCamNoticeBBSService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Cyber_LectureNoticeViewVO;
import com.korea.dto.Lecture_NoticeVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamNoticeBBSController {
	
	@Autowired
	CyberCamNoticeBBSService cyberCamNoticeBBSService;
	
	//공지사항게시판 리스트(학생)
	@RequestMapping(value="/cyberCampus/stu/cyberNoticeList", method=RequestMethod.GET)
	public String noticeBBSList(HttpSession session, Model model){
		
		String url="/cyberCampus/common/cyberNoticeList";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String auth = loginUser.getAuthority();
		
		// 사이버캠퍼스 이동시 CyberCamMainController 에 심어둔 lec_no를 가져온다.
		int stu_lec_no = (int) session.getAttribute("stu_lec_no");
		List<Cyber_LectureNoticeViewVO> cyber_LectureNoticeViewVO = cyberCamNoticeBBSService.getNoticeBBSList(stu_lec_no);
		
		model.addAttribute("cyber_LectureNoticeViewVO",cyber_LectureNoticeViewVO);
		model.addAttribute("auth",auth);
		
		return url;
	}
	
	//공지사항게시판 리스트(교수)
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeList", method=RequestMethod.GET)
	public String noticeBBSListPro(HttpSession session, Model model){
		String url="/cyberCampus/common/cyberNoticePro";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String auth = loginUser.getAuthority();
		// 사이버캠퍼스 이동시 CyberCamMainController 에 심어둔 lec_no를 가져와서 또 쓸려고 stu_lec_no에 담아줌 어짜피 뷰
		int stu_lec_no =  Integer.parseInt((String) session.getAttribute("pro_lec_no"));
		List<Cyber_LectureNoticeViewVO> cyber_LectureNoticeViewVO = cyberCamNoticeBBSService.getNoticeBBSList(stu_lec_no);
		
		model.addAttribute("cyber_LectureNoticeViewVO",cyber_LectureNoticeViewVO);
		model.addAttribute("auth",auth);

		return url;
	}


	
	
	
	
	
	
	
	//공지사항게시판 상세보기(학생)
	@RequestMapping(value="/cyberCampus/stu/cyberNoticeDetail", method=RequestMethod.GET)
	public String noticeBBSDetail(int ln_no, Model model){
		String url = "/cyberCampus/common/cyberNoticeDetail";
		
		
		List<Cyber_LectureNoticeViewVO> cyber_LectureNoticeViewVO = cyberCamNoticeBBSService.getNoticeBBSDetail(ln_no);
		model.addAttribute("cyber_LectureNoticeViewVO",cyber_LectureNoticeViewVO);
		

		return url;
	}
	//공지사항게시판 상세보기(교수)
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeDetailPro", method=RequestMethod.GET)
	public String noticeBBSDetailPro(int ln_no, Model model){
		String url = "/cyberCampus/common/cyberNoticeDetailPro";
		

		List<Cyber_LectureNoticeViewVO> cyber_LectureNoticeViewVO = cyberCamNoticeBBSService.getNoticeBBSDetail(ln_no);
		model.addAttribute("cyber_LectureNoticeViewVO",cyber_LectureNoticeViewVO);
		
		return url;
	}

	//공지사항게시판 등록
	
	
	
	//글쓰기 페이지 이동
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeInsert", method=RequestMethod.GET)
	public String noticeBBSInsertPage(){
		String url="/cyberCampus/common/cyberNoticeInsertPro";
		return url;
		
	}
	
	
	

	@RequestMapping(value="/cyberCampus/pro/cyberNoticeInsertFileUploadContextInsert", method=RequestMethod.POST)
	public String noticeBBSInsert(@RequestParam(value="file", defaultValue = "1")MultipartFile multipartFile,
			HttpSession session, HttpServletRequest request
			) throws IOException{
		String url="redirect:/cyberCampus/pro/cyberNoticeList";
			
		
	
	
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String proId = loginUser.getUse_id();
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/pro/cyAF");

		
		Lecture_NoticeVO lecture_NoticeVO = new Lecture_NoticeVO();
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		
	
	
		if(!multipartFile.isEmpty()){
			File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);	
			attachment_FileVO.setAf_aftername(file.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
			
			
			cyberCamNoticeBBSService.insertNoticeFileUpload(attachment_FileVO);
			int af_No = cyberCamNoticeBBSService.getNoticeFileAf_no();
			
			lecture_NoticeVO.setLn_lec_no(Integer.parseInt(pro_lec_no));
			lecture_NoticeVO.setLn_af_no(af_No);
			lecture_NoticeVO.setLn_content(request.getParameter("content"));
			lecture_NoticeVO.setLn_title(request.getParameter("title"));
			lecture_NoticeVO.setLn_pro_use_id(proId);
			
			cyberCamNoticeBBSService.insertNoticeBBS(lecture_NoticeVO);

		
			 
			return url;
		}
		
		
		File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
		multipartFile.transferTo(file);	
		attachment_FileVO.setAf_aftername("default");
		attachment_FileVO.setAf_realname("default");
		attachment_FileVO.setAf_path("default");

		cyberCamNoticeBBSService.insertNoticeFileUpload(attachment_FileVO);
		int af_No = cyberCamNoticeBBSService.getNoticeFileAf_no();
		
		lecture_NoticeVO.setLn_lec_no(Integer.parseInt(pro_lec_no));
		lecture_NoticeVO.setLn_af_no(af_No);
		lecture_NoticeVO.setLn_content(request.getParameter("content"));
		lecture_NoticeVO.setLn_title(request.getParameter("title"));
		lecture_NoticeVO.setLn_pro_use_id(proId);
		
		cyberCamNoticeBBSService.insertNoticeBBS(lecture_NoticeVO);

		
		
		return url;
	}

	//공지사항게시판 삭제
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeInsertFileUploadContextDelete", method=RequestMethod.GET)
	public String noticeBBSDelete(HttpSession session, int ln_no){
		String url="redirect:/cyberCampus/pro/cyberNoticeList";
		
		
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		

		
		Map<String, String> params = new HashMap<String,String>();
		params.put("pro_lec_no", pro_lec_no);
		params.put("ln_no",ln_no+"");
		
		cyberCamNoticeBBSService.deleteNoticeBBS(params);
		
		return url;
	}

	//공지사항게시판수정 글리스트 불러오기
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeInsertFileUploadContextUpdate", method=RequestMethod.GET)
	public String noticeBBSUpdate(int ln_no, Model model){
		
		String url="/cyberCampus/common/cyberNoticeUpdatePro";
		
		List<Cyber_LectureNoticeViewVO> cyber_LectureNoticeViewVO = cyberCamNoticeBBSService.getNoticeBBSDetail(ln_no);
		model.addAttribute("cyber_LectureNoticeViewVO",cyber_LectureNoticeViewVO);

		return url;
	}
	
	
	//공지사항게시판수정GO
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeInsertFileUploadContextUpdateGo", method=RequestMethod.POST)
	public String noticeBBSUpdateGo( Model model, HttpSession session, HttpServletRequest request,
			@RequestParam(value="file", defaultValue = "1")MultipartFile multipartFile)throws IOException{
		
		String url="redirect:/cyberCampus/pro/cyberNoticeList";
		
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String proId = loginUser.getUse_id();
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/pro/cyAF");
		
		
		int af_no=Integer.parseInt(request.getParameter("af_no"));
	
		int ln_no=Integer.parseInt(request.getParameter("ln_no"));
	
		
		Lecture_NoticeVO lecture_NoticeVO = new Lecture_NoticeVO();
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		
		
		if(!multipartFile.isEmpty()){
			File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);
			attachment_FileVO.setAf_no(af_no);
			attachment_FileVO.setAf_aftername(file.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
		
			cyberCamNoticeBBSService.updateNoticeBBSFile(attachment_FileVO);
				
			
			lecture_NoticeVO.setLn_lec_no(Integer.parseInt(pro_lec_no));
			lecture_NoticeVO.setLn_af_no(af_no);
			lecture_NoticeVO.setLn_content(request.getParameter("content"));
			lecture_NoticeVO.setLn_title(request.getParameter("title"));
			lecture_NoticeVO.setLn_pro_use_id(proId);
			lecture_NoticeVO.setLn_no(ln_no);
			cyberCamNoticeBBSService.updateNoticeBBS(lecture_NoticeVO);
		
			 
			return url;
		}
	
		
		lecture_NoticeVO.setLn_lec_no(Integer.parseInt(pro_lec_no));
		lecture_NoticeVO.setLn_af_no(af_no);
		lecture_NoticeVO.setLn_content(request.getParameter("content"));
		lecture_NoticeVO.setLn_title(request.getParameter("title"));
		lecture_NoticeVO.setLn_pro_use_id(proId);
		lecture_NoticeVO.setLn_no(ln_no);
		cyberCamNoticeBBSService.updateNoticeBBS(lecture_NoticeVO);
	
		
		

		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//파일다운로드
	@RequestMapping(value="/cyberCampus/common/cyberNoticeFileDown", method=RequestMethod.GET)
	public ModelAndView noticeBBSFileDown(Model model, HttpSession session, 
			int af_no,HttpServletRequest request, 
			HttpServletResponse response)throws IOException{
		
	
			Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
			
			attachment_FileVO = cyberCamNoticeBBSService.getFileDownload(af_no);
			

			String downloadpath = request.getSession().getServletContext().getRealPath("resources/pro/cyAF");
			
			File file = new File(downloadpath,attachment_FileVO.getAf_aftername());
			
			if(file == null) {
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
				return null;
			}
			
			return new ModelAndView("download", "downloadFile", file);
		}
	
	
	
}
	
