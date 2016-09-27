function updateSyl(lec_no){
	location.href='/stu/updateSyl?lec_no='+lec_no;
};
function toPdf(){
	document.pdfForm.method="post";
	document.pdfForm.action="/stu/toPdf";
	document.pdfForm.target="_blank";
	document.pdfForm.submit(); 
}
function toCerPdf(){
	document.pdfForm.method="get";
	document.pdfForm.action="/stu/attendCertificatePDF";
	document.pdfForm.target="_blank";
	document.pdfForm.submit(); 
}
function toGradePdf(){
	document.pdfForm.method="post";
	document.pdfForm.action="/stu/gradeCertificatePDF";
	document.pdfForm.target="_blank";
	document.pdfForm.submit(); 
}