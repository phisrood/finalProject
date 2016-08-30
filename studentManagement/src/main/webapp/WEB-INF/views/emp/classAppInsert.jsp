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




<!-- 수업평가항목추가:행정 -->
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
			
            
			
           
			      
			<div class="x_content">
			      <div class="x_content">
                     <div style="text-align:right;">
			      <button type="button" class="btn btn-dark">수정</button>
			      <button type="button" class="btn btn-dark">저장</button>
                     </div>
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                       <tr>
                          <th>평가문항</th>
                          <th>매우그렇다(5점)</th>
                          <th>그렇다(4점)</th>
                          <th>보통이다(3점)</th>
                          <th>그렇지않다(2점)</th>
                          <th>매우그렇지않다(1점)</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>나는 이 수업방식이 마음에 들었다</td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                        </tr>
                        <tr>
                          <td><button type="button" class="btn btn-info btn-xs">항목추가+</button></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                        </tr>
                        
                        
                      </tbody>
                    </table>
                    
                    <br/>
           			 
	
                  </div>
            
				<!-- x-content -->
			</div>		
		
	</div>
					<!-- /page content -->
	</div>

		

		
	
	