<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<base href="<%=basePath%>"> 
<script type="text/javascript" src="utils.js"></script>  
<script type="text/javascript" src="regUser.js"></script>
<script type="text/javascript"></script>
</head>

<body>
<div>
<h3>填写注册信息（*项为必填项）</h3>
<form action="register.action">
<table>
<tr>
<td>用户名</td><td><input type="text" name="username" id="username" onblur="validate(this)" />*<span id="checkuser"></span></td>
</tr>
<tr>
<td>密码</td><td><input type="password" name="password" id="password" />*</td>
</tr>
<tr>
<td>重复密码</td><td><input type="password" name="repassword" id="repassword" onblur="chkrepwd()" />*<span id="checkpwd"></span></td>
</tr>
<tr>
<td>邮箱</td><td><input type="text" name="email" id="email" onblur="chkmail(this)" />*<span id="checkmail"></span></td>
</tr>
<tr>
<td>性别</td><td><input type="radio" name="sex" id="sex" value="a" />男<input type="radio" name="sex1" id="sex" value="b" />女</td>
</tr>
<tr>
<td>电话</td><td><input type="text" name="tel" id="tel" size="11" />*</td>
</tr>
<tr>
<td>真实姓名</td><td><input type="text" name="realname" id="realname" />*</td>
</tr>
<tr>
<td>属于饭店的编号</td><td><select name="resnum" id="resnum">
							<option value="10001">10001 姥姥家</option>
                            <option value="10002">10002 来地方</option>
                            <option value="10003">10003 好日子</option>
                            <option value="10004">10004 京桥日本料理</option>
                            <option value="10005">10005 御兰园铁板烧牛排馆</option>
                            <option value="10006">10006 盆盆香</option>
                         </select>(服务员选项)</td>
</tr>
<tr>
<td><input type="submit" value="注册" /></td><td><input type="reset" value="重置" />(服务员选项)</td>
</tr>
</table>
</form>
</div>
</body>
</html>