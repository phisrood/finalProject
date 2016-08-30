package com.korea.memberManage.dao;


import java.util.List;
import java.util.Map;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorDetailViewVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.ProfessorViewVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;

/**
 * @Interface Name : MemberManageDAO.java
 * @Description : 학생 및 교수 및 교직원 정보 조회 / 등록 / 수정 / 비활성화
 * @Modification Information
 * @author 조현욱
 * @since 2016.08.29.
 * @version 1.0
 * @see <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱        		최초생성
 *    2016.08.29.	김양문			학생등록
 *    2016.08.29	이수정			교수등록 
 *    2016.08.30.	이수정			교수조회
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
 */
public interface MemberManageDAO {
	/**
	 * 학생 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public List<StudentVO> getStuInfoList();
	/**
	 * 학생 정보 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	// 학생 정보 등록
	public int insertStuInfo(Map<String, String> studentMap);

	// 학생 정보 수정



	/**
	 * 학생 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateStuInfo();

	/**
	 * 학생 정보 비활성화
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateStuInfoOnOff();

	
	
	
	/**
	 * 교수 정보 조회
	 * 
	 * @param
	 * @return	List<ProfessorViewVO>
	 * @throws
	 */
	public List<ProfessorViewVO> getProInfoList();

	/**
	 * 교수 정보 등록
	 * 
	 * @param	ProfessorVO
	 * @return
	 * @throws
	 */
	public void insertProInfo(ProfessorVO professorVO) ;


	/**
	 * 교수 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateProInfo();

	/**
	 * 교수 정보 비활성화
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateproInfoOnOff();

	
	
	
	
	
	/**
	 * 교직원 정보 조회
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String getEmpInfoList();

	/**
	 * 교직원 정보 등록
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String insertEmpInfo();

	/**
	 * 교직원 정보 수정
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateEmpInfo();

	/**
	 * 교직원 정보 비활성화
	 * 
	 * @param
	 * @return
	 * @throws
	 */
	public String updateEmpInfoOnOff();

	//학과번호 가져오기
	public List<DepartmentVO> getDepartmentList();

	public UsersVO insertUserProInfo(UsersVO usersVO);
	
	public ProfessorDetailViewVO getDetailProInfo(String pro_use_id);
}
