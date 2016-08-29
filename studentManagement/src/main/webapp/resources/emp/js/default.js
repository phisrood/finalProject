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