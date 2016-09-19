function insertLB(form){
	if($("#lb_completeKind :selected").val()=='none'){
		alert("이수구분을 선택하세요");
	}else if(result){
	document.lbInsertForm.method = "post";
	document.lbInsertForm.action = "/pro/crsesBookInsert";
	document.lbInsertForm.submit();
	}else{
		alert("학수번호가 올바르지 않습니다");
	}
};
function updateCrsesBook(lb_no){
	location.href="/pro/crsesBookUpdatePage?lb_no="+lb_no;
}
function updateLB(form){
	if($("#lb_completeKind :selected").val()=='none'){
		alert("이수구분을 선택하세요");
	}else{
		document.lbUpdateForm.mehtod="get";
		document.lbUpdateForm.action = "/pro/crsesBookUpdate";
		document.lbUpdateForm.submit();
	}
}
function openLecture(lb_no){
	location.href="/pro/openLecturePage?lb_no="+lb_no;
}
function insertLecture(form){
	/*$.ajax({
		url:'/pro/pro_timeCheck',
		mehtod:'get',
		type:'json',
		data: {'pro_id':$("#pro_id").val()},
		success:function(data){
			
		},error:function(){
			alert('에럼');
		}
	});*/
	document.insertLectureForm.method="get";
	document.insertLectureForm.action="/pro/openLecture";
	document.insertLectureForm.submit();
	
}
function updateSyl(lec_no){
	location.href='/pro/updateSyl?lec_no='+lec_no;
};
function toPdf(){
	document.pdfForm.method="post";
	document.pdfForm.action="/pro/toPdf";
	document.pdfForm.target="_blank";
	document.pdfForm.submit(); 
}