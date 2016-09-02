package com.korea.notice.service;

import java.util.List;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Colleage_NoticeVO;
import com.korea.dto.NoticeViewVO;
import com.korea.notice.dao.NoticeDAO;

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
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeDAO noticeDAO;
	
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<Colleage_NoticeVO> getNoticeNewList() {
		return noticeDAO.getNoticeNewList();
	}
	/**
	 * 공지사항전체리스트
	 * @param
	 * @return List<NoticeViewVO>
	 * @throws 
	 */
	@Override
	public List<NoticeViewVO> getNoticeAllList() {

		return noticeDAO.getNoticeAllList();
	}
	/**
	 * @return 
	 * 공지상세보기
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public NoticeViewVO getNoticeDetailInfo(int cn_no) {
		return noticeDAO.getNoticeDetailInfo(cn_no);
		
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateNotice(Colleage_NoticeVO colleage_NoticeVO, Attachment_FileVO attachment_FileVO) {
		noticeDAO.updateNotice(colleage_NoticeVO);
		/*noticeDAO.updateNoticeFile(attachment_FileVO);*/
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteNotice(Colleage_NoticeVO colleage_NoticeVO) {

		noticeDAO.deleteNotice(colleage_NoticeVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertNotice(Colleage_NoticeVO colleage_NoticeVO,Attachment_FileVO attachment_FileVO) {
		
		System.out.println(attachment_FileVO.getAf_realname());
		System.out.println(attachment_FileVO.getAf_path());
		if(attachment_FileVO.getAf_realname()!=null){
			noticeDAO.insertNoticeFile(attachment_FileVO);
			colleage_NoticeVO.setCn_af_no(attachment_FileVO.getAf_no());
		}
		noticeDAO.insertNotice(colleage_NoticeVO);
	}
	

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

	

}
