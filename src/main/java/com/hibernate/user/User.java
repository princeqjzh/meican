package com.hibernate.user;

public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName, String userPwd, String userEmail,
			Integer userSign, String userTel, String userSex, Integer userRes,
			String userRealName, String userImg, String addperson,
			String addtime, String updateperson, String updatetime,
			Integer deletesign) {
		super(userName, userPwd, userEmail, userSign, userTel, userSex,
				userRes, userRealName, userImg, addperson, addtime,
				updateperson, updatetime, deletesign);
	}

}
