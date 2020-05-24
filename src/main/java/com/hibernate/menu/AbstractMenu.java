package com.hibernate.menu;

public abstract class AbstractMenu implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer menuClasses;
	private Integer menuPrice;
	private Integer foodNum;
	private String foodName;
	private Integer menuDiscount;
	private Integer menuNum;
	private Integer menuResNum;
	private String foodImg;
	private String addperson;
	private String addtime;
	private String updateperson;
	private String updatetime;
	private Integer deletesign;

	// Constructors

	/** default constructor */
	public AbstractMenu() {
	}

	/** full constructor */
	public AbstractMenu(Integer menuClasses, Integer menuPrice,
			Integer foodNum, String foodName, Integer menuDiscount,
			Integer menuNum, Integer menuResNum, String foodImg,
			String addperson, String addtime, String updateperson,
			String updatetime, Integer deletesign) {
		this.menuClasses = menuClasses;
		this.menuPrice = menuPrice;
		this.foodNum = foodNum;
		this.foodName = foodName;
		this.menuDiscount = menuDiscount;
		this.menuNum = menuNum;
		this.menuResNum = menuResNum;
		this.foodImg = foodImg;
		this.addperson = addperson;
		this.addtime = addtime;
		this.updateperson = updateperson;
		this.updatetime = updatetime;
		this.deletesign = deletesign;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMenuClasses() {
		return this.menuClasses;
	}

	public void setMenuClasses(Integer menuClasses) {
		this.menuClasses = menuClasses;
	}

	public Integer getMenuPrice() {
		return this.menuPrice;
	}

	public void setMenuPrice(Integer menuPrice) {
		this.menuPrice = menuPrice;
	}

	public Integer getFoodNum() {
		return this.foodNum;
	}

	public void setFoodNum(Integer foodNum) {
		this.foodNum = foodNum;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getMenuDiscount() {
		return this.menuDiscount;
	}

	public void setMenuDiscount(Integer menuDiscount) {
		this.menuDiscount = menuDiscount;
	}

	public Integer getMenuNum() {
		return this.menuNum;
	}

	public void setMenuNum(Integer menuNum) {
		this.menuNum = menuNum;
	}

	public Integer getMenuResNum() {
		return this.menuResNum;
	}

	public void setMenuResNum(Integer menuResNum) {
		this.menuResNum = menuResNum;
	}

	public String getFoodImg() {
		return this.foodImg;
	}

	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}

	public String getAddperson() {
		return this.addperson;
	}

	public void setAddperson(String addperson) {
		this.addperson = addperson;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getUpdateperson() {
		return this.updateperson;
	}

	public void setUpdateperson(String updateperson) {
		this.updateperson = updateperson;
	}

	public String getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getDeletesign() {
		return this.deletesign;
	}

	public void setDeletesign(Integer deletesign) {
		this.deletesign = deletesign;
	}

}