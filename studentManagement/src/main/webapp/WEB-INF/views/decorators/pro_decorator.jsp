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

<!DOCTYPE html>
<html lang="en">
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
    <link href="/pro/css/default.css" rel="stylesheet">
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
              <a href="/pro/main" class="site_title"><i class="fa fa-paw"></i> <span>Hanguk University</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile">
              <div class="profile_pic">
                <img src="/common/images/default.png" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>환영합니다,</span>
                <h2>${professorInfo.use_name }</h2>
                <br>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>${professorInfo.dep_name } &nbsp; ${professorInfo.pro_position }${professorInfo.pro_stat }중</h3>  <!-- 학과 -->
                <br>
                <ul class="nav side-menu">
               
	                  	  <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/pro/noticeAllList">공지사항</a></li>
		                      <li><a href="/pro/messageAllList">쪽지함</a></li>
		                  
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-edit"></i> 학적 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/pro/colleageChangeList">학적변동현황 조회</a></li>
		                      <li><a href="/pro/belongMinorREQList">학과 부/다전공 신청</a></li>
		                      <li><a href="/pro/othersMinorREQList">타학과 부/다전공신청</a></li>
		                      <li><a href="#">휴/복학 신청 현황</a></li>
		                      <li><a href="#">졸업요건</a></li>
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-desktop"></i> 수업 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/pro/acadeCalList">학사일정조회</a></li>
		                      <li><a href="/pro/classAppStat">수업평가통계</a></li>
		                      <li><a href="/pro/crsesBookInsert">수강편람등록</a></li>
		                      <li><a href="/pro/crsesBookList">수강편람조회</a></li>
		                      <li><a href="#">강의개설</a></li>
		                      <li><a href="#">수강생성적조회</a></li>
		                      <li><a href="#">학과생성적조회</a></li>
		                      <li><a href="#">성적입력</a></li>
		                      
		                    </ul>
		                  </li>
		                  <li><a><i class="fa fa-clone"></i>상담신청 보기 <span class="fa fa-chevron-down"></span></a>
		                    <ul class="nav child_menu">
		                      <li><a href="/pro/adviceResponsList">사이버 상담 신청 내역</a></li>
		                      <li><a href="#">사이버 상담실</a></li>
		                      <li><a href="/pro/adviceBoard">상담게시판</a></li>
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
                    <img src="/common/images/default.png" alt="">${professorInfo.use_name }
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href=""> 프로필</a></li>
                    <li><a href=""></a></li>
                    <li><a href="/common/logout"><i class="fa fa-sign-out pull-right"></i> 로그아웃</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="/common/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
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


