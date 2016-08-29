package com.korea.memberManage.controller;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class MemberManageController {

	
	//학생정보조회
	@RequestMapping(value="/emp/stuInfoList", method=RequestMethod.GET)
	public String stuInfoList(){
		String url="/emp/stuInfoList";
		
	
		return url;
	}
	
	//학생정보등록
	@RequestMapping(value="/emp/stuInfoInsert", method=RequestMethod.POST)
	public String stuInfoInsert(MultipartHttpServletRequest request){
		String url="/emp/stuInfoInsert";
		File file = (File) request.getFile("studentList");
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(file);
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
		return url;
	}
	
	//학생정보등록(신입생 엑셀등록)
	@RequestMapping(value="/emp/stuInfoInsertExcel", method=RequestMethod.GET)
	public String stuInfoInsertExcel(){
		String url="";
		
		return url;
	}
	
	//학생정보수정
	@RequestMapping(value="/emp/stuInfoUpdate", method=RequestMethod.GET)
	public String stuInfoUpdate(){
		String url="";
		
		return url;
	}
	
	//학생정보 비활성화onoff
	@RequestMapping(value="/emp/stuInfoOnOff", method=RequestMethod.GET)
	public String stuInfoOnOff(){
		String url="";
		
		return url;
	}
	
	///////////////////////////교수/////////////////////////
	
	//교수정보조회
	@RequestMapping(value="/emp/proInfoList", method=RequestMethod.GET)
	public String proInfoList(){
		String url="";
		
		return url;
	}
	
	//교수정보등록
	@RequestMapping(value="/emp/proInfoInsert", method=RequestMethod.GET)
	public String proInfoInsert(){
		String url="";
		
		return url;
	}
	
	//교수정보수정
	@RequestMapping(value="/emp/proInfoUpdate", method=RequestMethod.GET)
	public String proInfoUpdate(){
		String url="";
		
		return url;
	}
	
	//교수정보 비활성화onoff
	@RequestMapping(value="/emp/proInfoOnOff", method=RequestMethod.GET)
	public String proInfoOnOff(){
		String url="";
		
		return url;
	}
	
	///////////////////////////교직원/////////////////////////
	
	//교직원정보조회
	@RequestMapping(value="/emp/empInfoList", method=RequestMethod.GET)
	public String empInfoList(){
		String url="";
		
		return url;
	}
	
	//교직원정보등록
	@RequestMapping(value="/emp/empInfoInsert", method=RequestMethod.GET)
	public String empInfoInsert(){
		String url="";
		
		return url;
	}
	
	//교직원정보수정
	@RequestMapping(value="/emp/empInfoUpdate", method=RequestMethod.GET)
	public String empInfoUpdate(){
		String url="";
		
		return url;
	}
	
	//교직원정보 비활성화onoff
	@RequestMapping(value="/emp/empInfoOnOff", method=RequestMethod.GET)
	public String empInfoOnOff(){
		String url="";
		
		return url;
	}
	
	
	private void readSheet(int columnindex, Sheet sheet) {
		int rowindex;
		int rows = sheet.getPhysicalNumberOfRows();

		for (rowindex = 2; rowindex < rows; rowindex++) {
			// 행을읽는다
			Row row = sheet.getRow(rowindex);
			columnindex = readRow(columnindex, row);
		}
	}

	private int readRow(int columnindex, Row row) {
		if (row != null) {
			// 셀의 수
			int cells = row.getPhysicalNumberOfCells();
			for (columnindex = 0; columnindex < cells; columnindex++) {
				// 셀값을 읽는다
				System.out.print(readCell(columnindex, row)+"\t");
			}
			System.out.println();
		}
		return columnindex;
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
		}
		return value;
	}
}
