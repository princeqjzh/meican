package com.hibernate.user;


public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String userPwd;
	private String userEmail;
	private Integer userSign;
	private String userTel;
	private String userSex;
	private Integer userRes;
	private String userRealName;
	private String userImg;
	private String addperson;
	private String addtime;
	private String updateperson;
	private String updatetime;
	private Integer deletesign;

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** full constructor */
	public AbstractUser(String userName, String userPwd, String userEmail,
			Integer userSign, String userTel, String userSex, Integer userRes,
			String userRealName, String userImg, String addperson,
			String addtime, String updateperson, String updatetime,
			Integer deletesign) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userEmail = userEmail;
		this.userSign = userSign;
		this.userTel = userTel;
		this.userSex = userSex;
		this.userRes = userRes;
		this.userRealName = userRealName;
		this.userImg = userImg;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserSign() {
		return this.userSign;
	}

	public void setUserSign(Integer userSign) {
		this.userSign = userSign;
	}

	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Integer getUserRes() {
		return this.userRes;
	}

	public void setUserRes(Integer userRes) {
		this.userRes = userRes;
	}

	public String getUserRealName() {
		return this.userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	public String getUserImg() {
		return this.userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
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