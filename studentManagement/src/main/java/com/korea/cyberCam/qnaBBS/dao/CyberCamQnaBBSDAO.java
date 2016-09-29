package com.korea.cyberCam.qnaBBS.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LectureVO;
import com.korea.dto.Professor_InquiryList_ViewVO;
import com.korea.dto.Ques_CommentsVO;
import com.korea.dto.Quesbbs_ViewVO;
import com.korea.dto.Question_BoardListVO;
import com.korea.dto.Question_BoardVO;

/**
 * @Interface Name : IndivInfoManageDAO.java
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
public interface CyberCamQnaBBSDAO {
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 리스트
	public	List<Question_BoardListVO> getQnaBBSList(Map<String, String> lecNoInContext);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 상세보기
	public Question_BoardVO getQnaBBSDetail(int qb_no);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 등록
	public void insertQnaBBS(Attachment_FileVO attachment_FileVO);
	public int selectQnaBBSAF_NO();
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 삭제
	public void deleteQnaBBS(int qb_no);
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	//qna게시판 수정

	
	//강의목록 조회
	public List<LectureVO> selectlectureList();

	public void insertQnaBBSFinal(Question_BoardVO question_BoardVO);
	public void updateQnaBBS(Attachment_FileVO attachment_FileVO);
	public void updatetQnaBBSFinal(Question_BoardVO question_BoardVO);
	public List<Question_BoardListVO> getQnaBBSListPro(String pro_lec_no);
	public Attachment_FileVO getQnaBBSDetailAf_no(int af_no);
	public List<Professor_InquiryList_ViewVO> selectProInquiryList(String pro_lec_no);
	
	//댓글추가
	public void insertComment(Map<String, String> params);
	public Quesbbs_ViewVO getQuesBBSVO(String qb_no);
	
	//댓글수정
	public int updateCommentQnaBBS(Map<String, String> params);
	public Quesbbs_ViewVO selectCommentQnaBBS(String qb_no);
	//댓글삭제
	public void deleteComment(String qc_no);
	
	
}
