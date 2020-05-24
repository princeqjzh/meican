<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的订单</title>
<base href="<%=basePath%>">
<script type="text/javascript" src="list/lhgcalendar/lhgcore.js"></script>
<script type="text/javascript" src="list/lhgcalendar/lhgcalendar.js"></script>
<style>
body{
	background: url(list/img/bg03.jpg);
	background-repeat:repeat-x;
	text-align:center;
	color:#FFF;
}

div,span{
	font: "华文行楷";
	color:#FFF;
}
#load_msg{
	display:none;
	font-size:20px;
position: absolute;
top: 364px;
left: 36%;
	color:#FF0000;
}
#retn{
	text-decoration:none;
	color:#F63;
}
#sub{
	border:1px;
	float:left;
	margin-left:500px;
	margin-top:50px;
	border-color:#F90;
}
#res{
	border:1px;
	float:right;
	margin-right:300px;
	padding-left:30px;
	margin-top:50px;
	border-color:#F90;
}
a{
	color:#FFF;
	text-decoration:none;
}
</style>
</head>

<body>
<!--${requestScope.res_num}-->
<div><span><a href="restaurant.action">&nbsp;首页&nbsp;&nbsp;</a></span><span><a href="userinfo?username=${sessionScope.user}">&nbsp;${sessionScope.user}&nbsp;&nbsp;</a></span><span><a href="userorder.action?username=${sessionScope.user}">&nbsp;我的订单&nbsp;&nbsp;</a></span>
<span><a href="userlogin/login.jsp">&nbsp;注销登录&nbsp;&nbsp;</a></span></div>
<div><h1>确认订单信息</h1></div>
<div>用户名：${requestScope.username}</div>
<div>饭店名：${requestScope.res_name}</div>
<div>订单号：${requestScope.ordernum}</div>

<div>金额：${requestScope.total}</div>
<div><h2>详细订单信息</h2></div>
<form action="order.action" onsubmit="showLoading();">
	<div><span>用餐人数：</span><input type="text" id="people" name="people" size="10px;" /></div>
	<div><span>用餐时间：</span><input type="text" id="c7" name="time" onClick="J.calendar.get();"/></div>
	<div style="position:absolute;"><span id="sub"><input type="submit" style="width:100px; height:30px; background: url(list/img/btn.png);" onclick="qwe()"/></span>
	<span id="res"><input type="reset" style="width:100px; height:30px; background: url(list/img/btn.png);"/></span></div>
	<div align="center"><a href="menu?${requestScope.res_num}" style="float: right;"><span id="retn">返回</span></a></div>
</form>
<div id="load_msg">iloa</div>
<script type="text/javascript">
function showLoading(){
	var msg_dom = document.getElementById("load_msg");
	msg_dom.style.display="block";
	function time(msg,l){
		msg.innerText = '慢事务开始执行，已经运行了'+l.toString()+'秒';
		setTimeout(function(){
			time(msg,l+1);
		},1*1000)
	}
	time(msg_dom,0);
}
</script>

</body>
<script>
function qwe(){
	if(document.getElementById(people).value == null){
		alert("人数不能为空！");
		document.getElementById(people).focus();
	}
	if(document.getElementById(c7).value == null){
		alert("时间不能为空！");
		document.getElementById(c7).focus();
	}
}
</script>
</html>
