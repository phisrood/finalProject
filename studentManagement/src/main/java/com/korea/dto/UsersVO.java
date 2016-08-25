package com.korea.dto;
/**
 * 사용자VO
 * 
 * @param
 * use_id : 아이디
 * use_kind : 학생/교수/직원
 * use_name : 이름
 * use_yn : 사용유무
 * use_athu : 권한
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class UsersVO {

	private String use_id;
	private String use_kind;
	private String use_name;
	private String use_yn;
	private String use_athu;
	public String getUse_id() {
		return use_id;
	}
	public void setUse_id(String use_id) {
		this.use_id = use_id;
	}
	public String getUse_kind() {
		return use_kind;
	}
	public void setUse_kind(String use_kind) {
		this.use_kind = use_kind;
	}
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public String getUse_athu() {
		return use_athu;
	}
	public void setUse_athu(String use_athu) {
		this.use_athu = use_athu;
	}
	
}
