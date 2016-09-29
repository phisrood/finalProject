<%--==============================================================
 * 사이버 캠퍼스 자유 게시판 left 메뉴구성
 * @author 조현욱
 * @since  2016.08.29.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    	수정일       	수정자          		수정내용
 *    -------      -------     -------------------
 *    2016.08.29.  	조현욱      		최초생성
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    <script src="/bootstrap/js/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
	<!-- 부트스트랩 css -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/font-awesome.min.css" rel="stylesheet">
    <link href="/bootstrap/css/nprogress.css" rel="stylesheet">
    <link href="/bootstrap/css/green.css" rel="stylesheet">
    <link href="/bootstrap/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <link href="/bootstrap/css/jqvmap.min.css" rel="stylesheet"/>
    <link href="/common/css/default.css" rel="stylesheet">
    <link href="/bootstrap/css/custom.min.css" rel="stylesheet">

  	 
  	 <!-- DatePicker -->
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
	<script type="text/javascript" src="/common/js/ckeditor/js/ckeditor.js"></script>
	<script>	
	$(window).ready(function() { 
		var confirm="<div style=\"width:500px;margin:50px;font-size:20px;\">";
		confirm +="<div>이름 : ${adviceVO.use_name }</div>";
		confirm +="<div>학번 : ${adviceVO.ad_stud_use_id }</div>";
		confirm +="<div >상담 방법 : ${adviceVO.ad_way }</div>";
		confirm +="<div>상담 내용 : ${adviceVO.ad_purpose }</div>";
		confirm +="<div>날짜 : ${adviceVO.ad_reqdate }</div>";
		confirm +="<div>시간 : ${adviceVO.ad_time } 시</div>";
		confirm +="<div></div>";
		confirm +="<div>";
		confirm +="</div><br />";
		confirm +="<form method=\"post\" action=\"/pro/updateAdviceConfirm\">";
		confirm +="<input type=\"hidden\" name=\"ad_no\" value=\"${adviceVO.ad_no }\"/>";
		confirm +="<div style=\"text-align:right;\">";
		confirm +="<input type=\"submit\" class=\"btn btn-default\" value=\"처리\"/>";
		confirm +="</div><br />";
		confirm +="</form>";
		confirm +="</div>";
		
		var after="<form method=\"post\" action=\"/pro/updateAdviceDelay\" id='frm'>";		
		after+="<input type=\"hidden\" name=\"ad_no\" value=\"${adviceVO.ad_no }\"/>";		
		after+="<div style=\"width:500px;margin:50px;font-size:20px;\">";
		after+="<div>이름 : ${adviceVO.use_name }</div>";
		after+="<div>학번 : ${adviceVO.ad_stud_use_id }</div>";
		after+="<div>상담 방법 : ${adviceVO.ad_way }</div>";
		after+="<div>상담 내용 : ${adviceVO.ad_purpose }</div>";
		after+="<div>일자 선택 ";
		after+="<input type='text' name=\"ad_return\" id='ad_return' readonly/>";
		after+="</div>";
		after+="<div>시간 선택 ";
		after+="<select class=\"btn btn-default\" name=\"ad_time\">";
		after+="<option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\">24</option>";
		after+="</select> 시";
		after+="</div>";
		after+="<div style=\"text-align:right;\">";
		after+="<input type=\"submit\" class=\"btn btn-default\" value=\"연기\" />";
		after+="</div>";
		after+="</div>";
		after+="</form>";
		
		$("#confirmForm").html(confirm);
		
		$("#selectBox").change(function() {
			var str = $("#selectBox option:selected").val();
			
			if(str == '확인'){
				$("#confirmForm").html(confirm);
			}else if(str=='연기'){
				$("#confirmForm").html(after);
				
				$("#ad_return").datepicker({
						showOn: "button",
						buttonText: "선택",
						showButtonPanel : true,
						currentText : '오늘 날짜',
						closeText : '닫기',
						dateFormat : "yy-mm-dd",
						changeMonth : true,
						changeYear : true,
						nextText : '다음 달',
						prevText : '이전 달',
						changeMonth : true,
						dayNames : [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일' ],
						dayNamesMin : [ '월', '화', '수', '목', '금', '토', '일' ],
						monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12' ],
						monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월' ],
						minDate : -0
				});
			}
		});
	});
	</script>
	  
	<div class="row">    
	    	<!-- 상담 신청 내역 처리 화면 ( 연기 ) -->
	       		<div class="x_title" style="margin:30px;" >
	                <h2>상담 신청 내역 처리</h2>
	               	<div class="clearfix"  ></div>
	            </div>
	            
	            <div style="margin:30px;" >
		          	<select name="ad_stat" id="selectBox" class="btn btn-default">
						<option value="확인">확인</option>
						<option value="연기">연기</option>
					</select>
				</div>  
				  
				<div id="confirmForm">
				</div>
				
	 			<c:set var="adviceVO" value="${adviceVO}"/>
	</div>
          
    <!-- Datatables -->
    <script src="/bootstrap/js/jquery.dataTables.min.js"></script>
    <script src="/bootstrap/js/dataTables.bootstrap.min.js"></script>
    <script src="/bootstrap/js/dataTables.buttons.min.js"></script>
    <script src="/bootstrap/js/buttons.bootstrap.min.js"></script>
    <script src="/bootstrap/js/buttons.flash.min.js"></script>
    <script src="/bootstrap/js/buttons.html5.min.js"></script>
    <script src="/bootstrap/js/buttons.print.min.js"></script>
    <script src="/bootstrap/js/dataTables.fixedHeader.min.js"></script>
    <script src="/bootstrap/js/dataTables.keyTable.min.js"></script>
    <script src="/bootstrap/js/dataTables.responsive.min.js"></script>
    <script src="/bootstrap/js/responsive.bootstrap.js"></script>
    <script src="/bootstrap/js/jszip.min.js"></script>
    <script src="/bootstrap/js/vfs_fonts.js"></script>