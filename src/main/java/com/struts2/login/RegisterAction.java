/**
 * 
 */
package com.struts2.login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.login.dao.LoginDao;

public class RegisterAction extends ActionSupport {

	private String username;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getResnum() {
		return resnum;
	}

	public void setResnum(String resnum) {
		this.resnum = resnum;
	}

	private String password;
	private String email;
	private String sex;
	private String tel;
	private String realname;
	private String resnum;

	public String execute() {
		
		String s_sex = null;

		int user_sign = 1;
		LoginDao logindao = new LoginDao();
		System.out.println(this.getSex());
		if(getSex().equals("a")){
			s_sex = "��";
		}if(getSex().equals("b"))
			s_sex = "Ů";
		System.out.println(s_sex);
		System.out.println(getResnum());
		
		if (this.getResnum() != null) {
			int res_num = Integer.valueOf(getResnum());
			
			System.out.println(res_num);
			user_sign = 2;
			logindao.AddUser(getUsername(), getPassword(), getEmail(), user_sign, getTel(), getRealname(), s_sex, res_num);

		}else
			logindao.AddUser1(getUsername(), getPassword(), getEmail(), user_sign, getTel(), getRealname(), s_sex);

		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("user", getUsername());

		return SUCCESS;
	}
}
