package com.struts2.restaurant;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.restaurant.dao.RestaurantDao;

public class RestaurantSearchAction extends ActionSupport{
	
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) throws UnsupportedEncodingException {
//		this.key = key;
		this.key = new String(key.getBytes("ISO8859-1"),"UTF-8");
	}

	public String execute() throws Exception{
		RestaurantDao resdao = new RestaurantDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		ActionContext ctx = ActionContext.getContext();
//		System.out.println("Key:"+getKey());
		if(key != null){
			rs = resdao.SearchResraurant(key);
	//		HttpServletRequest request = ServletActionContext.getRequest();
	//		request.setAttribute("list_res", rs);
	//		ctx.getSession().remove("list_res");
			ctx.getSession().put("list_res", rs);
//			System.out.println(ctx.getSession().get("list_res"));
		}else{
			rs = resdao.listResraurant();
		}
		return SUCCESS;
	}
}
