<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--==============================================================
 * 상담 게시판
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>

<!-- Data tables -->
<link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">

<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		var table = $('#datatable').DataTable();
		table.order([ 0, 'desc' ]).draw();
	});
</script>

<div class="row">
	<div class="x_panel_big">
		<!-- 상담 게시판 -->
		<div class="x_title">
			<h2>상담 게시판</h2>
			<div class="clearfix"></div>
		</div>
		<br>
		<div style="float: left; width: 72%;">&nbsp;&nbsp;&nbsp;- 상담 내역은
			본인과 담당 교수만 열람이 가능합니다.</div>
		<div class="x_content">
			<div style="text-align: right;">
			<%-- <c:if test="${auth eq 'ROLE_STU' }"> --%>
				<a href="/stu/adviceBoardWriteForm"><button type="button" class="btn btn-dark">작 성</button></a>
  			<%-- </c:if> --%>
  			</div>

			<table id="datatable" class="table table-striped jambo_table bulk_action">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>학생명</th>
						<th>작성일</th>
						<th>답변 상태</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="adviceBoard" items="${adviceBoardList}">
						<tr>
							<td>${adviceBoard.adb_no }</td>
							<td>
								<a href="/common/adviceBoardUpdateDetail?adb_no=${adviceBoard.adb_no }">
								${adviceBoard.adb_title }</a>
							</td>
							<td>${adviceBoard.use_name }</td>
							<td>${adviceBoard.adb_date }</td>
							<td>
								<c:if test="${adviceBoard.adb_commentstat eq 'N'}">
									없음
								</c:if>
								<c:if test="${adviceBoard.adb_commentstat eq 'Y'}">
									있음
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<br>
		</div>
	</div>
</div>
<!-- Datatables -->
<script>
	function OpenWindow(url, intWidth, intHeight) {
		window.open(url, "_blank", "width=" + intWidth + ",height=" + intHeight
				+ ",resizable=1,scrollbars=1");
	}
</script>
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