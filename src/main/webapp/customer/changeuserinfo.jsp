<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>

 <div>
    <table align="center"><tr><td> <img src="userimg/e16b70fc.jpg"/></td></tr></table>
    <table align="center">
    <form action="userchange?userid=<s:property value="id"/>">
		<s:iterator value="#session.list_user">
		<tr><td>用户名：</td><td><input name="username" value="<s:property value="userName"/>" /></td></tr>
        <tr><td>密码：</td><td><input name="userpwd" value="<s:property value="userPwd"/>" /></td></tr>
		<tr><td>邮件：</td><td><input name="mail" value="<s:property value="userEmail"/>" /></td></tr>
		<tr><td>电话：</td><td><input name="tel" value="<s:property value="userTel"/>" /></td></tr>
		<tr><td>性别：</td><td><input name="sex" value="<s:property value="userSex"/>" /></td></tr>
        <tr><td>真实姓名：</td><td><input name="real" value="<s:property value="userRealName"/>" /></td></tr>
        <tr><td><input type="submit" value="修改" /></td><td><input type="reset" value="重置" /></td></tr>
		</s:iterator>
    </form>
	</table>
    </div>
<div><a href="javascript :history.back(-1)">返回</a></div>
</body>
</html>