<%--==============================================================
 * 수강신청메인
 * @author 이수정
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.09.06.  	이수정      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<!-- 부트스트랩 css -->
	<!-- 부트스트랩 css -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <link href="/bootstrap/css/nprogress.css" rel="stylesheet">
    <link href="/bootstrap/css/green.css" rel="stylesheet">
    <link href="/bootstrap/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <link href="/bootstrap/css/jqvmap.min.css" rel="stylesheet"/>
    <link href="/bootstrap/css/custom.min.css" rel="stylesheet">
    <link href="/common/css/default.css" rel="stylesheet">
    
<script src="/common/js/notice.js"></script>
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>


</head>

<body class="nav-md">
   
      <div class="main_container">
         <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
               <div class="navbar nav_title" style="border: 0;">
                  <a href="/stu/main" class="site_title"><i class="fa fa-paw"></i>
                     <span>Hanguk University</span></a>
               </div>


               <!-- menu profile quick info -->

               <div class="profile_info">
                  <span>2016학년도 2학기</span>
                  <table style="width:210px;height:400px; background:#2A3F54;">
                  	<tbody>
                     <tr>
                        <td>학과</td>
                        <td>멀티미디어공학</td>
                     </tr>
                     <tr>
                        <td>학년</td>
                        <td>4학년</td>
                     </tr>
                     <tr>
                        <td>학번</td>
                        <td>20101231</td>
                     </tr>
                     <tr>
                        <td>학생이름</td>
                        <td>한도니</td>
                     </tr>
                     <tr>
                        <td>이수가능학점</td>
                        <td>21점</td>
                     </tr>
                     <tr>
                        <td>신청한학점</td>
                        <td>15</td>

                     </tr>
                     <tr>
                        <td colspan="2" style="text-align:center;">
                           <button type="button" class="btn btn-dark" >신청한과목 조회</button>
                        </td>
                     </tr>
                     <tr>
                        <td colspan="2" style="text-align:center;">
                           <button type="button" class="btn btn-dark">시간표보기 조회</button>
                        </td>
                     </tr>
                  	</tbody>
                  </table>
               </div>
            </div>
            <!-- /menu profile quick info -->

            <br />




         </div>
      </div>

        <div class="right_col" role="main">
          <decorator:body />
        </div>







   <!-- /page content -->

   <!-- footer content -->
   <footer>
      <div class="pull-right">HanGuk University - StudentManagement</div>
      <div class="clearfix"></div>
   </footer>
   <!-- /footer content -->




</body>

</html>
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
