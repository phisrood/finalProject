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

<!-- 수강편람조회 -->
	


	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				
				<h2>
					<i class="fa fa-file-text-o"></i> 수강편람조회
				</h2>
				<ul class="nav navbar-right panel_toolbox"></ul>
				<div class="title_right">
	                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
	                  <div class="input-group">
	                  <input type="text" class="form-control" placeholder="Search for...">
	                    <span class="input-group-btn">
	                      <button class="btn btn-dark" type="button">검색</button>
	                    </span>
	                  </div>
	                </div>
				<div class="clearfix"></div>
			</div>
			
	          	</div>
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">년도</label>
                    
                      <select class="form-control">
                        <option>2016</option>
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                        <option>2012</option>
                      </select>
                   
                   
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">학기</label>
                    
                      <select class="form-control">
                        <option>1학기</option>
                        <option>2학기</option>
                      </select>
                    
              
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">학과</label>
                    
                      <select class="form-control">
                        <option>정보통신공학과</option>
                        <option>컴퓨터공학과</option>
                        <option>수학과</option>
                        <option>기계공학과</option>
                        <option>경영학과</option>
                      </select>
                    
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">이수구분</label>
                      <select class="form-control">
                        <option>전공</option>
                        <option>교양</option>
                      </select>
                   
             
            <div style="text-align:right;">
	            <button type="button" class="btn btn-dark">조회</button>
				<button type="button" class="btn btn-dark">출력</button>
            </div>   
       
     

     			<div class="x_content">
                
                <table id="datatable" class="table table-striped jambo_table bulk_action">
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
			<!-- /page content -->
		</div>
		
		
	

		

	