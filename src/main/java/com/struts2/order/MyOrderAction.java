package com.struts2.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.order.dao.OrderDao;

public class MyOrderAction extends ActionSupport{
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		OrderDao oderdao = new OrderDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = oderdao.listOrder(getUsername());
		ctx.getSession().put("order_list", rs);
		return SUCCESS;
	}

}
