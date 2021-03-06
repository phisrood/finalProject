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
    <link href="../vendors/normalize-css/normalize.css" rel="stylesheet">
    <link href="../vendors/ion.rangeSlider/css/ion.rangeSlider.css" rel="stylesheet">
    <link href="../vendors/ion.rangeSlider/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <!-- Bootstrap Colorpicker -->
    <link href="../vendors/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">

    <link href="../vendors/cropper/dist/cropper.min.css" rel="stylesheet">
<!-- Custom Theme Style -->
<link href="/stu/css/custom.min.css" rel="stylesheet">

<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>


<script>
$(function() {
    $( "#testDatepickerStart" ).datepicker({
    	
    	  showButtonPanel: true, 
          currentText: '오늘 날짜', 
          closeText: '닫기', 
          dateFormat: "yy-mm-dd",
          changeMonth: true, 
          changeYear: true,
          nextText: '다음 달',
          prevText: '이전 달',
          changeMonth: true, 
          dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
          dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
          monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
          monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
   		  minDate: -0
         
    });
});

$(function() {
    $( "#testDatepickerEnd" ).datepicker({
    	
  	  showButtonPanel: true, 
      currentText: '오늘 날짜', 
      closeText: '닫기', 
      dateFormat: "yy-mm-dd",
      changeMonth: true, 
      changeYear: true,
      nextText: '다음 달',
      prevText: '이전 달',
      changeMonth: true, 
      dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
      dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
      monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
      monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	  minDate: +1
    });
});



</script>

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
			    <form action="/stu/schoolReREQ" method="POST"> 
			<div class="form-group">
				
                        <label>신청구분</label><br>
                          <select class="form-control" name="option">
                            <option value="일반휴학">일반휴학</option>
                            <option value="군휴학">군휴학</option>
                            <option value="일반복학">일반복학</option>
                            <option value="제대복학">제대복학</option>
                          </select>
                        <br/>
                        </div>
                      
                       
                        <fieldset>
                          <div class="control-group">
                            <div class="controls">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">시작일자</label>
                              <div class="col-md-11 xdisplay_inputx form-group has-feedback">
                                <input type="text" name="ad_reqdate_start" class="form-control has-feedback-left"  id="testDatepickerStart">
                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                <span id="inputSuccess2Status4" class="sr-only">(success)</span>
                              </div>
                            </div>
                          </div>
                        </fieldset>
                        <fieldset>
                          <div class="control-group">
                            <div class="controls">
                        		<label class="control-label col-md-3 col-sm-3 col-xs-12">종료일자</label>
                              <div class="col-md-11 xdisplay_inputx form-group has-feedback">
                                <input type="text" id="testDatepickerEnd" name="ad_reqdate_end" class="form-control has-feedback-left">
                                <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                <span id="inputSuccess2Status4" class="sr-only">(success)</span>
                              </div>
                            </div>
                          </div>
                        </fieldset>
                        
                       
                        
                  <div class="col-md-9 col-sm-9 col-xs-12">
			        <div class="form-group">
                      <label>변동사유</label>
                      <input type="text" name="sayou" class="form-control" placeholder="변동사유를 쓰시오">
                    </div>
			      </div>
                    	<div style="text-align:right;">
			                      <button type="submit" class="btn btn-dark">신청</button>
                    	</div>
                    	
                    </form> 	
                    
			      <div class="x_content">
			    
        
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>접수번호</th>
                          <th>신청일자</th>
                          <th>신청구분</th>
                          <th>휴/복학 시작일자</th>
                          <th>휴/복학 종료일자</th>
                          <th>승인여부<th>
                         <!--  <th>취소여부<th> -->
                        </tr>
                      </thead>
                      
                      
  					<c:choose>
                      	     <c:when test="${empty Colleage_Register_ChangeVO}">
	                        		<td colspan="8" align="center">신청한 내역이 없습니다.</td>
                        	</c:when>
                     
   					<c:otherwise>
                      <tbody>
                       <c:forEach items="${Colleage_Register_ChangeVO}" var="Colleage_Register_ChangeVO">
                        <tr>
                          <td>${Colleage_Register_ChangeVO.crc_no}</td>
                          <td>${Colleage_Register_ChangeVO.crc_year}</td>
                          <td>${Colleage_Register_ChangeVO.crc_colleagechangestatus}</td>
                          <td>${Colleage_Register_ChangeVO.crc_changedate}</td>
                          <td>${Colleage_Register_ChangeVO.crc_returnappointdate}</td>
                          <td>${Colleage_Register_ChangeVO.crc_submityn}</td>
                   <%--        <td>${Colleage_Register_ChangeVO.crc_cancelyn}</td> --%>
                        </tr>
							</c:forEach>
						
						 	</c:otherwise>
                        
                         	</c:choose>	
                 	
                      </tbody>
                    </table>
                  </div>
                     
       
			

				<!-- x-content -->
			</div>		
		</div>
	</div>
					<!-- /page content -->
	
			
			
	<!-- cal -->
	<script src="/stu/js/click_cal.js"></script>
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
	
	