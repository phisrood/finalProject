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



<!-- 전체성적조회 -->

	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					학과생성적조회
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
                        
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">학년</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select class="form-control">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                          </select>
                        </div>
                        
                 	<div style="text-align:right;">
                    
                          <select style="width:100px; height:30px;">
                            <option>전체</option>
                            <option>학번</option>
                            <option>이름</option>
                          </select>
                     <input type="text" style="width:200px; height:30px;">
	                <button type="button" class="btn btn-dark">검색</button>
                      
                     </div>   
                
                        
           
			      
			<div class="x_content">
			      <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                       <tr>
                          <th>년도</th>
                          <th>학년</th>
                          <th>이름</th>
                          <th>총 이수학기</th>
                          <th>총 취득학점</th>
                          <th>총 평점평균</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>이수정</td>
                          <td>2</td>
                          <td>36</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>한돈희</td>
                          <td>2</td>
                          <td>36</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>2</td>
                          <td>김양문</td>
                          <td>4</td>
                          <td>36</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>3</td>
                          <td>이건원</td>
                          <td>6</td>
                          <td>36</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>3</td>
                          <td>이수정</td>
                          <td>2</td>
                          <td>36</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>이수정</td>
                          <td>2</td>
                          <td>36</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>이수정</td>
                          <td>2</td>
                          <td>36</td>
                          <td>3.5</td>
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

		