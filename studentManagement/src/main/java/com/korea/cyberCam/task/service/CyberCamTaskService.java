package com.korea.cyberCam.task.service;

public interface CyberCamTaskService {

	//과제등록
	public void insertTaskReg();
	
	//과제제출
	public void insertTaskSubmit();
	
	//과제제출한 리스트
	public void getTaskSubmitList();
	
	//과제수정
	public void updateTask();
}
