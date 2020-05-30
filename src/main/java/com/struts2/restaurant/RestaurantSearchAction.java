package com.struts2.restaurant;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.restaurant.dao.RestaurantDao;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestaurantSearchAction extends ActionSupport{
	
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) throws UnsupportedEncodingException {
		this.key = new String(key.getBytes("ISO8859-1"),"UTF-8");
	}

	public String execute() throws Exception{
		RestaurantDao resdao = new RestaurantDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		ActionContext ctx = ActionContext.getContext();
		if(key != null){
			rs = resdao.SearchResraurant(key);
			ctx.getSession().put("list_res", rs);
		}else{
			rs = resdao.listResraurant();
		}
		return SUCCESS;
	}
}
