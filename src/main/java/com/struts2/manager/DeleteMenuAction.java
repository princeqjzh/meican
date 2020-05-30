package com.struts2.manager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.manager.dao.ManagerDao;
import com.struts2.menu.dao.MenuDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeleteMenuAction extends ActionSupport{
	
	private String food_num;

	public String getFood_num() {
		return food_num;
	}

	public void setFood_num(String food_num) {
		this.food_num = food_num;
	}
	
	public String execute() {
		String res = "SUCCESS";
		ActionContext ctx = ActionContext.getContext();
		
		int res_num = (Integer) ctx.getSession().get("res_num");
		
		ManagerDao managerDao = new ManagerDao();
		managerDao.deldetefun(Integer.valueOf(getFood_num()),res_num);
		
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		MenuDao menuDao = new MenuDao();
		rs = menuDao.listMenu(res_num);
		if(rs!=null){
			ctx.getSession().put("list_menu", rs);
			res = SUCCESS;
		}else
			res = ERROR;
		return res;
	}

}
