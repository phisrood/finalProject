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


<script>
$(function() {
    $( "#testDatepickerStart" ).datepicker({
    	
    	  showButtonPanel: true, 
          currentText: '오늘 날짜', 
          closeText: '닫기', 
          dateFormat: "yy-mm-dd",
          changeMonth: true, 
          changeYear: true,
          nextText: '다음 달',
          prevText: '이전 달',
          changeMonth: true, 
          dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
          dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
          monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
          monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
   		  minDate: -0
         
    });
});

$(function() {
    $( "#testDatepickerEnd" ).datepicker({
    	
  	  showButtonPanel: true, 
      currentText: '오늘 날짜', 
      closeText: '닫기', 
      dateFormat: "yy-mm-dd",
      changeMonth: true, 
      changeYear: true,
      nextText: '다음 달',
      prevText: '이전 달',
      changeMonth: true, 
      dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
      dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
      monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
      monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	  minDate: +1
    });
});



</script>


    <div class="row">
    	<!-- 과제 등록 -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 99%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 150px; text-align: center;"><h2>과제 등록</h2></div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
			<div class="x_panel_big">
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					과 &nbsp;제 &nbsp;명 &nbsp;: &nbsp;<input name="title" type="text" size="100">
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					과제시작일 &nbsp;: &nbsp;<input name="title" id="testDatepickerStart" type="text" size="100">
				</div>
				<div style="float: left; width: 100%;">
					과제종료일 &nbsp;: &nbsp;<input name="title" id="testDatepickerEnd" type="text" size="100">
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					<div style="float: left; width: 6%;">첨부 파일 &nbsp;: &nbsp;</div>
					<div style="float: left; width: 94%;"><input name="file" type="file"></div>
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div style="float: left; width: 100%;">
					과제 내용 &nbsp;: &nbsp;
				</div>
				<div style="float: left; width: 100%;"><br></div>
				<div>
					<div class="x_panel_big"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></div>
				</div>
				<div style="float: left; width: 96%;"><br></div>
				<div style="float: right; width: 4%;">
					<button type="button" class="btn btn-default btn-sm">등 록</button>
				</div>
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