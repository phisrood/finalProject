package com.korea.cyberCam.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.cyberCam.task.dao.CyberCamTaskDAO;
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
@Service
public class CyberCamTaskServiceImpl implements CyberCamTaskService{
	@Autowired
	private CyberCamTaskDAO cyberCamTaskDAO;


	@Override
	public void insertTaskReg() {
		// TODO Auto-generated method stub

	}
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public void insertTaskSubmit() {

	
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
	public int insertTaskReg(Attachment_FileVO attachment_FileVO) {
		
		//삽입하고
		cyberCamTaskDAO.insertTaskReg(attachment_FileVO);	
				//af 넘버를 가져옴
		return cyberCamTaskDAO.selectTaskAf_no();
		
	}
	@Override
	public void insertTaskWrite(HomeworkVO homeworkVO) {
		cyberCamTaskDAO.insertTaskWrite(homeworkVO);
		
	}
	@Override
	public void insertTaskWriteNotFile(HomeworkVO homeworkVO) {
		cyberCamTaskDAO.insertTaskWriteNoFile(homeworkVO);
		
	}
	@Override
	public List<HomeworkVO> getTaskListPro(String pro_lec_no) {
		
		return cyberCamTaskDAO.getTaskListPro(pro_lec_no);
		
	}
	@Override
	public List<HomeworkVO> getTaskListStu(int pro_lec_no) {
		
		return cyberCamTaskDAO.getTaskListStu(pro_lec_no);
	}
	@Override
	public Homedetail_ViewVo getTaskListProDetail(String hw_no) {
		
		return cyberCamTaskDAO.getTaskListProDetail(hw_no);
	}
	@Override
	public List<Homework_SubmitVO> getSubmitStuList(int hw_no) {
		
		return cyberCamTaskDAO.getSubmitStuList(hw_no);
	}
	@Override
	public int insertStuSubmit(Attachment_FileVO attachment_FileVO) {
		
		
		cyberCamTaskDAO.insertStuSubmit(attachment_FileVO);
		return cyberCamTaskDAO.selectTaskAf_no();
	}
	@Override
	public void insertSubmitListTask(Homework_SubmitVO homework_SubmitVO) {
		
		cyberCamTaskDAO.insertSubmitListTask(homework_SubmitVO);
		
	}
	@Override
	public Attachment_FileVO getFileDownload(int af_no) {
		
		return cyberCamTaskDAO.selectFileDownload(af_no);
	}
	@Override
	public void updateStuSubmit(Attachment_FileVO attachment_FileVO) {
		
		cyberCamTaskDAO.updateStuSubmit(attachment_FileVO);
	}
	@Override
	public void updatetaskUpdate(HomeworkVO homeworkVO) {
		cyberCamTaskDAO.updatetaskUpdate(homeworkVO);
		
	}
	@Override
	public void deletetaskList(String hw_no) {
		cyberCamTaskDAO.deletetaskList(hw_no);
		
	}
	@Override
	public List<Homework_SubmitVO> getSubmitStuCheck(String id) {
		
		return cyberCamTaskDAO.getSubmitStuCheck(id);
	}
	@Override
	public Homework_SubmitVO gethoSubmit(Homework_SubmitVO homework_SubmitVO) {
		
		return cyberCamTaskDAO.gethoSubmit(homework_SubmitVO);
	}

}
