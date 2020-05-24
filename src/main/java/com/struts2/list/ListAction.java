/**
 * 
 */
package com.struts2.list;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.list.dao.ListDao;
import com.struts2.list.dao.ListSelectDao;

public class ListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {

		int res_num = 0;
		int total = 0;
		int ordernum = 0;
		String username = null;
		Cookie[] cookies;
		HttpServletRequest request = ServletActionContext.getRequest();
		cookies = request.getCookies();
		Map<String, Object> map = new HashMap<String, Object>();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("res_num")
					|| cookie.getName().equals("total")
					|| cookie.getName().equals("username")
					|| cookie.getName().contains("food_num")) {
				map.put(cookie.getName(), cookie.getValue());
				System.out.println(cookie.getName()+cookie.getValue());
			}
		}

		ListDao listdao = new ListDao();
		ordernum = listdao.reviceList(map);

		for (Map.Entry<String, Object> entry : map.entrySet()) {
			if (entry.getKey().equals("res_num")) {
				// map.put(cookie.getName(), cookie.getValue());
				String temp = (String) entry.getValue();
				res_num = Integer.valueOf(temp);
			}
			if (entry.getKey().equals("total")) {
				String temp1 = (String) entry.getValue();
				total = Integer.valueOf(temp1);
			}
			if (entry.getKey().equals("username")) {
				username = (String) entry.getValue();
			}
		}

		String res_name = ListSelectDao.select(res_num);

		request.setAttribute("res_name", res_name);
		request.setAttribute("total", total);
		request.setAttribute("ordernum", ordernum);
		request.setAttribute("username", username);
		request.setAttribute("res_num", res_num);
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("ordernum", ordernum);
		ctx.getSession().put("total", total);
		ctx.getSession().put("res_num", res_num);
		ctx.getSession().put("res_name", res_name);

		return SUCCESS;

	}
}
