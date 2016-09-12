package com.korea.cyberCam.noticeBBS.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Cyber_LectureNoticeViewVO;
import com.korea.dto.Lecture_NoticeVO;

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
public class CyberCamNoticeBBSDAOImpl implements CyberCamNoticeBBSDAO{
	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public void getNoticeBBSList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getNoticeBBSDetail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertNoticeBBS(Lecture_NoticeVO lecture_NoticeVO) {
		
		sqlSession.insert("cyberCamLectureNoticeBBS.insertLectureBBS",lecture_NoticeVO);
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteNoticeBBS() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */

	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getNoticeFileDown() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Cyber_LectureNoticeViewVO>  getNoticeBBSList(int stu_lec_no) {
		
		return (List<Cyber_LectureNoticeViewVO>) sqlSession.selectList("cyberCamLectureNoticeBBS.getLectureNoticeListStu",stu_lec_no);
	}
	@Override
	public List<Cyber_LectureNoticeViewVO> getNoticeBBSDetail(int ln_no) {
		
		return sqlSession.selectList("cyberCamLectureNoticeBBS.getLectureNoticeListStuDetail",ln_no);
	}
	@Override
	public int insertNoticeFileUpload(
			Attachment_FileVO attachment_FileVO) {
		
		return sqlSession.insert("cyberCamLectureNoticeBBS.insertFileUpload",attachment_FileVO);
	}
	@Override
	public int getNoticeFileAfno() {
		
		return (int) sqlSession.selectOne("cyberCamLectureNoticeBBS.selectafNo");
	}
	@Override
	public int updateNoticeBBSFile(Attachment_FileVO attachment_FileVO) {
		
		return sqlSession.update("cyberCamLectureNoticeBBS.updateFile",attachment_FileVO);
	}
	@Override
	public int updateNoticeBBS(Lecture_NoticeVO lecture_NoticeVO) {
		return sqlSession.update("cyberCamLectureNoticeBBS.updateContent",lecture_NoticeVO);
		
	}
	@Override
	public Attachment_FileVO getNoticeFileDown(int af_no) {
		
		return (Attachment_FileVO) sqlSession.selectOne("cyberCamLectureNoticeBBS.getDownloadFile",af_no);
	}
	

}
