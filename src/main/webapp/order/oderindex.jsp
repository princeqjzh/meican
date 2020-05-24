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
<style>
body{
	background: url(order/img/bg03.jpg);
	background-repeat: repeat-x;
	text-align: center;
	color: #FFF;
}
#lis{
	border:#FFF;
	border-bottom-width:medium;
	border-bottom-color:#FFF;
	border-bottom-style:outset;
	border-bottom-style:inset;
	color:#FFF;
}
a{
	color:#FFF;
	text-decoration:none;}

</style>
</head>

<body>
<!--${requestScope.res_num}-->
<div><span><a href="restaurant.action">&nbsp;首页&nbsp;&nbsp;</a></span><span><a href="userinfo?username=${sessionScope.user}">&nbsp;${sessionScope.user}&nbsp;&nbsp;</a></span><span><a href="userorder.action?username=${sessionScope.user}">&nbsp;我的订单&nbsp;&nbsp;</a></span>
<span><a href="userlogin/login.jsp">&nbsp;注销登录&nbsp;&nbsp;</a></span></div>
<div><span><h1 style="color:#FFF;">订单信息</h1></span><span><h4 style="color:#FFF;">${sessionScope.user}</h4></span></div>
<!--<img src='<s:property value="food_img"/>'/>-->
	<div>
        <s:iterator value="#session.order_list">
          <div id="lis">
        	<p><font color="#FFFFFF">订单号：<s:property value="order_num"/></font></p>
			<p><font color="#FFFFFF">日期：<s:property value="order_date"/></font></p>
            <p><font color="#FFFFFF">饭店：<s:property value="order_res"/></font></p>
            <p><font color="#FFFFFF">金额：<s:property value="order_mon"/></font></p>
            <p><font color="#FFFFFF"><a href="appraise.action?res_num=<s:property value="order_res_num"/>">评价我们。</a></font></p>
            <p><br/></p>
          </div>
        </s:iterator>
	</div>
	
</body>
</html>