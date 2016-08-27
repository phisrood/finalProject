<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	<!-- Ion.RangeSlider -->
    <link href="../vendors/normalize-css/normalize.css" rel="stylesheet">
    <link href="../vendors/ion.rangeSlider/css/ion.rangeSlider.css" rel="stylesheet">
    <link href="../vendors/ion.rangeSlider/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <!-- Bootstrap Colorpicker -->
    <link href="../vendors/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">

    <link href="../vendors/cropper/dist/cropper.min.css" rel="stylesheet">
	<!-- Custom Theme Style -->
	<link href="/stu/css/custom.min.css" rel="stylesheet">


	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					수강신청조회
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
			<button type="button" class="btn btn-dark">출력</button>
                    	</div>
           
			      
			<div class="x_content">
			      <div class="x_content">
                    
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>학과</th>
                          <th>학년</th>
                          <th>과목명</th>
                          <th>이수구분</th>
                          <th>학점</th>
                          <th>강의시간</th>
                          <th>교수</th>
                          <th>강의계획서</th>
                        </tr>
                      </thead>

				<!-- 과목누르면 사이버캠퍼스로 이동 -->

                      <tbody>
                        <tr>
                          <td>정보통신공학과</td>
                          <td>4</td>
                          <td>데이터통신</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>15:00-18:00</td>
                          <td>누군가</td>
                          <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                          <td>정보통신공학과</td>
                          <td>4</td>
                          <td>데이터통신</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>15:00-18:00</td>
                          <td>누군가</td>
                          <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                          <td>정보통신공학과</td>
                          <td>4</td>
                          <td>데이터통신</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>15:00-18:00</td>
                          <td>누군가</td>
                          <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                          <td>정보통신공학과</td>
                          <td>4</td>
                          <td>데이터통신</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>15:00-18:00</td>
                          <td>누군가</td>
                          <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                        </tr>
                        <tr>
                          <td>정보통신공학과</td>
                          <td>4</td>
                          <td>데이터통신</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>15:00-18:00</td>
                          <td>누군가</td>
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
    <script src="../vendors/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
    <!-- jquery.inputmask -->
    <script src="../vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js"></script>
    <!-- jQuery Knob -->
    <script src="../vendors/jquery-knob/dist/jquery.knob.min.js"></script>
    <!-- Cropper -->
    <script src="../vendors/cropper/dist/cropper.min.js"></script>
		
			<!-- Custom Theme Scripts -->
			<script src="/stu/js/custom.min.js"></script>
	
	