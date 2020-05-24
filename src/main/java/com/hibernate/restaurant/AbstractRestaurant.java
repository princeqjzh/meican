package com.hibernate.restaurant;


public abstract class AbstractRestaurant implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer resNum;
	private String resName;
	private String resRank;
	private String resTel;
	private String resAdd;
	private String resPro;
	private String resCity;
	private String addperson;
	private String addtime;
	private String updateperson;
	private String updatetime;
	private Integer deletesign;

	// Constructors

	/** default constructor */
	public AbstractRestaurant() {
	}

	/** full constructor */
	public AbstractRestaurant(Integer resNum, String resName, String resRank,
			String resTel, String resAdd, String resPro, String resCity,
			String addperson, String addtime, String updateperson,
			String updatetime, Integer deletesign) {
		this.resNum = resNum;
		this.resName = resName;
		this.resRank = resRank;
		this.resTel = resTel;
		this.resAdd = resAdd;
		this.resPro = resPro;
		this.resCity = resCity;
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

	public Integer getResNum() {
		return this.resNum;
	}

	public void setResNum(Integer resNum) {
		this.resNum = resNum;
	}

	public String getResName() {
		return this.resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResRank() {
		return this.resRank;
	}

	public void setResRank(String resRank) {
		this.resRank = resRank;
	}

	public String getResTel() {
		return this.resTel;
	}

	public void setResTel(String resTel) {
		this.resTel = resTel;
	}

	public String getResAdd() {
		return this.resAdd;
	}

	public void setResAdd(String resAdd) {
		this.resAdd = resAdd;
	}

	public String getResPro() {
		return this.resPro;
	}

	public void setResPro(String resPro) {
		this.resPro = resPro;
	}

	public String getResCity() {
		return this.resCity;
	}

	public void setResCity(String resCity) {
		this.resCity = resCity;
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