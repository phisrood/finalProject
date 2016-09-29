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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Data tables -->
<link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">


<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>







<script>
	$(document).ready(function() {
		$("#submit").click(function() {
			var instance = CKEDITOR.instances.content;
			instance.updateElement();
			$("#output").attr("value", instance.getData());
			if ($("#title").val() == "") {
				alert("제목을 입력하세요.");
				$("#title").focus();
				return false;
			} else if ($("#content").val() == "") {
				alert("내용을 입력하세요.");
				$("#content").focus();
				return false;
			} else if ($("#content").val().length > 4008) {
				$("#content").val($("#content").val().substring(0, 10));
				alert("내용에 최대 4000자까지만 입력할 수 있습니다.");
				$("#content").focus();
				return false;
			} else if ($("#title").val() == "") {

			}
		});
	});

	window.onload = function() {
		CKEDITOR.replace('content');
	}
</script>




<form method="POST" action="/cyberCampus/pro/cyberNoticeInsertFileUploadContextInsert" enctype="multipart/form-data">
	<div class="row">
		<div class="x_panel">
			<!-- 공지사항 글작성 -->
			<div class="x_title">
				<h2>공지사항 글작성</h2>

				<div class="clearfix"></div>
			</div>
			<br>
			<div class="x_content">
				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<input type="text" id="title" class="form-control" name="title" style="width: 800px;">
					</div>
				</div>
				<br><br>
				
				<div class="form-group"> 
					<label class="control-label col-md-3 col-sm-3">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<textarea class="form-control" name="content" style="width: 1000px; height: 500px;" id="content">
                         </textarea>
					</div>
				</div>

				<br> <br> <br> <br>
				<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12"> 
						<input type="file" class="btn btn-dark" name="file" id="file">



						<br><br>
					</div>
				</div>
				<br>

			</div>
		</div>
			<div style="text-align:right;">
			<button type="button" class="btn btn-dark" onclick="javascript:history.go(-1);">목록</button> 
			<input type="submit" class="btn btn-dark" onclick="check();" id="submit" name="submit" value="등록">
			</div>
	</div>
</form>











