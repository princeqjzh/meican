/**
 * 
 */
package com.struts2.manager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.list.dao.ListSelectDao;
import com.struts2.manager.dao.ManagerDao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ManagerAction extends ActionSupport {
	
	private int page;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String execute() {
		
		String res = null;
		
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext ctx = ActionContext.getContext();
		String username = (String) ctx.getSession().get("user");

		ManagerDao managerDao = new ManagerDao();
		int res_num = managerDao.ResNum(username);
		System.out.println(res_num);
		
		String res_name = ListSelectDao.select(res_num);
		System.out.println(res_name);
		
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = managerDao.listMenu(res_num,page);
		if(rs!=null){
			ctx.getSession().put("res_num", res_num);
			ctx.getSession().put("list_menu", rs);
			ctx.getSession().put("res_name", res_name);
			res = SUCCESS;
		}else
			res = ERROR;
		return res;
	}

}
