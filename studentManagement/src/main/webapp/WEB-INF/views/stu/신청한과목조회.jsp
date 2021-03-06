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

<!-- 수강편람승인반려 -->
	


	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				
				<h2>
					<i class="fa fa-calendar"></i> 신청학 과목 조회
				</h2>
				
				
				<div class="clearfix"></div>
			
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
                   
               <div style="text-align:right";>
            <button type="button" class="btn btn-dark">승인</button>
			<button type="button" class="btn btn-dark">반려</button>
               </div>
       
     

     			<div class="x_content">
                
                <table id="datatable" class="table table-striped jambo_table bulk_action">
                  <thead>
                    <tr>
                      <th>학수번호</th>
                      <th>교과목명</th>
                      <th>개설학과</th>
                      <th>분반</th>
                      <th>학점</th>
                      <th>이수구분</th>
                      <th>교번</th>
                      <th>담당교수</th>
                      <th>승인/반려</th>
                      <th>수업계획서</th>
                    </tr>
                  </thead>

		

               <tbody>
                 <tr>
                   <td>21500</td>
                   <td>데이터통신</td>
                   <td>정보통신공학과</td>
                   <td>01</td>
                   <td>3</td>
                   <td>전공</td>
                   <td>1074</td>
                   <td>누군가</td>
                   <td><input type="checkbox"></td>
                   <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                 </tr>
                 <tr>
                   <td>21500</td>
                   <td>데이터통신</td>
                   <td>정보통신공학과</td>
                   <td>01</td>
                   <td>3</td>
                   <td>전공</td>
                   <td>1074</td>
                   <td>누군가</td>
                   <td><input type="checkbox"></td>
                   <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                 </tr>
                 <tr>
                   <td>21500</td>
                   <td>데이터통신</td>
                   <td>정보통신공학과</td>
                   <td>01</td>
                   <td>3</td>
                   <td>전공</td>
                   <td>1074</td>
                   <td>누군가</td>
                   <td><input type="checkbox"></td>
                   <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                 </tr>
                 <tr>
                   <td>21500</td>
                   <td>데이터통신</td>
                   <td>정보통신공학과</td>
                   <td>01</td>
                   <td>3</td>
                   <td>전공</td>
                   <td>1074</td>
                   <td>누군가</td>
                   <td><input type="checkbox"></td>
                   <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                 </tr>
                 <tr>
                   <td>21500</td>
                   <td>데이터통신</td>
                   <td>정보통신공학과</td>
                   <td>01</td>
                   <td>3</td>
                   <td>전공</td>
                   <td>1074</td>
                   <td>누군가</td>
                   <td><input type="checkbox"></td>
                   <td><button type="button" class="btn btn-info btn-xs">강의계획서</button></td>
                 </tr>
                       
               </tbody>
             </table>
           </div>
                    
      
		

			<!-- x-content -->
				
	
		</div>
			<!-- /page content -->
		</div>
		
		
	

		

	