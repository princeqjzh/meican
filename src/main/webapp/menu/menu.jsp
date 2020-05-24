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
<title>订餐网</title>
<script type="javascript/text" src="menu/jquery-1.11.1.min.js">

</script>
<base href="<%=basePath%>">
<style type="text/css">
	#nametable{
		height:500px;
		overflow:auto;
		overflow-x: hidden;
		overflow-y:scroll;
		}
	#red_title{
		color:#ff0000;
		text-align:right;
		font-size:20px;
		position:static;
		margin-right:400px;

	}
		.products{
			list-style:none;
			margin-right:340px;
			padding:0px;
			height:100%;
			overflow:hidden;
			border:2px solid #FF0000;
		}
		.products li{
			display:inline;
			float:left;
			margin:10px;
		}
		.item{
			display:block;
			text-decoration:none;
		}
		.item img{
			border:1px solid #333;
		}
		.item p{
			margin:0;
			font-weight:bold;
			text-align:center;
			color:#c3c3c3;
		}
		.cart{
			position:fixed;
			right:0;
			top:0;
			width:300px;
			height:100%;
			background:#ccc;
			padding:0px 10px;
		}
		h1{
			text-align:center;
			color:#555;
		}
		h2{
			position:absolute;
			font-size:16px;
			left:10px;
			bottom:20px;
			color:#555;
		}
		.total{
			margin:0;
			text-align:right;
			padding-right:20px;
		}
	</style>
</head>

<body style="margin:0;padding:0;height:100%;background:#fafafa;" onLoad="addUser('${sessionScope.user}',${requestScope.res_num})">
	<ul class="products">
    <s:iterator value="#request.list_menu">
		<li>
			<a href="javascript:void(0)" class="item" onClick="addProduct('<s:property value="food_name"/>',<s:property value="food_num"/>,<s:property value="menu_price"/> )">
				<!--<img src='<s:property value="food_img"/>'/>-->
                <img src="menu/<s:property value="food_img"/>"/>
				<div>
					<p><s:property value="food_name"/></p>
					<p>价格：<s:property value="menu_price"/></p>
				</div>
			</a>
		</li>
	</s:iterator>
	</ul>
	<h2 id="red_title">点选菜品</h2>
	<div class="cart">
		<h1>Shopping Cart</h1>
        <table style="width:300px;height:auto;">
			<thead>
				<tr>
					<th field="name" width=100 align="left">菜名</th>
					<th field="quantity" width=60 align="left">折扣</th>
					<th field="price" width=60 align="left">菜价</th>
                    <th field="dele" width=60 align="left"></th>
				</tr>
			</thead>
		</table>
        <div id="nametable">
		<table id="cartcontent" style="width:300px;height:auto;">
			<thead>
				<tr>
					<th field="name" width=100 align="left"></th>
					<th field="quantity" width=60 align="left"></th>
					<th field="price" width=60 align="left"></th>
                    <th field="dele" width=60 align="left"></th>
				</tr>
			</thead>
		</table>
        <dl id="list_view"></dl>
        
        </div>
		<p class="total" id="totalP">总价: 0元</p>
		<h2><a href="javascript:history.back(-1)">返回</a></h2>
	    <a href="list.action"><div><span style="float:right; text-decoration:none; width:auto; background-color:#F60; font-family:'华文行楷'; color:#FFF; font-size:24px;">订餐</span></div></a>
	</div>
</body>
<script>
	var tablerow = 0;
	function addUser(name,res_num){
		addCookie('username',name,1);
		addCookie('res_num',res_num,1);
		//alert(name);
	}
	document.body.onclick=function(e){ 
        e=e|| window.event; 
        var obj=e.target || e.srcElement; 
         
        if(obj.tagName=="TD"){ 
            obj=obj.parentNode; 
        } 
       //alert(obj.rowIndex);
	   tablerow = obj.rowIndex;
    } 
	var totalprice = 0;
	var index = 0;
	function addProduct(name,num,price){
		var t = document.getElementById("cartcontent");
		var tRow = t.insertRow(index);
		var tCell0 = tRow.insertCell(0);
		var tCell1 = tRow.insertCell(1);
		var tCell2 = tRow.insertCell(2);
		var tCell3 = tRow.insertCell(3);
		var qwe = document.createElement("p");
		qwe.innerHTML = '<button onClick="delete1('+num+','+price+','+index+')">删除</button>';
		tCell0.appendChild(document.createTextNode(name));
		tCell1.appendChild(document.createTextNode("1"));
		tCell2.appendChild(document.createTextNode(price));
		tCell3.appendChild(qwe);
		totalprice = totalprice + price;
		
		//把数据存入cookie里面
		var name1 = 'food_num'+index;
		addCookie(name1,num,1);
		addCookie('total',totalprice,1);
		document.getElementById("totalP").innerHTML="总价为："+totalprice+"元";
		//alert(index);
		
		
		
		var div=document.getElementById('nametable');
		div.scrollTop = div.scrollHeight;
		index = index+1;
	}
	
	function delete1(name,price,index1){
		var tableobj=document.getElementById("cartcontent");
		alert("删除第"+index1+"行");
		tableobj.deleteRow(index1);
		var date = new Date();
		date.setTime(date.getTime() - 100000000);
		name = name+tablerow;
		document.cookie = name + "=a; expires=" + date.toGMTString();
		totalprice = totalprice - price;
		addCookie('total',totalprice,1);
		document.getElementById("totalP").innerHTML="总价为："+totalprice+"元";
	}
	
	//打开cookies
	function addCookie(name,value,expiresHours){ 
		var cookieString=name+"="+escape(value); 
		//判断是否设置过期时间 
		if(expiresHours>0){ 
			var date=new Date(); 
			date.setTime(date.getTime+expiresHours*3600*1000); 
			cookieString=cookieString+"; expires="+date.toGMTString(); 
		} 
		document.cookie=cookieString; 
	} 
	</script>
    <script>
	var picTop2 = 0;
	var closeTop2 = 0;
	function initPic(){
		picTop2 = document.getElementById('cart').style.pixelTop;
		closeTop2 = document.getElementById('nametable').style.pixelTop - 10;
	}
	function autoPic(){		
		document.getElementById('cart').style.pixelTop = picTop2 + document.body.scrollTop;
		document.getElementById('nametable').style.pixelTop = closeTop2 + document.body.scrollTop;
	}
	
	window.onscroll = autoPic;
</script>

<script language="javascript" type="text/javascript"> 
    
</script>
</html>
