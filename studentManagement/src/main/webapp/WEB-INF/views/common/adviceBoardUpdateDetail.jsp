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
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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
	
<div class="row">
	<!-- 상담 게시글 작성 -->
	<div class="x_panel_big" style="height:500px;" >
	<div class="x_title">
		<h2>상담 게시글 상세</h2>
		<div class="clearfix"></div>
	</div>
		<div class="x_content" style="height: 80%">
		<br>
			<input type="hidden" name="adb_no" value="${adb_no }"/>
			<div class="form-group" style="height: 10%;">
				<label class="control-label col-md-3 col-sm-3 col-xs-12">제목</label>
				<div class="col-md-9 col-sm-9 col-xs-12">
					<input type="text" class="form-control" name="adb_title"
						value="${adb_title }" style="width: 100%;" id="adb_title" disabled="disabled">
				</div>
			</div>
			<div class="form-group" style="height: 10%;">
				<label class="control-label col-md-3 col-sm-3 col-xs-12">작성일</label>
				<div class="col-md-9 col-sm-9 col-xs-12">
					<input type="text" class="form-control" name="adb_date"
						value="${adb_date }" disabled="disabled"  style="width: 100%;" disabled="disabled">
				</div>
			</div>  
			<div class="form-group" style="height: 10%;">
				<label class="control-label col-md-3 col-sm-3 col-xs-12">작성자</label>
				<div class="col-md-9 col-sm-9 col-xs-12">
					<input type="text" class="form-control" name="use_name"
						value="${use_name }" disabled="disabled"  style="width: 100%;" >
				</div>
			</div>  
			<input type="hidden" name="adb_no" value="${adb_no }" />
			<div class="form-group" style="height: 10%;">
				<label class="control-label col-md-3 col-sm-3 col-xs-12">학번</label>
				<div class="col-md-9 col-sm-9 col-xs-12">
					<input type="text" class="form-control" name="adb_stud_use_id"
						value="${adb_stud_use_id }" disabled="disabled"  style="width: 100%;">
				</div>
			</div>
			<div class="form-group" style="height: 150px;">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">내용</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
						<p>${adb_content}</p>
					</div>
			</div>
			<div class="form-group">
					<label class="control-label col-md-3 col-sm-3 col-xs-12">첨부파일</label>
					<div class="col-md-9 col-sm-9 col-xs-12">
					<c:choose>
							<c:when test="${adb_af_no != 0 }">
								<a href="/common/adviceBoardFile?adb_af_no=${adb_af_no }">
									<input type="button" class="btn btn-dark" style="width: 300px;"
										value="${filename }">
								</a>
							</c:when>
							<c:otherwise>
								<input type="button" class="btn btn-dark" style="width: 200px;" value="첨부파일이 없습니다.">
							</c:otherwise>
					</c:choose>
					</div>
			</div>
		</div>
		</div>
	<div class="x_panel_big" style="height:250px;" >
	<div class="x_title">
		<h2>상담 게시글 답변</h2>
		<div class="clearfix"></div>
	</div>	
	<div class="x_content" style="height: 80%">
			<c:if test="${adb_commentstat == 'N'}">
				등록된 답변이 없습니다.
			</c:if>
			<c:if test="${adb_commentstat == 'Y'}">
				<br /><br />
				답변 교수명 : ${adb_pro_use_id } <br />
				답변 내용   : ${adb_commentcontent }
			</c:if>
			<br><br>
			
			
		<form method="post" action="/pro/adviceBoardReply">
		<input type="hidden" name="adb_no" value="${adb_no }"/>
		
		<div >
			<br>
			<c:if test="${auth eq 'ROLE_PRO' }">
				작성자 : ${loginUserId } <br />
				답변 내용 : <input type="text" name="adb_commentcontent" />    
				<c:if test="${adb_commentstat == 'N'}">
					<input type="submit" class="btn btn-dark" value="답변등록"/>		
				</c:if>
				<c:if test="${adb_commentstat == 'Y'}">
					<input type="submit" class="btn btn-dark" value="답변수정"/>		
				</c:if>
			</c:if>
		</div>
		</form>
	</div>
		<br><br>
	</div>
		<div style="text-align: right;">
			<c:if test="${loginUserId eq '작성자' }">
				<input type="button" class="btn btn-dark" value="수정" onclick="location.href='/stu/adviceBoardUpdateForm?adb_no=${adb_no}'"/>
				<input type="button" class="btn btn-dark" value="삭제" onclick="location.href='/stu/adviceBoardDelete?adb_no=${adb_no}'"/>
			</c:if>
			<c:if test="${auth eq 'ROLE_PRO' }">
				<input type="button" class="btn btn-dark" value="목록" onclick="location.href='/pro/adviceBoard'"/>
			</c:if>
			<c:if test="${auth eq 'ROLE_STU' }">
				<input type="button" class="btn btn-dark" value="목록" onclick="location.href='/stu/adviceBoard'"/>
			</c:if>
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