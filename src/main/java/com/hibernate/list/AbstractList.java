package com.hibernate.list;

import java.io.Serializable;

public abstract class AbstractList
		implements Serializable
{
	private Integer id;
	private Integer listOrdNum;
	private Integer listMeNum;
	private String listPrise;
	private String listResNum;
	private String listUserName;
	private String addperson;
	private String addtime;
	private String updateperson;
	private String updatetime;
	private Integer deletesign;

	public AbstractList() {}

	public AbstractList(Integer listOrdNum, Integer listMeNum, String listPrise, String listResNum, String listUserName, String addperson, String addtime, String updateperson, String updatetime, Integer deletesign)
	{
		this.listOrdNum = listOrdNum;
		this.listMeNum = listMeNum;
		this.listPrise = listPrise;
		this.listResNum = listResNum;
		this.listUserName = listUserName;
		this.addperson = addperson;
		this.addtime = addtime;
		this.updateperson = updateperson;
		this.updatetime = updatetime;
		this.deletesign = deletesign;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getListOrdNum()
	{
		return this.listOrdNum;
	}

	public void setListOrdNum(Integer ordernum)
	{
		this.listOrdNum = ordernum;
	}

	public Integer getListMeNum()
	{
		return this.listMeNum;
	}

	public void setListMeNum(Integer listMeNum)
	{
		this.listMeNum = listMeNum;
	}

	public String getListPrise()
	{
		return this.listPrise;
	}

	public void setListPrise(String listPrise)
	{
		this.listPrise = listPrise;
	}

	public String getListResNum()
	{
		return this.listResNum;
	}

	public void setListResNum(String listResNum)
	{
		this.listResNum = listResNum;
	}

	public String getListUserName()
	{
		return this.listUserName;
	}

	public void setListUserName(String listUserName)
	{
		this.listUserName = listUserName;
	}

	public String getAddperson()
	{
		return this.addperson;
	}

	public void setAddperson(String addperson)
	{
		this.addperson = addperson;
	}

	public String getAddtime()
	{
		return this.addtime;
	}

	public void setAddtime(String addtime)
	{
		this.addtime = addtime;
	}

	public String getUpdateperson()
	{
		return this.updateperson;
	}

	public void setUpdateperson(String updateperson)
	{
		this.updateperson = updateperson;
	}

	public String getUpdatetime()
	{
		return this.updatetime;
	}

	public void setUpdatetime(String updatetime)
	{
		this.updatetime = updatetime;
	}

	public Integer getDeletesign()
	{
		return this.deletesign;
	}

	public void setDeletesign(Integer deletesign)
	{
		this.deletesign = deletesign;
	}
}
