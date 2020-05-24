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
</head>

<body>
<div>
<s:iterator value="#session.change_menu">
<form action="changemenu?<s:property value="food_id"/>">

	编号：<input name="food_num" value="<s:property value="food_num"/>" />
    名字：<input name="food_name" value="<s:property value="food_name"/>" />
    价格：<input name="menu_price" value="<s:property value="menu_price"/>" />
    类别：<!--<input name="menu_classes" value="<s:property value="menu_classes"/>" />-->
    折扣：<input name="menu_discount" value="<s:property value="menu_discount"/>" />
    <p>图片：<img src="menu/<s:property value="food_img"/>"/></p><input type="file" name="food_img" />
	<input type="submit" value="修改" /><a href="javascript :history.back(-1)">返回</a>
</form>
</s:iterator>
</div>
</body>
</html>