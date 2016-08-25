<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>




<!-- 수업평가->과목눌렀을때->(평가항목) -->
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
			
			<form class="form-inline">
                  <div class="form-group">
                    <label>과목</label>
                    <input type="text" class="form-control" placeholder=" ">
                  </div>
                  <div class="form-group">
                    <label>교수</label>
                    <input type="text" class="form-control" placeholder=" ">
                  </div>
            </form>
            
			
           
			      
			<div class="x_content">
			      <div class="x_content">
                    
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
                          <td>나는 수업에 적극적으로 참여하였다</td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                        </tr>
                        <tr>
                          <td>나는 이 수업방식이 마음에 들었다</td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                        </tr>
                        <tr>
                          <td>나는 이 수업방식이 마음에 들었다</td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                        </tr>
                        <tr>
                          <td>나는 이 수업방식이 마음에 들었다</td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                          <td><input type="checkbox"></td>
                        </tr>
                        
                      </tbody>
                    </table>
                    
                    <br/>
           			 <button type="button" class="btn btn-dark"><a href="/stu/classList">제출</a></button>
	
                  </div>
            
				<!-- x-content -->
			</div>		
		
	</div>
					<!-- /page content -->
	</div>

		

		
	
	