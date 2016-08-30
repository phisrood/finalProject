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

function go_searchPwd(searchPwdform){
	if(document.searchPwdform.id.value=""){
		alert("학번을 입력해주세요.");
		document.searchPwdform.id.focus();
	}else if(document.searchPwdform.birth.value=""){
		alert("생년월일을 입력해주세요.")
		document.searchPwdform.birth.focus();
	}else{
		document.searchPwdform.method="post";
		document.searchPwdform.action="/common/pwdSearch";
		document.searchPwdform.submit();
	} 
	
}