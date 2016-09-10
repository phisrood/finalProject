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
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 등록
	@RequestMapping(value="/cyberCampus/pro/cyberNoticeInsert", method=RequestMethod.GET)
	public String noticeBBSInsert(@RequestParam(value="file", defaultValue = "1")MultipartFile multipartFile,
			HttpSession session, HttpServletRequest request) throws IOException{
		String url="/cyberCampus/common/cyberNoticeInsertPro";
		
		
		/*LN_NO 공지사항번호
		LN_LEC_NO 강의등록번호
		LN_PRO_USE_ID 작성자
		LN_AF_NO 파일번호
		LN_TITLE 제목 
		LN_CONTENT 내용
		LN_DATE 작성일*/
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String proId = loginUser.getUse_id();
		String pro_lec_no = (String) session.getAttribute("pro_lec_no");
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/pro/CycamNotice");
		
		Lecture_NoticeVO lecture_NoticeVO = new Lecture_NoticeVO();
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		
		
	
		if(!multipartFile.isEmpty()){
			File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);	
			attachment_FileVO.setAf_aftername(file.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
		
			///인설트부터 시작
		}
		
		
		
		
		
		
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판 삭제
	@RequestMapping(value="/cyberCampus/emp/cyberNoticeDelete", method=RequestMethod.GET)
	public String noticeBBSDelete(){
		String url="/cyberCampus/emp/cyberNoticeDelete";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//공지사항게시판수정
	@RequestMapping(value="/cyberCampus/emp/cyberNoticeUpdate", method=RequestMethod.GET)
	public String noticeBBSUpdate(){
		String url="/cyberCampus/emp/cyberNoticeUpdate";
		
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
	public String noticeBBSFileDown(){
		String url="";
		
		return url;
	}
}
