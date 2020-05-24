<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的订餐</title>
<style>
    *{padding:0px; margin:0px; list-style:none;}
    body{width:100%;margin:0px;padding:0px;background:url(pic/bg03.jpg);width:100%;height:100%}
    .top{width:960px;height:336px;margin:0 auto; background:url(pic/bg01s1.jpg) no-repeat; position:relative}
    .bottom{width:960px;height:305px;margin:0 auto; background:url(pic/bg02.jpg) no-repeat; position:relative}
    #username,#password,#userpwd,#validatecode{ position:absolute;top:206px;left:187px;width:193px;height:34px;border:0px;font-size:14px;line-height:30px;color:#666}
    #password,#userpwd{left:402px; z-index:2}
    #validatecode{left:618px; z-index:2;width:113px}
    #vcodesrc{ position:absolute;top:165px;left:616px; font-family:Arial}
    #userpwd{z-index:1;color:#333}
    #register_bt{position:absolute;top:207px;left:751px;width:102px;height:33px; background:transparent; z-index:3;border:0px; cursor:pointer}
    #login_bt{position:absolute;top:207px;left:621px;width:102px;height:33px; background:transparent; z-index:3;border:0px; cursor:pointer}
    .forget{color:#94adc3;position:absolute;top:247px;left:805px;font-size:12px; text-decoration:none}
    .forget1{color:#ff6600;position:absolute;top:247px;left:745px;font-size:12px; text-decoration:none}
    .item_list{position:absolute;top:70px;left:505px;width:300px;padding-top:20px;}
    ul,li{padding:0;margin:0; font-size:12px;list-style:none; border:0;font-weight:normal;}
    .item_list ul{width:100%}
    .item_list li{width:100%;line-height:24px;color:#fff;}
</style>

<script language="javascript" type="text/javascript">
function userValue(){
	document.getElementById(username).value ="";	
}
function hide_pw(){
	document.getElementById(password).value = "";
}
</script>
</head>
<body>
<div class="top">
<form name="userLoginActionForm" id="userLoginActionForm" method="post" action="login">
	<input type="text" autofocus="true" id="username" name="username" placeholder="账户..." maxlength="20" onfocus="userValue()"  />
    <input type="password" id="password" name="password" placeholder="密码..." onfocus="hide_pw()" />
    <input type="submit" value="" id="login_bt" name="login_bt" onclick="logincheck()"/>

    <a href="register.jsp"><input type="button" value="" id="register_bt" name="register_bt"/></a>
    <a href="3.jsp" class="forget">忘记密码？</a>
    <input type="hidden"  id="is_cs" name="is_cs" value="0" />
    <input type="hidden"  id="is_get" name="is_get" value="1" />
    <input type="hidden"  id="show_msg" name="show_msg" value="" />
    <input type="hidden"  id="jz" name="jz" value="0" />
    <input type="hidden"  id="no_new" name="no_new" value="0" />
</form>
</div>


</body>
</html>