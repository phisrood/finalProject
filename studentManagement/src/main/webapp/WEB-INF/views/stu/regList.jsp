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

	
    
    <!-- 등록납부내역 -->
			
           
            <div class="row">
            
  <div class="x_panel">
                  <div class="x_title">
                    <h2>등록금 납부내역</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                  
                  <form class="form-inline">
                  <div class="form-group">
                    <label>소속</label>
                    <input type="text" class="form-control" placeholder="정보통신공학과 4학년">
                  </div>
                	&nbsp;&nbsp;&nbsp;
                  <div class="form-group">
                    <label>학적상태</label>
                    <input type="text"  class="form-control" placeholder="재학 ">
                  </div>
                </form>
                <div style="text-align:right;">
                <button type="button" class="btn btn-danger">고지서(PDF)</button>
                </div>
                
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>연도</th>
                          <th>학기</th>
                          <th>입학금</th>
                          <th>수업료</th>
                          <th>납부총액</th>
                          <th>납부일</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>1000000</td>  <!-- A -->
                          <td>3520000</td>	<!-- B -->
                          <td>3620000</td>	<!-- A+B -->
                          <td>2012/02/27</td>	
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>1000000</td>  <!-- A -->
                          <td>3520000</td>	<!-- B -->
                          <td>3620000</td>	<!-- A+B -->
                          <td>2012/02/27</td>	
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>1000000</td>  <!-- A -->
                          <td>3520000</td>	<!-- B -->
                          <td>3620000</td>	<!-- A+B -->
                          <td>2012/02/27</td>	
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>1000000</td>  <!-- A -->
                          <td>3520000</td>	<!-- B -->
                          <td>3620000</td>	<!-- A+B -->
                          <td>2012/02/27</td>	
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>1000000</td>  <!-- A -->
                          <td>3520000</td>	<!-- B -->
                          <td>3620000</td>	<!-- A+B -->
                          <td>2012/02/27</td>	
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>1000000</td>  <!-- A -->
                          <td>3520000</td>	<!-- B -->
                          <td>3620000</td>	<!-- A+B -->
                          <td>2012/02/27</td>	
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
