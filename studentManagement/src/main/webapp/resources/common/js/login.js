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