package com.test;

import com.hibernate.user.AbstractUser;
import com.hibernate.user.HibernateSessionFactory;
import com.hibernate.user.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class tes4hi {
	public static void main(String[] args) throws HibernateException {
		tes4hi hi = new tes4hi();
		hi.addUser();
	}

	private void addUser() throws HibernateException {
		// TODO Auto-generated method stub
		User user = new User();

		user.setUserName("zhou");

		Configuration config = new Configuration().configure();

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.save(user);

			tx.commit();
			System.out.println("success");
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}


	private void searchUser() throws HibernateException {

		Configuration config = new Configuration().configure();

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		User user;
		SQLQuery query = session.createSQLQuery(
				"select count(id) as cnt from user").addScalar("cnt",
				Hibernate.INTEGER);
		int count = (Integer) query.uniqueResult();

		for (int i = 1; i <= count; i++) {
			user = (User) session.get(User.class, new Integer(i));
			System.out
					.println(user.getId() + "    " + user.getUserName()
							+ "    " + user.getUserPwd() + "    "
							+ user.getUserSex() + "    " + user.getUserEmail()
							+ "    " + user.getUserTel());
		}
	}

	private List<AbstractUser> listSearch(String username)
			throws HibernateException {

		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(User.class);
		cri.add(Restrictions.eq("userName", username));
		List list = cri.list();
		User user = (User) list.get(0);

		List<AbstractUser> rs = new ArrayList<AbstractUser>();
		rs.add(user);

		return rs;

	}

	private void deleteUser(String username) throws HibernateException {
		Configuration config = new Configuration().configure();

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		User user = (User) session.get(User.class, new Integer(1));
		try {
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}

	private void updateUser(String username) throws HibernateException {

		Configuration config = new Configuration().configure();

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		User user = (User) session.get(User.class, new Integer(2));
		user.setUserName(username);
		try {
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			System.out.println("success");
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}


}
