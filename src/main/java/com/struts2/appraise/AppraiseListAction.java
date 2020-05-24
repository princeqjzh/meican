package com.struts2.appraise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.appraise.dao.AppraiseDao;
import com.struts2.list.dao.ListSelectDao;

public class AppraiseListAction extends ActionSupport{
	
	private int res_num;

	public int getRes_num() {
		return res_num;
	}

	public void setRes_num(int res_num) {
		this.res_num = res_num;
	}

	public String execute() {
		AppraiseDao appDao = new AppraiseDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = appDao.AppraiseList(res_num);
		System.out.println("restaurant number: "+res_num);
		String res_name = ListSelectDao.select(res_num);
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("app_list", rs);
		System.out.println("appraise list: "+rs);
		ctx.getSession().put("res_name", res_name);
		
		return SUCCESS;
	}
}
