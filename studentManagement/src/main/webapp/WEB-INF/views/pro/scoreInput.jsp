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



<!-- 수강생성적조회 -->

	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-calendar"></i> 수강생성적조회
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
                        
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">교과목명</label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                           <select class="form-control">
		                        <option>데이터통신</option>
		                        <option>센서네트워크</option>
		                        <option>전파공학</option>
		                        <option>프로그래밍</option>
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
                          <th>학기</th>
                          <th>학과</th>
                          <th>학번</th>
                          <th>이름</th>
                          <th>학수번호</th>
                          <th>과목</th>
                          <th>이수구분</th>
                          <th>학점</th>
                          <th>점수</th>
                          <th>등급</th>
                          <th>평점</th>
                          
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>컴퓨터공학과</td>
                          <td>20122750</td>
                          <td>이수정</td>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>89</td>
                          <td>B+</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>컴퓨터공학과</td>
                          <td>20122750</td>
                          <td>이수정</td>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>89</td>
                          <td>B+</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>컴퓨터공학과</td>
                          <td>20122750</td>
                          <td>이수정</td>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>89</td>
                          <td>B+</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>컴퓨터공학과</td>
                          <td>20122750</td>
                          <td>이수정</td>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>89</td>
                          <td>B+</td>
                          <td>3.5</td>
                        </tr>
                        <tr>
                          <td>2012</td>
                          <td>1</td>
                          <td>컴퓨터공학과</td>
                          <td>20122750</td>
                          <td>이수정</td>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>전공</td>
                          <td>3</td>
                          <td>89</td>
                          <td>B+</td>
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

		