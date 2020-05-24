package com.hibernate.order;


public abstract class AbstractOrder implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer ordNum;
	private String ordUserName;
	private Float ordPrise;
	private Integer ordResNum;
	private String ordDate;
	private Integer ordNumber;
	private String ordStatus;
	private String ordWaiterName;
	private String addperson;
	private String addtime;
	private String updateperson;
	private String updatetime;
	private Integer deletesign;

	// Constructors

	/** default constructor */
	public AbstractOrder() {
	}

	/** full constructor */
	public AbstractOrder(Integer ordNum, String ordUserName, Float ordPrise,
			Integer ordResNum, String ordDate, Integer ordNumber,
			String ordStatus, String ordWaiterName, String addperson,
			String addtime, String updateperson, String updatetime,
			Integer deletesign) {
		this.ordNum = ordNum;
		this.ordUserName = ordUserName;
		this.ordPrise = ordPrise;
		this.ordResNum = ordResNum;
		this.ordDate = ordDate;
		this.ordNumber = ordNumber;
		this.ordStatus = ordStatus;
		this.ordWaiterName = ordWaiterName;
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

	public Integer getOrdNum() {
		return this.ordNum;
	}

	public void setOrdNum(Integer ordNum) {
		this.ordNum = ordNum;
	}

	public String getOrdUserName() {
		return this.ordUserName;
	}

	public void setOrdUserName(String ordUserName) {
		this.ordUserName = ordUserName;
	}

	public Float getOrdPrise() {
		return this.ordPrise;
	}

	public void setOrdPrise(Float ordPrise) {
		this.ordPrise = ordPrise;
	}

	public Integer getOrdResNum() {
		return this.ordResNum;
	}

	public void setOrdResNum(Integer ordResNum) {
		this.ordResNum = ordResNum;
	}

	public String getOrdDate() {
		return this.ordDate;
	}

	public void setOrdDate(String ordDate) {
		this.ordDate = ordDate;
	}

	public Integer getOrdNumber() {
		return this.ordNumber;
	}

	public void setOrdNumber(Integer ordNumber) {
		this.ordNumber = ordNumber;
	}

	public String getOrdStatus() {
		return this.ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getOrdWaiterName() {
		return this.ordWaiterName;
	}

	public void setOrdWaiterName(String ordWaiterName) {
		this.ordWaiterName = ordWaiterName;
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