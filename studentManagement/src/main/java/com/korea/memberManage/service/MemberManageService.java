package com.korea.memberManage.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorDetailViewVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.ProfessorViewVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;


/**
 * @Interface Name : MemberManageService.java
 * @Description : 구성원 정보 조회 / 등록 / 수정 / 비활성화
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
 *    2016.08.29.	김양문			학생등록
 *    2016.08.29.	이수정			교수등록
 *    2016.08.29.	이수정			교수조회
 *    2016.08.30.	이수정			교수수정
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */


public interface MemberManageService {
	/**
	 * 학생 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	public List<StudentVO> getStuInfoList();
	/**
	 * 학생 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	//학생 정보 등록
	public String insertStuInfo(MultipartFile file);
	
	//학생 정보 수정

	/**
	 * 학생 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	public String updateStuInfo();
	/**
	 * 학생 정보 비활성화
	 * @param
	 * @return 
	 * @throws 
	 */
	public String updateStuInfoOnOff();
	
	
	
	/**
	 * 교수 정보 조회
	 * @param
	 * @return 	List<ProfessorViewVO>
	 * @throws 
	 */
	public List<ProfessorViewVO> getProInfoList();

	
	/**
	 * 교수 정보 등록
	 * @param	ProfessorVO,UsersVO
	 * @return 
	 * @throws 
	 */
	public void insertProInfo(ProfessorVO professorVO, UsersVO usersVO);
	
	/**
	 * 학과 정보 가져오기
	 * @param	
	 * @return 	List<DepartmentVO>
	 * @throws 
	 */
	public List<DepartmentVO> getDepartmentList();

	
	/**
	 * 교수 정보 수정
	 * @param ProfessorVO,UsersVO 
	 * @return  
	 * @throws 
	 */
	public void updateProInfo(ProfessorVO professorVO, UsersVO usersVO);
	
	
	public String getEmpInfoList();
	/**
	 * 교직원 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	public String insertEmpInfo();
	/**
	 * 교직원 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	public String updateEmpInfo();
	/**
	 * 교직원 정보 비활성화
	 * @param
	 * @return 
	 * @throws 
	 */
	public String updateEmpInfoOnOff();
	
	/**
	 * @return 
	 * 교수정보상세보기
	 * @param	int
	 * @return 
	 * @throws 
	 */
	public ProfessorDetailViewVO getDetailProInfo(String pro_use_id);


}
