package com.struts2.appraise;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.appraise.dao.AppraiseDao;

public class AppraiseResAction extends ActionSupport {

	private int prise_star;
	private int deli_star;
	private int server_star;
	private int star;
	private String content;

	public int getPrise_star() {
		return prise_star;
	}

	public void setPrise_star(int prise_star) {
		this.prise_star = prise_star;
	}

	public int getDeli_star() {
		return deli_star;
	}

	public void setDeli_star(int deli_star) {
		this.deli_star = deli_star;
	}

	public int getServer_star() {
		return server_star;
	}

	public void setServer_star(int server_star) {
		this.server_star = server_star;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String execute() {

		ActionContext ctx = ActionContext.getContext();
		String resnum = String.valueOf(ctx.getSession().get("res_num"));
		String username = (String) ctx.getSession().get("user");

		AppraiseDao appraisedao = new AppraiseDao();
		appraisedao.AddAppraise(getDeli_star(), getPrise_star(),
				getServer_star(), getStar(), getContent(), resnum, username);

		return SUCCESS;

	}
}
