<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<!-- 사이버 상담 신청 내역 -->
	<form method="post" action="/stu/adviceREQ">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_title">
					<h2>상담 신청</h2>
					<div class="clearfix"></div>
				</div>
				<div>
					상담교수 : <select name="ad_pro_use_id">
						<option value="교수1">교수1</option>
						<option value="교수2">교수2</option>
						<option value="교수3">교수3</option>
						<option value="교수4">교수4</option>
						<option value="기타">기타</option>
					</select>
				</div>
				<br>
				<div style="float: left; width: 50%;">
					상담 내용 : <select name="ad_purpose">
						<option value="취업">취업</option>
						<option value="수강">수강</option>
						<option value="학적">학적</option>
						<option value="장학">장학</option>
						<option value="기타">기타</option>
					</select>
				</div>
				<div style="float: left; width: 50%;">
					상담 방법 : <select name="ad_way">
						<option value="화상">화상</option>
						<option value="채팅">채팅</option>
						<option value="방문">방문</option>
					</select>
				</div>
				<br> <br>
				<div>
					일자 선택 <input type="text" OnClick="Calendar(this, 'down','no');"
						name="ad_reqdate">
				</div>
				<br>
				<div>
					시간 선택 <select name="ad_time">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
					</select> 시
				</div>
				<br>
				<div align="center">
					<input type="submit" class="btn btn-dark" value="상담신청" />
				</div>
			</div>
		</div>
	</form>

	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="x_panel">
			<div class="x_title">
				<h2>상담 신청 내역</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_panel">
				완료 : 상담이 완료된 상태<br> 대기 : 담당 교수가 확인하여 상담일까지 대기하는 상태<br> 미처리
				: 담당 교수가 확인하지 않은 상태<br> 연기 : 담당 교수 일정상 기간을 미룬 상태
			</div>
			<table id="datatable" class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>방법</th>
						<th>구분</th>
						<th>교수명</th>
						<th>일자</th>
						<th>시</th>
						<th>상태</th>
						<th>회신일</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="adviceReq" items="${adviceReqList}">
						<tr>
							<td>${adviceReq.ad_way }</td>
							<td>${adviceReq.ad_purpose }</td>
							<td>${adviceReq.ad_pro_use_id }</td>
							<td><fmt:formatDate pattern="yyyy-MM-dd" value="${adviceReq.ad_reqdate }"/></td>
							<td>${adviceReq.ad_time }</td>
							<td>${adviceReq.ad_stat }</td>
							<td>${adviceReq.ad_return }</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
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