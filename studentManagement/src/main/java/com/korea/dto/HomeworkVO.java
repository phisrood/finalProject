package com.korea.dto;
/**
 * 과제게시판VO
 * 
 * @param
 * hw_no : 글번호<br>
 * hw_pro_use_id : 작성자<br> 
 * hw_lec_no : 강의등록번호<br>
 * hw_af_no : 파일번호<br>
 * hw_title : 제목<br>
 * hw_content : 내용<br>
 * hw_date : 작성일<br> 
 * hw_startdate : 시작일<br>
 * hw_enddate : 마감일
 * 
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class HomeworkVO {

	private int hw_no;
	private String hw_pro_use_id;
	private int hw_lec_no;
	private int hw_af_no;
	private String hw_title;
	private String 	hw_content;
	private String hw_date;
	private String hw_startdate;
	private String hw_enddate;
	public int getHw_no() {
		return hw_no;
	}
	public void setHw_no(int hw_no) {
		this.hw_no = hw_no;
	}
	public String getHw_pro_use_id() {
		return hw_pro_use_id;
	}
	public void setHw_pro_use_id(String hw_pro_use_id) {
		this.hw_pro_use_id = hw_pro_use_id;
	}
	public int getHw_lec_no() {
		return hw_lec_no;
	}
	public void setHw_lec_no(int hw_lec_no) {
		this.hw_lec_no = hw_lec_no;
	}
	public int getHw_af_no() {
		return hw_af_no;
	}
	public void setHw_af_no(int hw_af_no) {
		this.hw_af_no = hw_af_no;
	}
	public String getHw_title() {
		return hw_title;
	}
	public void setHw_title(String hw_title) {
		this.hw_title = hw_title;
	}
	public String getHw_content() {
		return hw_content;
	}
	public void setHw_content(String hw_content) {
		this.hw_content = hw_content;
	}
	public String getHw_date() {
		return hw_date;
	}
	public void setHw_date(String hw_date) {
		this.hw_date = hw_date;
	}
	public String getHw_startdate() {
		return hw_startdate;
	}
	public void setHw_startdate(String hw_startdate) {
		this.hw_startdate = hw_startdate;
	}
	public String getHw_enddate() {
		return hw_enddate;
	}
	public void setHw_enddate(String hw_enddate) {
		this.hw_enddate = hw_enddate;
	}
	
	
}
