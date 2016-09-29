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
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>
<script>
 window.onload=function()
 {
  CKEDITOR.replace('lr_content');
 }
 
</script> 	
<script>
	function updateStudyBBS(updateStudyBBSForm) {
		if (document.updateStudyBBSForm.lr_title.value == "") {
			alert('제목을 입력해주세요');
			document.updateStudyBBSForm.lr_title.focus();
		} else if(document.updateStudyBBSForm.file.value == "") {
			alert('첨부파일을 넣어주세요');
			document.updateStudyBBSForm.file.focus();
		} else {
			document.updateStudyBBSForm.method = "post";
			document.updateStudyBBSForm.action = "/cyberCampus/pro/studyBBSUpdate";
			document.updateStudyBBSForm.submit();

		}
	}
</script> 
<div class="row" >
    	<!-- 학습 자료실 게시물 상세 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 250px; text-align: center;"><h2>학습 자료실</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>

	<!-- page content -->
	<div class="x_panel_big" style="height:700px;">
		<form name="updateStudyBBSForm" class="form-horizontal form-label-left" enctype="multipart/form-data" >
		<div class="x_content" style="height: 80%">
			<br />
				<input type="hidden" name="lr_no"
					value="${studyBBSDetailViewVO.lr_no }">
				<input type="hidden" name="lr_lec_no"
					value="${studyBBSDetailViewVO.lr_lec_no }">
				<div class="form-group" style="height: 10%;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<input type="hidden" name="lr_no" value="${noticeDetailViewVO.lr_no }">
						<input type="text" class="form-control" name="lr_title"
							value="${studyBBSDetailViewVO.lr_title}" style="width: 100%;">
					</div>
				</div>
				<div class="form-group" style="height: 60%;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<textarea class="form-control" name="lr_content" style="width:1000px;height:500px;">${studyBBSDetailViewVO.lr_content}</textarea>
					</div>
				</div>
				
				<div class="form-group" style="margin-top: 200px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
							<c:if test="${studyBBSDetailViewVO.lr_af_no == 0 }">
								<input type="button" class="btn btn-dark" style="width: 200px;" name="af_aftername" value="첨부파일이 없습니다.">
							</c:if>
							<c:if test="${studyBBSDetailViewVO.lr_af_no != 0 }">
								<a href="cyberCampus/common/studyBBSFileDown?af_aftername=${studyBBSDetailViewVO.af_aftername}">
									<input type="button" class="btn btn-dark" style="width: 300px;" name="af_aftername"
										value="${studyBBSDetailViewVO.af_realname}">
								</a>
							</c:if>
							<input type="hidden" name="file_no" value="${studyBBSDetailViewVO.lr_af_no }">
							<input type="file" id="studyBBSFileUp" class="btn btn-dark" name="file" >
					</div>
				</div>




		</div>
		<!-- x-content 끝 -->


	<!-- /page content -->
		</form>
		</div>
				<div style="text-align: right; height: 20%">
					<button type="button" class="btn btn-dark" onclick="updateStudyBBS('updateStudyBBSForm');">수정</button>
					<button type="button" class="btn btn-dark"
						onclick="javascript:history.go(-1);">뒤로</button>
				</div>
	</div>


    