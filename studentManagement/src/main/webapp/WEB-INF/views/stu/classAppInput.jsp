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

	<!-- Ion.RangeSlider -->
    <link href="/stu/css/normalize.css" rel="stylesheet">
    <link href="/stu/css/ion.rangeSlider.css" rel="stylesheet">
    <link href="/stu/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <!-- Bootstrap Colorpicker -->
    <link href="/stu/css/bootstrap-colorpicker.min.css" rel="stylesheet">

    <link href="/stu/css/cropper.min.css" rel="stylesheet">
<!-- Custom Theme Style -->
<link href="/stu/css/custom.min.css" rel="stylesheet">

<!-- 수업평가 -->

	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-calendar"></i> 수업평가
				</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
			</div>
			
			
			<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">년도</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control">
                            <option>2016</option>
                            <option>2015</option>
                            <option>2014</option>
                            <option>2013</option>
                            <option>2012</option>
                          </select>
                        </div>
                       
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">학기</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control">
                            <option>1학기</option>
                            <option>2학기</option>
                          </select>
                        </div>
      
      			<div style="text-align:right;">
                	<button type="button" class="btn btn-dark">조회</button>
                </div>
                        
           <!-- 과목누를시 수업평가 -->
			      
			<div class="x_content">
			      <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>구분</th>
                          <th>학과</th>
                          <th>과목</th>
                          <th>분반</th>
                          <th>교수</th>
                          <th>이수구분</th>
                          <th>학점</th>
                          <th>비고</th>
                        </tr>
                      </thead>

				

                      <tbody>
                        <tr>
                          <td></td>
                          <td>정보통신공학과</td>
                          <td>데이터통신</td>
                          <td>02</td>
                          <td>누군가</td>
                          <td>전공</td>
                          <td>3</td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td>정보통신공학과</td>
                          <td>데이터통신</td>
                          <td>02</td>
                          <td>누군가</td>
                          <td>전공</td>
                          <td>3</td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td>정보통신공학과</td>
                          <td>데이터통신</td>
                          <td>02</td>
                          <td>누군가</td>
                          <td>전공</td>
                          <td>3</td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td>정보통신공학과</td>
                          <td>데이터통신</td>
                          <td>02</td>
                          <td>누군가</td>
                          <td>전공</td>
                          <td>3</td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td>정보통신공학과</td>
                          <td>데이터통신</td>
                          <td>02</td>
                          <td>누군가</td>
                          <td>전공</td>
                          <td>3</td>
                          <td></td>
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
    <script src="/stu/js/ion.rangeSlider.min.js"></script>
    <!-- Bootstrap Colorpicker -->
    <script src="/stu/js/bootstrap-colorpicker.min.js"></script>
    <!-- jquery.inputmask -->
    <script src="/stu/js/jquery.inputmask.bundle.min.js"></script>
    <!-- jQuery Knob -->
    <script src="/stu/js/jquery.knob.min.js"></script>
    <!-- Cropper -->
    <script src="/stu/js/cropper.min.js"></script>
		
			<!-- Custom Theme Scripts -->
			<script src="/stu/js/custom.min.js"></script>
	
	