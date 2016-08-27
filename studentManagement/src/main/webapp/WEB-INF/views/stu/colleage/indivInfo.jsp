<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	<!-- Data tables -->
    <link href="/bootstrap/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/css/scroller.bootstrap.min.css" rel="stylesheet">
    <style>
    	#image{width:80%; height: 80%;}
    </style>

	<div class="row">
    	<div class="x_panel_big">
    		<!-- 학생 개인 정보 관리 -->
    			<div class="x_panel">
   					<i class="fa fa-arrow-circle-o-right"></i> &nbsp;학생 개인 정보 관리
                </div>
                <div class="clearfix"></div>
                <div class="col-md-55">
                	<div class="thumbnail" align="center" style="padding: 13px;">
                		<div align="center" class="img-container" style="border: 1px solid; width:180px;">
                        		<img id="image" src="/common/images/img.jpg" alt="Picture">
                        </div><br>
                        <div align="center">
                        	<input type="text" id="" required="required" size="15" value="학생 사진"  disabled="disabled" style="text-align: center;">
                    	</div>
                	</div>
                </div>
                <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="20122750" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성명(한글)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="이수정" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">단과 &nbsp;대학</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="공과 대학" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">주민 &nbsp;번호</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="930813-2310042" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">학적 &nbsp;상태</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="재학" style="text-align: center;"></div>
					</div>
				</div>
				<div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">과&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;정</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="정규" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성명(영어)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="lee soojung" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">현재 &nbsp;학과</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="정보통신공학과" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">과&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;정</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="대한민국" style="text-align: center;"></div><br><br>
					</div>
				</div>
                <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;년</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="4" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성명(한자)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="李水正" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">전&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;공</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="정보통신공학전공" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;별</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="여자" style="text-align: center;"></div><br><br>
					</div>
				</div>
				<div class="clearfix"></div>
				
			<!-- 학생 개인 정보-->
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button"  disabled="disabled" class="btn btn-default btn-sm">학생 개인 정보</button>
				</div>
				<div class="x_panel_big">
					<div class="x_panel">
						<div style="padding:3px;"></div>
						<div style="float: left; width: 96%;">
	   						<i class="fa fa-arrow-circle-o-right"></i> &nbsp;개인 정보 / 주소 정보 ( 하이포탈 비밀 번호 변경 )
	   					</div>
	   					<div style="float: right; width: 4%;">
	   						<button type="button" class="btn btn-dark">저 장</button>
	   					</div>
	                </div>
	                <div class="clearfix"></div><br>
	                <div style="float: left; width: 5%;"><br></div>
	                <div style="float: left; width: 70%;">
		                <div style="float: left; width: 10%; padding: 3px;">생년월일</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="1993.08.13" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding: 3px;">혈액형</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="A형" style="text-align: center;"></div>
	               		<div style="float: left; width: 6%; padding: 3px;">취미</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="노는게 제일 좋아" style="text-align: center;"></div>
               		</div>
               		<div style="float: left; width: 25%;"><br></div>
               		<div class="clearfix"></div><br>
               		<div style="float: left; width: 5%;"><br></div>
               		<div style="float: left; width: 70%;">
	               		<div style="float: left; width: 10%; padding:3px;">전화번호</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="010-4810-3183" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding:3px;">E-mail</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="lsj0813@naver.com" style="text-align: center;"></div>
	                	<div style="float: left; width: 32%;"><br></div>
                	</div>
                	<div style="float: left; width: 25%;"><br></div>
                	<div class="clearfix"></div><br>
                	<div class="x_title"></div>
                	<div class="clearfix"></div>
                	<div align="center" style="float: left; width: 20%; padding: 12px;"><br>포탈 비밀 번호 변경</div>
                	<div class="x_panel" style="float: left; width: 60%;">
		                <div align="center">
			                <div style="float: left; width: 14%; padding: 3px;">현재</div>
		               		<div style="float: left; width: 37%;"><input type="text" id="" required="required" size="15" value="" style="text-align: center;"></div>
		               		<div style="float: left; width: 49%;"><br></div><br><br>
	               		</div>
		                <div align="center">
			                <div style="float: left; width: 14%; padding: 3px;">변경</div>
		               		<div style="float: left; width: 37%;"><input type="text" id="" required="required" size="15" value="" style="text-align: center;"></div>
		               		<div style="float: left; width: 11%; padding: 3px;">변경(확인)</div>
		               		<div style="float: left; width: 37%;"><input type="text" id="" required="required" size="15" value="" style="text-align: center;"></div><br>
	               		</div>
               		</div>
               		<div style="float: left; width: 20%;"><br></div>
                </div>
    	</div>
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
    <script src="/bootstrap/js/datatables.scroller.min.js"></script>
    <script src="/bootstrap/js/jszip.min.js"></script>
    <script src="/bootstrap/js/pdfmake.min.js"></script>
    <script src="/bootstrap/js/vfs_fonts.js"></script>