// JavaScript Document
function chkrepwd(){
	if(document.getElementById("password").value != document.getElementById("repassword").value){
		document.getElementById("repassword").value = "";
		document.getElementById("repassword").focus();
		document.getElementById("checkpwd").innerHTML="两次密码不一致！";
		return false;
	}
}
function chkmail(str){
	var strReg=""; 
	var r; 
	var strText=document.all(str).value; 
	//strReg=/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/i; 
	strReg=/^\w+((-\w+)|(\.\w+))*\@{1}\w+\.{1}\w{2,4}(\.{0,1}\w{2}){0,1}/ig; 
	r=strText.search(strReg); 
	if(r==-1) { 
	alert("邮箱格式错误!"); 
	document.all(str).focus(); 
	} 
}