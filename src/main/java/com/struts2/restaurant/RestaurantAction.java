package com.struts2.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.restaurant.dao.RestaurantDao;

public class RestaurantAction extends ActionSupport{
	public String execute()throws Exception{
		RestaurantDao resdao = new RestaurantDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = resdao.listResraurant();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list_res", rs);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("list_res", rs);
		return SUCCESS;
	}
}
