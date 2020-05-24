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
		li.setListOrdNum(ordernum);// ¶©µ¥ºÅ
		li.setListPrise(String.valueOf(total));// ¼Û¸ñ
		li.setListResNum(String.valueOf(res_name));// ·¹µê±àºÅ
		li.setListUserName(username);// ÓÃ»§Ãû
		li.setListMeNum(listMeNum);// ²Ë±àºÅ

		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			// ¿ªÊ¼Ò»¸öÊÂÎñ
			tx = session.beginTransaction();
			// ³Ö¾Ã»¯²Ù×÷
			session.save(li);
			// Ìá½»ÊÂÎñ
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
			// ¿ªÊ¼Ò»¸öÊÂÎñ
			tx = session.beginTransaction();
			// ³Ö¾Ã»¯²Ù×÷
			session.save(user);
			// Ìá½»ÊÂÎñ
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
