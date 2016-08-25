package com.korea.dto;
/**
 * 상담 VO
 * 
 * @param
 * ad_no : 상담번호<br>
 * ad_pro_use_id : 교수아이디<br>
 * ad_stud_use_id : 학생아이디<br>
 * ad_reqdate : 상담신청일자<br>
 * ad_way : 상담방법<br>
 * ad_purpose : 상담목적<br>
 * ad_time : 상담시간<br>
 * ad_stat : 상담처리상태<br>
 * ad_return : 상담회신일자
 * 
 * @version 한돈희, 1.0, 2016.08.24, 초기 작성
 * @author 한돈희
 *
 */
public class AdviceVO {

	private int ad_no;
	private String ad_pro_use_id;
	private String ad_stud_use_id;
	private String ad_reqdate;
	private String ad_way;
	private String ad_purpose;
	private String ad_time;
	private String ad_stat;
	private String ad_return;
	public int getAd_no() {
		return ad_no;
	}
	public void setAd_no(int ad_no) {
		this.ad_no = ad_no;
	}
	public String getAd_pro_use_id() {
		return ad_pro_use_id;
	}
	public void setAd_pro_use_id(String ad_pro_use_id) {
		this.ad_pro_use_id = ad_pro_use_id;
	}
	public String getAd_stud_use_id() {
		return ad_stud_use_id;
	}
	public void setAd_stud_use_id(String ad_stud_use_id) {
		this.ad_stud_use_id = ad_stud_use_id;
	}
	public String getAd_reqdate() {
		return ad_reqdate;
	}
	public void setAd_reqdate(String ad_reqdate) {
		this.ad_reqdate = ad_reqdate;
	}
	public String getAd_way() {
		return ad_way;
	}
	public void setAd_way(String ad_way) {
		this.ad_way = ad_way;
	}
	public String getAd_purpose() {
		return ad_purpose;
	}
	public void setAd_purpose(String ad_purpose) {
		this.ad_purpose = ad_purpose;
	}
	public String getAd_time() {
		return ad_time;
	}
	public void setAd_time(String ad_time) {
		this.ad_time = ad_time;
	}
	public String getAd_stat() {
		return ad_stat;
	}
	public void setAd_stat(String ad_stat) {
		this.ad_stat = ad_stat;
	}
	public String getAd_return() {
		return ad_return;
	}
	public void setAd_return(String ad_return) {
		this.ad_return = ad_return;
	}
	
	
}
