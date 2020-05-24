package com.hibernate.order;

public class Order extends AbstractOrder implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(Integer ordNum, String ordUserName, Float ordPrise,
			Integer ordResNum, String ordDate, Integer ordNumber,
			String ordStatus, String ordWaiterName, String addperson,
			String addtime, String updateperson, String updatetime,
			Integer deletesign) {
		super(ordNum, ordUserName, ordPrise, ordResNum, ordDate, ordNumber,
				ordStatus, ordWaiterName, addperson, addtime, updateperson,
				updatetime, deletesign);
	}

}
