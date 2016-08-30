package com.korea.memberManage.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.UsersVO;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * @Class Name : MemberManageDAOImpl.java
 * @Description : 학생 및 교수 및 교직원 정보 조회 / 등록 / 수정 / 비활성화
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
public class MemberManageDAOImpl implements MemberManageDAO{


	@Autowired(required=false)
	private SqlSession sqlSession;
	

	/**
	 * 학생 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getStuInfoList() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학생 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int insertStuInfo(Map<String, String> studentMap) {
		studentMap.put("use_id", "0");
		int resultUser = sqlSession.insert("member.insertUser",studentMap);
		System.out.println(studentMap.get("use_id"));
		int resultStudent = sqlSession.insert("member.insertStudent", studentMap);
		int resultMajor = sqlSession.insert("member.insertMajorAssign", studentMap);
		int reusltReg = sqlSession.insert("member.insertRegist",studentMap);
		int resultCRC = sqlSession.insert("member.insertCRC",studentMap);
		return resultUser;
	}
	/**
	 * 학생 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateStuInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 학생 정보 비활성화
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateStuInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	/**
	 * 교수 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getProInfoList() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * 교수 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	
	/**
	 * 교수 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateProInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 교수 정보 비활성화
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateproInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/**
	 * 교직원 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String getEmpInfoList() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 교직원 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String insertEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 교직원 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 교직원 정보 비활성화
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateEmpInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentVO> getDepartmentList() {
		return sqlSession.selectList("Department.departmentList");
	}
	
	@Override
	public void insertProInfo(ProfessorVO professorVO) {
		System.out.println(professorVO.getPro_use_id());
		sqlSession.insert("Professor.professorInsert",professorVO);
	}

	@Override
	public UsersVO insertUserProInfo(UsersVO usersVO) {
		sqlSession.insert("Professor.userProInsert",usersVO);
		
		return usersVO;
		
	}

}
