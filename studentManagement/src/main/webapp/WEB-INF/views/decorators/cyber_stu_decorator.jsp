<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%--==============================================================
 * 교수 데코레이터
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
<%
	String referer = request.getHeader("Referer"); //url 접근막기
	if (referer == null) {
%>
<script>
	location.href = '/main.jsp';
</script>
<%
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Hanguk University! |</title>

<!-- 부트스트랩 css -->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
<link href="/bootstrap/css/nprogress.css" rel="stylesheet">
<link href="/bootstrap/css/green.css" rel="stylesheet">
<link href="/bootstrap/css/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet">
<link href="/bootstrap/css/jqvmap.min.css" rel="stylesheet" />
<link href="/bootstrap/css/custom.min.css" rel="stylesheet">
<link href="/stu/css/default.css" rel="stylesheet">
<link href="/common/css/default.css" rel="stylesheet">

<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>




</head>

<body class="nav-md">
	<div class="container body" background-color="red">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="/cyberCampus/stu/cyberClassMain?lec_no=${lectureInfo.lec_no }" class="site_title"><i class="fa fa-paw"></i>
							<span>CyberCampus</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile">
						<div class="profile_pic">
							<img src="/common/images/img.jpg" alt="..."
								class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>환영합니다,</span>
							<h2>${studentInfo.use_name }님</h2>
						</div>
					</div>
					<!-- /menu profile quick info -->

					<br />

					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section">
							<h3>${studentInfo.dep_name }&nbsp;${studentInfo.stud_stat }중</h3>
							<!-- 학과 -->
							<br>
							<ul class="nav side-menu">
								<li><a href="/cyberCampus/stu/cyberNoticeList">공지사항</a></li>
								<li><a href="/cyberCampus/stu/qnaBBSList">강의Q&A</a></li>
								<li><a href="/cyberCampus/stu/studyBBSList">학습자료실</a></li>
								<li><a href="/cyberCampus/stu/onlineConList">온라인콘텐츠보기</a></li>
							</ul>
						</div>

					</div>
					<!-- /sidebar menu -->
				</div>
			</div>

						<!-- page content -->
			<div class="right_col" role="main">
				<decorator:body />
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
				<div class="pull-right">HanGuk University - StudentManagement
				</div>
				<div class="clearfix"></div>
			</footer>
			<!-- /footer content -->
		</div>
	</div>

</body>
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
</html>


