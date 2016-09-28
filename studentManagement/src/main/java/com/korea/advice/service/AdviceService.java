package com.korea.advice.service;

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
public interface AdviceService {
	/**
	 * 받은 상담신청조회(교수)
	 * @param pro_use_id
	 * @return List
	 */
	public List<AdviceVO> getAdviceResponsList(String pro_use_id);

	/**
	 * 보낸 상담신청조회(학생)
	 * @param stud_use_id
	 * @return List
	 */
	public List<AdviceVO> getAdviceRequestList(String stud_use_id);

	/**
	 * 상담 신청
	 * @param adviceVO
	 * @return void
	 */
	public void insertAdviceREQ(AdviceVO adviceVO);

	/**
	 * 상담신청 삭제
	 * @param ad_no
	 * @return void
	 */
	public void updateAdviceCancel(int ad_no);

	/**
	 * 상담신청 수정 폼
	 * @param ad_no
	 * @return AdviceVO
	 */
	public AdviceVO updateAdviceConfirmForm(int ad_no);
	
	/**
	 * 상담신청수정
	 * @param ad_no
	 * @return AdviceVO
	 */
	public AdviceVO updateAdviceConfirm(int ad_no);
	/**
	 * 상담 신청 삭제
	 * @param adviceVO
	 * @return void
	 */
	public void updateAdviceDelay(AdviceVO adviceVO);
	
	/**
	 * 상담 답변
	 * @return void
	 */
	public void insertAdviceReply();

	/**
	 * 상담 가능일자 입력
	 * @return void
	 */
	public void insertAdviceDate();

	/**
	 * 상담신청 한 리스트
	 * @return List
	 */
	public List<Advice_BoardVO> getAdviceBoardList();

	/**
	 * 상담할 교수 리스트
	 * @param stud_use_id
	 * @return List
	 */
	public List<ProfessorVO> getProfessorList(String stud_use_id);

	public int insertAdviceBoardAF(ADBInsertVO adviceInsertVO);

	public void insertAdviceBoard(int af_no,ADBInsertVO adviceInsertAFVO);

	public Advice_BoardVO getAdviceBoard(int adb_no);

	public void updateAdviceBoard(Map<String, String> params,int flag);

	public void deleteAdviceBoard(int adb_no);

	public void updateAdviceComment(Advice_BoardVO adviceBoardVO);

	public Attachment_FileVO getAdviceBoardFile(int adb_af_no);

	public int updateAdviceBoardFile(Map<String, String> paramsFile);

	public List<AdviceVO> getMyAdviceReqeustList(String loginUser);

	public List<AdviceVO> getMyAdviceResponseList(String use_id);

	public void updateChannelId(String channelId, String ad_no);

	public void updateChannelId(String ad_no);

}
