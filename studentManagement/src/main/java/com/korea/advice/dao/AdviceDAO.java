package com.korea.advice.dao;

import java.util.List;
import java.util.Map;

import com.korea.dto.ADBInsertVO;
import com.korea.dto.AdviceVO;
import com.korea.dto.Advice_BoardInsertVO;
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
public interface AdviceDAO {
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 받은 상담 신청조회(교수)
	public List<AdviceVO> getAdviceResponsList(String pro_use_id);

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 보낸 상담 신청조회(학생)
	public List<AdviceVO> getAdviceRequestList(String stud_use_id);

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담신청
	public void insertAdviceREQ(AdviceVO adviceVO);

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담신청 삭제
	public void updateAdviceCancel(int ad_no);

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담신청 수정
	public AdviceVO updateAdviceConfirmForm(int ad_no);
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담신청 수정
	public AdviceVO updateAdviceConfirm(int ad_no);
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담 신청 삭제
	public void updateAdviceDelay(AdviceVO adviceVO);
	
	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담답변
	public void insertAdviceReply();

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담가능일자 입력
	public void insertAdviceDate();

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담가능일자 입력
	public List<Advice_BoardVO> getAdviceBoardList();

	/**
	 * 교수가 받은 상담신청조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 상담가능일자 입력
	public List<ProfessorVO> getProfessorList(String stud_use_id);

	public int insertAdviceBoardAF(ADBInsertVO adviceInsertVO);

	public void insertAdviceBoard(int af_no,ADBInsertVO adviceInsertAFVO);

	public Advice_BoardVO getAdviceBoard(int adb_no);

	public void updateAdviceBoard(Map<String, String> params);

	public void deleteAdviceBoard(int adb_no);

	public void updateAdviceComment(Advice_BoardVO adviceBoardVO);

	public Attachment_FileVO getAdviceBoardFile(int adb_af_no);

	public int updateAdviceBoardFile(Map<String, String> paramsFile);

	public List<AdviceVO> getMyAdviceRequestList(String loginUser);

	public List<AdviceVO> getMyAdviceResponseList(String use_id);

	public int insertAdviceBoardAF(Map<String, String> params);

	public void updateAdviceBoard2(Map<String, String> params);

	public void updateChannelId(String channelId, String ad_no);

	public void updateChannelId(String ad_no);


}