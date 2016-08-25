package com.korea.dto;
/**
 * 쪽지VO
 * 
 * @param
 * mes_no : 글번호<br>
 * mes_send_use_id : 발신자<br>
 * mes_recive_use_id : 수신자<br>
 * mes_title : 제목<br>
 * mes_content : 내용<br>
 * mes_date : 작성일<br>
 * mes_readyn : 수신여부<br>
 * mes_delyn : 삭제여부
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class MessageVO {

	private int mes_no;
	private String mes_send_use_id;
	private String mes_recive_use_id;
	private String mes_title;
	private String mes_content;
	private String mes_date;
	private String mes_readyn;
	private String mes_delyn;
	public int getMes_no() {
		return mes_no;
	}
	public void setMes_no(int mes_no) {
		this.mes_no = mes_no;
	}
	public String getMes_send_use_id() {
		return mes_send_use_id;
	}
	public void setMes_send_use_id(String mes_send_use_id) {
		this.mes_send_use_id = mes_send_use_id;
	}
	public String getMes_recive_use_id() {
		return mes_recive_use_id;
	}
	public void setMes_recive_use_id(String mes_recive_use_id) {
		this.mes_recive_use_id = mes_recive_use_id;
	}
	public String getMes_title() {
		return mes_title;
	}
	public void setMes_title(String mes_title) {
		this.mes_title = mes_title;
	}
	public String getMes_content() {
		return mes_content;
	}
	public void setMes_content(String mes_content) {
		this.mes_content = mes_content;
	}
	public String getMes_date() {
		return mes_date;
	}
	public void setMes_date(String mes_date) {
		this.mes_date = mes_date;
	}
	public String getMes_readyn() {
		return mes_readyn;
	}
	public void setMes_readyn(String mes_readyn) {
		this.mes_readyn = mes_readyn;
	}
	public String getMes_delyn() {
		return mes_delyn;
	}
	public void setMes_delyn(String mes_delyn) {
		this.mes_delyn = mes_delyn;
	}
	
}
