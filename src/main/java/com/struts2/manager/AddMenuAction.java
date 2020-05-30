/**
 * 
 */
package com.struts2.manager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.manager.dao.ManagerDao;
import com.struts2.menu.dao.MenuDao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddMenuAction extends ActionSupport {

	private String foodname;
	private int foodnum;
	private int foodprice;
	private int classes;
	private int menunum;

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getFoodnum() {
		return foodnum;
	}

	public void setFoodnum(int foodnum) {
		this.foodnum = foodnum;
	}

	public int getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public int getMenunum() {
		return menunum;
	}

	public void setMenunum(int menunum) {
		this.menunum = menunum;
	}

	public String execute() {

		String res = null;

		ManagerDao managerDao = new ManagerDao();

		ActionContext ctx = ActionContext.getContext();
		int res_num = Integer.valueOf((String) ctx.getSession().get("res_num"));

		managerDao.AddMenu(getFoodname(), getFoodnum(), getClasses(),
				getMenunum(), getFoodprice(), res_num);

		MenuDao menuDao = new MenuDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = menuDao.listMenu(res_num);
		if (rs != null) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("list_menu", rs);
			request.setAttribute("res_num", res_num);
			res = SUCCESS;
		} else
			res = ERROR;
		return res;

	}
}
