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
		<title>个人信息</title>
       
		<base href="<%=basePath%>">
         <link rel="stylesheet" href="customer/css/style.css" type="text/css" media="all" />
    <script>

    </script>
	</head>

	<body>
    <div id="daohang" align="center">
<ul>
<li><a href="restaurant/indexres.jsp">首页</a></li>
<li><a href="userorder.action?username=${sessionScope.user}">我的订单</a></li>
<li><a href="customer/changeuserinfo.jsp">修改信息</a></li>
<li><a href="userlogin/login.jsp">注销登录</a></li>
</ul>
</div>

   <div>
    <table align="center"><tr><td> <img src="userimg/e16b70fc.jpg"/></td></tr></table>
    <table align="center">
		<s:iterator value="#request.list_user">
		<tr><td>用户名：</td><td><s:property value="userName"/></td></tr>
		<tr><td>邮件：</td><td><s:property value="userEmail"/></td></tr>
		<tr><td>电话：</td><td><s:property value="userTel"/></td></tr>
		<tr><td>性别：</td><td><s:property value="userSex"/></td></tr>
		</s:iterator>
	</table>
    </div>
	</body>
</html>