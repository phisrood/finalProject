function insertLB(form){
	if(result){
	document.lbInsertForm.method = "post";
	document.lbInsertForm.action = "/pro/crsesBookInsert";
	document.lbInsertForm.submit();
	}else{
		alert("학수번호가 올바르지 않습니다");
	}
};