package com.korea.dto;

/**
 * 온라인콘텐츠 시청현황 VO
 * 
 * @param cn_no
 *            : 공지사항시퀀스번호<br>
 *            cn_af_no : 업로드파일시퀀스번호<br>
 *            cn_sp_use_id : 작성자<br>
 *            cn_title : 공지사항제목<br>
 *            cn_content : 공지사항내용<br>
 * 
 * 
 * @version 이건원, 1.0, 2016.09.07, 초기 작성
 * @author 이건원
 *
 */
public class Online_Con_Watchcheck_ViewVO {

	private String oc_no;
	private String oc_lec_no;
	private String use_name;
	private String stud_use_id;
	private String dep_name;
	private String ws_attendyn;

	public String getOc_no() {
		return oc_no;
	}

	public void setOc_no(String oc_no) {
		this.oc_no = oc_no;
	}

	public String getOc_lec_no() {
		return oc_lec_no;
	}

	public void setOc_lec_no(String oc_lec_no) {
		this.oc_lec_no = oc_lec_no;
	}

	public String getUse_name() {
		return use_name;
	}

	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}

	public String getStud_use_id() {
		return stud_use_id;
	}

	public void setStud_use_id(String stud_use_id) {
		this.stud_use_id = stud_use_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getWs_attendyn() {
		return ws_attendyn;
	}

	public void setWs_attendyn(String ws_attendyn) {
		this.ws_attendyn = ws_attendyn;
	}

}
