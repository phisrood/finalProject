package com.korea.cyberCam.qnaBBS.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.cyberCam.qnaBBS.dao.CyberCamQnaBBSDAO;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LectureVO;
import com.korea.dto.Professor_InquiryList_ViewVO;
import com.korea.dto.Ques_CommentsVO;
import com.korea.dto.Quesbbs_ViewVO;
import com.korea.dto.Question_BoardListVO;
import com.korea.dto.Question_BoardVO;

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

@Service
public class CyberCamQnaBBSServiceImpl implements CyberCamQnaBBSService{
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	
	@Autowired
	private CyberCamQnaBBSDAO cyberCamQnaBBSDAO;

	
	
	@Override
	public	List<Question_BoardListVO> getQnaBBSList(Map<String, String> lecNoInContext) {
		 
	
		return cyberCamQnaBBSDAO.getQnaBBSList(lecNoInContext);
	
	}

	@Override
	public void insertQnaBBS(Attachment_FileVO attachment_FileVO) {
		cyberCamQnaBBSDAO.insertQnaBBS(attachment_FileVO);
		
	}
	

	@Override
	public int selectQnaBBSAF_NO() {
		return cyberCamQnaBBSDAO.selectQnaBBSAF_NO();
	}
	
	@Override
	public void deleteQnaBBS(int qb_no) {
		cyberCamQnaBBSDAO.deleteQnaBBS(qb_no);
	}

	@Override
	public void updateQnaBBS(Attachment_FileVO attachment_FileVO,Question_BoardVO question_BoardVO) {
		cyberCamQnaBBSDAO.updateQnaBBS(attachment_FileVO);
		cyberCamQnaBBSDAO.updatetQnaBBSFinal(question_BoardVO);
	}

	@Override
	public Question_BoardVO getQnaBBSDetail(int qb_no) {
	
		
		return cyberCamQnaBBSDAO.getQnaBBSDetail(qb_no);
		
	}

	//강의목록 조회
	@Override
	public List<LectureVO> selectlectureList() {
		return cyberCamQnaBBSDAO.selectlectureList();
	}



	@Override
	public void insertQnaBBSFinal(Question_BoardVO question_BoardVO) {
		cyberCamQnaBBSDAO.insertQnaBBSFinal(question_BoardVO);
		
	}

	@Override
	public List<Question_BoardListVO> getQnaBBSListPro(String pro_lec_no) {
		
		return cyberCamQnaBBSDAO.getQnaBBSListPro(pro_lec_no);
	}

	@Override
	public Attachment_FileVO getQnaBBSDetailAf_no(int af_no) {
		
		return cyberCamQnaBBSDAO.getQnaBBSDetailAf_no(af_no);
	}

	@Override
	public Professor_InquiryList_ViewVO selectProInquiryList(String pro_lec_no) {
		
		return cyberCamQnaBBSDAO.selectProInquiryList(pro_lec_no);
	}

	@Override
	public Quesbbs_ViewVO insertComment(Map<String, String> params) {
		
		//insert 하고
		cyberCamQnaBBSDAO.insertComment(params);
		
		//댓글달린 게시판의 정보를 받아와서 
		Quesbbs_ViewVO vo = cyberCamQnaBBSDAO.getQuesBBSVO(params.get("qb_no"));
		
		//리턴
		return vo;
	}

	@Override
	public Quesbbs_ViewVO getCommentVO(int qb_no) {
		
		return cyberCamQnaBBSDAO.getQuesBBSVO(Integer.toString(qb_no));
	}

	@Override
	public int updateCommentQnaBBS(Map<String, String> params) {
	
	
		return cyberCamQnaBBSDAO.updateCommentQnaBBS(params);
	}

	@Override
	public Quesbbs_ViewVO selectCommentQnaBBS(String qb_no) {
		
		return cyberCamQnaBBSDAO.selectCommentQnaBBS(qb_no);
	}

	@Override
	public void updateQnaBBSNoAttachment(Question_BoardVO question_BoardVO) {
		cyberCamQnaBBSDAO.updatetQnaBBSFinal(question_BoardVO);
		
	}





	

}
