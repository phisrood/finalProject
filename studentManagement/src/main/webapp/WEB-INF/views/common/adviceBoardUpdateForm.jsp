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
		<div class="x_title">
			<h2>&nbsp;&nbsp;상담 게시글 작성</h2>
			<div class="clearfix"></div>
		</div>
		<br>
			<form action="/stu/adviceBoardUpdate" method="post">
			<%-- <c:forEach var="adviceBoard" items="${adviceBoardVO }"> --%>
			<input type="hidden" name="adb_no" value="${adb_no }"/>
			<div style="float: right; width: 78%;">
				<input type="text" name="adb_title" size="50" value="${adb_title }"/>
			</div>
			<div style="float: right; width: 7%;">제목
			</div>
			<br>
			작성일 : <input type="text" name="adb_date" value="${adb_date }" disabled="disabled"/>
			<div style="float: right; width: 15%;">
				<br>
			</div>
			<br> <br>
	
			<div style="float: right; width: 85%;">
				작성자명 : 
				<input type="text" name="adb_stud_use_id" value="${adb_stud_use_id }" disabled="disabled"/>
			</div>
			<br> <br>
			<div style="float: right; width: 15%;">
				<br>
			</div>
			<br>
			<div style="float: right; width: 78%;">
				<textarea rows="5" cols="50" name="adb_content">${adb_content }</textarea>
			</div>
			<div style="float: right; width: 7%;">내용</div>
			<div style="float: right; width: 15%;">
				<br>
			</div>
			<div style="float: right; width: 20%;">
				<br>
			</div>
			<c:if test="${adb_commentstat == 'N'}">
				등록된 답변이 없습니다.
			</c:if>
			<c:if test="${adb_commentstat == 'Y'}">
				<br /><br />
				답변 교수명 : ${adb_pro_use_id } <br />
				답변 내용   : ${adb_commentcontent }
			</c:if>
			<%-- </c:forEach> --%>
		
		<div align="center" style="float: right; width: 90%;">
			<br> 
			<input type="file" name="adb_file" /> 
			<input type="button" class="btn btn-default btn-sm" value="취소" />
			<input type="submit" class="btn btn-default btn-sm" value="수정"/>
		</div>
		<div style="float: right; width: 20%;">
			<br>
		</div>
	</div>

	</form>
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