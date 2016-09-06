package com.korea.cyberCam.studyBBS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.cyberCam.studyBBS.dao.CyberCamStudyBBSDAO;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LearningRoomViewVO;
import com.korea.dto.Learning_RoomVO;

/**
 * @Class Name : CyberCamStudyBBSServiceImpl.java
 * @Description : 사이버캠퍼스
 * @Modification Information
 * @author 이수정
 * @since  2016.09.06.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.09.06.   이수정	            최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Service
public class CyberCamStudyBBSServiceImpl implements CyberCamStudyBBSService{
	
	@Autowired
	CyberCamStudyBBSDAO	cyberCamStudyBBSDAO;
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<LearningRoomViewVO> getStudyBBSList() {
		
		return cyberCamStudyBBSDAO.getStudyBBSList();
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public LearningRoomViewVO getStudyBBSDetail(int lr_no) {
		return cyberCamStudyBBSDAO.getStudyBBSDetail(lr_no);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertStudyBBS(Learning_RoomVO learning_RoomVO, Attachment_FileVO attachment_FileVO) {
		if(attachment_FileVO.getAf_realname()!=null){
			cyberCamStudyBBSDAO.insertStudyBBSFile(attachment_FileVO);
			learning_RoomVO.setLr_af_no(attachment_FileVO.getAf_no());
		}
		cyberCamStudyBBSDAO.insertStudyBBS(learning_RoomVO);
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteStudyBBS(Learning_RoomVO learning_RoomVO) {
		
		cyberCamStudyBBSDAO.deleteStudyBBS(learning_RoomVO);
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateStudyBBS() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getStudyBBSFileDown() {
		// TODO Auto-generated method stub
		
	}

}
