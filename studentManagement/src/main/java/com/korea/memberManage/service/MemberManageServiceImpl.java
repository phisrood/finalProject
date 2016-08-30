package com.korea.memberManage.service;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.korea.dto.DepartmentVO;
import com.korea.dto.ProfessorVO;
import com.korea.dto.ProfessorViewVO;
import com.korea.dto.StudentVO;
import com.korea.dto.UsersVO;
import com.korea.memberManage.dao.MemberManageDAO;



/**
 * @Class Name : MemberManageServiceImpl.java
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
@Service
public class MemberManageServiceImpl implements MemberManageService{

	@Autowired
	private MemberManageDAO memberManageDAO; 
	

	String[] columnHead = {"이름","생년월일","핸드폰번호","우편번호"
			,"주소","상세주소","혈액형","성별","이메일","주민번호앞자리","주민번호뒷자리","학과번호","납부금액","납부일","영문명"};
	

	/**
	 * 학생 정보 조회
	 * @param
	 * @return 
	 * @throws 
	 */

	@Override
	public List<StudentVO> getStuInfoList() {
		return memberManageDAO.getStuInfoList();
		
	}
	/**
	 * 학생 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String insertStuInfo(MultipartFile file) {
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(file.getInputStream());
			int rowindex = 0;
			int columnindex = 0;
			// 시트 수 (첫번째에만 존재하므로 0을 준다)
			// 만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
			
			Sheet sheet = workbook.getSheetAt(0);
			// 행의 수
			readSheet(columnindex, sheet);
			
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 학생 정보 수정
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public String updateStuInfo() {
		
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
	public List<ProfessorViewVO> getProInfoList() {
		
		return memberManageDAO.getProInfoList();
	}

	/**
	 * 교수 정보 등록
	 * @param
	 * @return 
	 * @throws 
	 */
	@Override
	public List<DepartmentVO> getDepartmentList() {
		// TODO Auto-generated method stub
		return memberManageDAO.getDepartmentList();
	}

	
	@Override
	public void insertProInfo(ProfessorVO professorVO, String name) {
		
		
		UsersVO usersVO = new UsersVO();
		usersVO.setAuthority("ROLE_PRO");
		usersVO.setUse_kind("professor");
		usersVO.setUse_name(name);
		usersVO.setUse_pwd(professorVO.getPro_regno1());
		usersVO=memberManageDAO.insertUserProInfo(usersVO);
		professorVO.setPro_use_id(usersVO.getUse_id());
		memberManageDAO.insertProInfo(professorVO);
		

		
	}

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
	private void readSheet(int columnindex, Sheet sheet) {
		int rowindex;
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		for (rowindex = 2; rowindex < rows; rowindex++) {
			// 행을읽는다
			Row row = sheet.getRow(rowindex);
			readRow(columnindex, row);
		}
	}


	


	private void readRow(int columnindex, Row row) {
		Map<String, String> studentMap = new HashMap<String, String>(); 
		if (row != null) {
			// 셀의 수
			int cells = row.getPhysicalNumberOfCells();
			for (columnindex = 0; columnindex < cells; columnindex++) {
				// 셀값을 읽는다
				String cellValue =readCell(columnindex, row);
				switch(columnindex){
					case 0: //이름
						studentMap.put("name", cellValue);
						break;
					case 1: //생년월일
						studentMap.put("birth", cellValue);
						break;
					case 2: //핸드폰번호
						studentMap.put("phone", cellValue);
						break;
					case 3: //우편번호
						studentMap.put("zipCode", cellValue);
						break;
					case 4: //주소
						studentMap.put("add", cellValue);
						break;
					case 5: //상세주소
						studentMap.put("addDetail", cellValue);
						break;
					case 6: //혈액형
						studentMap.put("blType", cellValue);
						break;
					case 7: //성별
						studentMap.put("gender", cellValue);
						break;
					case 8: //이메일
						studentMap.put("email", cellValue);
						break;
					case 9: //주민번호 앞자리
						studentMap.put("reg1", cellValue);
						break;
					case 10: //주민번호 뒷자리
						studentMap.put("reg2", cellValue);
						break;
					case 11: //학과번호
						studentMap.put("depNo", cellValue);
						break;
					case 12: //납부금액
						studentMap.put("paySum", cellValue);
						break;
					case 13: //등록일
						studentMap.put("regDate", cellValue);
						break;
					case 14: //영문명
						studentMap.put("engname", cellValue);
						break;
				}
			}//end of row
			int result = memberManageDAO.insertStuInfo(studentMap);
		}
	}

	private String readCell(int columnindex, Row row) {
		Cell cell = row.getCell(columnindex);
		String value = "";
		
		// 셀이 빈값일경우를 위한 널체크
		if (cell == null) {
			return "없음";
		} else {
			// 타입별로 내용 읽기
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_FORMULA:
				value = cell.getCellFormula();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				value = cell.getNumericCellValue() + "";
				break;
			case Cell.CELL_TYPE_STRING:
				value = cell.getStringCellValue() + "";
				break;
			case Cell.CELL_TYPE_BLANK:
				value = cell.getBooleanCellValue() + "";
				break;
			case Cell.CELL_TYPE_ERROR:
				value = cell.getErrorCellValue() + "";
				break;
			}
			System.out.println(columnHead[columnindex]+":"+value);
		}
		return value;
	}
	
	
}
