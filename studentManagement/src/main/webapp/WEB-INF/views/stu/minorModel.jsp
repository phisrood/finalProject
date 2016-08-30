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

	<!-- Data tables -->
    <link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
    
    <div class="row">
    	<div class="x_panel_big">
    		<!-- 부 / 다 전공 신청 -->
	    		<div class="x_panel">
	   					<i class="fa fa-arrow-circle-o-right"></i> &nbsp;부 / 다 전공 신청
	            </div>
	            <div class="clearfix"></div>
	            <div class="x_content">
                    
                    <table id="datatable" class="table table-striped table-bordered">
                       	<tr>
                         	<td align="center" colspan="2" style="font-weight: bold;">부전공</td>
                         	<td align="center" colspan="2" style="font-weight: bold;">다전공</td>
                       	</tr>
                      	<tr>
                        	<td align="center"><input type="checkbox" name="division">&nbsp;&nbsp;&nbsp;신청</td>
                          	<td align="center"><input type="checkbox" name="division">&nbsp;&nbsp;&nbsp;취소</td>
                          	<td align="center"><input type="checkbox" name="division">&nbsp;&nbsp;&nbsp;신청</td>
                          	<td align="center"><input type="checkbox" name="division">&nbsp;&nbsp;&nbsp;취소</td>
                        </tr>
                        <tr>
                          	<td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;지원자</td>
                        </tr>
                        <tr>
                        	<td align="center">단과 대학</td>
                          	<td align="center"></td>
                          	<td align="center">학과</td>
                          	<td align="center"></td>
                        </tr>
                        <tr>
                        	<td align="center">성명</td>
                          	<td align="center"></td>
                          	<td align="center">학년</td>
                          	<td align="center"></td>
                        </tr>
                        <tr>
                        	<td align="center">학번</td>
                          	<td align="center"></td>
                          	<td align="center">전체 이수 학점</td>
                          	<td align="center"></td>
                        </tr>
                        <tr>
                        	<td align="center">평점 평균</td>
                          	<td align="center"></td>
                          	<td align="center"></td>
                          	<td align="center"></td>
                        </tr>
                        <tr>
                          	<td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;신청 및 취소 학과</td>
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
                          		<select name="department">
									<option value="학과">학과</option>
									<option value="학과">학과</option>
								</select>
                          	</td>
                        </tr>
                    </table>
                    <div align="center">
						<button type="button" class="btn btn-dark">신청</button>
					</div>
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