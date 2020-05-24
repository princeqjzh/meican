<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看订单</title>
</head>

<body>
<s:iterator value="#session.waiter_list">
<div>
<p>订单号：<s:property value="order_num"/></p>
<p>订单日期：<s:property value="order_date"/></p>
<p>预订人数：<s:property value="order_people"/></p>
<p>预订人：<s:property value="order_user"/></p>
<p>总价：<s:property value="order_price"/></p>
</div>
</s:iterator>
</body>
</html>