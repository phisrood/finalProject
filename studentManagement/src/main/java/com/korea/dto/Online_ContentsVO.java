package com.korea.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * 온라인콘텐츠VO
 * 
 * @param oc_no
 *            : 콘텐츠번호<br>
 *            oc_lec_no : 강의등록번호<br>
 *            oc_pro_use_id : 게시자<br>
 *            oc_af_no : 파일번호<br>
 *            oc_startdate : 학습시작일<br>
 *            oc_enddate : 학습마감일<br>
 *            oc_content : 내용<br>
 *            oc_date : 작성일
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class Online_ContentsVO {

	private int oc_no;
	private int oc_lec_no;
	private String oc_pro_use_id;
	private int oc_af_no;
	private String oc_startdate;
	private String oc_enddate;
	private String oc_content;
	private String oc_date;
	private int oc_time;
	private MultipartFile file;
	private String ws_attendyn;

	public String getWs_attendyn() {
		return ws_attendyn;
	}

	public void setWs_attendyn(String ws_attendyn) {
		this.ws_attendyn = ws_attendyn;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public int getOc_time() {
		return oc_time;
	}

	public void setOc_time(int oc_time) {
		this.oc_time = oc_time;
	}

	public int getOc_no() {
		return oc_no;
	}

	public void setOc_no(int oc_no) {
		this.oc_no = oc_no;
	}

	public int getOc_lec_no() {
		return oc_lec_no;
	}

	public void setOc_lec_no(int oc_lec_no) {
		this.oc_lec_no = oc_lec_no;
	}

	public String getOc_pro_use_id() {
		return oc_pro_use_id;
	}

	public void setOc_pro_use_id(String oc_pro_use_id) {
		this.oc_pro_use_id = oc_pro_use_id;
	}

	public int getOc_af_no() {
		return oc_af_no;
	}

	public void setOc_af_no(int oc_af_no) {
		this.oc_af_no = oc_af_no;
	}

	public String getOc_startdate() {
		return oc_startdate;
	}

	public void setOc_startdate(String oc_startdate) {
		this.oc_startdate = oc_startdate;
	}

	public String getOc_enddate() {
		return oc_enddate;
	}

	public void setOc_enddate(String oc_enddate) {
		this.oc_enddate = oc_enddate;
	}

	public String getOc_content() {
		return oc_content;
	}

	public void setOc_content(String oc_content) {
		this.oc_content = oc_content;
	}

	public String getOc_date() {
		return oc_date;
	}

	public void setOc_date(String oc_date) {
		this.oc_date = oc_date;
	}

}
