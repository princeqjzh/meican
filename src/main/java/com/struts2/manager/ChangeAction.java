package com.struts2.manager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.manager.dao.ManagerDao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ChangeAction extends ActionSupport {

	private String food_id;

	public String getFood_id() {
		return food_id;
	}

	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}

	public String execute() {

		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = ServletActionContext.getRequest();

		ManagerDao managerDao = new ManagerDao();

		int res_num = (Integer) ctx.getSession().get("res_num");
		int id = Integer.valueOf(getFood_id());
		
		List rs = managerDao.searchid(id);
		ctx.getSession().put("change_menu", rs);
		return SUCCESS;
	}

}
