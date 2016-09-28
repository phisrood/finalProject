<%--==============================================================
 * 사이버 캠퍼스 자유 게시판 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="/common/js/notice.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var re = /^[0-9]+$/;
		var engName = /[a-zA-Z]{1,20}/;
		var korName = /[가-힣]{1,20}/;
		var tel = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$/;
  
		$("#submitBtn").click(function() {
			if ($("#dep_name").val() == "") {
				swal({
					title : "< Error! >",
					text : "학과명을 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_name").focus();
				return false;
			}else if (!korName.test($("#dep_name").val())) {
				swal({
					title : "< Error! >",
					text : "학과명을 정확히 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_engname").focus();
				return false;
			} else if ($("#dep_engname").val() == "") {
				swal({
					title : "< Error! >",
					text : "영문명을 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_engname").focus();
				return false;
			} else if (!engName.test($("#dep_engname").val())) {
				swal({
					title : "< Error! >",
					text : "영문명은 영어로만 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_engname").focus();
				return false;
			}else if ($("#dep_majneedcredit").val() == "") {
				swal({
					title : "< Error! >",
					text : "주전공 졸업학점을 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_majneedcredit").focus();
				return false;
			} else if (!re.test($("#dep_majneedcredit").val())) {
				swal({
					title : "< Error! >",
					text : "주전공 졸업학점은 숫자로만 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_majneedcredit").value = "";
				$("#dep_majneedcredit").focus();
				return false;
			} else if ($("#dep_minneedcredit").val() == "") {
				swal({
					title : "< Error! >",
					text : "부전공 졸업학점을 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_minneedcredit").focus();
				return false;
			} else if (!re.test($("#dep_minneedcredit").val())) {
				swal({
					title : "< Error! >",
					text : "부전공 졸업학점은 숫자로만 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_minneedcredit").value = "";
				$("#dep_minneedcredit").focus();
				return false;
			} else if ($("#dep_mulcredit").val() == "") {
				swal({
					title : "< Error! >",
					text : "다전공 졸업학점을 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_mulcredit").focus();
				return false;
			} else if (!re.test($("#dep_mulcredit").val())) {
				swal({
					title : "< Error! >",
					text : "다전공 졸업학점은 숫자로만 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_mulcredit").value = "";
				$("#dep_mulcredit").focus();
				return false;
			} else if ($("#dep_phone").val() == "") {
				swal({
					title : "< Error! >",
					text : "학과 전화번호를 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_phone").focus();
				return false;
			}else if (!tel.test($("#dep_phone").val())) {
				swal({
					title : "< Error! >",
					text : "학과 전화번호를 정확히 입력해주세요.",
					type : "error",
					confirmButtonText : "닫기"
				});
				$("#dep_phone").value = "";
				$("#dep_phone").focus();
				return false;
			} 
		});
	});
</script>
<style>
html, body {
	overflow: hidden;
}

h2 {
	display: inline;
}
</style>    
</head>  
<div class="row">    
  
	<div class="x_panel">    
         <div class="x_title">
		<h2>
			<i class="fa fa-university"></i>학과정보관리    
		</h2>
		<div class="clearfix"></div>
		</div>  

	<form name="frm" method="post" action="/emp/departmentInsert">
  
		<div>  
			<br>
			<div class="form-group">  
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">학과명</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">    
                   <input type="text" class="form-control" placeholder="한글 최대 10자" name="dep_name" maxlength="10" id="dep_name">
                 </div>  
            </div>  
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">영문명</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="영문 최대 30자" name="dep_engname" maxlength="30" id="dep_engname">
                 </div>  
            </div>  
	
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">주전공 졸업학점</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="숫자만 입력" name="dep_majneedcredit" maxlength="3" id="dep_majneedcredit">
                 </div>
            </div>    
			<br> <br>
			<div class="form-group">  
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">부전공 졸업학점</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="숫자만 입력" name="dep_minneedcredit" maxlength="3" id="dep_minneedcredit">
                 </div>
            </div>
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">다전공 졸업학점</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="숫자만 입력" name="dep_mulcredit" maxlength="3" id="dep_mulcredit">
                 </div>
            </div>
			<br> <br>
			<div class="form-group">
                 <label class="control-label col-md-3 col-sm-3 col-xs-12">전화번호</label>
                 <div class="col-md-9 col-sm-9 col-xs-12">
                   <input type="text" class="form-control" placeholder="'-'을 포함한 전화번호 12자리" maxlength="12" name="dep_phone" id="dep_phone">
                 </div>
            </div>
			<br>
		</div>
		<div style="text-align: right">
			<input type="submit" class="btn btn-dark" value="등록" id="submitBtn"/>
			<a href="/emp/departmentInfoList">
			<button type="button" class="btn btn-dark">
				취소
			</button>  
			</a> 
		</div>
	</form>
</div>
</div>
</html>
