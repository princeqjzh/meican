<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

</head>

<body>
<div><span><a href="restaurant.action">首页</a></span><span><a href="userinfo?username=${sessionScope.user}">${sessionScope.user}</a></span><span><a href="userorder.action?username=${sessionScope.user}">我的订单</a></span>
<span><a href="userlogin/login.jsp">注销登录</a></span></div>
<div><h1>${sessionScope.res_name}</h1><span style="float:right;"><h4>${sessionScope.user}</h4></span></div>
<div>&nbsp;<br /></div>
<form action="appraise_res.action">
<div><span>价格评分</span>
	<select name="prise_star" size="1">
    	<option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
    </select>
</div>
<div>
<span>好吃度评分</span>
	<select name="deli_star" size="1">
    	<option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
    </select>
</div>
<div>
<span>服务态度评分</span>
	<select name="server_star" size="1">
    	<option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
    </select>
</div>
<div>
<span>总&nbsp;&nbsp;&nbsp;&nbsp;评&nbsp;&nbsp;&nbsp;&nbsp;分</span>
	<select name="star" size="1">
    	<option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
    </select>
</div>
<div><textarea name="content" onkeyup="checkLen(this)"></textarea>
<div>您还可以输入 <span id="count">200</span> 个文字</div></div>
<div><input type="submit" /><input type="reset" /></div>
</form>
</body>
<script type="text/javascript">
function checkLen(obj) 
{
var maxChars = 200;//最多字符数
if (obj.value.length > maxChars)
obj.value = obj.value.substring(0,maxChars);
var curr = maxChars - obj.value.length;
document.getElementById("count").innerHTML = curr.toString();
}
</script>
</html>