<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<h2></h2>
 <s:iterator value="#request.list_menu">
 	<h3>编号：<s:property value="food_num"/></h3>
 	<p>名字：<s:property value="food_name"/></p>
    <p>价格：<s:property value="menu_price"/></p>
 </s:iterator>
</body>
</html>