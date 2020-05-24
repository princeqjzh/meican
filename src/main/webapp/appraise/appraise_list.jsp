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
<title>查看评价</title>
<base href="<%=basePath%>">
</head>

<body>
<div>
<div><span><a href="restaurant.action">首页</a></span><span><a href="userinfo?username=${sessionScope.user}">${sessionScope.user}</a></span><span><a href="userorder.action?username=${sessionScope.user}">我的订单</a></span>
<span><a href="userlogin/login.jsp">注销登录</a></span></div>
<table>
<s:iterator value="#session.app_list">
	<tr>
    	<td><s:property value="app_username"/></td>
        <td><s:property value="app_content"/></td>
        <td><s:property value="app_star"/></td>
        <td><s:property value="app_delistar"/></td>
        <td><s:property value="app_pricestar"/></td>
        <td><s:property value="app_serverstar"/></td>
    </tr>
</s:iterator>
</table>

</div>
</body>
</html>