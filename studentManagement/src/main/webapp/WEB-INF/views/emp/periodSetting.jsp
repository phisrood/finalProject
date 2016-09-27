<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 부트스트랩 css -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <link href="/bootstrap/css/nprogress.css" rel="stylesheet">
    <link href="/bootstrap/css/green.css" rel="stylesheet">
    <link href="/bootstrap/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <link href="/bootstrap/css/jqvmap.min.css" rel="stylesheet"/>
    <link href="/bootstrap/css/custom.min.css" rel="stylesheet">
    <link href="/common/css/default.css" rel="stylesheet">
	<link href="/bootstrap/css/sweetalert.css" rel="stylesheet">
   	<script src="/bootstrap/js/sweetalert.min.js"></script>
    <script src="/common/js/notice.js"></script>
    <script src="/bootstrap/js/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
수강신청기간:<input type="button" id="crsesInquiryPeriod"  class="btn btn-dark" onclick="crsesInquiryPeriod();" value="${period.pr_crses_inquiry }"/>
<br />
<br />
수업평가:<input type="button" id="appLecturePeriod"  class="btn btn-dark" onclick="appLecturePeriod();" value="${period.pr_app_lecture }"/>
<br />
<br />

성적반영:<input type="button" id="scoreSummary"  class="btn btn-dark" onclick="scoreSummary();" value="성적반영"/>
<br />
<br />
졸업:<input type="button" id="graduate"  class="btn btn-dark" onclick="graduate();" value="졸업"/>
<br />
<br />
<script>
	function crsesInquiryPeriod(){
		$.ajax({
			url:"/emp/updateCrsesInquiryPeriod",
			method:"get",
			type:"json",
			data:{"state":$("#crsesInquiryPeriod").val()},
			success:function(data){
				$("#crsesInquiryPeriod").val(data.pr_crses_inquiry);
			},error:function(){
				alert("에러");
			}
		});
	}
	function appLecturePeriod(){
		$.ajax({
			url:"/emp/appLecturePeriod",
			method:"get",
			type:"json",
			data:{"state":$("#appLecturePeriod").val()},
			success:function(data){
				$("#appLecturePeriod").val(data.pr_app_lecture);
			},error:function(){
				alert("에러");
			}
		});
	}
	function scoreSummary(){
		$.ajax({
			url:"/emp/scoreSummary",
			method:"get",
			type:"json",
			success:function(){
			},error:function(){
				alert("에러");
			}
		});
	}
	function majorReqPeriod(){
		$.ajax({
			url:"/emp/majorReqPeriod",
			method:"get",
			type:"json",
			data:{"state":$("#majorReqPeriod").val()},
			success:function(data){
				$("#majorReqPeriod").val(data.pr_major_req);
			},error:function(){
				alert("에러");
			}
		});
	}
	
</script>
<!-- 부트스트랩js -->
    <script src="/bootstrap/js/fastclick.js"></script>
    <script src="/bootstrap/js/nprogress.js"></script>
    <script src="/bootstrap/js/Chart.min.js"></script>
    <script src="/bootstrap/js/gauge.min.js"></script>
    <script src="/bootstrap/js/bootstrap-progressbar.min.js"></script>
    <script src="/bootstrap/js/icheck.min.js"></script>
    <script src="/bootstrap/js/skycons.js"></script>
    <script src="/bootstrap/js/jquery.flot.js"></script>
    <script src="/bootstrap/js/jquery.flot.pie.js"></script>
    <script src="/bootstrap/js/jquery.flot.time.js"></script>
    <script src="/bootstrap/js/jquery.flot.stack.js"></script>
    <script src="/bootstrap/js/jquery.flot.resize.js"></script>
    <script src="/bootstrap/js/jquery.flot.orderBars.js"></script>
    <script src="/bootstrap/js/jquery.flot.spline.min.js"></script>
    <script src="/bootstrap/js/curvedLines.js"></script>
    <script src="/bootstrap/js/date.js"></script>
    <script src="/bootstrap/js/jquery.vmap.js"></script>
    <script src="/bootstrap/js/jquery.vmap.world.js"></script>
    <script src="/bootstrap/js/jquery.vmap.sampledata.js"></script>
    <script src="/bootstrap/js/moment.min.js"></script>
    <script src="/bootstrap/js/daterangepicker.js"></script>
    <script src="/bootstrap/js/custom.min.js"></script>
</body>
</html>