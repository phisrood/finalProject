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
 *	  2016.09.02.  	박진성,조현욱      	1차 수정(임시완료)
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

<script>
window.onload=function()
{
 replace('image');
}

</script>
			
	<form action="/stu/indivUpdate" method="POST">
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
                		
                			
                	
                        		<img id="image" src="/stu/images/${studentVO.af_aftername}" alt="Picture" width="170px" height="150px">
                        		
                        		</div>                     
                        </div>
                        <br>
                        <div align="center">
                        	<c:choose>
                        		<c:when test="${studentVO.stud_af_no eq 0 }">
	                        		<input type="button" class="btn btn-dark btn-xs" value="사진등록" onclick="javascript:OpenWindow('/colleage/indivInfoImageInsert','320','180')" />
                        		</c:when>
                        		<c:otherwise>
	                        		<input type="button" class="btn btn-dark btn-xs" value="사진수정" onclick="javascript:OpenWindow('/colleage/indivInfoImage','320','180')" />
                        		</c:otherwise>
                        	</c:choose>
                        	   
                    	</div>
                
                </div>
                <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" name="stud_use_id" value="${studentVO.stud_use_id}" style="text-align: center;" readonly="readonly"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">성명(한글)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.use_name}" style="text-align: center;" readonly="readonly"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">주민 &nbsp;번호</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_regno1}-${studentVO.stud_regno2}" readonly="readonly" style="text-align: center;"></div><br><br>
					</div>
				</div>
				<div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
             
                		<div style="float: left; width: 35%; padding:3px;">성명(영어)</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_engname}" style="text-align: center;" readonly="readonly"></div><br><br>
                		<div style="float: left; width: 35%; padding:3px;">현재 &nbsp;학과</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.dep_name}" style="text-align: center;" readonly="readonly"></div><br><br>
                      		<div style="float: left; width: 35%; padding:3px;">학적 &nbsp;상태</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_stat }" style="text-align: center;" readonly="readonly"></div>
					</div>
				</div>
                <div class="col-md-55">
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;년</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="1학년(고정값 수정필요)" style="text-align: center;" readonly="readonly"></div><br><br>  
                	<div class="thumbnail" style="padding:10px;">
                		<div style="float: left; width: 35%; padding:3px;">전&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;공</div>
                		
                		<div style="float: right; width: 65%;">
                		<input type="text" id="" required="required" size="15" value="${studentVO.dep_name}" style="text-align: center;" readonly="readonly">
                		</div><br><br>
                		
                		<div style="float: left; width: 35%; padding:3px;">다&nbsp;&nbsp;전&nbsp;&nbsp;&nbsp;공</div>
                		<div style="float: right; width: 65%;">
                		<input type="text" id="" required="required" size="15" value="" style="text-align: center;" readonly="readonly">
                		</div><br><br>
                		
                		<div style="float: left; width: 35%; padding:3px;">부&nbsp;&nbsp;전&nbsp;&nbsp;&nbsp;공</div>
                		<div style="float: right; width: 65%;">
                		<input type="text" id="" required="required" size="15" value="" style="text-align: center;" readonly="readonly">
                		</div><br><br>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.dep_name}" style="text-align: center;" readonly="readonly"></div><br><br>

                		<div style="float: left; width: 35%; padding:3px;">성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;별</div>
                		<div style="float: right; width: 65%;"><input type="text" id="" required="required" size="15" value="${studentVO.stud_gender}" style="text-align: center;" readonly="readonly"></div><br><br>
					</div>
				</div>    
				<div class="clearfix">
				
					
				
				</div>
				
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
	   						<button type="submit" class="btn btn-dark btn-xs">&nbsp;저 장&nbsp;</button>
	   					</div>
	                </div>
	                <div class="clearfix"></div><br>
	                <div style="float: left; width: 5%;"><br></div>
	                <div style="float: left; width: 70%;">
		                <div style="float: left; width: 10%; padding: 3px;">생년월일</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_birth" required="required" size="15" value="${studentVO.stud_birth}" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding: 3px;">혈액형</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_bltype" required="required" size="15" value="${studentVO.stud_bltype}" style="text-align: center;"></div>
	               		<div style="float: left; width: 6%; padding: 3px;">취미</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_hob" required="required" size="15" value="${studentVO.stud_hob}" style="text-align: center;"></div>
               		</div>
               		<div style="float: left; width: 25%;"><br></div>
               		<div class="clearfix"></div><br>
               		<div style="float: left; width: 5%;"><br></div>
               		<div style="float: left; width: 70%;">
	               		<div style="float: left; width: 10%; padding:3px;">전화번호</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_phone" required="required" size="15" value="${studentVO.stud_phone}" style="text-align: center;"></div>
	               		<div style="float: left; width: 8%; padding:3px;">E-mail</div>
	               		<div style="float: left; width: 25%;"><input type="text" name="stud_email" required="required" size="15" value="${studentVO.stud_email}" style="text-align: center;"></div>
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
		               		<input type="password"  required="required" size="30" name="now_use_pwd" style="text-align: center;" placeholder="현재 패스워드를 입력"></div>
		               		
		               		<div style="float: left; width: 49%;"></div><br><br>
	               		</div>
		                <div align="center">
			                <div style="float: left; width: 14%; padding: 3px;">변경</div>
		               		<div style="float: left; width: 37%;"><input type="password"  required="required" name="after_use_pwd" size="30"  placeholder="변경할 패스워드 입력" style="text-align: center;"></div>
		               		<div style="float: left; width: 11%; padding: 3px;">변경(확인)</div>
		               		<div style="float: left; width: 37%;"><input type="password"  required="required" size="30" name="after_use_pwd1" placeholder="변경할 패스워드 확인"  style="text-align: center;"></div><br>
		               	
	               		</div>
	               		
               		</div>
               		<div style="float: left; width: 20%;"><br></div>
                </div>
    	</div>
    </div>
    
    </form>
   
    
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
