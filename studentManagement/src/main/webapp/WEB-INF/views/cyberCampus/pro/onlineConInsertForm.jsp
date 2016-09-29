<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	<!-- Data tables -->
    <link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
    <!-- DatePicker -->
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
	<script type="text/javascript">
		function fileType() {
				var thumbext = document.getElementById('file').value; //파일을 추가한 input 박스의 값
	
				thumbext = thumbext.slice(thumbext.indexOf(".") + 1).toLowerCase(); //파일 확장자를 잘라내고, 비교를 위해 소문자로 만듭니다.
	
				if(thumbext != "mp4"){ //확장자를 확인합니다.
					swal({
						title : "< Error! >",
						text : "인터넷강의는 mp4파일만 지원합니다.",
						type : "error",
						confirmButtonText : "닫기"
					});
					$("#file").val(null);
					return false;
	
				}		   
			}
	</script>
	<script>	
	$(function() {	
		$("#submitBtn").click(function() {
			   var re = /^[0-9]+$/; //숫자만
			   var fileLength = $("#file").val();
		       if ($("#oc_content").val() == "") {
		    	   swal({
						title : "< Error! >",
						text : "강의제목을 입력해주세요.",
						type : "error",
						confirmButtonText : "닫기"
					});
		          $("#oc_content").focus();
		          return false;
		       }else if ($("#oc_startdate").val() == "") {
		    	   swal({
						title : "< Error! >",
						text : "학습시작기간을 입력해주세요.",
						type : "error",
						confirmButtonText : "닫기"
					});
		          $("#oc_startdate").focus();
		             return false;
		       }else if ($("#oc_enddate").val() == "") {
		    	   swal({
						title : "< Error! >",
						text : "학습마감기간을 입력해주세요.",
						type : "error",
						confirmButtonText : "닫기"
					});
		          $("#oc_time").focus();
		             return false;
		       }else if (fileLength.length == 0) {
		    	   swal({
						title : "< Error! >",
						text : "강의파일을 등록해주세요.",
						type : "error",
						confirmButtonText : "닫기"
					});
		             return false;
		       }else if ($("#oc_time").val() == "") {
		    	   swal({
						title : "< Error! >",
						text : "출석인정시간을 입력해주세요.",
						type : "error",
						confirmButtonText : "닫기"
					});
		          $("#oc_time").focus();
		             return false;
		       }else if (!re.test($("#oc_time").val())) {
		    	   swal({
						title : "< Error! >",
						text : "출석인정시간은 숫자로만 입력해주세요.",
						type : "error",
						confirmButtonText : "닫기"
					});
		          $("#oc_time").focus();
		             return false;
		       }
		    });
		
		$("#oc_startdate").datepicker(
				{
					showOn: "button",
					buttonImage: "/resources/common/images/calendar.png",
					showButtonPanel : true,
					currentText : '오늘 날짜',
					closeText : '닫기',
					dateFormat : "yy-mm-dd",
					changeMonth : true,
					changeYear : true,
					nextText : '다음 달',
					prevText : '이전 달',
					changeMonth : true,
					dayNames : [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일',
							'일요일' ],
					dayNamesMin : [ '월', '화', '수', '목', '금', '토', '일' ],
					monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',
							'9', '10', '11', '12' ],
					monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
							'8월', '9월', '10월', '11월', '12월' ],
					minDate : -0
					
				});
		
			$("#oc_enddate").datepicker(
					{
						showOn: "button",
						buttonImage: "/resources/common/images/calendar.png",
						showButtonPanel : true,
						currentText : '오늘 날짜',
						closeText : '닫기',
						dateFormat : "yy-mm-dd",
						changeMonth : true,
						changeYear : true,
						nextText : '다음 달',
						prevText : '이전 달',
						changeMonth : true,
						dayNames : [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일',
								'일요일' ],
						dayNamesMin : [ '월', '화', '수', '목', '금', '토', '일' ],
						monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',
								'9', '10', '11', '12' ],
						monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
								'8월', '9월', '10월', '11월', '12월' ],
						minDate : -0
						
					});
			
	});
	</script>

    <div class="row">  
    	<!-- 인터넷 강의 등록 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>강의 등록</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel">  
				<br>
				<form method="post" action="/cyberCampus/pro/onlineConReg" enctype="multipart/form-data">
				<table id="datatable" class="table table-striped table-bordered" style="width:850px;margin-left:100px;">
					<tr>
						<td colspan="2">
							강의 제목 
							<input type="text" id="oc_content" class="form-control" maxlength="15" name="oc_content" style="width: 800px;" placeholder="최대 15자">
						</td>
					</tr>
					<tr>
						<td style="width:425px;">
							<p>학습 시작 기간</p>
							<input type="text" id="oc_startdate" class="form-control" name="oc_startdate" style="width: 150px;float: left;" readonly="readonly">
						</td>
						<td style="width:425px;">
							<p>학습 마감 기간</p>
							<input type="text" id="oc_enddate" class="form-control" name="oc_enddate" style="width: 150px;float: left;" readonly="readonly">
						</td>
					</tr>
					
					<tr>
						<td style="width:425px;">
							<p>첨부파일</p>
							<div style="float: left;">
							<input type="file" name="file" accept="video/*" onchange="fileType()" id="file" ></div>
						</td>
						<td style="width:425px;">
							출석 인정 시간 
							<input type="text" id="oc_time" class="form-control" name="oc_time" style="width: 165px;"  maxlength="3" placeholder="숫자입력 ex)10->10분">
						</td>  
					</tr>
					
				</table>
			
				<div style="float: right; width: 5%;">
					<input type="submit" class="btn btn-dark" value="등록" id="submitBtn"/>
				</div>
				</form>
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