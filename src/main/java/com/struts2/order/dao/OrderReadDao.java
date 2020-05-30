package com.struts2.order.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderReadDao {

	public void searchmenu(int ordernum) {
		Configuration config = new Configuration().configure();

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
	}

	public static void main(String[] args) {
		new OrderReadDao().searchmenu(1135731);
	}
}
