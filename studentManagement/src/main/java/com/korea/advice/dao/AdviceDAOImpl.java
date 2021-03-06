package com.korea.advice.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.ADBInsertVO;
import com.korea.dto.AdviceVO;
import com.korea.dto.Advice_BoardVO;
import com.korea.dto.Attachment_FileVO;
import com.korea.dto.ProfessorVO;

/**
 * @Class Name : AdviceController.java
 * @Description : 학사일정관리 서비스 클래스
 * @Modification Information
 * @author 이영만
 * @since 2016.08.25.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *   
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
@Repository
public class AdviceDAOImpl implements AdviceDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<AdviceVO> getAdviceResponsList(String pro_use_id) {
		List<AdviceVO> adviceResList = (List<AdviceVO>) sqlSession.selectList("adviceDAO.selectResList",pro_use_id);
		return adviceResList;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<AdviceVO> getAdviceRequestList(String stud_use_id) {
		List<AdviceVO> adviceReqList = (List<AdviceVO>) sqlSession.selectList("adviceDAO.selectReqList", stud_use_id);
		return adviceReqList;
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertAdviceREQ(AdviceVO adviceVO) {
		sqlSession.insert("adviceDAO.insertAdvice", adviceVO);
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void updateAdviceCancel(int ad_no) {
		sqlSession.delete("adviceDAO.updateAdviceCancel",ad_no);
	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public AdviceVO updateAdviceConfirmForm(int ad_no) {
		AdviceVO adviceVO = (AdviceVO) sqlSession.selectOne("adviceDAO.selectResConfirm",ad_no);
		return adviceVO;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public AdviceVO updateAdviceConfirm(int ad_no) {
		AdviceVO adviceVO = (AdviceVO) sqlSession.selectOne("adviceDAO.updateAdviceConfirm",ad_no);
		return adviceVO;
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	public void updateAdviceDelay(AdviceVO adviceVO) {
		sqlSession.update("adviceDAO.updateAdviceDelay", adviceVO);
	}
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertAdviceReply() {
		// TODO Auto-generated method stub

	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public void insertAdviceDate() {
		// TODO Auto-generated method stub

	}

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public List<Advice_BoardVO> getAdviceBoardList() {
		List<Advice_BoardVO> adviceBoardList = (List<Advice_BoardVO>) sqlSession.selectList("adviceBoardDAO.selectAdviceBoardList");
		return adviceBoardList;
	}

	@Override
	public List<ProfessorVO> getProfessorList(String stud_use_id) {
		List<ProfessorVO> professorList = (List<ProfessorVO>) sqlSession.selectList("adviceDAO.selectProfessorList",stud_use_id);
		return professorList;
	}

	@Override
	public int insertAdviceBoardAF(ADBInsertVO adviceInsertVO) {
		sqlSession.insert("adviceBoardDAO.insertAdviceBoardAF", adviceInsertVO);
		return (int) sqlSession.selectOne("adviceBoardDAO.selectCurrval");
	}

	@Override
	public void insertAdviceBoard(int af_no,ADBInsertVO adviceInsertAFVO) {
		if(af_no == 0){
			sqlSession.insert("adviceBoardDAO.insertBoard", adviceInsertAFVO);
		}else{
			sqlSession.insert("adviceBoardDAO.insertBoardAF", adviceInsertAFVO);			
		}
	}

	@Override
	public Advice_BoardVO getAdviceBoard(int adb_no) {
		Advice_BoardVO adviceVO = (Advice_BoardVO) sqlSession.selectOne("adviceBoardDAO.getAdviceBoard", adb_no);
		return adviceVO;
	}

	@Override
	public void updateAdviceBoard(Map<String, String> params) {
		sqlSession.update("adviceBoardDAO.updateAdviceBoard", params);
	}

	@Override
	public void deleteAdviceBoard(int adb_no) {
		sqlSession.delete("adviceBoardDAO.deleteAdviceBoard", adb_no);
	}

	@Override
	public void updateAdviceComment(Advice_BoardVO adviceBoardVO) {
		sqlSession.update("adviceBoardDAO.updateAdviceComment",adviceBoardVO);
	}

	@Override
	public Attachment_FileVO getAdviceBoardFile(int adb_af_no) {
		return (Attachment_FileVO) sqlSession.selectOne("adviceBoardDAO.getAdviceBoardFile", adb_af_no);
	}

	@Override
	public int updateAdviceBoardFile(Map<String, String> paramsFile) {
		sqlSession.update("adviceBoardDAO.updateAdviceBoardFile", paramsFile);
		return 0;
	}

	@Override
	public List<AdviceVO> getMyAdviceRequestList(String loginUser) {
		return (List<AdviceVO>) sqlSession.selectList("adviceDAO.getMyAdviceRequestList", loginUser);
	}

	@Override
	public List<AdviceVO> getMyAdviceResponseList(String use_id) {
		return (List<AdviceVO>) sqlSession.selectList("adviceDAO.getMyAdviceResponseList",use_id);
	}

	@Override
	public int insertAdviceBoardAF(Map<String, String> params) {
		sqlSession.insert("adviceBoardDAO.insertAdviceBoardAF2", params);
		return (int) sqlSession.selectOne("adviceBoardDAO.selectCurrval");
	}

	@Override
	public void updateAdviceBoard2(Map<String, String> params) {
		sqlSession.update("adviceBoardDAO.updateAdviceBoard2", params);
	}

	@Override
	public void updateChannelId(String channelId, String ad_no) {
		Map<String,String> params = new HashMap<String, String>();
		params.put("channelId", channelId);
		params.put("ad_no", ad_no);
		
		sqlSession.update("adviceDAO.updateChannelId",params);
	}

	@Override
	public void updateChannelId(String ad_no) {
		sqlSession.update("adviceDAO.updateChannelIdClose",ad_no);
	}

}
