package com.struts2.waiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.waiter.dao.WaiterView;

public class WaiterAction extends ActionSupport{
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		String username = (String) ctx.getSession().get("user");
		WaiterView orderView = new WaiterView();
		
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = orderView.listOrder(username);
		ctx.getSession().put("waiter_list", rs);
		
		return SUCCESS;
	}
}
