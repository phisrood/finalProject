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

<!-- 부트스트랩 css -->

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

               <div class="clearfix"></div>

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



      <!-- page content -->
      <div class="right_col" role="main">


         <div class="row">

            <!-- page content -->




            <div class="x_content">
               <div class="x_content">
               
                  <legend align="left">수강신청가능 목록 리스트</legend>
                  

                  <table id="datatable" class="table table-striped jambo_table bulk_action">
                     <thead>
                        <tr>
                           <th>과목명</th>
                           <th>학수번호</th>
                           <th>수업시간</th>
                           <th>강의실</th>
                           <th>교수명</th>
                           <th>수강점수</th>
                           <th>학점</th>
                           <th>이수구분</th>
                           <th>수강신청</th>
                           <th>강의계획서보기</th>
                        </tr>
                     </thead>

                     <tbody>
                        <tr>
                           <td>JAVA</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="신청"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                           <td>SPRING</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="신청"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                     
                     </tbody>
                  </table>
               </div>
               
            <div class="x_content">
               <div class="x_content">
                  <legend align="left">수강 신청한 과목</legend>
                  <table id="datatable" class="table table-striped jambo_table bulk_action">
                     <thead>
                        <tr>
                           <th>과목명</th>
                           <th>학수번호</th>
                           <th>수업시간</th>
                           <th>강의실</th>
                           <th>교수명</th>
                           <th>수강점수</th>
                           <th>학점</th>
                           <th>이수구분</th>
                           <th>수강신청</th>
                           <th>강의계획서보기</th>
                        </tr>
                     </thead>

                     <tbody>
                        <tr>
                           <td>JAVA</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="포기"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                           <td>SPRING</td>
                           <td>12321</td>
                           <td>월/금1~2</td>
                           <td>701호</td>
                           <td>박진성</td>
                           <td>3.0</td>
                           <td>3학점</td>
                           <td>전선</td>
                           <td><input type="button" value="포기"></td>
                           <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                     
                     </tbody>
                  </table>
               </div>
               




               <!-- x-content -->
            </div>
         </div>
      </div>
      <!-- /page content -->
   </div>





   <!-- Ion.RangeSlider -->
   <script src="../vendors/ion.rangeSlider/js/ion.rangeSlider.min.js"></script>
   <!-- Bootstrap Colorpicker -->
   <script
      src="../vendors/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
   <!-- jquery.inputmask -->
   <script
      src="../vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js"></script>
   <!-- jQuery Knob -->
   <script src="../vendors/jquery-knob/dist/jquery.knob.min.js"></script>
   <!-- Cropper -->
   <script src="../vendors/cropper/dist/cropper.min.js"></script>

   <!-- Custom Theme Scripts -->
   <script src="/stu/js/custom.min.js"></script>


   <!-- /page content -->

   <!-- footer content -->
   <footer>
      <div class="pull-right">HanGuk University - StudentManagement</div>
      <div class="clearfix"></div>
   </footer>
   <!-- /footer content -->




</body>

</html>
