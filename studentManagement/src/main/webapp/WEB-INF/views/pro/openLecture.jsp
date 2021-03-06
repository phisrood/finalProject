<%--==============================================================
 * 강의개설
 * @author 조현욱
 * @since  2016.09.01.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.09.01.  	김양문			최초생성
 *    2016.09.05.  	김양문			강의개설 script
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
<head>

<style>
html, body {
	overflow: hidden;
}

h2 {
	display: inline;
}
</style>
</head>
<body>

	<script src="/common/js/notice.js"></script>
	<script src="/pro/js/default.js"></script>
	<div class="row">
		<!-- page content -->
		<div class="x_panel">
			<div class="x_title">
				<h2>강의개설</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<br />
				<form name="insertLectureForm"
					class="form-horizontal form-label-left">
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">학수번호</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" id="lb_no"
								value="${lb.lb_no }" name="lec_lb_no" readonly="readonly">
							<span id="lbNoCheck"> </span>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">교과목명</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" value="${lb.lb_name }"
								readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">개설학과</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control"
								value="${lb.lb_department }" readonly="readonly"
								name="lb_department">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">교수번호</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" id="pro_id"name="lec_ln_pro_use_id" value="${loginUser.use_id }" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">학점</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" value="${lb.lb_credit }"
								readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">이수구분</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control"
								value="${lb.lb_completekind }" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">강의실</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control pull-left" id="classroom"
								readonly="readonly" name="cu_tt_no">&nbsp;&nbsp;
								<input type="hidden" name="cu_ci_no" id="ci_no">
						<button type="button" class="btn btn-info btn-sm" id="search"
								data-toggle="modal" data-target="#myModal">검색</button>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">개설학기</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<select class="form-control" name="lec_makesemester">
								<option selected value="none">선택해주세요</option>
								<option value="1">1학기</option>
								<option value="2">2학기</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">강의연도</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="강의연도"
								name="lec_makeyear">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">인원</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="인원"
								name="lec_persons" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3 col-sm-3 col-xs-12">이수구분</label>
						<div class="col-md-9 col-sm-9 col-xs-12">
							<input type="text" class="form-control" placeholder="학점"
								value="${lb.lb_completekind }" name="lb_completekind"
								readonly="readonly">
						</div>
					</div>
					<div style="text-align: center;">

						<button type="button" class="btn btn-dark"
							onclick="insertLecture('this.form');">등록</button>
						<button type="button" class="btn btn-dark"
							onclick="javascript:history.go(-1);">취소</button>
					</div>
				</form>
			</div>
		</div>
		<!-- /page content -->
	</div>
	<!-- Modal -->
	<div id="myModal" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">강의실</h4>
				</div>
				<div class="modal-body">
					<select class="form-control" id="classroomList" name="classroom">
						<option selected value="none">선택해주세요</option>
						<c:forEach items="${classroom }" var="classroom">
							<option value="${classroom.ci_no }">${classroom.ci_roomname }:${classroom.ci_roomnumber }호</option>
						</c:forEach>
					</select>
					<div class="x_content">
						<div id="paging">
							<table id="datatable" class="table table-bordered jambo_table bulk_action">
								<thead>
									<tr align="center">
										<th>시간</th>
										<th>월</th>
										<th>화</th>
										<th>수</th>
										<th>목</th>
										<th>금</th>
									</tr>
								</thead>
								<tbody id="stuTbody">

								</tbody>

							</table>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" onclick="reset();">초기화</button>
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="submit">확인</button>
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="close">닫기</button>
				</div>
			</div>
		</div>
	</div>
	<style>
.choice {
	
}
</style>
	<script>
	var check = new Array();
		function reset() {
			check = new Array();
			$("#check").html('');
			$("#classroomList").val('none');
			$.each($("tr .timetable"), function() {
				$(this).text('가능');
				$(this).removeClass('choice');
				$(this).css('background-color', '');
			})
		}
		$(function() {
			$("#close").click(function() {
				$.each($("tr .timetable"), function() {
					$("#classroomList").val('none');
					$(this).text('가능');
					$(this).removeClass('choice');
					$(this).css('background-color', '');
				});
				reset();
			});
		$('#myModal').on('show.bs.modal', function (e) {
			$("#stuTbody").html('');
		});
			function tableGen() {
				$("#stuTbody")
						.html(
								"<tr><td>09:00~10:00</td>"
										+ "<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>"
										+ "<tr>"
										+ "	<td>10:00~11:00</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>11:00~12:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>12:00~13:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>13:00~14:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>14:00~15:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>15:00~16:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>16:00~17:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>17:00~18:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>                                                                          "
										+ "<tr>                                                                           "
										+ "	<td>18:00~19:00</td>                                                       "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>    "
										+ "	<td class=\"timetable\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>"
										+ "</tr>")
			};
			$("#classroomList").change(
					function() {
						var classroom = $("#classroomList :selected").val();
						tableGen();
						$.each($("tr .timetable"), function(index) {
							$(this).text('가능');
							$(this).removeClass('choice');
							$(this).css('background-color', '');
							$(this).click(
									function() {
										if ($(this).text().indexOf('불가') < 0) {
											if ($(this).attr('class').indexOf(
													'choice') < 0) {
												$(this).addClass('choice')
												$(this).css('background-color',
														'gray');
												check.push(index);
											} else {
												$(this).removeClass('choice');
												$(this).css('background-color',
														'');
												check.splice(check
														.indexOf(index), 1);
											}
										}
									});
						});
						$("#submit").click(function() {
							$("#classroom").val(check);
							$("#ci_no").val($("#classroomList").val());
							reset();
						});
						$.ajax({
							url : "/pro/getClassroomTime",
							data : {
								'classroom' : classroom
							},
							dataType : 'json',
							success : function(obj) {
								$.each(obj.data,
										function(index, value) {
											var idx = parseInt(value.cu_tt_no);
											$("tr .timetable").eq(idx).text(
													'불가');
											$("#check").text(
													$("tr .timetable").attr(
															'onclick'));
										});
							},
							error : function() {
								alert('양문이똥멍청이');
							}
						});
					});
		});
	</script>
</body>

</html>