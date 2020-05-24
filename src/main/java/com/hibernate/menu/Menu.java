package com.hibernate.menu;

public class Menu extends AbstractMenu implements java.io.Serializable {


	/** default constructor */
	public Menu() {
	}

	/** full constructor */
	public Menu(Integer menuClasses, Integer menuPrice, Integer foodNum,
			String foodName, Integer menuDiscount, Integer menuNum,
			Integer menuResNum, String foodImg, String addperson,
			String addtime, String updateperson, String updatetime,
			Integer deletesign) {
		super(menuClasses, menuPrice, foodNum, foodName, menuDiscount, menuNum,
				menuResNum, foodImg, addperson, addtime, updateperson,
				updatetime, deletesign);
	}

}
