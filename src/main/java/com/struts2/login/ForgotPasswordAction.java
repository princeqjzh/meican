package com.struts2.login;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.struts2.login.dao.LoginDao;

public class ForgotPasswordAction {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute() {
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		String res = null;
		LoginDao logindao = new LoginDao();
		String pwd = logindao.forgotPassword(username);
		if(pwd != ""){
			request.setAttribute("name", username);
			request.setAttribute("pwd", pwd);
			res = "success";
		}else{
			res = "register";
		}
		return res;
	}
}
