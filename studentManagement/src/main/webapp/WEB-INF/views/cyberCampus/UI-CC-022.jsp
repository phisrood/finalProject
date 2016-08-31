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
    
    <div class="row">
    	<!-- 온라인 콘텐츠 ( 학과 ) -->
    		<div style="float: left; width: 100%;"><br></div>
    		<div style="float: left; width: 1%;"><br></div>
	    	<div style="float: left; width: 49%; text-align: center;">
				<div style="border: 1px solid; float: left; width: 100px; text-align: center;"><h2>강의</h2></div>
			</div>
			<div style="float: right; width: 1%;"><br></div>
			<div style="float: right; width: 49%; text-align: center;">
				<div style="float: right; width: 110px; text-align: right;">
					<button type="button" class="btn btn-default btn-sm">주 추가하기 <i class="fa fa-plus-circle"></i></button>
				</div>
			</div>
			<div style="float: left; width: 100%;"><br></div>
	     	<div class="x_panel_big">
	     		<div class="x_title">
                   	<h2>온라인 콘텐츠</h2>
                   	<div class="clearfix"></div>
                </div>
                <table id="datatable" class="table table-striped table-bordered">
                   	<thead>
                   		<tr>
                       		<th>학습 내용</th>
                       		<th>학습 기간 / 출석 인정 시간</th>
                       		<th>진도</th>
                       		<th>강의 보기</th>
                       		<th>삭제</th>
                     	</tr>
                   	</thead>
                   	<tbody>
                     	<tr>
                     	  	<td colspan="5">1 주차</td>
                     	</tr>
                     	<tr>
                       		<td>알고리즘 1</td>
                       		<td>2016/08/08 00시00분 ~ 2016/08/09 23시59분</td>
                       		<td>0분 / 25분</td>
                       		<td><a href="javascript:OpenWindow('UI-CC-021.jsp','800','600')" style="text-decoration:none">
                       			보기</a>
                       		</td>
                       		<td><a href="" style="text-decoration:none">
                       			삭제</a>
                       		</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5">2 주차</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5"><a href="" style="text-decoration:none">
                       			강의 등록</a>
                       		</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5">3 주차</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5"><a href="" style="text-decoration:none">
                       			강의 등록</a>
                       		</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5">4 주차<br></td>
                     	</tr>
                     	<tr>
                       		<td colspan="5"><a href="" style="text-decoration:none">
                       			강의 등록</a>
                       		</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5">5 주차</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5"><a href="" style="text-decoration:none">
                       			강의 등록</a>
                       		</td>
                     	</tr>
                     	<tr>
                       		<td colspan="5"><br><br><br><br><br><br></td>
                     	</tr>
                   	</tbody>
               	</table>
	     	</div>
    </div>
    <!-- Datatables -->
    <script>
		function OpenWindow(url,intWidth,intHeight) { 
		      window.open(url, "_blank", "width="+intWidth+",height="+intHeight+",resizable=1,scrollbars=1") ; 
		} 
	</script>
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