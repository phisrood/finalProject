<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 학적변동현황(타학과)
 * @author 
 * @since  2016.08.25.
 * @version 1.0
 * @see
 * <pre>
 * << 개정이력(Modification Information) >>
 *    수정일       수정자          수정내용
 *    -------      -------     -------------------
 *    
 * Copyright (c) 2016 by DDIT  All right reserved
 * </pre>
===============================================================--%>


    
    <!-- 부/다전공 신청현황 && 승인반려: 타학과 -->
			
           
            <div class="row">
            
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>타학과 부/다전공 신청명단</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>이름</th>
                          <th>학번</th>
                          <th>연락처</th>
                          <th>학과</th>
                          <th>신청구분</th><!-- 신청/취소  -->
                        </tr>
                      </thead>


                      <tbody>
                        <c:forEach var="req" items="${reqList}" varStatus="index">
                        	<tr>
                        		<td>${index.count }</td>
                        		<td></td>
                        		<td>${req.sb_stud_use_id }</td>
                        		<td></td>
                        		<td></td>
                        		<td>신청</td>
                        	</tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                </div>
                <!-- 학생누르면 해당학생 부/다전공 신청서 나타남 -->
                 <div class="x_panel">
                  <div class="x_title">
                    <h2>상세내역</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>소속학과</th>
                          <th>학년</th>
                          <th>학번</th>
                          <th>전체이수학점</th>
                          <th>평점평균</th>  
                          <th>부/다 전공</th>  
                          <th>신청 및 취소 학과</th>  
                        </tr>
                      </thead>
                       <tbody>
                        <tr>
                          <td>1</td>
                          <td>정보통신공학과</td>
                          <td>4</td>
                          <td>20122750</td>
                          <td>70</td>
                          <td>3.5</td>
                          <td>부전공</td>
                          <td>전자공학과</td>
                        </tr>
                      </tbody>
                    </table>
                   <div class="col-md-9 col-sm-9 col-xs-12">
			                      <label class="control-label col-md-3 col-sm-3 col-xs-12">신청사유</label><br/>
			                      <textarea class="resizable_textarea form-control" placeholder="신청사유를 쓰시오"></textarea><br/>
			       </div>
                     <div style="text-align:right;">
					<button type="button" class="btn btn-dark" >승인</button>
					<button type="button" class="btn btn-dark">반려</button>
					</div>
			       
                  </div>
                  
                  
                  
                </div>
                
                
              </div>
      
              </div>
       
   