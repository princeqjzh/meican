package com.struts2.restaurant.dao;

public class RestaurantBean {
	private int res_id;
	private String res_name;
	private String res_tel;
	private String res_add;
	private String res_rank;
	
	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getRes_tel() {
		return res_tel;
	}

	public void setRes_tel(String res_tel) {
		this.res_tel = res_tel;
	}

	public String getRes_add() {
		return res_add;
	}

	public void setRes_add(String res_add) {
		this.res_add = res_add;
	}

	public String getRes_rank() {
		return res_rank;
	}

	public void setRes_rank(String res_rank) {
		this.res_rank = res_rank;
	}
}
