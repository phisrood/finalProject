function go_login(){  
	if (document.formm.id.value == "") {
	    alert("아이디를 입력하여 주세요.");
	    document.formm.id.focus();
	}else if(document.formm.password.value==""){
		alert("패스워드를 입력하여 주세요.");
		document.formm.password.focus();
	}else{
		document.formm.action="/common/login";
		document.formm.submit();   
	}    
}      

function go_searchPwd(){
	if(document.searchPwd_form.id.value=""){
		alert("학번을 입력해주세요.");
		document.searchPwd_form.id.focus();
	}else if(document.searchPwd_form.birth.value=""){
		alert("생년월일을 입력해주세요.")
		document.searchPwd_form.birth.focus();
	}else{
		document.searchPwd_form.method="post";
		document.searchPwd_form.action="/common/pwdSearch";
		document.searchPwd_form.submit();
	}
	
}