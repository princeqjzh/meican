package com.struts2.appraise;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.list.dao.ListSelectDao;

public class AppraiseAction extends ActionSupport{
	private int res_num;

	public int getRes_num() {
		return res_num;
	}

	public void setRes_num(int res_num) {
		this.res_num = res_num;
	}
	
	public String execute() {
		
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("res_name", ListSelectDao.select(getRes_num()));
		
		return SUCCESS;
		
	}
}
