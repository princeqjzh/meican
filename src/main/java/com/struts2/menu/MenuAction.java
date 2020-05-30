package com.struts2.menu;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.menu.dao.MenuDao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MenuAction extends ActionSupport {
	private int res_num;
	
	public int getRes_num() {
		return res_num;
	}

	public void setRes_num(int res_num) {
		this.res_num = res_num;
	}

	public String execute()throws Exception{
		String res = null;
		int res_num = getRes_num();
		System.out.println(res_num);
		MenuDao menuDao = new MenuDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = menuDao.listMenu(res_num);
		if(rs!=null){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("list_menu", rs);
			request.setAttribute("res_num", res_num);
			res = SUCCESS;
		}else
			res = ERROR;
		return res;
	}
}
