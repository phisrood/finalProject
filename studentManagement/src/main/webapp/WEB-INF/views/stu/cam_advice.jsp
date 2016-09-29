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
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!-- 화상 부트스트랩 -->
<!-- <link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
 -->


<style>
.local-video {
	width: 20%;
	height: 20%;
	z-index: 10;
	position: relative;
	top: -100px;
	right: 30px;
}

.remote-video {
	margin-top: 20px;
	margin-bottom: 20px;
	margin-left: 20px;
	margin-right: 5px;
	width: 90%;
	height: 30%;
}
</style>

	<script type="text/javascript">
		function pagereload() {
			location.reload();
		}

		function serverCam() {

		}
		function clientCam() {

		}
		function chat(ad_no) {
			$.ajax({
		    	  url : "/stu/sendChannelId",
		    	  method : "get",
		    	  data : { 		  
		    	  "channelId":"noId",
		    	  "ad_no" :ad_no,
		    	  "flag" : "close"
		    	  },
		    	  success : function(){
		    	  
		    	  }
		      });
			
			 var url = "http://192.168.206.102:8888?name=<c:out value="${userName}" />";
			 
			 userwidth = (screen.width/2);
			 userheight = (screen.height/2);
			 
			 wLeft = window.screenLeft ? window.screenLeft : window.screenX;
			 wTop = window.screenTop ? window.screenTop : window.screenY;
			
			 var left = wLeft + (window.innerWidth / 2) - (userwidth / 2);
			 var top = wTop + (window.innerHeight / 2) - (userheight / 2);
			 
			window.open(url, "채팅","width=435px, height=365px,"+'top=' + top + ', left=' + left +'');
		}
		function noIng() {
			alert("진행중일때만 입장하실 수 있습니다.");
		}
		function ing() {
			var va = $("#funk").val();
			$("#connectChannelId").val(va);
		}
	</script>

<div class="row">
	<!-- 사이버 상담실 ( 화상 상담 ) -->
	<div class="x_panel_big">  
		<div class="x_title">
		<h2><i class="fa fa-comments-o"></i> 사이버 상담실</h2>
			<div class="clearfix"></div>
		</div>		  
		<button type="button" class="btn btn-round btn-danger" onClick="pagereload();">새로고침</button>
				<table id="datatable" class="table table-striped jambo_table bulk_action">
				<thead>
					<tr>  
						<th>상담번호</th>
						<th>방법</th>
						<th>구분</th>
						<th>교수명</th>
						<th>일자</th>
						<th>시간</th>
						<th>상태</th>
						<th>입장</th>
					</tr>
				</thead>
		
				<tbody id="fun">
					<c:forEach var="adviceVO" items="${adviceList}">
					<tr>
						<td>${adviceVO.ad_no }</td>
						<td>${adviceVO.ad_way }</td>
						<td>${adviceVO.ad_purpose }</td>
						<td>${adviceVO.use_name }</td>
						<td>${adviceVO.ad_reqdate }</td>
						<td>${adviceVO.ad_time } 시</td>
						<td>${adviceVO.ad_stat }</td>
						<td>  
							<c:choose>
							<c:when test="${adviceVO.ad_way eq '화상'}">
								<c:if test="${auth eq 'ROLE_PRO' }">
									<button type="button" class="btn btn-dark" onClick="serverCam();">입 장</button>
								</c:if>
								<c:if test="${auth eq 'ROLE_STU' }">
									<c:choose>
										<c:when test="${adviceVO.ad_stat eq '진행중'}">
											<button type="button" class="btn btn-dark" id="funk" value="${adviceVO.ad_channel }"  onclick="ing();" data-toggle="modal" data-target="#myModal">입 장</button>		
										</c:when>
										<c:otherwise>
											<button type="button" class="btn btn-dark" onclick="noIng();">입 장</button>
										</c:otherwise>
									</c:choose>
								</c:if>
							</c:when>
							<c:when test="${adviceVO.ad_way eq '채팅'}">
								<c:if test='${adviceVO.ad_stat eq "진행중"}'>
									<button type="button" class="btn btn-dark" onClick='chat("${adviceVO.ad_no }")'>입 장</button>
								</c:if>
								<c:if test='${adviceVO.ad_stat eq "대기"}'>
									<button type="button" class="btn btn-dark" onclick="noIng();">입 장</button>
								</c:if>
							</c:when>
							<c:when test="${adviceVO.ad_way eq '방문'}">
							
							</c:when>
							</c:choose>
						</td>
						
					</tr>
					</c:forEach>
				</tbody>
				</table>
				<div class="col-md-6"></div>
		</div>
	</div>
	<div style="float: left; width: 2%;">
		<br>
	</div>


<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="title">사이버 상담실</h4>
			</div>

			  <div class="container">
    <div class="row">
    
      	<form class="form-inline">
	      <div class="col-md-12">
	        <h1 class="page-header">화상상담</h1>  
	        <br>    
	      </div>
     	</form>
 	
          <div class="col-md-6" style="width:90%;height:30%;">
   		
   		<div style="margin:20px;">
    	  <div class="col-md-6">
        <h2 class="h3">학생</h2>
        <h3 class="h4">화상 상담실 입장</h3>
        
          <div class="form-group">
            <label class="sr-only" for="connectChannelId">Channel Id</label>
            <input class="form-control" type="text" id="connectChannelId" placeholder="상담실 코드" style="width:220px;" readonly>
            <button class="btn btn-dark" id="connectChannel">
            	상담실 입장
            </button>
          </div>
            
        <div class="row">
          <div class="col-md-8">
            <div class="progress">
              <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;" id="receiveProgressbar">
              </div>
            </div>
          </div>  
          
          <div>      
            <button class="btn btn-dark" id="receive">파일받기</button>
          </div>
          
        </div>
		
        <video class="remote-video center-block" id="calleeRemoteVideo" ></video>
        <video class="local-video pull-right" id="calleeLocalVideo" muted></video>

      </div>

    </div>
  </div>  
  			<div class="modal-footer">
				<button type="button" class="btn btn-dark" data-dismiss="modal" id="close" onclick="close();">종료</button>
			</div>
		</div>
	</div>
</div>

  <script src="//www.playrtc.com/sdk/js/playrtc.js"></script>
 <script>
    'use strict';

    var createChannelButton = document.querySelector('#createChannel');
    var createChannelIdInput = document.querySelector('#createChannelId');
    var sendButton = document.querySelector('#send');
    var selectFile = document.querySelector('#seclectFile');
    var file = null;
    var appCaller;

    appCaller = new PlayRTC({
      projectKey: '0e3823c3-2e00-4ed9-a38d-ab113f07eab1',
      localMediaTarget: 'callerLocalVideo',
      remoteMediaTarget: 'callerRemoteVideo'
    });

    appCaller.on('connectChannel', function (channelId) {
      createChannelIdInput.value = channelId;
    });

    createChannelButton.addEventListener('click', function (event) {
      event.preventDefault();
      appCaller.createChannel();
    }, false);

    sendButton.addEventListener('click', function (event) {
      var data = selectFile.files[0];

      event.preventDefault();
      if (!data) {
        return false;
      };
      appCaller.sendFile(data);
      selectFile.value = '';
      return false;
    }, false);
  </script>
  <script>
    'use strict';
    
    var connectChannelIdInput = document.querySelector('#connectChannelId');
    var connectChannelButton = document.querySelector('#connectChannel');
    var receiveButton = document.querySelector('#receive');
    var appCallee;  
    
    appCallee = new PlayRTC({
      projectKey: '0e3823c3-2e00-4ed9-a38d-ab113f07eab1',
      localMediaTarget: 'calleeLocalVideo',
      remoteMediaTarget: 'calleeRemoteVideo'
    });

    appCallee.on('addDataStream', function (pid, uid, dataChannel) {
      dataChannel.on('message', function (message) {
        if (message.type === 'binary') {
          alert('A file received. Please save the file.');
          file = message;
        }
      });

      dataChannel.on('error', function (event) {
        alert('ERROR. See the log.');
      });
    });

    connectChannelButton.addEventListener('click', function (event) {
      var channelId = connectChannelIdInput.value;

      event.preventDefault();
      if (!channelId) {
        return;
      }
      appCallee.connectChannel(channelId);
    }, false);

    receiveButton.addEventListener('click', function (event) {
      event.preventDefault();
      if (file) {
        PlayRTC.utils.fileDownload(file.blob, file.fileName);
      }
    }, false);
  </script>
