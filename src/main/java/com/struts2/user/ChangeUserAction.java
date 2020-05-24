package com.struts2.user;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.dao.UserInfoDao;

public class ChangeUserAction extends ActionSupport {
	private int userid;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getReal() {
		return real;
	}

	public void setReal(String real) {
		this.real = real;
	}

	private String userpwd;
	private String mail;
	private String tel;
	private String sex;
	private String real;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String execute() {
		UserInfoDao info = new UserInfoDao();
		info.updateuser(userid, username, userpwd, mail, tel, sex, real);
		return SUCCESS;
	}

}
