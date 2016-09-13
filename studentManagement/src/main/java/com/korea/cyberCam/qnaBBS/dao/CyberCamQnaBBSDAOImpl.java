package com.korea.cyberCam.qnaBBS.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
@Repository
public class CyberCamQnaBBSDAOImpl implements CyberCamQnaBBSDAO{

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public	List<Question_BoardListVO> getQnaBBSList(Map<String, String> lecNoInContext) {
		
		
		return (List<Question_BoardListVO>) sqlSession.selectList("CyberCamQnaBBSDao.getCyberCamQnaBBSList",lecNoInContext);
		
	}

	

	
	@Override
	public  Question_BoardVO getQnaBBSDetail(int qb_no) {
		return (Question_BoardVO) sqlSession.selectOne("CyberCamQnaBBSDao.getCyberCamQnaBBSDetail", qb_no);
	}

	@Override
	public void insertQnaBBS(Attachment_FileVO attachment_FileVO) {
		sqlSession.insert("CyberCamQnaBBSDao.getCyberCamQnaBBSInsert",attachment_FileVO);
		
	}
	@Override
	public void deleteQnaBBS(int qb_no) {
		sqlSession.delete("CyberCamQnaBBSDao.deleteQnaBBS",qb_no);
		
	}

	
	@Override
	public int selectQnaBBSAF_NO() {
		return (int) sqlSession.selectOne("CyberCamQnaBBSDao.getCyberCamQnaBBSSelectAF_NO");
	}
	@Override
	public List<LectureVO>  selectlectureList() {
	
		return (List<LectureVO>) sqlSession.selectList("CyberCamQnaBBSDao.getlectureList");
	}
	@Override
	public void insertQnaBBSFinal(Question_BoardVO question_BoardVO) {
		sqlSession.insert("CyberCamQnaBBSDao.insertCyberCamQnaBBSFinal",question_BoardVO);
	}
	@Override
	public void updateQnaBBS(Attachment_FileVO attachment_FileVO) {
		sqlSession.update("CyberCamQnaBBSDao.updateCyberCamQnaBBSAttachFileUpdate",attachment_FileVO);
		
	}
	@Override
	public void updatetQnaBBSFinal(Question_BoardVO question_BoardVO) {
		sqlSession.update("CyberCamQnaBBSDao.updateCyberCamQnaBBSAttachContentUpdate",question_BoardVO);
		
	}




	@Override
	public List<Question_BoardListVO> getQnaBBSListPro(String pro_lec_no) {
		
		return sqlSession.selectList("CyberCamQnaBBSDao.getCyberCamQnaBBSListPro",pro_lec_no);
	}




	@Override
	public Attachment_FileVO getQnaBBSDetailAf_no(int af_no) {
		
		return (Attachment_FileVO) sqlSession.selectOne("CyberCamQnaBBSDao.getCyberCamQnaBBSDetailAfNo",af_no);
	
	}




	@Override
	public List<Professor_InquiryList_ViewVO> selectProInquiryList(String pro_lec_no) {
		
		return (List<Professor_InquiryList_ViewVO>) sqlSession.selectList("CyberCamQnaBBSDao.getselectProInquiryList",pro_lec_no);
	}




	@Override
	public void insertComment(Map<String, String> params) {
		sqlSession.insert("CyberCamQnaBBSDao.insertComment", params);
	}




	@Override
	public Quesbbs_ViewVO getQuesBBSVO(String qb_no) {
		return (Quesbbs_ViewVO) sqlSession.selectOne("CyberCamQnaBBSDao.getQuesBBS", qb_no);
	}




	@Override
	public int updateCommentQnaBBS(Map<String, String> params) {
		
		return sqlSession.update("CyberCamQnaBBSDao.updateCommentQnaBBS",params);
	}




	@Override
	public Quesbbs_ViewVO selectCommentQnaBBS(String qb_no) {
		
		return (Quesbbs_ViewVO) sqlSession.selectOne("CyberCamQnaBBSDao.selectComment", qb_no);
	}
}
