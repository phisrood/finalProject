<%--==============================================================
 * 개인 정보 관리 left 메뉴구성
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
 <!--    <style>
    	#image{width:80%; height: 80%;}
    	#checkMsg{
		  font-size: 12px;
		}
		#checkPwd{
		  color : red;
		  font-size: 12px;
		}
    </style>
	<script type="text/javascript" src="httpRequest.js"></script>
	<script type="text/javascript">
	 var checkFirst = false;
	 var lastKeyword = '';
	 var loopSendKeyword = false;
	 
	 function checkId() {
	  if (checkFirst == false) {
	   //0.5초 후에 sendKeyword()함수 실행
	   setTimeout("sendId();", 500);
	   loopSendKeyword = true;
	  }
	  checkFirst = true;
	 }
	 
	 function checkPwd(){
	  var f1 = document.forms[0];
	  var pw1 = f1.pwd.value;
	  var pw2 = f1.pwd_check.value;
	  if(pw1!=pw2){
	   document.getElementById('checkPwd').style.color = "red";
	   document.getElementById('checkPwd').innerHTML = "동일한 암호를 입력하세요."; 
	  }else{
	   document.getElementById('checkPwd').style.color = "black";
	   document.getElementById('checkPwd').innerHTML = "암호가 확인 되었습니다."; 
	   
	  }
	  
	 }
	 
	 
	 function sendId() {
	  if (loopSendKeyword == false) return;
	  
	  var keyword = document.search.u_id.value;
	  if (keyword == '') {
	   lastKeyword = '';
	   document.getElementById('checkMsg').style.color = "black";
	   document.getElementById('checkMsg').innerHTML = "아이디를 입력하세요.";
	  } else if (keyword != lastKeyword) {
	   lastKeyword = keyword;
	   
	   if (keyword != '') {
	    var params = "id="+encodeURIComponent(keyword);
	    sendRequest("id_check.jsp", params, displayResult, 'POST');
	   } else {
	   }
	  }
	  setTimeout("sendId();", 500);
	 }
	 
	 
	 function displayResult() {
	  if (httpRequest.readyState == 4) {
	   if (httpRequest.status == 200) {
	    var resultText = httpRequest.responseText;
	    var listView = document.getElementById('checkMsg');
	    if(resultText==0){
	     listView.innerHTML = "사용 할 수 있는 ID 입니다";
	     listView.style.color = "blue";
	    }else{
	     listView.innerHTML = "이미 등록된 ID 입니다";
	     listView.style.color = "red";
	    }
	   } else {
	    alert("에러 발생: "+httpRequest.status);
	   }
	  }
	 }
	</script> -->


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
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_use_id}" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성명(한글)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.use_name}" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">주민 &nbsp;번호</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_regno1}-${studentVO.stud_regno2}" style="text-align: center;"></div><br><br>
     
					</div>
				</div>
				<div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
             
                		<div style="float: left; width: 35%; padding:3px;">성명(영어)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_engname}" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">현재 &nbsp;학과</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.dep_name}" style="text-align: center;"></div><br><br>
                      		<div style="float: left; width: 35%; padding:3px;">학적 &nbsp;상태</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_stat }" style="text-align: center;"></div>
					</div>
				</div>
                <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;년</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="수저저저저저저저정" style="text-align: center;"></div><br><br>  
                		<div style="float: left; width: 35%; padding:3px;">전&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;공</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.dep_name}" style="text-align: center;"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;별</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_gender}" style="text-align: center;"></div><br><br>
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
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_birth}" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding: 3px;">혈액형</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_gender}" style="text-align: center;"></div>
	               		<div style="float: left; width: 6%; padding: 3px;">취미</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_hob}" style="text-align: center;"></div>
               		</div>
               		<div style="float: left; width: 25%;"><br></div>
               		<div class="clearfix"></div><br>
               		<div style="float: left; width: 5%;"><br></div>
               		<div style="float: left; width: 70%;">
	               		<div style="float: left; width: 10%; padding:3px;">전화번호</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_phone}" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding:3px;">E-mail</div>
	               		<div style="float: left; width: 25%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_email}" style="text-align: center;"></div>
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
		               		<div style="float: left; width: 37%;">
		               		<input type="text" name="u_id" id="u_id" required="required" size="15" value="" style="text-align: center;"></div>
		               		<div style="float: left; width: 48%; padding: 3px;"></div>
		               	
	               		</div>
		                <div align="center">
			                <div style="float: left; width: 14%; padding: 3px;">변경</div>
		               		<div style="float: left; width: 37%;"><input type="password" name="pwd" required="required" size="15" value="" style="text-align: center;"></div>
		               		<div style="float: left; width: 11%; padding: 3px;">변경(확인)</div>
		               		<div style="float: left; width: 37%;"><input type="password" name="pwd_check" required="required" size="15" value=""  style="text-align: center;"></div><br>
		               		<div style="float: left; width: 62%;"><br></div>
		               	
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
