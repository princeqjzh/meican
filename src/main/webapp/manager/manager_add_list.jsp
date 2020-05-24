<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加菜单</title>
</head>

<body>
<div><h2>${sessionScope.res_name}</h2><h4>${sessionScope.user}</h4></div>
<form action="addmanager.action">
<table>
<tr>
<td>菜名</td><td><input type="text" name="foodname" /></td>
</tr>
<tr>
<td>菜编号</td><td><input type="text" name="foodnum" /></td>
</tr>
<tr>
<td>价格</td><td><input type="text" name="foodprice" /></td>
</tr>
<tr>
<td>类别</td>
<td><input type="radio" name="classes" value="0"/>0<input type="radio" name="classes" value="1" />1<input type="radio" name="classes" value="2" />2<input type="radio" name="classes" value="3" />3<input type="radio" name="classes" value="4" />4</td>
</tr>
<tr>
<td>菜单编号</td><td><input type="text" name="menunum" /></td>
</tr>
<tr>
<td>图片</td><td><input type="file" name="foodimg" /></td>
</tr>
<tr>
<td><input type="submit" value="添加"/></td><td><input type="reset" value="重置"/></td>
</tr>
</table>
</form>
</body>
</html>