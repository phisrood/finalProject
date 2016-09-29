package com.korea.cyberCam.qnaBBS.controller;
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korea.cyberCam.qnaBBS.service.CyberCamQnaBBSService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LectureViewVO;
import com.korea.dto.Professor_InquiryList_ViewVO;
import com.korea.dto.Ques_CommentsVO;
import com.korea.dto.Quesbbs_ViewVO;
import com.korea.dto.Question_BoardListVO;
import com.korea.dto.Question_BoardVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamQnaBBSController {
	
	
	
	@Autowired
	CyberCamQnaBBSService cyberCamQnaBBSService;
	
	
							
	@RequestMapping(value="/cyberCampus/pro/qnaCommentInsert", method=RequestMethod.GET)
	public void qnaCommentInsertPro( HttpSession session, HttpServletResponse response,
			@RequestParam(value="qb_no") String qb_no,		
			@RequestParam(value="comment") String comment
			){
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();
		
		Map<String, String> params = new HashMap<String, String>();
		
		params.put("qb_no", qb_no);
		params.put("comment", comment);
		params.put("id", id);
		
		Quesbbs_ViewVO quesVO = cyberCamQnaBBSService.insertComment(params);
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(quesVO);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
	
		
	}
	
	//댓글수정
	@RequestMapping(value="/cyberCampus/pro/qnaCommentUpdate", method=RequestMethod.GET)
	public void qnaCommentUpdatePro( HttpSession session, HttpServletResponse response,
			@RequestParam(value="qb_no") String qb_no,		
			@RequestParam(value="comment") String comment
			){
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String id = loginUser.getUse_id();
		
		Map<String, String> params = new HashMap<String,String>();
		params.put("id", id);
		params.put("qb_no", qb_no);
		params.put("comment", comment);
		
		cyberCamQnaBBSService.updateCommentQnaBBS(params);
		Quesbbs_ViewVO quesVO = cyberCamQnaBBSService.selectCommentQnaBBS(qb_no);
		
		ObjectMapper jsonObject = new ObjectMapper();
		
		try {
			response.setContentType("text/json; charset=utf-8;");
			String str = jsonObject.writeValueAsString(quesVO);
			response.getWriter().print(str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ei){
			ei.printStackTrace();
		}
		
	}
	
	//qna게시판 리스트(학생)
	@RequestMapping(value="/cyberCampus/stu/qnaBBSList", method=RequestMethod.GET)
	public String qnaBBSList(Model model, HttpSession session){
		String url="/cyberCampus/common/qnaBBSList";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
		String auth = loginUser.getAuthority();
		
		
		int stu_lec_no = (int) session.getAttribute("stu_lec_no");

		Map<String, String> lecNoInContext = new HashMap<String, String>();
		lecNoInContext.put("stu_lec_no", stu_lec_no+"");
		lecNoInContext.put("stud_use_id", stud_use_id);
		
		List<Question_BoardListVO> question_BoardListVO = cyberCamQnaBBSService.getQnaBBSList(lecNoInContext);
		model.addAttribute("question_BoardListVO",question_BoardListVO);
		model.addAttribute("auth",auth);
		
		
		return url;
	}
	//qna게시판 리스트(선생)
	@RequestMapping(value="/cyberCampus/pro/qnaBBSList", method=RequestMethod.GET)
	public String qnaBBSListPro(Model model, HttpSession session){
		String url="/cyberCampus/common/qnaBBSListPro";
		

		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		LectureViewVO lectureView = (LectureViewVO) session.getAttribute("lectureInfo");
		String pro_lec_no=lectureView.getLec_no();

		String auth = loginUser.getAuthority();
	
		
		List<Question_BoardListVO> question_BoardListVO = cyberCamQnaBBSService.getQnaBBSListPro(pro_lec_no);
		model.addAttribute("question_BoardListVO",question_BoardListVO);
		model.addAttribute("auth",auth);
		
		return url;
	}
	
	//qna게시판 상세보기
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSDetail","/cyberCampus/pro/qnaBBSDetail"}, method=RequestMethod.GET)
	public String qnaBBSDetail(@RequestParam(value="qb_no" , defaultValue="0")int qb_no,
			Model model,HttpSession session){
		String url = "/cyberCampus/common/qnaBBSDetail";
			
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");

		
		Professor_InquiryList_ViewVO Professor_InquiryList_ViewVO = new Professor_InquiryList_ViewVO();
		
		
		String auth = loginUser.getAuthority();
	
		if(auth.equals("ROLE_PRO")){
			String pro_lec_no = (String) session.getAttribute("pro_lec_no");
			List<Professor_InquiryList_ViewVO> Professor_InquiryList_View = cyberCamQnaBBSService.selectProInquiryList(pro_lec_no);
			model.addAttribute("Professor_InquiryList_View",Professor_InquiryList_ViewVO);
		}
			
		 Question_BoardVO question_BoardVO =  cyberCamQnaBBSService.getQnaBBSDetail(qb_no);
		
		  
		 int af_no = question_BoardVO.getQb_af_no();
		 Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		 attachment_FileVO = cyberCamQnaBBSService.getQnaBBSDetailAf_no(af_no);
		 Quesbbs_ViewVO quesVO = cyberCamQnaBBSService.getCommentVO(qb_no);
		
		  
		  model.addAttribute("question_BoardVO",question_BoardVO);
		  model.addAttribute("auth",auth);
		  model.addAttribute("attachment_FileVO",attachment_FileVO);
		  model.addAttribute("Professor_InquiryList_View",Professor_InquiryList_ViewVO);
		  model.addAttribute("quesVO",quesVO);

		return url;
	}

	
	//qna게시판 등록페이지 이동
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSInsert","/cyberCampus/pro/qnaBBSInsert"}, method=RequestMethod.GET)
	public String qnaBBSInsert(Model model, HttpSession session){
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
	
		model.addAttribute("stud_use_id", stud_use_id);
		
		String url="/cyberCampus/common/qnaBBSInsert";
		return url;
	}
	
	//qna게시판 리스트(게시판 파일 다운로드)
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSFileDownload","/cyberCampus/pro/qnaBBSFileDownload"}, method=RequestMethod.GET)
	public ModelAndView qnaBBSFileDownload(Model model, HttpSession session, int af_no,HttpServletRequest request, HttpServletResponse response)
	
		throws IOException{
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		
		attachment_FileVO = cyberCamQnaBBSService.getQnaBBSDetailAf_no(af_no);
		

		String downloadpath = request.getSession().getServletContext().getRealPath("resources/stu/qnaAF");
		
		File file = new File(downloadpath,attachment_FileVO.getAf_aftername());
		
		if(file == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		
		return new ModelAndView("download", "downloadFile", file);
	}

	//qna게시판 글 등록(학생)
		@RequestMapping(value={"/cyberCampus/stu/qnaBBSsetInsert","/cyberCampus/pro/qnaBBSInsert"}, method=RequestMethod.POST)
		public String qnaBBSsetInsert(HttpSession session, Model model,   HttpServletRequest request,
					
				@RequestParam(value="file", defaultValue = "1")MultipartFile multipartFile,
				@RequestParam(value="af_not_no", defaultValue = "1")int af_not_no
				
				) throws IOException{
			
			String url="/cyberCampus/common/qnaBBSList";
			//D:\SpringFrameWork\spring_workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\studentManagement\resources\stu\qnaAF
			String uploadPath=request.getSession().getServletContext().getRealPath("resources/stu/qnaAF");
			UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
			String stud_use_id = loginUser.getUse_id();
			int stu_lec_no = (int) session.getAttribute("stu_lec_no");
			
			
			
			Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
			if(!multipartFile.isEmpty()){
				File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
				multipartFile.transferTo(file);	
				attachment_FileVO.setAf_aftername(file.getName());
				attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
				attachment_FileVO.setAf_path(uploadPath);
				
				cyberCamQnaBBSService.insertQnaBBS(attachment_FileVO);
				int af_no = cyberCamQnaBBSService.selectQnaBBSAF_NO();		
				
				Question_BoardVO question_BoardVO = new Question_BoardVO();
				question_BoardVO.setQb_stud_use_id(stud_use_id);
				question_BoardVO.setQb_lec_no(stu_lec_no);
				question_BoardVO.setQb_af_no(af_no);
				question_BoardVO.setQb_title(request.getParameter("title"));
				question_BoardVO.setQb_content(request.getParameter("content"));
				cyberCamQnaBBSService.insertQnaBBSFinal(question_BoardVO);
				
				return url;
			}
			File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);	
			attachment_FileVO.setAf_aftername("default");
			attachment_FileVO.setAf_realname("default");
			attachment_FileVO.setAf_path("default");
			
			cyberCamQnaBBSService.insertQnaBBS(attachment_FileVO);
			int af_no = cyberCamQnaBBSService.selectQnaBBSAF_NO();	
				
			
			Question_BoardVO question_BoardVO = new Question_BoardVO();
			question_BoardVO.setQb_stud_use_id(stud_use_id);
			question_BoardVO.setQb_lec_no(stu_lec_no);
			question_BoardVO.setQb_af_no(af_no);
			question_BoardVO.setQb_title(request.getParameter("title"));
			question_BoardVO.setQb_content(request.getParameter("content"));
			cyberCamQnaBBSService.insertQnaBBSFinal(question_BoardVO);
	

			return url;
		}
	
	//qna게시판삭제
	@RequestMapping(value="/common/qnaBBSDelete", method=RequestMethod.GET)
	public String qnaBBSDelete(@RequestParam(value="qb_no")int qb_no){
		
		String url="redirect:/cyberCampus/stu/qnaBBSList";

		
		cyberCamQnaBBSService.deleteQnaBBS(qb_no);
		
		
		return url;
	}

	//qna게시판수정(학생)
	@RequestMapping(value="/common/qnaBBSUpdate", method=RequestMethod.POST)
	public String qnaBBSUpdate(HttpSession session, HttpServletRequest request,
		    @RequestParam(value="content", defaultValue="")String content,
			@RequestParam(value="title", defaultValue="")String title,
			@RequestParam(value="file", defaultValue = "1")MultipartFile multipartFile,
			@RequestParam(value="qb_no", defaultValue = "")String qb_no,
			@RequestParam(value="writer", defaultValue = "")String writer,
			@RequestParam(value="qb_lec_no", defaultValue = "")String qb_lec_no,
			@RequestParam(value="qb_af_no", defaultValue = "1")String qb_af_no,
			@RequestParam(value="qb_date", defaultValue = "")String qb_date)throws IOException{
		
		

		
		String url="redirect:/cyberCampus/stu/qnaBBSList";
	
		String uploadPath=request.getSession().getServletContext().getRealPath("resources/stu/qnaAF");
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
	

		
		
		Question_BoardVO question_BoardVO = new Question_BoardVO();
		
		Attachment_FileVO attachment_FileVO = new Attachment_FileVO();
		if(!multipartFile.isEmpty()){
			File file= new File(uploadPath,System.currentTimeMillis()+multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);	
			attachment_FileVO.setAf_aftername(file.getName());
			attachment_FileVO.setAf_realname(multipartFile.getOriginalFilename());
			attachment_FileVO.setAf_path(uploadPath);
			attachment_FileVO.setAf_no(Integer.parseInt(qb_af_no));
	
			question_BoardVO.setQb_af_no(Integer.parseInt(qb_af_no));
			question_BoardVO.setQb_stud_use_id(writer);
			question_BoardVO.setQb_lec_no(Integer.parseInt(qb_lec_no));
			question_BoardVO.setQb_no(Integer.parseInt(qb_no));
			question_BoardVO.setQb_title(title);
			question_BoardVO.setQb_content(content);
			question_BoardVO.setQb_date(qb_date);
			cyberCamQnaBBSService.updateQnaBBS(attachment_FileVO,question_BoardVO);
		return url;

		}
		
		
		question_BoardVO.setQb_af_no(Integer.parseInt(qb_af_no));
		question_BoardVO.setQb_stud_use_id(writer);
		question_BoardVO.setQb_lec_no(Integer.parseInt(qb_lec_no));
		question_BoardVO.setQb_no(Integer.parseInt(qb_no));
		question_BoardVO.setQb_title(title);
		question_BoardVO.setQb_content(content);
		question_BoardVO.setQb_date(qb_date);
		cyberCamQnaBBSService.updateQnaBBSNoAttachment(question_BoardVO);
	
		return url;
	}
}
