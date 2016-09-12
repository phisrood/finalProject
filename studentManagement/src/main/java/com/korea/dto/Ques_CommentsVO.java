package com.korea.dto;
/**
 * Qna댓글게시판VO
 * 
 * @param
 * qc_no : 댓글번호<br>
 * qc_qb_no : 게시글번호<br>
 * qc_pro_use_id : 교수아이디<br>
 * qc_date : 작성일<br>
 * qc_content : 댓글내용
 * 
 * @version 박진성, 1.0, 2016.09.09, 초기 작성
 * @author 박진성
 *
 *
 */
public class Ques_CommentsVO {

	private int qc_no;
	private int qc_qb_no;
	private String qc_pro_use_id;
	private String qc_date;
	private String qc_content;
	public int getQc_no() {
		return qc_no;
	}
	public void setQc_no(int qc_no) {
		this.qc_no = qc_no;
	}
	public int getQc_qb_no() {
		return qc_qb_no;
	}
	public void setQc_qb_no(int qc_qb_no) {
		this.qc_qb_no = qc_qb_no;
	}
	public String getQc_pro_use_id() {
		return qc_pro_use_id;
	}
	public void setQc_pro_use_id(String qc_pro_use_id) {
		this.qc_pro_use_id = qc_pro_use_id;
	}
	public String getQc_date() {
		return qc_date;
	}
	public void setQc_date(String qc_date) {
		this.qc_date = qc_date;
	}
	public String getQc_content() {
		return qc_content;
	}
	public void setQc_content(String qc_content) {
		this.qc_content = qc_content;
	}
	
}
