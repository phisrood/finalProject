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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
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
<script>


</script>


  <body>
    <div class="row">
    	<div class="x_panel_big">
    		<!-- 부 / 다 전공 신청 -->
	    		<div class="x_panel">
	   					<i class="fa fa-arrow-circle-o-right"></i> &nbsp;부 / 다 전공 신청
	            </div>
	            <div class="clearfix"></div>
	            <div class="x_content">
                 <form action="belongMinorREQ" method="post">
                    <table id="datatable" class="table table-striped table-bordered">
                       	<tr>
                         	<td align="center" colspan="2" style="font-weight: bold;">부/다전공 신청양식</td>
                       	</tr> 
                      	<tr> 
                      		<td align="center">신청구분</td>
                        	<td colspan="3"> 
								<select name="selec" style="margin-left:25px;">
								    <option value="1" selected>선택해주세요</option>
								    <option value="2">부전공</option>
								    <option value="3">다전공</option>
								</select>
							</td>		
                        </tr>
                        <tr>
                          	<td colspan="4"></td>
                        </tr>
                        <tr>
                          	<th colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;지원자</th>
                        </tr>
                        <tr>
                          	<td align="center">학과</td>
                          	<td align="center">${studentInfo.dep_name }</td>
                        	<td align="center">성명</td>
                          	<td align="center">${loginUser.use_name }</td>
                        </tr>
                        <tr>
                          	<td align="center">학년</td>
                          	<td align="center">???</td>
                        	<td align="center">학번</td>
                          	<td align="center">${loginUser.use_id }</td>
                        </tr>
                        <tr>
                          	<td align="center">전체 이수 학점</td>
                          	<td align="center">${semes }</td>
                        	<td align="center">평점 평균</td>
                          	<td align="center">${score }</td>
                        </tr>
                        <tr>
                          	<td colspan="4"></td>
                        </tr>
                        <tr>
                          	<th colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;신청 및 취소 학과</th>
                        </tr>
                        <tr>
                        	<td align="center">단과 대학</td>
                          	<td align="center">
                          		<select name="college">
									<option value="단과 대학">단과 대학</option>
									<option value="단과 대학">단과 대학</option>
								</select>
                          	</td>
                          	<td align="center">학과</td>
                          	<td align="center">
                          		<select name="sb_dep_no">
                          			<option value="0" selected>선택해주세요</option>
									<c:forEach var="department" items="${departmentList }">
										<option value="${department.dep_no }">${department.dep_name }</option>
									</c:forEach>
								</select>
                          	</td>
                        </tr>
                        <tr>
                          	<td colspan="4"></td>
                        </tr>
                    </table>
                    <div align="center">
						<button type="submit" class="btn btn-dark">신청</button>
					</div>
                    </form>
                </div>
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