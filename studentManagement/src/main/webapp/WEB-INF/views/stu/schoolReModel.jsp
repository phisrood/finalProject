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

	<!-- 휴/복학 -->

	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-bars"></i> 휴/복학신청
				</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="clearfix"></div>
			</div>
			
			<div class="x_content">
			
			<div class="form-group">
			
                        <label>신청구분</label><br>
                        
                          <select class="form-control">
                            <option>일반휴학</option>
                            <option>군휴학</option>
                            <option>일반복학</option>
                            <option>제대복학</option>
                          </select>
                        <br/>
                        </div>
                      
                       
                        <fieldset>
                          <div class="control-group">
                            <div class="controls">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">휴학시작일자</label>
                              <div class="col-md-11 xdisplay_inputx form-group has-feedback">
                                <input type="text" class="form-control has-feedback-left" id="single_cal4" placeholder="First Name" aria-describedby="inputSuccess2Status4">
                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                <span id="inputSuccess2Status4" class="sr-only">(success)</span>
                              </div>
                            </div>
                          </div>
                        </fieldset>
                        <fieldset>
                          <div class="control-group">
                            <div class="controls">
                        		<label class="control-label col-md-3 col-sm-3 col-xs-12">복학시작일자</label>
                              <div class="col-md-11 xdisplay_inputx form-group has-feedback">
                                <input type="text" class="form-control has-feedback-left" id="single_cal4" placeholder="First Name" aria-describedby="inputSuccess2Status4">
                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                <span id="inputSuccess2Status4" class="sr-only">(success)</span>
                              </div>
                            </div>
                          </div>
                        </fieldset>
                        
                       
                        
                  <div class="col-md-9 col-sm-9 col-xs-12">
			        <div class="form-group">
                      <label>변동사유</label>
                      <input type="text" class="form-control" placeholder="변동사유를 쓰시오">
                    </div>
			                      <button type="button" class="btn btn-dark">신청</button>
			      </div>
			      
			      <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>신청일자</th>
                          <th>신청구분</th>
                          <th>휴/복학예정일자</th>
                          <th>휴학종료예정일</th>
                          <th>취소구분</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>1</td>
                          <td>2012/02/20</td>
                          <td>휴학</td>
                          <td>2012/03/02</td>
                          <td>2012/08/31</td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>2012/02/20</td>
                          <td>휴학</td>
                          <td>2012/03/02</td>
                          <td>2012/08/31</td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>2012/02/20</td>
                          <td>휴학</td>
                          <td>2012/03/02</td>
                          <td>2012/08/31</td>
                          <td>없음</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>2012/02/20</td>
                          <td>휴학</td>
                          <td>2012/03/02</td>
                          <td>2012/08/31</td>
                          <td>없음</td>
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
	
	