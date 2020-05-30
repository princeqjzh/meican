package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.list.List1;
import com.hibernate.user.User;

public class AddList {

	/**
	 * @param args
	 */

	private static int ordernum=123456789;
	private static String total = "190";
	private static String res_name = "10001";
	private static String username = "admin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(106);
//		add1();
	}

	private static void add(int listMeNum) {
		// TODO Auto-generated method stub
		List1 li= new List1();
		//
		li.setListOrdNum(ordernum);
		li.setListPrise(String.valueOf(total));
		li.setListResNum(String.valueOf(res_name));
		li.setListUserName(username);
		li.setListMeNum(listMeNum);

		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
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
	
	private static void add1(){
		User user = new User(); 
		user.setUserName("qwe123");
		user.setUserPwd("000000");
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}

}
