package com.hibernate.restaurant;

public class Restaurant extends AbstractRestaurant implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Restaurant() {
	}

	/** full constructor */
	public Restaurant(Integer resNum, String resName, String resRank,
			String resTel, String resAdd, String resPro, String resCity,
			String addperson, String addtime, String updateperson,
			String updatetime, Integer deletesign) {
		super(resNum, resName, resRank, resTel, resAdd, resPro, resCity,
				addperson, addtime, updateperson, updatetime, deletesign);
	}

}
