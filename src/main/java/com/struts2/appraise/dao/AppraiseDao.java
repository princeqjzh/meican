package com.struts2.appraise.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.appraise_res.AbstractAppraiseRes;
import com.hibernate.appraise_res.AppraiseRes;
import com.hibernate.menu.AbstractMenu;
import com.hibernate.menu.Menu;
import com.hibernate.user.HibernateSessionFactory;

public class AppraiseDao {

	public void AddAppraise(int appDeliStar, int appPriseStar,
			int appServerStar, int appStar, String appResContent,
			String appResNum, String appUserName) {

		AppraiseRes appraiseres = new AppraiseRes();
		appraiseres.setAppDeliStar(appDeliStar);
		appraiseres.setAppPriseStar(appPriseStar);
		appraiseres.setAppServerStar(appServerStar);
		appraiseres.setAppStar(appStar);
		appraiseres.setAppResContent(appResContent);
		appraiseres.setAppResNum(appResNum);
		appraiseres.setAppUserName(appUserName);

		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.save(appraiseres);

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}

	public List AppraiseList(int res_num) {
		List rs = new ArrayList();
		List list;
		List list_copy;
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(AppraiseRes.class);
		cri.add(Restrictions.eq("appResNum", String.valueOf(res_num)));
		list = cri.list();
		list_copy = list;

		for (int i = 0; i < list_copy.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("app_username", ((AbstractAppraiseRes) list.get(i)).getAppUserName());
			map.put("app_content", ((AbstractAppraiseRes) list.get(i)).getAppResContent());
			map.put("app_star", ((AbstractAppraiseRes) list.get(i)).getAppStar());
			map.put("app_delistar", ((AbstractAppraiseRes) list.get(i)).getAppDeliStar());
			map.put("app_pricestar", ((AbstractAppraiseRes) list.get(i)).getAppPriseStar());
			map.put("app_serverstar", ((AbstractAppraiseRes) list.get(i)).getAppServerStar());
			
			list1.add(map);
		}
		return list1;
	}
	public static void main(String[] args){
		int res_num = 10001;
		AppraiseDao appDao = new AppraiseDao();
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = appDao.AppraiseList(res_num);
		System.out.println(rs);
	}
}
