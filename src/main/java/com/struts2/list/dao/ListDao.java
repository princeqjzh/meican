/**
 * 
 */
package com.struts2.list.dao;

import java.util.Date;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.list.List1;
import com.hibernate.user.HibernateSessionFactory;

public class ListDao {

	private int res_name, total, food;
	private String username, name, price, food1;
	Date date = new Date();
	int ordernum = (int) ((date.getTime()) % 10000000);

	public int reviceList(Map<String, Object> map) {

		if (map != null) {

			for (Map.Entry<String, Object> entry : map.entrySet()) {
				if (entry.getKey().equals("res_num")) {
					name = (String) entry.getValue();
					System.out.println("123:" + name);

				} else if (entry.getKey().equals("total")) {
					price = (String) entry.getValue();

				} else if (entry.getKey().equals("username")) {
					username = (String) entry.getValue();
				}
			}

			res_name = Integer.valueOf(name);
			total = Integer.valueOf(price);

			for (Map.Entry<String, Object> entry : map.entrySet()) {
				if (entry.getKey().contains("food_num")) {
					food1 = (String) entry.getValue();
					food = Integer.valueOf(food1);
					add(food);

				}
			}
		}
		return ordernum;
	}

	private void add(int listMeNum) {
		// TODO Auto-generated method stub
		List1 li = new List1();
		//
		li.setListOrdNum(ordernum);
		li.setListPrise(String.valueOf(total));
		li.setListResNum(String.valueOf(res_name));
		li.setListUserName(username);
		li.setListMeNum(listMeNum);

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.save(li);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			System.out.println("success");
			session.close();
		}
	}

}
