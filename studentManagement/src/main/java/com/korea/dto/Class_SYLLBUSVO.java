package com.korea.dto;
/**
 * 강의계획서VO
 * 
 * @param
 * cs_lec_no : 강의등록번호 <br>
 * cs_pro_use_id : 작성자<br>
 * cs_content : 강의설명<br>
 * cs_progress : 진행방식<br>
 * cs_writer : 저자<br>
 * cs_bookversion : 판사항<br>
 * cs_bookname : 도서명<br>
 * cs_publisher : 출판사<br>
 * cs_midterm : 중간고사<br>
 * cs_final : 기말고사<br>
 * cs_homework : 과제<br>
 * cs_attend : 출석
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Class_SYLLBUSVO{
	private int cs_lec_no;
	private String cs_pro_use_id;
	private String cs_content;
	private String cs_progress;
	private String cs_writer;
	private String cs_bookversion;
	private String cs_bookname;
	private String cs_publisher;
	private int cs_midterm;
	private int cs_final;
	private int cs_homework;
	private int cs_attent;
	public int getCs_lec_no() {
		return cs_lec_no;
	}
	public void setCs_lec_no(int cs_lec_no) {
		this.cs_lec_no = cs_lec_no;
	}
	public String getCs_pro_use_id() {
		return cs_pro_use_id;
	}
	public void setCs_pro_use_id(String cs_pro_use_id) {
		this.cs_pro_use_id = cs_pro_use_id;
	}
	public String getCs_content() {
		return cs_content;
	}
	public void setCs_content(String cs_content) {
		this.cs_content = cs_content;
	}
	public String getCs_progress() {
		return cs_progress;
	}
	public void setCs_progress(String cs_progress) {
		this.cs_progress = cs_progress;
	}
	public String getCs_writer() {
		return cs_writer;
	}
	public void setCs_writer(String cs_writer) {
		this.cs_writer = cs_writer;
	}
	public String getCs_bookversion() {
		return cs_bookversion;
	}
	public void setCs_bookversion(String cs_bookversion) {
		this.cs_bookversion = cs_bookversion;
	}
	public String getCs_bookname() {
		return cs_bookname;
	}
	public void setCs_bookname(String cs_bookname) {
		this.cs_bookname = cs_bookname;
	}
	public String getCs_publisher() {
		return cs_publisher;
	}
	public void setCs_publisher(String cs_publisher) {
		this.cs_publisher = cs_publisher;
	}
	public int getCs_midterm() {
		return cs_midterm;
	}
	public void setCs_midterm(int cs_midterm) {
		this.cs_midterm = cs_midterm;
	}
	public int getCs_final() {
		return cs_final;
	}
	public void setCs_final(int cs_final) {
		this.cs_final = cs_final;
	}
	public int getCs_homework() {
		return cs_homework;
	}
	public void setCs_homework(int cs_homework) {
		this.cs_homework = cs_homework;
	}
	public int getCs_attent() {
		return cs_attent;
	}
	public void setCs_attent(int cs_attent) {
		this.cs_attent = cs_attent;
	}
	
	
}
