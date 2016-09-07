package com.korea.cyberCam.onlineCon.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Online_ContentsVO;

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
@Repository
public class CyberCamOnlineConDAOImpl implements CyberCamOnlineConDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertOnlineCon(Online_ContentsVO onlineContentsVO) {
		sqlSession.insert("CyberCamOnlineContentsDAO.insertOnlineCon",
				onlineContentsVO);
	}

	/**
	 * 개인 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void updateOnlineCon() {
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
	public void deleteOnlineCon() {
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
	public List<Online_ContentsVO> getOnlineConList(String lec_no) {
		return (List<Online_ContentsVO>) sqlSession.selectList("CyberCamOnlineContentsDAO.getOnlineConList", lec_no);
	}

	@Override
	public int insertOnlineConFile(Attachment_FileVO attachFileVO) {
		sqlSession.insert("CyberCamOnlineContentsDAO.insertOnlineConFile",attachFileVO);
		return (int) sqlSession.selectOne("CyberCamOnlineContentsDAO.getCurrval");
	}

}
