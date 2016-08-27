<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<!-- 교과목수강명단조회 -->

	<div class="row">

	<!-- page content -->
	
	
		<div class="x_panel">
		
			<div class="x_title">
				<h2>
					<i class="fa fa-calendar"></i> 교과목수강명단조회
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
                          <th>학수번호</th>
                          <th>교과목명</th>
                          <th>개설학과</th>
                          <th>분반</th>
                          <th>학점</th>
                          <th>이수구분</th>
                          <th>교번</th>
                          <th>담당교수</th>
                          <th>비고</th>
                          <th>수강생보기</th>
                        </tr>
                      </thead>


                      <tbody>
                        <tr>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>컴퓨터공학과</td>
                          <td>01</td>
                          <td>3</td>
                          <td>전공</td>
                          <td>1074</td>
                          <td>누군가</td>
                          <td></td>
                          <td><button type="button" class="btn btn-info btn-xs">수강생명단</button></td>
                        </tr>
                        <tr>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>컴퓨터공학과</td>
                          <td>01</td>
                          <td>3</td>
                          <td>전공</td>
                          <td>1074</td>
                          <td>누군가</td>
                          <td></td>
                          <td><button type="button" class="btn btn-info btn-xs">수강생명단</button></td>
                        </tr>
                        <tr>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>컴퓨터공학과</td>
                          <td>01</td>
                          <td>3</td>
                          <td>전공</td>
                          <td>1074</td>
                          <td>누군가</td>
                          <td></td>
                          <td><button type="button" class="btn btn-info btn-xs">수강생명단</button></td>
                        </tr>
                        <tr>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>컴퓨터공학과</td>
                          <td>01</td>
                          <td>3</td>
                          <td>전공</td>
                          <td>1074</td>
                          <td>누군가</td>
                          <td></td>
                          <td><button type="button" class="btn btn-info btn-xs">수강생명단</button></td>
                        </tr>
                        <tr>
                          <td>21005</td>
                          <td>프로그래밍</td>
                          <td>컴퓨터공학과</td>
                          <td>01</td>
                          <td>3</td>
                          <td>전공</td>
                          <td>1074</td>
                          <td>누군가</td>
                          <td></td>
                          <td><button type="button" class="btn btn-info btn-xs">수강생명단</button></td>
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

		