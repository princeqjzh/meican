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
<title>无标题文档</title>
<base href="<%=basePath%>">
<style>
body{
	background-image:url(manager/img/bg03.jpg);
	background-repeat:repeat-x;
	background-repeat:repeat;
}
a{
	text-decoration:none;
}
span{
	text-align:center;
	color:#FFF;}
table tr td{
	color:#FFF;}
</style>
</head>

<body>
<div><h1 align="center" style="color:#FFF;">${sessionScope.res_name}</h1><h3 style="color:#FFF;">${sessionScope.user}</h3></div>
<div style="color:#FFF;"><a href="manager/manager_add_list.jsp/"><font color="#FFFFFF">添加新菜</font></a></div>
<table class="tabl" align="center" border="1">
<tr>
	<td>编号</td>
    <td>菜名</td>
    <td>价格</td>
    <td>菜类别</td>
    <td>折扣</td>
    <td>图片</td>
    <td>备注</td>
</td>
<s:iterator value="#session.list_menu">
<tr>
	<td><s:property value="food_num"/></td>
    <td><s:property value="food_name"/></td>
    <td><s:property value="menu_price"/></td>
    <td><s:property value="menu_classes"/></td>
    <td><s:property value="menu_discount"/></td>
    <td><img src="menu/<s:property value="food_img"/>"/></td>
    <td><a href="changemanager?food_id=<s:property value="food_id"/>"><font color="#FFFFFF">更改</font></a>&nbsp;<a href="deletemanager?food_num=<s:property value="food_num"/>"><font color="#FFFFFF">删除</font></a></td>
</tr>
</s:iterator>
</table>
<div align="center" style="color:#FFF;">
<span>&nbsp;<a href="manager.action?page=1"><font color="#FFFFFF">首页</font></a>&nbsp;</span>
<span>&nbsp;<a href="manager.action?page=1"><font color="#FFFFFF">上一页</font></a>&nbsp;</span>
<span>&nbsp;<a href="manager.action?page=2"><font color="#FFFFFF">下一页</font></a>&nbsp;</span>
<span>&nbsp;<a href="manager.action?page=2"><font color="#FFFFFF">尾页</font></a>&nbsp;</span>
</div>
</body>
</html>