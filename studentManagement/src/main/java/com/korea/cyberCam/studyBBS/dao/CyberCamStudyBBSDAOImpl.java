package com.korea.cyberCam.studyBBS.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.LearningRoomViewVO;
import com.korea.dto.Learning_RoomVO;
import com.korea.dto.NoticeViewVO;
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
public class CyberCamStudyBBSDAOImpl implements CyberCamStudyBBSDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * @return 
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<LearningRoomViewVO> getStudyBBSList() {
		List<LearningRoomViewVO> studyBBSAllList = 
				(List<LearningRoomViewVO>) sqlSession.selectList("LearningRoom.getStudyBBSAllList");
		return studyBBSAllList;
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getStudyBBSDetail() {
		
	}
	/**
	 * 학습자료실 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertStudyBBS(Learning_RoomVO learning_RoomVO){
		sqlSession.insert("LearningRoom.insertStudyBBS",learning_RoomVO);
	}
	/**
	 * 학습자료실 파일업로드
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public Attachment_FileVO insertStudyBBSFile(Attachment_FileVO attachment_FileVO){
		sqlSession.insert("LearningRoom.insertStudyBBSFile",attachment_FileVO);
		return attachment_FileVO;
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void deleteStudyBBS() {
		// TODO Auto-generated method stub
		
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
