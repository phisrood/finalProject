package com.korea.dto;
/**
 * 학적변동현황VO
 * 
 * @param
 * crc_no : 순번<br>
 * crc_stud_use_id : 아이디<br>
 * crc_year : 연도<br>
 * crc_cemester : 학기<br>
 * crc_changedate : 변동일자<br>
 * crc_colleagestatus : 학적상태<br>
 * crc_colleagechangestatus : 학적변동현황<br>
 * crc_changereason : 변동사유<br>
 * crc_returnappointdate : 복학예정일자<br>
 * crc_cancelyn : 취소여부<br>
 * crc_submityn : 승인여부
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Colleage_Register_ChangeVO {

	private int crc_no;
	private String crc_stud_use_id;
	private String crc_year;
	private String crc_cemester;
	private String crc_changedate;
	private String crc_colleagestatus;
	private String crc_colleagechangestatus;
	private String crc_changereason;
	private String crc_returnappointdate;
	private String crc_cancelyn;
	private String crc_submityn;
	public int getCrc_no() {
		return crc_no;
	}
	public void setCrc_no(int crc_no) {
		this.crc_no = crc_no;
	}
	public String getCrc_stud_use_id() {
		return crc_stud_use_id;
	}
	public void setCrc_stud_use_id(String crc_stud_use_id) {
		this.crc_stud_use_id = crc_stud_use_id;
	}
	public String getCrc_year() {
		return crc_year;
	}
	public void setCrc_year(String crc_year) {
		this.crc_year = crc_year;
	}
	public String getCrc_cemester() {
		return crc_cemester;
	}
	public void setCrc_cemester(String crc_cemester) {
		this.crc_cemester = crc_cemester;
	}
	public String getCrc_changedate() {
		return crc_changedate;
	}
	public void setCrc_changedate(String crc_changedate) {
		this.crc_changedate = crc_changedate;
	}
	public String getCrc_colleagestatus() {
		return crc_colleagestatus;
	}
	public void setCrc_colleagestatus(String crc_colleagestatus) {
		this.crc_colleagestatus = crc_colleagestatus;
	}
	public String getCrc_colleagechangestatus() {
		return crc_colleagechangestatus;
	}
	public void setCrc_colleagechangestatus(String crc_colleagechangestatus) {
		this.crc_colleagechangestatus = crc_colleagechangestatus;
	}
	public String getCrc_changereason() {
		return crc_changereason;
	}
	public void setCrc_changereason(String crc_changereason) {
		this.crc_changereason = crc_changereason;
	}
	public String getCrc_returnappointdate() {
		return crc_returnappointdate;
	}
	public void setCrc_returnappointdate(String crc_returnappointdate) {
		this.crc_returnappointdate = crc_returnappointdate;
	}
	public String getCrc_cancelyn() {
		return crc_cancelyn;
	}
	public void setCrc_cancelyn(String crc_cancelyn) {
		this.crc_cancelyn = crc_cancelyn;
	}
	public String getCrc_submityn() {
		return crc_submityn;
	}
	public void setCrc_submityn(String crc_submityn) {
		this.crc_submityn = crc_submityn;
	}
	
	
}
