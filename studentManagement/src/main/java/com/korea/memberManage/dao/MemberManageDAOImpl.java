package com.korea.memberManage.dao;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorDetailViewVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.ProfessorViewVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;


/**
 * @Class Name : MemberManageDAOImpl.java
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
 *    2016.08.29	이수정			교수등록 
 *    2016.08.30.	이수정			교수조회
 *    2016.08.30.	이수정			교수수정
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
	public List<StudentVO> getStuInfoList() {
		List<StudentVO> studentList = sqlSession.selectList("member.getStuInfoList");
		return studentList;
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
	
	
	
	//교수 정보 조회
	@Override
	public List<ProfessorViewVO> getProInfoList() {
		List<ProfessorViewVO> proInfoList = 
				(List<ProfessorViewVO>) sqlSession.selectList("Professor.getProInfoList");
		System.out.println(proInfoList);
		return proInfoList;
		
	}

	//학과번호 리스트불러오기
	@Override
	public List<DepartmentVO> getDepartmentList() {
		return sqlSession.selectList("Department.departmentList");
	}
	
	//교수정보등록
	public void insertProInfo(ProfessorVO professorVO) {
		System.out.println(professorVO.getPro_use_id());
		sqlSession.insert("Professor.professorInsert",professorVO);
	}
	
	//USERS테이블에 교수정보 등록
	public UsersVO insertUserProInfo(UsersVO usersVO) {
		
		
		sqlSession.insert("Professor.userProInsert",usersVO);
		
		return usersVO;
		
	}
	
	//교수정보수정
	@Override
	public void updateProInfo(ProfessorVO professorVO, UsersVO usersVO) {
		usersVO.setUse_id(professorVO.getPro_use_id());
		sqlSession.update("Professor.userProUpdate",usersVO);
		sqlSession.update("Professor.professorUpdate",professorVO);
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
	@Override
	public String getEmpInfoList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String insertEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateEmpInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateEmpInfoOnOff() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public ProfessorDetailViewVO getDetailProInfo(String pro_use_id) {
		return (ProfessorDetailViewVO) sqlSession.selectOne("Professor.professorDetail", pro_use_id);
	}

	

}
