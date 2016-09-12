<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
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

<div class="row">
	<!-- 온라인 콘텐츠 ( 학과 ) -->
	<div style="float: left; width: 100%;">
		<br>
	</div>
	<div style="float: left; width: 1%;">
		<br>
	</div>
	<div style="float: left; width: 49%; text-align: center;">
		<div
			style="border: 1px solid; float: left; width: 100px; text-align: center;">
			<h2>강의</h2>
		</div>
	</div>
	<div style="float: right; width: 1%;">
		<br>
	</div>
	<div style="float: right; width: 49%; text-align: center;">
		<div style="float: right; width: 110px; text-align: right;"></div>
	</div>
	<div style="float: left; width: 100%;">
		<br>
	</div>
	<div class="x_panel_big">
		<div class="x_title">
			<h2>온라인 콘텐츠</h2>
			<div class="clearfix"></div>
		</div>
		<table id="datatable" class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>학생이름</th>
					<th>학번</th>
					<th>학과</th>
					<th>출석여부</th>
				</tr>
			</thead>
			<c:set var="previous" value="0"/>
			<c:set var="week" value="1"/>
			<tbody>
				<c:forEach var="watchCheck" items="${watchCheckList }"
					varStatus="sta">
					<c:set var="current" value="${watchCheck.oc_no}"/>
					<c:if test="${previous!=current }">
						<tr>
							<td colspan="4">${week }주차</td>
						</tr>
						<c:set var="week" value="${week+1 }"/>
					</c:if>
					<tr>
						<td>${watchCheck.use_name}</td>
						<td>${watchCheck.stud_use_id}</td>
						<td>${watchCheck.dep_name}</td>
						<td>
							<c:if test="${watchCheck.ws_attendyn eq 'Y'}">
								O
							</c:if>
							<c:if test="${watchCheck.ws_attendyn eq 'N'}">
								X
							</c:if>
						</td>			
					</tr>
					<c:set var="previous" value="${current }"/>
				</c:forEach>

				<tr>
					<td colspan="5"><br> <br> <br> <br> <br>
						<br></td>
				</tr>
			</tbody>
		</table>
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