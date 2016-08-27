<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <!-- 학과정보관리 -->
			
           
            <div class="row">
            
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>학과정보관리</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div style="text-align:right;">
				<button type="button" class="btn btn-dark">등록</button>
				<button type="button" class="btn btn-dark" >수정</button>
				<button type="button" class="btn btn-dark">삭제</button>
				</div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>구분</th>
                          <th>NO</th>
                          <th>학과코드</th>
                          <th>학과명</th>
                          <th>학과명(영문)</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td><input type="checkbox"></td>
                          <td>1</td>
                          <td>002</td>
                          <td>컴퓨터공학과</td>
                          <td>Computer Engineering</td>
                         
                        </tr>
                        <tr>
                          <td><input type="checkbox"></td>
                          <td>1</td>
                          <td>002</td>
                          <td>컴퓨터공학과</td>
                          <td>Computer Engineering</td>
                        </tr>
                        <tr>
                          <td><input type="checkbox"></td>
                          <td>1</td>
                          <td>002</td>
                          <td>컴퓨터공학과</td>
                          <td>Computer Engineering</td>
                        </tr>
                        <tr>
                         <td><input type="checkbox"></td>
                          <td>1</td>
                          <td>002</td>
                          <td>컴퓨터공학과</td>
                          <td>Computer Engineering</td>
                        </tr>
                        
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
       
              
              </div>
       
          
   