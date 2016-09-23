<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%--==============================================================
 * 학생 데코레이터
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
<%   String referer = request.getHeader("Referer"); //url 접근막기
	if(referer==null){
		%>
		<script>
		location.href='/main.jsp';
		</script>
		<%
	}
%> 
<!DOCTYPE html>
<html lang="kor">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Hanguk University! | </title>

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
    <script src="/stu/js/default.js"></script>
    <script src="/common/js/notice.js"></script>
    <script src="/bootstrap/js/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>


  
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="/stu/main" class="site_title"><i class="fa fa-paw"></i> <span>Hanguk University</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile">
              <div class="profile_pic">
                <img src="/stu/images/${studentInfo.af_aftername}" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>환영합니다,</span>
                <h2>${studentInfo.use_name }님</h2>
                <br>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>${studentInfo.dep_name }&nbsp; ${studentInfo.stud_stat }중</h3>  <!-- 학과 -->
                <br>
                <ul class="nav side-menu">
                
		                  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/noticeAllList">공지사항</a></li>
		                      <li><a href="/stu/messageAllList">쪽지함</a></li>
		                  
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-edit"></i> 학적 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/indivInfo">학생개인정보관리</a></li>
		                      <li><a href="/stu/colleageChangeList">학적변동현황</a></li>
		                      <li><a href="/stu/minorMain">부/다 전공신청</a></li>
		                      <li><a href="/stu/schoolReModel">휴/복학신청</a></li>
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-desktop"></i> 수업 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/acadeCalList">학사일정조회</a></li>
		                      <li><a href="/stu/crsesInquiryList">수강신청조회</a></li>
		                      
		                      <li><a href="/stu/timeTableList" target="_blank" onClick="window.open(this.href, '', 'width=1000, height=1200'); return false;">수업시간표</a></li>
		                      <li><a href="/stu/scoreListAll">전체성적조회</a></li>
		                      <li><a href="/stu/classAppInput">수업평가</a></li>
		                      <li><a href="/stu/scoreListNow">현재학기성적조회</a></li>
		                      <li><a href="/stu/lectureList">강의조회</a></li>
		                      
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-table"></i> 등록 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/regList">등록내역</a></li>
		                      <li><a href="#">고지서</a></li>
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-clone"></i>상담신청 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/adviceRequestList">사이버 상담 신청 내역</a></li>
		                      <li><a href="/stu/camAdvice">사이버상담실</a></li>
		                      <li><a href="/stu/adviceBoard">상담게시판</a></li>
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-desktop"></i>증명서발급 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/gradeCertificateInfo">성적증명서</a></li>
		                      <li><a href="/stu/attendCertificateInfo">재학증명서</a></li>
		                      <li><a href="/stu/graduteCertificateInfo">졸업증명서</a></li>
		                    </ul>
		                  </li>
		                   <li><a><i class="fa fa-bar-chart-o"></i> 수강신청 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/stu/crsesLoginForm" target="_blank">수강신청</a></li>                     
		                    </ul>
		                  </li>
                </ul>
              </div>
             
            </div>
            <!-- /sidebar menu -->

        
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="/stu/images/${studentInfo.af_aftername}" alt="">${studentInfo.use_name }
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href=""> 프로필</a></li>
                    <li><a href=""></a></li>
                    <li><a href="/common/logout"><i class="fa fa-sign-out pull-right"></i> 로그아웃</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="/stu/messageAllList">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">${messageCount }</span>
                  </a>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <decorator:body />
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            HanGuk University - StudentManagement
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


