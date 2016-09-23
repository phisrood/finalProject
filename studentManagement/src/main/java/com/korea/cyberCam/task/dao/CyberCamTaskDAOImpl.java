package com.korea.cyberCam.task.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Attachment_FileVO;
import com.korea.dto.Homedetail_ViewVo;
import com.korea.dto.HomeworkAllList_ViewVO;
import com.korea.dto.HomeworkVO;
import com.korea.dto.Homework_SubmitVO;
import com.korea.dto.Homework_ViewVO;

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
public class CyberCamTaskDAOImpl implements CyberCamTaskDAO{



	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertTaskReg() {
		
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertTaskSubmit() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void getTaskSubmitList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void updateTask() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertTaskReg(Attachment_FileVO attachment_FileVO) {
			
		sqlSession.insert("Homework.insertTask",attachment_FileVO);
		
	}
	@Override
	public int selectTaskAf_no() {
		return (int) sqlSession.selectOne("Homework.selectAfNo");
		
	}
	@Override
	public void insertTaskWrite(HomeworkVO homeworkVO) {
		
		sqlSession.insert("Homework.insertTaskFinal",homeworkVO);
		
	}
	@Override
	public void insertTaskWriteNoFile(HomeworkVO homeworkVO) {
		sqlSession.insert("Homework.insertTaskFinalNotFile",homeworkVO);
		
	}
	@Override
	public List<HomeworkAllList_ViewVO> getTaskListPro(String pro_lec_no) {
		
		return sqlSession.selectList("Homework.selectTaskListPro",pro_lec_no);
	}
	@Override
	public List<HomeworkAllList_ViewVO> getTaskListStu(int pro_lec_no) {
	
		return sqlSession.selectList("Homework.selectTaskListStu",pro_lec_no);
	}
	@Override
	public Homedetail_ViewVo getTaskListProDetail(String hw_no) {
		
		return (Homedetail_ViewVo) sqlSession.selectOne("Homework.selectTaskListProDetail",hw_no);
	}
	@Override
	public List<Homework_SubmitVO> getSubmitStuList(int hw_no) {
		
		return sqlSession.selectList("Homework.selectSubmitList",hw_no);
	}
	@Override
	public void insertStuSubmit(Attachment_FileVO attachment_FileVO) {
		
			sqlSession.insert("Homework.insertStuSubmit",attachment_FileVO);
		
		
	}
	@Override
	public void insertSubmitListTask(Homework_SubmitVO homework_SubmitVO) {
		
		sqlSession.insert("Homework.insertSubmitListTask",homework_SubmitVO);
		
	}
	@Override
	public Attachment_FileVO selectFileDownload(int af_no) {
		
		return (Attachment_FileVO) sqlSession.selectOne("Homework.selectFileDownload",af_no);
	}
	@Override
	public void updateStuSubmit(Attachment_FileVO attachment_FileVO) {
		
		sqlSession.update("Homework.updateStuSubmit",attachment_FileVO);
	}
	@Override
	public void updatetaskUpdate(HomeworkVO homeworkVO) {
		sqlSession.update("Homework.updatetaskUpdate",homeworkVO);
		
	}
	@Override
	public void deletetaskList(String hw_no) {
		sqlSession.delete("Homework.deletetaskList",hw_no);
		
	}

}
