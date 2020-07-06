<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="zh">
<head>
	<title>订餐网</title>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="restaurant/css/style.css" type="text/css" media="all" />
	<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />
	<![endif]-->
	<script type="text/javascript" src="restaurant/js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="restaurant/js/jquery-func.js"></script>
    <script src="restaurant/js/func.js"></script>
</head>
<body bgcolor="#0033CC" onload="getArea('','sheng')">
<!-- Shell -->
<div id="shell">
	<!-- Header -->
	<div id="header">
		<h1 id="logo"><a href="restaurant.action"></a></h1>
		<div class="social">
			<span>您好啊：<a href="userinfo?username=${sessionScope.user}">${sessionScope.user}</a></span>
		</div>
		
		<!-- Navigation -->
		<div id="navigation">
		</div>
		<!-- end Navigation -->
		
		<!-- Sub-menu -->
		<div id="sub-navigation">
			
			<div id="search">
             <form action="searchres.action">
                	搜索：<input type="text" name="key" />
                </form>
				
               
			</div>
		</div>
		<!-- end Sub-Menu -->
		
	</div>
	<!-- end Header -->
	
	<!-- Main -->
	<div id="main">
		<!-- Content -->
	  <div id="content">
			
			<!-- Box -->
			<div class="box">
				<div class="head">
					<h2>推荐饭店</h2>
					<p class="text-right"> </p>
				</div>
				<s:iterator value="#session.list_res" status="L">
				<!-- Movie -->
				<div class="movie">
					<div class="movie-image">
						<span class="play"><a href="menu.action?res_num=<s:property value="res_num"/>"><span class="name"><s:property value="res_name"/><br/><s:property value="res_add"/></span></a></span>
						<a href="#"><img src="restaurant/images/<s:property value="res_img"/>" alt="movie" /></a>
					</div>
					<div class="rating">
						<p>RATING:&nbsp;&nbsp;&nbsp;</p>
                      	<p id="recommend1"><s:property value="res_rank"/>&nbsp;&nbsp;&nbsp;</p>
                        <p><a href="appraiselist.action?res_num=<s:property value="res_num"/>">查看评价</a></p>
					</div>
				</div>
				<!-- end Movie -->
				</s:iterator>
				<div class="cl"></div>
			</div>
			<!-- end Box -->
			
			
			
		</div>
		<!-- end Content -->

		<!-- NEWS --><!-- end NEWS -->
		
		<!-- Coming --><!-- end Coming -->
	  <div class="cl">&nbsp;</div>
	</div>
	<!-- end Main -->
</div>
<!-- end Shell -->
</body>
<script type="text/javascript">
	document.getElementById("recommend1").innerHTML="4.0";
	document.getElementById("recommend2").innerHTML="4.1";
	document.getElementById("recommend3").innerHTML="4.2";
	document.getElementById("recommend4").innerHTML="4.3";
	document.getElementById("recommend5").innerHTML="4.4";
	document.getElementById("recommend6").innerHTML="4.5";
	document.getElementById("nearby1").innerHTML="4.6";
	document.getElementById("nearby2").innerHTML="4.7";
	document.getElementById("nearby3").innerHTML="4.8";
	document.getElementById("nearby4").innerHTML="4.9";
	document.getElementById("nearby5").innerHTML="5.0";
	document.getElementById("nearby6").innerHTML="5.1";
</script>
</html>
