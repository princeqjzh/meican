package com.hibernate.appraise_res;

import java.io.Serializable;

public class AppraiseRes
		extends AbstractAppraiseRes
		implements Serializable
{
	public AppraiseRes() {}

	public AppraiseRes(String appResNum, String appUserName, String appResContent, Integer appPriseStar, Integer appDeliStar, Integer appServerStar, Integer appStar, String addperson, String addtime, String updateperson, String updatetime, Integer deletesign)
	{
		super(appResNum, appUserName, appResContent, appPriseStar, appDeliStar, appServerStar, appStar, addperson, addtime, updateperson, updatetime, deletesign);
	}
}
