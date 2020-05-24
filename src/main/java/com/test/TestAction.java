package com.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	public String execute() throws Exception{
		
		if(getUsername().equals("admin")&&getPassword().equals("admin")){
			return "success";
			
		}else
			return "error";
		
		
		
	}
}
