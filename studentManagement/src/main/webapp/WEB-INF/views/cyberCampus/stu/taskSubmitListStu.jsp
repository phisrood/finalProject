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


<script src="/bootstrap/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
<script>
	$(function() {
		$('#datatable').DataTable();

		$('.listbtn').click(function() {

			var id_value = $(this).attr('id');

			$("#hid").val(id_value);

			$('#submit_list').click();

		});

		$('.Updatebtn').click(function() {

			var id_value = $(this).attr('id');
		

			alert(af_value);

			$("#hid1").val(id_value);
			

			$('#submit_update').click();
		});
	});
</script>

<div class="row">
	<!-- 과제 ( 학생 ) -->
	<div style="float: left; width: 100%;">
		<br>
	</div>
	<div style="float: left; width: 1%;">
		<br>
	</div>
	<div style="float: left; width: 99%; text-align: center;">
		<div style="border: 1px solid; float: left; width: 100px; text-align: center;">
			<h2>과제</h2>
		</div>
	</div>
	<div style="float: left; width: 100%;">
		<br>
	</div>
	<table id="datatable" class="table table-striped jambo_table bulk_action">
		<thead>
			<tr>
				<th>등록번호</th>
				<th>과제명</th>
				<th>과제제출 시작일</th>
				<th>과제제출 종료일</th>
				<th>제출관리</th>
				<th>제출여부</th>
			</tr>
		</thead>
		<c:forEach items="${homeworkVO}" var="homeworkVO" varStatus="status">
			<tbody>
				<tr>
							<td>${status.count+1}</td>
							<td>${homeworkVO.hw_title}</td>
							<td>${homeworkVO.hw_startdate}</td>
							<td>${homeworkVO.hw_enddate}</td>
							<td>
								<button type="button" id="${homeworkVO.hw_no}" class="listbtn btn-info btn-xs">제출하기</button>
							</td>
							<td><span class="bannerbtn btn-info btn-xs" style="color: #F0F63E">미제출</span></td>
				</tr>
				</tbody>
			<%-- 	<tbody>
				<tr>	
							<td>${status.count+1}</td>
							<td>${homeworkVO.hw_title}</td>
							<td>${homeworkVO.hw_startdate}</td>
							<td>${homeworkVO.hw_enddate}</td>
							<td>																		<!--  -->
								<button type="button" id="${homeworkVO.hw_no}" class="Updatebtn btn-info btn-xs">수정하기</button>
							</td>
							<td><span class="bannerbtn btn-info btn-xs" style="color: #FC89AB">제출완료</span></td>			
			
				</tr>
			</tbody> --%>
		</c:forEach>
	</table>

</div>

<!-- 최초등록 과제 -->
<div id="submit_list" data-toggle="modal" data-target="#CalenderList"></div>

<div id="CalenderList" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel2">제출하기</h4>
			</div>
			<div class="modal-body">

				<form method="post" action="/cyberCampus/stu/submitStu" enctype="multipart/form-data">


					<div id="testmodal2" style="padding: 5px 20px;">
						<div class="form-group">
							<table id="datatable" class="table table-striped jambo_table bulk_action">
								<thead>
									<tr>
										<th colspan="2">파일 첨부하기</th>

									</tr>

								</thead>
								<tbody id="listInfo">
									<tr>
										<td><input type="file" name="file" required="required"></td>
										<td><input type="submit"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<input type="hidden" value="" id="hid" name="hid">
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default antoclose2" data-dismiss="modal">닫기</button>
			</div>
		</div>
	</div>
</div>
<!-- 수정 과제 -->
<div id="submit_update" data-toggle="modal" data-target="#CalenderList1"></div>

<div id="CalenderList1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel2">제출하기</h4>
			</div>
			<div class="modal-body">

				<form method="post" action="/cyberCampus/stu/submitStuUpdate" enctype="multipart/form-data">


					<div id="testmodal2" style="padding: 5px 20px;">
						<div class="form-group">
							<table id="datatable" class="table table-striped jambo_table bulk_action">
								<thead>
									<tr>
										<th colspan="2">파일 수정하기</th>

									</tr>

								</thead>
								<tbody id="listInfo">
									<tr>
										<td><input type="file" name="file" required="required"></td>
										<td><input type="submit"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<input type="hidden" value="" id="hid1" name="hid"> 

				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default antoclose2" data-dismiss="modal">닫기</button>
			</div>
		</div>
	</div>
</div>

<!-- Datatables -->
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