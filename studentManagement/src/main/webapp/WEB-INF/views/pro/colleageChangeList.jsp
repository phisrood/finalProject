<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--==============================================================
 * 학적변동현황(학과)
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
    
    <!-- 학적변동현황: 학과 -->
			
           
            <div class="row">
            
              <div class="x_panel_big">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>학과생명단</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>이름</th>
                          <th>학년</th>
                          <th>학번</th>
                          <th>연락처</th>
                          <th>학적구분</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>1</td>
                          <td>이수정</td>
                          <td>4</td>
                          <td>20122750</td>
                          <td>010-1234-5678</td>
                          <td>재학</td>
                        </tr>
                        <tr>
                          <td>2</td>
                          <td>한돈희</td>
                          <td>4</td>
                          <td>20121234</td>
                          <td>010-1234-5678</td>
                          <td>재학</td>
                        </tr>
                        <tr>
                          <td>3</td>
                          <td>김양문</td>
                          <td>4</td>
                          <td>20124567</td>
                          <td>010-1234-5678</td>
                          <td>재학</td>
                        </tr>
                        <tr>
                          <td>4</td>
                          <td>이건원</td>
                          <td>4</td>
                          <td>20124565</td>
                          <td>010-1234-5678</td>
                          <td>재학</td>
                        </tr>
                        <tr>
                          <td>5</td>
                          <td>박진성</td>
                          <td>4</td>
                          <td>20121569</td>
                          <td>010-1234-5678</td>
                          <td>재학</td>
                        </tr>
                        <tr>
                          <td>6</td>
                          <td>조현욱</td>
                          <td>4</td>
                          <td>20124550</td>
                          <td>010-1234-5678</td>
                          <td>재학</td>
                        </tr>
                       
                        
                      </tbody>
                    </table>
                  </div>
                </div>
                
                 <div class="x_panel">
                  <div class="x_title">
                    <h2>학적변동현황</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped jambo_table bulk_action">
                      <thead>
                        <tr>
                          <th>NO</th>
                          <th>신청일자</th>
                          <th>변동구분</th>
                          <th>취소구분</th>
                          <th>시작일자</th>
                          <th>종료예정일자</th>
                          <th>변동사유</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>신입학</td>
                          <td></td>
                          <td>2012/03/02</td>
                          <td>2012/03/02</td>
                          <td>입학</td>
                        </tr>
                        <tr>
                          <td>1</td>
                          <td>2012/03/02</td>
                          <td>일반휴학</td>
                          <td></td>
                          <td>2012/03/02</td>
                          <td>2012/03/02</td>
                          <td>개인사정</td>
                        </tr>
                        
                      </tbody>
                    </table>
                  </div>
                </div>
                
              </div>
      
              </div>
       
   