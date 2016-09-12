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

<!-- Data tables -->
<link href="/stu/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/buttons.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/responsive.bootstrap.min.css" rel="stylesheet">
<link href="/stu/css/scroller.bootstrap.min.css" rel="stylesheet">
<!-- 화상 부트스트랩 -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">

<script type="text/javascript">
	function serverCam() {
	
	}
	function clientCam() {
	
	}
	function chat() {
		window.open("http://192.168.206.124:8888", "채팅",
				"width=450, height=450");
	}
</script>

<style>
.local-video {
	width: 80px;
	height: 60px;
	z-index: 10;
	position: relative;
	top: -100px;
	right: 30px;
}

.remote-video {
	margin-top: 20px;
	margin-bottom: 20px;
	width: 320px;
	height: 240px;
}
</style>
<div class="row">
	<!-- 사이버 상담실 ( 화상 상담 ) -->
	<table id="datatable"
		class="table table-striped jambo_table bulk_action">
		<thead>
			<tr>
				<th>방법</th>
				<th>구분</th>
				<th>교수명</th>
				<th>일자</th>
				<th>시</th>
				<th>상태</th>
				<th>입장</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="adviceVO" items="${adviceList}">
			<tr>
				<td>${adviceVO.ad_way }</td>
				<td>${adviceVO.ad_purpose }</td>
				<td>${adviceVO.ad_pro_use_id }</td>
				<td>${adviceVO.ad_reqdate }</td>
				<td>${adviceVO.ad_time }</td>
				<td>${adviceVO.ad_stat }</td>
				<td>
					<c:choose>
					<c:when test="${adviceVO.ad_way eq '화상'}">
						<c:if test="${auth eq 'ROLE_PRO' }">
							<button type="button" class="btn btn-dark" onClick="serverCam();">입 장</button>
						</c:if>
						<c:if test="${auth eq 'ROLE_STU' }">
							<button type="button" class="btn btn-dark" data-toggle="modal" data-target="#myModal">입 장</button>
						</c:if>
					</c:when>
					<c:when test="${adviceVO.ad_way eq '채팅'}">
						<button type="button" class="btn btn-dark" onClick="chat();">입 장</button>
					</c:when>
					<c:when test="${adviceVO.ad_way eq '방문'}">
					
					</c:when>
					</c:choose>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div class="x_panel_big">
		<div class="x_title">
			<h2>&nbsp;&nbsp;</h2>
			<div class="clearfix"></div>
		</div>


		<div class="x_panel_big" style="float: left; width: 73%;">
			<div class="row">

				<div class="col-md-12">
					<h1 class="page-header">사이버 상담실</h1>
				</div>

				<div class="col-md-6" id="adviceRoom">
					
				</div>

				<div class="col-md-6"></div>

			</div>
		</div>

	</div>
	<div style="float: left; width: 2%;">
		<br>
	</div>
</div>


<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="title">화상상담</h4>
			</div>

			  <div class="container">
    <div class="row">

      <div class="col-md-12">
        <h1 class="page-header">사이버 상담실</h1>
      </div>
      
          <div class="col-md-6">
        <h2 class="h3">학생</h2>
        <h3 class="h4">화상 상담실 입장</h3>
        <form class="form-inline">
          <div class="form-group">
            <label class="sr-only" for="connectChannelId">Channel Id</label>
            <input class="form-control" type="text" id="connectChannelId" placeholder="상담실 코드" value="">
          </div>
          <button class="btn btn-default" id="connectChannel">
            <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> Connect Channel
          </button>
        </form>
        
        <div class="row">
          <div class="col-md-8">
            <div class="progress">
              <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;" id="receiveProgressbar">
              </div>
            </div>
          </div>
          <div class="col-md-2">
            <button class="btn btn-default" id="receive">
              <span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span> 파일받기
            </button>
          </div>
        </div>

        <video class="remote-video center-block" id="calleeRemoteVideo"></video>
        <video class="local-video pull-right" id="calleeLocalVideo"></video>

      </div>

    </div>
  </div>

  <!--<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>-->
  <!--<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>-->

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

  			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="close" onclick="close();">종료</button>
			</div>
		</div>
	</div>
</div>

<!-- Datatables -->
<script src="/stu/js/jquery.dataTables.min.js"></script>
<script src="/stu/js/dataTables.bootstrap.min.js"></script>
<script src="/stu/js/dataTables.buttons.min.js"></script>
<script src="/stu/js/buttons.bootstrap.min.js"></script>
<script src="/stu/js/buttons.flash.min.js"></script>
<script src="/stu/js/buttons.html5.min.js"></script>
<script src="/stu/js/buttons.print.min.js"></script>
<script src="/stu/js/dataTables.fixedHeader.min.js"></script>
<script src="/stu/js/dataTables.keyTable.min.js"></script>
<script src="/stu/js/dataTables.responsive.min.js"></script>
<script src="/stu/js/responsive.bootstrap.js"></script>
<script src="/stu/js/datatables.scroller.min.js"></script>
<script src="/stu/js/jszip.min.js"></script>
<script src="/stu/js/pdfmake.min.js"></script>
<script src="/stu/js/vfs_fonts.js"></script>