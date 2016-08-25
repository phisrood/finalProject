package com.korea.dto;
/**
 * 자유게시판댓글VO
 * 
 * @param
 * fc_no : 댓글번호<br>
 * fc_qb_no : 게시판번호<br>
 * fc_use_id : 작성자<br>
 * fc_date : 작성일<br>
 * fc_content : 댓글
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Free_CommentsVO {

	private int fc_no;
	private int fc_qb_no;
	private String fc_use_id;
	private String fc_date;
	private String fc_content;
	public int getFc_no() {
		return fc_no;
	}
	public void setFc_no(int fc_no) {
		this.fc_no = fc_no;
	}
	public int getFc_qb_no() {
		return fc_qb_no;
	}
	public void setFc_qb_no(int fc_qb_no) {
		this.fc_qb_no = fc_qb_no;
	}
	public String getFc_use_id() {
		return fc_use_id;
	}
	public void setFc_use_id(String fc_use_id) {
		this.fc_use_id = fc_use_id;
	}
	public String getFc_date() {
		return fc_date;
	}
	public void setFc_date(String fc_date) {
		this.fc_date = fc_date;
	}
	public String getFc_content() {
		return fc_content;
	}
	public void setFc_content(String fc_content) {
		this.fc_content = fc_content;
	}
	
}
