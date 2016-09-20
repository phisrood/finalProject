function insertStu(form) {
	var fileLocation = form.fileup.value;
	var extension = $("#fileup").val();
	extension =extension.slice(extension.indexOf('.')+1).toLowerCase();
	if(extension != 'xls' && extension != 'xlsx'){
		alert('엑셀파일만 가능합니다');
	}else if (fileLocation == "" || fileLocation == null) {
		alert("파일을 선택해주세요");
	} else {
		form.method="post";
		form.action="/emp/stuInfoInsert";
		form.submit();
	}
}

function insertPro(proInsertForm) {
	if(document.proInsertForm.name.value==""){
		alert('이름을 입력해주세요');
		document.proInsertForm.name.focus();
	}else if(document.proInsertForm.pro_engname.value==""){
		alert('영문명을 입력해주세요');
		document.proInsertForm.pro_engname.focus();
	}else if(document.proInsertForm.pro_dep_no.value==""){
		alert('학과를 선택해주세요');
		document.proInsertForm.pro_dep_no.focus();
	}else if(document.proInsertForm.pro_birth.value==""){
		alert('생년월일을 입력해주세요');
		document.proInsertForm.pro_birth.focus();
	}else if(document.proInsertForm.pro_phone.value==""){
		alert('핸드폰번호를 입력해주세요');
		document.proInsertForm.pro_phone.focus();
	}else if(document.proInsertForm.pro_zipcode.value==""){
		alert('우편번호를 입력해주세요');
		document.proInsertForm.pro_zipcode.focus();
	}else if(document.proInsertForm.pro_add.value==""){
		alert('주소를 입력해주세요');
		document.proInsertForm.pro_add.focus();
	}else if(document.proInsertForm.pro_adddetail.value==""){
		alert('상세주소를 입력해주세요');
		document.proInsertForm.pro_adddetail.focus();
	}else if(document.proInsertForm.pro_bltype.value==""){
		alert('혈액형을 선택해주세요');
		document.proInsertForm.pro_bltype.focus();
	}else if(document.proInsertForm.pro_hob.value==""){
		alert('취미를 입력해주세요');
		document.proInsertForm.pro_hob.focus();
	}else if(document.proInsertForm.pro_gender.value==""){
		alert('성별을 선택해주세요');
		document.proInsertForm.pro_gender.focus();
	}else if(document.proInsertForm.pro_email.value==""){
		alert('이메일을 입력해주세요');
		document.proInsertForm.pro_email.focus();
	}else if(document.proInsertForm.pro_regno1.value==""){
		alert('주민번호앞자리를 입력해주세요');
		document.proInsertForm.pro_regno1.focus();
	}else if(document.proInsertForm.pro_regno2.value==""){
		alert('주민번호뒷자리를 입력해주세요');
		document.proInsertForm.pro_regno2.focus();
	}else{
		document.proInsertForm.method="post";
		document.proInsertForm.action="/emp/proInfoInsert";
		document.proInsertForm.submit();
		
	}  
}

function updatePro(proUpdateForm) {
	if(document.proUpdateForm.name.value==""){
		alert('이름을 입력해주세요');
		document.proUpdateForm.name.focus();
	}else if(document.proUpdateForm.pro_engname.value==""){
		alert('영문명을 입력해주세요');
		document.proUpdateForm.pro_engname.focus();
	}else if(document.proUpdateForm.pro_position.value==""){
		alert('직책을 선택해주세요');
		document.proUpdateForm.pro_position.focus();
	}else if(document.proUpdateForm.pro_dep_no.value==""){
		alert('학과번호를 선택해주세요');
		document.proUpdateForm.pro_dep_no.focus();
	}else if(document.proUpdateForm.pro_birth.value==""){
		alert('생년월일을 입력해주세요');
		document.proUpdateForm.pro_birth.focus();
	}else if(document.proUpdateForm.pro_phone.value==""){
		alert('핸드폰번호를 입력해주세요');
		document.proUpdateForm.pro_phone.focus();
	}else if(document.proUpdateForm.pro_zipcode.value==""){
		alert('우편번호를 입력해주세요');
		document.proUpdateForm.pro_zipcode.focus();
	}else if(document.proUpdateForm.pro_add.value==""){
		alert('주소를 입력해주세요');
		document.proUpdateForm.pro_add.focus();
	}else if(document.proUpdateForm.pro_adddetail.value==""){
		alert('상세주소를 입력해주세요');
		document.proUpdateForm.pro_adddetail.focus();
	}else if(document.proUpdateForm.pro_bltype.value==""){
		alert('혈액형을 선택해주세요');
		document.proUpdateForm.pro_bltype.focus();
	}else if(document.proUpdateForm.pro_hob.value==""){
		alert('취미를 입력해주세요');
		document.proUpdateForm.pro_hob.focus();
	}else if(document.proUpdateForm.pro_gender.value==""){
		alert('성별을 선택해주세요');
		document.proUpdateForm.pro_gender.focus();
	}else if(document.proUpdateForm.pro_email.value==""){
		alert('이메일을 입력해주세요');
		document.proUpdateForm.pro_email.focus();
	}else if(document.proUpdateForm.pro_regno1.value==""){
		alert('주민번호앞자리를 입력해주세요');
		document.proUpdateForm.pro_regno1.focus();
	}else if(document.proUpdateForm.pro_regno2.value==""){
		alert('주민번호뒷자리를 입력해주세요');
		document.proUpdateForm.pro_regno2.focus();
	}else{
		document.proUpdateForm.method="post";
		document.proUpdateForm.action="/emp/proInfoUpdate";
		document.proUpdateForm.submit();
		
	}  
}
//수강편람 승인
function approve(){
	var checked= $(".checkLb:checked");
	var data=new Array();
	checked.each(function(){
		data.push($(this).val());
	});
	$.ajax({
		url : "/emp/crsesBookDecide",
		type: "post",
		data : {"data":data.toString()},
		dataType:"json",
		success:function(){
			location.href="/emp/crsesBookDecide";
		},
		error:function(){
			alert("에러얌");
		}
	});
}

//수강편람 반려
function disapprove(){
	var checked= $(".checkLb:checked");
	var data=new Array();
	checked.each(function(){
		data.push($(this).val());
	});
	$.ajax({
		url : "/emp/crsesBookDisapprove",
		type: "post",
		data : {"data":data.toString()},
		dataType:"json",
		success:function(){
			location.href="/emp/crsesBookDecide";
		},
		error:function(){
			alert("에러얌");
		}
	});
}
function updateSyl(lec_no){
	location.href='/emp/updateSyl?lec_no='+lec_no;
};
function toPdf(){
	document.pdfForm.method="post";
	document.pdfForm.action="/emp/classSYLtoPdf";
	document.pdfForm.target="_blank";
	document.pdfForm.submit(); 
}
