package com.test;

import com.hibernate.menu.Menu;
import com.hibernate.user.HibernateSessionFactory;
import com.hibernate.user.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class TestHibernate {
    public static void main(String[] args) throws HibernateException {
        new TestHibernate().search();
    }

    public void deldetefun(int food_num) {
//		int sign = 0;

        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Menu menu = (Menu) session.get(Menu.class, food_num);
        tx = session.beginTransaction();
        try {

            session.delete(menu);
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        } finally {
            session.close();

        }
//		return sign;
    }

    public int ResNum(String username) {
        int res_num = 0;
        Session session = HibernateSessionFactory.getSession();
        Criteria cri = session.createCriteria(User.class);
        cri.add(Restrictions.eq("userName", username));
        List list = cri.list();
        if (list != null && list.size() != 0) {
            User user = (User) list.get(0);
            String strUserName = user.getUserName();
            int strUserPwd = user.getUserRes();
            res_num = user.getUserRes();
        }
        return res_num;
    }

    private void selectTest() {
        long start = 0L, end = 0L, res = 0L;
        long start1 = 0L, end1 = 0L, res1 = 0L;
        // TODO Auto-generated method stub
        Session session = HibernateSessionFactory.getSession();
        Criteria cri = session.createCriteria(User.class);

        List list = cri.list();
        ListIterator iterator = list.listIterator();
        List<String> list2 = new ArrayList<String>();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println("name:" + user.getUserName());
            System.out.println("password:" + user.getUserPwd());
        }
    }

    private void select() {
        Session session = HibernateSessionFactory.getSession();
        Criteria crit = session.createCriteria(User.class);
        List list = crit.list();

        for (ListIterator iterator = list.listIterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            System.out.println("name: " + user.getUserName());
            System.out.println("password: " + user.getUserPwd());
        }
    }


    private void change() {
        // TODO Auto-generated method stub
        User user = new User();

        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        user = (User) session.get(User.class, new Integer(2));
        user.setUserName("hello");
        user.setUserPwd("helloword!");
        try {
            tx = session.beginTransaction();
            session.update(user);
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        } finally {
            session.close();
        }
    }

    private void add() {
        // TODO Auto-generated method stub
        User user = new User();
        user.setUserName("zsy");
        user.setUserPwd("000");
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

    private void get() {
        // TODO Auto-generated method stub
        User user = new User();
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        user = (User) session.get(User.class, new Integer(1));
        System.out.println("=====" + user.getUserName() + "========" + user.getUserPwd());

    }

    private void delet() {

        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        User user = (User) session.get(User.class, new Integer(1));
        tx = session.beginTransaction();
        try {

            session.delete(user);
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        } finally {
            session.close();

        }
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
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    private void search() throws HibernateException {
        User user = new User();
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        SQLQuery query = session.createSQLQuery("select count(id)  as cnt from user").addScalar("cnt", Hibernate.INTEGER);

        int c = (Integer) query.uniqueResult();


        System.out.println("c=" + c);
    }

    public int searchmenu() {
        int num = 0;
        List list;
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        return num;
    }
}
