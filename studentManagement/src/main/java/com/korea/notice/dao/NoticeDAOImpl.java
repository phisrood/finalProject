package com.korea.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.NoticeViewVO;
import com.korea.dto.UsersVO;

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
public class NoticeDAOImpl implements NoticeDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Colleage_NoticeVO> getNoticeNewList() {
		return sqlSession.selectList("ColleageNotice.noticeNewList");
	}
	/**
	 * @return 
	 * 공지 상세
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public NoticeViewVO getNoticeDetailInfo(int cn_no) {
		return(NoticeViewVO) sqlSession.selectOne("ColleageNotice.noticeDetail", cn_no);
	}
	/**
	 * @return 
	 * 공지리스트
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<NoticeViewVO> getNoticeAllList() {
		List<NoticeViewVO> noticeAllList = 
				(List<NoticeViewVO>) sqlSession.selectList("ColleageNotice.getNoticeAllList");
		return noticeAllList;
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateNotice(Colleage_NoticeVO colleage_NoticeVO) {
		sqlSession.update("ColleageNotice.noticeUpdate",colleage_NoticeVO);
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateNoticeFile(Attachment_FileVO attachment_FileVO) {
		sqlSession.update("ColleageNotice.noticeFileUpdate",attachment_FileVO);
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteNotice(Colleage_NoticeVO colleage_NoticeVO) {
		sqlSession.delete("ColleageNotice.noticeDelete",colleage_NoticeVO);
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertNotice(Colleage_NoticeVO colleage_NoticeVO) {
		
		sqlSession.insert("ColleageNotice.insertNotice",colleage_NoticeVO);
		
	}
	/**
	 * 공지사항 파일업로드
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public Attachment_FileVO insertNoticeFile(Attachment_FileVO attachment_FileVO) {
		
		sqlSession.insert("ColleageNotice.insertNoticeFile",attachment_FileVO);
		
		return attachment_FileVO;
		
	}


}
