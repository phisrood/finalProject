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
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.korea.cyberCam.qnaBBS.service.CyberCamQnaBBSService;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LectureVO;
import com.korea.dto.Question_BoardListVO;
import com.korea.dto.Question_BoardVO;
import com.korea.dto.UsersVO;

@Controller
public class CyberCamQnaBBSController {
	
	
	
	@Autowired
	CyberCamQnaBBSService cyberCamQnaBBSService;
	
	
	
	
	//qna게시판 리스트
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSList","/cyberCampus/pro/qnaBBSList"}, method=RequestMethod.GET)
	public String qnaBBSList(Model model, HttpSession session){
		String url="/cyberCampus/common/qnaBBSList";
		
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		int stu_lec_no = (int) session.getAttribute("stu_lec_no");
		
		
		Map<String, String> lecNoInContext = new HashMap<String, String>();
		lecNoInContext.put("stu_lec_no", stu_lec_no+"");
		lecNoInContext.put("stud_use_id", stud_use_id);
		
	
		List<Question_BoardListVO> question_BoardListVO = cyberCamQnaBBSService.getQnaBBSList(lecNoInContext);
		model.addAttribute("question_BoardListVO",question_BoardListVO);
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 상세보기
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSDetail","/cyberCampus/pro/qnaBBSDetail"}, method=RequestMethod.GET)
	public String qnaBBSDetail(){
		String url = "/cyberCampus/common/qnaBBSDetail";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 등록페이지 이동
	@RequestMapping(value={"/cyberCampus/stu/qnaBBSInsert","/cyberCampus/pro/qnaBBSInsert"}, method=RequestMethod.GET)
	public String qnaBBSInsert(Model model, HttpSession session){
		UsersVO loginUser = (UsersVO) session.getAttribute("loginUser");
		String stud_use_id = loginUser.getUse_id();
		
		
	
		model.addAttribute("stud_use_id", stud_use_id);
		
		String url="/cyberCampus/common/qnaBBSInsert";
		return url;
	}
	

	//qna게시판 글 등록
		@RequestMapping(value={"/cyberCampus/stu/qnaBBSsetInsert","/cyberCampus/pro/qnaBBSInsert"}, method=RequestMethod.POST)
		public String qnaBBSsetInsert(HttpSession session, Model model,   HttpServletRequest request,
					
				@RequestParam(value="file", defaultValue = "")MultipartFile multipartFile
				
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
			

	

			return url;
		}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판삭제
	@RequestMapping(value="/common/qnaBBSDelete", method=RequestMethod.GET)
	public String qnaBBSDelete(){
		String url="";
		
		return url;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판수정
	@RequestMapping(value="/common/qnaBBSUpdate", method=RequestMethod.GET)
	public String qnaBBSUpdate(){
		String url="";
		
		return url;
	}
}
