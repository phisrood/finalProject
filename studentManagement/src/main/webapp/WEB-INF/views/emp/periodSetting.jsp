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
</head>
<body>
수강신청기간:<input type="button" id="crsesInquiryPeriod" onclick="crsesInquiryPeriod();" value="${period.pr_crses_inquiry }"/>
수업평가:<input type="button" id="appLecturePeriod" onclick="appLecturePeriod();" value="${period.pr_app_lecture }"/>
성적반영:<input type="button" id="scoreSummary" onclick="scoreSummary();" value="${period.pr_score_sum }"/>
부/다전공신청기간:<input type="button" id="majorReqPeriod" onclick="majorReqPeriod();" value="${period.pr_major_req }"/>
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
			data:{"state":$("#scoreSummary").val()},
			success:function(data){
				$("#scoreSummary").val(data.pr_score_sum);
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
</body>
</html>