package com.korea.indivInfoManage.dao;
/**
 * @Class Name : IndivInfoManageDAOImpl.java
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

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.Colleage_Register_ChangeVO;
import com.korea.dto.StudentVO;
import com.korea.dto.Student_InfoViewVO;



@Repository
public class IndivInfoManageDAOImpl implements IndivInfoManageDAO{
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Autowired
	private SqlSession sqlSession;
	/**
	 * 개인 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public Student_InfoViewVO getIndivInfo(String stud_use_id) {
		return (Student_InfoViewVO) sqlSession.selectOne("indivInfoManageDAO.getIndivInfo",stud_use_id);
											           	//xml 네임스페이스, id, 가져갈것
	}
	/**
	 * 개인 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public int updateIndiv(StudentVO studentVO) {
		 return sqlSession.update("indivInfoManageDAO.setIndivInfo",studentVO);
	}
	/**
	 * 학적 변동 현황
	 * @param
	 * @return 
	 * @throws 
	 */
	//학적변동현황 불러오기
	@Override
	public List<Colleage_Register_ChangeVO> getColleageChangeList(String stud_use_id) {
		
		return sqlSession.selectList("indivInfoManageDAO.selectColleageChangeList",stud_use_id);
	}
	@Override
	public String getIndivInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int updateIndiv(Map<String, String> params) {
		
		
		return sqlSession.update("indivInfoManageDAO.setIndivPwd",params);
	}
	
	
	//파일이미지변경
	@Override
	public int updateImage(Map<String, String> map) {
	
		return sqlSession.update("indivInfoManageDAO.updateImage",map);
	}
	
	//파일이미지등록
	@Override
	public int insertImage(Map<String, String> insertMap) {
		
	 return sqlSession.insert("indivInfoManageDAO.insertImage",insertMap);
	 
	}
	
	//처음등록된 사진 가져오기
	@Override
	public int selectafno() {
		
	 return (int) sqlSession.selectOne("indivInfoManageDAO.selectafno");
	 
	}
	@Override
	public int updateafno(Map<String, String> para) {
		
		return (int) sqlSession.update("indivInfoManageDAO.updateafno",para);
	}
	

	
}
