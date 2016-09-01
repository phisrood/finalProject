function insertLB(form){
	if(result){
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
	document.lbUpdateForm.mehtod="get";
	document.lbUpdateForm.action = "/pro/crsesBookUpdate";
	document.lbUpdateForm.submit();
}