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
수업평가:<input type="button" id="appLecturePeriod" onclick="crsesInquiryPeriod();" value="${period.pr_app_lecture }"/>
성적반영:<input type="button" id="scoreSummary" onclick="crsesInquiryPeriod();" value="${period.pr_score_sum }"/>
부/다전공신청기간:<input type="button" id="majorReqPeriod" onclick="crsesInquiryPeriod();" value="${period.pr_major_req }"/>
</body>
</html>