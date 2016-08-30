function insertStu(form) {
	var fileLocation = form.fileup.value;
	if (fileLocation == "" || fileLocation == null) {
		alert("파일을 선택해주세요")
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
	}else if(document.proInsertForm.pro_position.value==""){
		alert('직책을 선택해주세요');
		document.proInsertForm.pro_position.focus();
	}else if(document.proInsertForm.pro_dep_no.value==""){
		alert('학과번호를 선택해주세요');
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