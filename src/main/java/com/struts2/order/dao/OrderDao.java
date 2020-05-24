package com.struts2.order.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.menu.AbstractMenu;
import com.hibernate.menu.Menu;
import com.hibernate.order.AbstractOrder;
import com.hibernate.order.Order;
import com.hibernate.user.HibernateSessionFactory;
import com.hibernate.user.User;
import com.struts2.list.dao.ListSelectDao;

public class OrderDao {

	public void AddOrder(int order_num, int order_price, int res_num,
			int order_people, String username, String date, String name) {
		Order order = new Order();

		order.setOrdDate(date);
		order.setOrdNum(order_num);
		order.setOrdNumber(order_people);
		order.setOrdPrise(Float.valueOf(order_price));
		order.setOrdResNum(res_num);
		order.setOrdUserName(username);
		order.setOrdWaiterName(name);

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.save(order);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			System.out.println("success");
			session.flush();
			HibernateSessionFactory.closeSession();
		}
	}

	public List listOrder(String username) {
		List rs = new ArrayList();
		List list;
		List list_copy;

		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(Order.class);
		cri.add(Restrictions.eq("ordUserName", username));
		list = cri.list();
		list_copy = list;

		for (int i = 0; i < list_copy.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("order_num", ((AbstractOrder) list.get(i)).getOrdNum());
			map.put("order_res_num",
					((AbstractOrder) list.get(i)).getOrdResNum());
			
			map.put("order_res",ListSelectDao.select(((AbstractOrder) list.get(i)).getOrdResNum()));
			map.put("order_mon", ((AbstractOrder) list.get(i)).getOrdPrise());
			map.put("order_date", ((AbstractOrder) list.get(i)).getOrdDate());

			list1.add(map);
		}

		session.close();
		return list1;
	}
	
//	public String reswaiter(int res_num){
//		String name = null;
//		Session session = HibernateSessionFactory.getSession();
//		Criteria cri = session.createCriteria(User.class);
//		List list = cri.list();
//		ListIterator iterator = list.listIterator();
//		List<String> list2 = new ArrayList<String>();
//		while(iterator.hasNext())
//		{
//			User user = (User)iterator.next();
//			System.out.println("name:"+user.getUserRes());
//			System.out.println("password:"+user.getUserSign());
//			if((user.getUserRes() == res_num)&&(user.getUserSign() == 2)){
//				name = user.getUserName();
//			}
//		}
//		return name;
//	} 
	
	public static void main(String[] args) throws HibernateException {
//		System.out.println(listOrder("admin"));
	}
}
