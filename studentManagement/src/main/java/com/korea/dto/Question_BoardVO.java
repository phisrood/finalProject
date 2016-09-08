package com.korea.dto;
/**
 * Qna게시판VO
 * 
 * @param
 * qb_no : 게시글 번호<br>
 * qb_stud_use_id : 학생아이디<br>
 * qb_lec_no : 강의번호<br>
 * qb_af_no : 첨부파일번호<br>
 * qb_title : 제목<br>
 * qb_content : 내용<br>
 * qb_date : 작성일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Question_BoardVO {

	private int qb_no;
	private String qb_stud_use_id;
	private int qb_lec_no;
	private int qb_af_no;
	private String qb_title;
	private String qb_content;
	private String qb_date;
	
	
	
	public int getQb_no() {
		return qb_no;
	}
	public void setQb_no(int qb_no) {
		this.qb_no = qb_no;
	}
	public String getQb_stud_use_id() {
		return qb_stud_use_id;
	}
	public void setQb_stud_use_id(String qb_stud_use_id) {
		this.qb_stud_use_id = qb_stud_use_id;
	}
	public int getQb_lec_no() {
		return qb_lec_no;
	}
	public void setQb_lec_no(int qb_lec_no) {
		this.qb_lec_no = qb_lec_no;
	}
	public int getQb_af_no() {
		return qb_af_no;
	}
	public void setQb_af_no(int qb_af_no) {
		this.qb_af_no = qb_af_no;
	}
	public String getQb_title() {
		return qb_title;
	}
	public void setQb_title(String qb_title) {
		this.qb_title = qb_title;
	}
	public String getQb_content() {
		return qb_content;
	}
	public void setQb_content(String qb_content) {
		this.qb_content = qb_content;
	}
	public String getQb_date() {
		return qb_date;
	}
	public void setQb_date(String qb_date) {
		this.qb_date = qb_date;
	}
	
	
}
