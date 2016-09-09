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
<script>
		function search(af_no,oc_time,oc_no,oc_lec_no,loginUser){
			$.ajax({
				method:"get",
				contentType : "application/json",
				url : "/cyberCampus/stu/onlineConView",
				dataType : "json",
				data:{
					"af_no":af_no,
					 "oc_no" : oc_no,
					  "oc_lec_no" : oc_lec_no,
					  "loginUser" : loginUser
				},
				success : function(data){
					clearInterval(timer);
					
					var minute = oc_time-1;
					var second = 59;
					
					$(".countTimeMinute").html(minute);
					$(".countTimeSecond").html(second);
					
					var timer = setInterval(function () {
							
							$(".countTimeMinute").html(minute-data.watchTime);
							$(".countTimeSecond").html(second);
							
							if(second == 0 && minute == 0){
								alert('수업이 종료되었습니다.');
								clearInterval(timer);
							}else{
								second--;
								if(second < 0){
									$.ajax({
										method:"post",
										url : "/cyberCampus/stu/timeCheck",
										dataType : "text",
										data:{
											"oc_time":1,
											"loginUser":loginUser,
											"oc_no":oc_no,
											"oc_lec_no":oc_lec_no,
											"full_time" : full_time
										},
										error : function(){
											/* alert("에러!"); */
										},
										success : function(data){
											clearInterval(timer);
										}
									});
									minute--;
									second = 59;
								}
								if(minute < 0){
									if(hour > 0){
										hour--;
										minute = 59;
									}
								}
							}
				    	}, 1000);
					
					var html = "";
					html += "<video src=\""+data.path+"\" controls loop autoplay/>";
					$("#onlineVideo").html(html);
				},
				error : function(){
					alert("에러!");
				}
			});
		};
</script>
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
		<div style="float: right; width: 110px; text-align: right;">
			<button type="button" class="btn btn-default btn-sm">
				주 추가하기 <i class="fa fa-plus-circle"></i>
			</button>
		</div>
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
					<th>강의 제목</th>
					<th>학습 기간 / 출석 인정 시간</th>
					<th>출석</th>
					<th>강의 보기</th>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach var="onlineCon" items="${onlineConList }" varStatus="sta">
				<tr>
					<td colspan="5">${sta.index+1 } 주차</td>
				</tr>
				<tr>
					<td>${onlineCon.oc_content }</td>
					<td> 
						${onlineCon.oc_startdate } ~ ${onlineCon.oc_enddate }  /  ${onlineCon.oc_time } 분
					</td>
					<td>x</td>
					<td>
					<button type="button" class="btn btn-info btn-sm" 
						data-toggle="modal" data-target="#myModal" 
						onclick="search('${onlineCon.oc_af_no}','${onlineCon.oc_time }','${onlineCon.oc_no }','${onlineCon.oc_lec_no }','${loginUser }')">보기</button>
					</td>
				</tr>
			</c:forEach>
				<tr>
					<td colspan="5"><br>
					<br>
					<br>
					<br>
					<br>
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

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="title">온라인콘텐츠</h4>
			</div>
			<div id="onlineVideo" class="modal-body">
			</div>
			<div id="remain">
					<h1>
					출석인정까지 남은 시간 :
					<span class="countTimeMinute"></span>분
					<span class="countTimeSecond"></span>초
					</h1>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="close" onclick="close();">닫기</button>
			</div>
		</div>
	</div>
</div>

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