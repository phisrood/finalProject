package com.korea.cyberCam.noticeBBS.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.cyberCam.noticeBBS.dao.CyberCamNoticeBBSDAO;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Cyber_LectureNoticeViewVO;
import com.korea.dto.Lecture_NoticeVO;

/**
 * @Class Name : IndivInfoManageController.java
 * @Description : 개인 정보 조회 / 수정 및 학적 변동 현황
 * @Modification Information
 * @author 조현욱
 * @since 2016.08.29.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Service
public class CyberCamNoticeBBSServiceImpl implements CyberCamNoticeBBSService {

	@Autowired
	private CyberCamNoticeBBSDAO cyberCamNoticeBBSDAO;

	@Override
	public void getNoticeBBSList() {
		// TODO Auto-generated method stub

	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void getNoticeBBSDetail() {
		// TODO Auto-generated method stub

	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertNoticeBBS(Lecture_NoticeVO lecture_NoticeVO) {

		cyberCamNoticeBBSDAO.insertNoticeBBS(lecture_NoticeVO);
	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void deleteNoticeBBS(Map<String, String> params) {

		cyberCamNoticeBBSDAO.deleteNoticeBBS(params);

	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public int updateNoticeBBS(Lecture_NoticeVO lecture_NoticeVO) {

		return cyberCamNoticeBBSDAO.updateNoticeBBS(lecture_NoticeVO);

	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void getNoticeFileDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cyber_LectureNoticeViewVO> getNoticeBBSList(int stu_lec_no) {

		return cyberCamNoticeBBSDAO.getNoticeBBSList(stu_lec_no);
	}

	@Override
	public List<Cyber_LectureNoticeViewVO> getNoticeBBSDetail(int ln_no) {

		return cyberCamNoticeBBSDAO.getNoticeBBSDetail(ln_no);
	}

	@Override
	public int insertNoticeFileUpload(Attachment_FileVO attachment_FileVO) {

		return cyberCamNoticeBBSDAO.insertNoticeFileUpload(attachment_FileVO);
	}

	@Override
	public int getNoticeFileAf_no() {

		return cyberCamNoticeBBSDAO.getNoticeFileAfno();
	}

	@Override
	public int updateNoticeBBSFile(Attachment_FileVO attachment_FileVO) {

		return cyberCamNoticeBBSDAO.updateNoticeBBSFile(attachment_FileVO);

	}

	@Override
	public Attachment_FileVO getFileDownload(int af_no) {

		return cyberCamNoticeBBSDAO.getNoticeFileDown(af_no);
	}

}
