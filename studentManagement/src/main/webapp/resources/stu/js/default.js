function updateSyl(lec_no){
	location.href='/stu/updateSyl?lec_no='+lec_no;
};
function toPdf(){
	document.pdfForm.method="post";
	document.pdfForm.action="/stu/classSYLtoPdf?lec_no="+lec_no;
	document.pdfForm.target="_blank";
	document.pdfForm.submit(); 
}