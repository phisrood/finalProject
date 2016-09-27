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
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style>
html, body {
	overflow: hidden;
}
</style>

<!-- Data tables -->
<link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>
<script>
window.onload=function()
{
 CKEDITOR.replace('adb_content');
}

 
</script> 
<div class="row">
	<!-- 상담 게시글 작성 -->
	<div class="x_panel_big" style="height:730px;">
	<div class="x_title">
		<h2>상담 게시글 수정</h2>
		<div class="clearfix"></div>
	</div>
	<br>  
	<form action="/stu/adviceBoardUpdate" method="post" enctype="multipart/form-data">
		
		<input type="hidden" name="adb_no" value="${adb_no }" />
		<div class="form-group" style="height: 10%;">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
			<div class="col-md-9 col-sm-9 col-xs-12">
				<input type="text" class="form-control" name="adb_title"
					value="${adb_title }" style="width: 100%;">
			</div>
		</div>
		<br><br> 
		<input type="hidden" name="adb_no" value="${adb_no }" />
		<div class="form-group" style="height: 10%;">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">작성일</label>
			<div class="col-md-9 col-sm-9 col-xs-12">
				<input type="text" class="form-control" name="adb_date"
					value="${adb_date }" disabled="disabled"  style="width: 100%;">
			</div>
		</div>
		<br><br>
		<input type="hidden" name="adb_no" value="${adb_no }" />
		<div class="form-group" style="height: 10%;">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">작성자</label>
			<div class="col-md-9 col-sm-9 col-xs-12">
				<input type="text" class="form-control" name="adb_stud_use_id"
					value="${adb_stud_use_id }" disabled="disabled"  style="width: 100%;">
			</div>
		</div>
		<br><br>
		<div class="form-group" style="height: 60%;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<textarea class="form-control" name="adb_content" style="width:1000px;height:500px;">${adb_content }</textarea>
					</div>
		</div>
		<br><br>
		<br><br>
	  <div class="form-group">
		<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
		<div class="col-md-9 col-sm-9 col-xs-12">
					<input type="file" class="btn btn-dark" style="width: 300px;" name="adb_file">
					<div style="text-align: right;">
				<input type="button" class="btn btn-dark" value="취소" onclick="location.href='/stu/adviceBoard'"/> 
			<input type="submit" class="btn btn-dark" value="수정" />
					</div>
			</div>
		</div>
	</form>
	<div style="float: right; width: 20%;">
		<br>
	</div>
</div>
</div>

<!-- Datatables -->
<script src="/stu/js/click_cal.js"></script>
<script src="/stu/js/jquery.dataTables.min.js"></script>
<script src="/stu/js/dataTables.bootstrap.min.js"></script>
<script src="/stu/js/dataTables.buttons.min.js"></script>
<script src="/stu/js/buttons.bootstrap.min.js"></script>
<script src="/stu/js/buttons.flash.min.js"></script>
<script src="/stu/js/buttons.html5.min.js"></script>
<script src="/stu/js/buttons.print.min.js"></script>
<script src="/stu/js/dataTables.fixedHeader.min.js"></script>
<script src="/stu/js/dataTables.keyTable.min.js"></script>
<script src="/stu/js/dataTables.responsive.min.js"></script>
<script src="/stu/js/responsive.bootstrap.js"></script>
<script src="/stu/js/datatables.scroller.min.js"></script>
<script src="/stu/js/jszip.min.js"></script>
<script src="/stu/js/pdfmake.min.js"></script>
<script src="/stu/js/vfs_fonts.js"></script>