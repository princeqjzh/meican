package com.struts2.login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.login.dao.LoginDao;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()throws Exception{
		ActionContext ctx = ActionContext.getContext();

		String strRes = null;

		boolean sign = false;
		
		ctx.getSession().put("user", getUsername());

		LoginDao logindao = new LoginDao();
		sign = logindao.strLoginDeal(getUsername(),getPassword());

		int user_sign=1;
		if(sign){
			user_sign = logindao.checkSign(getUsername());
			switch(user_sign){
				case 1:strRes = "success";
					break;
				case 2:strRes = "waiter";
					break;
				case 3:strRes = "manager";
					break;
				case 0:strRes = "success";
					break;
			}
			//strRes = "success";
		}else{
			strRes = "error";
		}
		System.out.println(strRes);
		return strRes;
	}
	
}
