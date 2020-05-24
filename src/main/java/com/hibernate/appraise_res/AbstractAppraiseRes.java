package com.hibernate.appraise_res;

import java.io.Serializable;

public abstract class AbstractAppraiseRes
		implements Serializable
{
	private Integer id;
	private String appResNum;
	private String appUserName;
	private String appResContent;
	private Integer appPriseStar;
	private Integer appDeliStar;
	private Integer appServerStar;
	private Integer appStar;
	private String addperson;
	private String addtime;
	private String updateperson;
	private String updatetime;
	private Integer deletesign;

	public AbstractAppraiseRes() {}

	public AbstractAppraiseRes(String appResNum, String appUserName, String appResContent, Integer appPriseStar, Integer appDeliStar, Integer appServerStar, Integer appStar, String addperson, String addtime, String updateperson, String updatetime, Integer deletesign)
	{
		this.appResNum = appResNum;
		this.appUserName = appUserName;
		this.appResContent = appResContent;
		this.appPriseStar = appPriseStar;
		this.appDeliStar = appDeliStar;
		this.appServerStar = appServerStar;
		this.appStar = appStar;
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

	public String getAppResNum()
	{
		return this.appResNum;
	}

	public void setAppResNum(String appResNum)
	{
		this.appResNum = appResNum;
	}

	public String getAppUserName()
	{
		return this.appUserName;
	}

	public void setAppUserName(String appUserName)
	{
		this.appUserName = appUserName;
	}

	public String getAppResContent()
	{
		return this.appResContent;
	}

	public void setAppResContent(String appResContent)
	{
		this.appResContent = appResContent;
	}

	public Integer getAppPriseStar()
	{
		return this.appPriseStar;
	}

	public void setAppPriseStar(Integer appPriseStar)
	{
		this.appPriseStar = appPriseStar;
	}

	public Integer getAppDeliStar()
	{
		return this.appDeliStar;
	}

	public void setAppDeliStar(Integer appDeliStar)
	{
		this.appDeliStar = appDeliStar;
	}

	public Integer getAppServerStar()
	{
		return this.appServerStar;
	}

	public void setAppServerStar(Integer appServerStar)
	{
		this.appServerStar = appServerStar;
	}

	public Integer getAppStar()
	{
		return this.appStar;
	}

	public void setAppStar(Integer appStar)
	{
		this.appStar = appStar;
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
