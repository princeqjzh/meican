/**
 * 
 */
package com.struts2.manager.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.appraise_res.AppraiseRes;
import com.hibernate.menu.AbstractMenu;
import com.hibernate.menu.Menu;
import com.hibernate.user.HibernateSessionFactory;
import com.hibernate.user.User;
import com.opensymphony.xwork2.ActionContext;

public class ManagerDao {
	
	public List listMenu(int res_num,int page) {
		List rs = new ArrayList();
		List list;
		List list_copy;
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		
		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(Menu.class);
		cri.add(Restrictions.eq("menuResNum", res_num));
		list = cri.list();
		list_copy = list;
		
		if(page == 1){
			for (int i=0; i<5; i++){
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("food_id", ((AbstractMenu) list.get(i)).getId());
				map.put("menu_price", ((AbstractMenu) list.get(i)).getMenuPrice());
				map.put("menu_classes", ((AbstractMenu) list.get(i)).getMenuClasses());
				map.put("food_num", ((AbstractMenu) list.get(i)).getFoodNum());
				map.put("food_name", ((AbstractMenu) list.get(i)).getFoodName());
				map.put("menu_price", ((AbstractMenu) list.get(i)).getMenuPrice());
				map.put("menu_discount", ((AbstractMenu) list.get(i)).getMenuDiscount());
				map.put("food_img", ((AbstractMenu) list.get(i)).getFoodImg());
				list1.add(map);
			}
		}
		if(page == 2){
			for (int i=5; i<list_copy.size(); i++){
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("food_id", ((AbstractMenu) list.get(i)).getId());
				map.put("menu_price", ((AbstractMenu) list.get(i)).getMenuPrice());
				map.put("menu_classes", ((AbstractMenu) list.get(i)).getMenuClasses());
				map.put("food_num", ((AbstractMenu) list.get(i)).getFoodNum());
				map.put("food_name", ((AbstractMenu) list.get(i)).getFoodName());
				map.put("menu_price", ((AbstractMenu) list.get(i)).getMenuPrice());
				map.put("menu_discount", ((AbstractMenu) list.get(i)).getMenuDiscount());
				map.put("food_img", ((AbstractMenu) list.get(i)).getFoodImg());
				list1.add(map);
			}
		}
		
		
		return list1;
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

	public void AddMenu(String foodName, int foodNum, int menuClasses,
			int menuNum, int menuPrice, int menuResNum) {
		Menu menu = new Menu();

		menu.setFoodName(foodName);
		menu.setFoodNum(foodNum);
		menu.setMenuClasses(menuClasses);
		menu.setMenuNum(menuNum);
		menu.setMenuPrice(menuPrice);
		menu.setMenuResNum(menuResNum);

		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			// ��ʼһ������
			tx = session.beginTransaction();
			// �־û�����
			session.save(menu);
			// �ύ����
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

	public void deldetefun(int food_num, int res_num) {
		// int sign = 0;

		int id = search(food_num, res_num);

		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Menu menu = (Menu) session.get(Menu.class, id);
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
		// return sign;
	}

	public List searchid(int id) {
		List rs = new ArrayList();
		List list;
		List list_copy;
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(Menu.class);
		cri.add(Restrictions.eq("id", id));
		list = cri.list();
		list_copy = list;

		for (int i = 0; i < list_copy.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("food_id", ((AbstractMenu) list.get(i)).getId());
			map.put("menu_price", ((AbstractMenu) list.get(i)).getMenuPrice());
			map.put("menu_classes",
					((AbstractMenu) list.get(i)).getMenuClasses());
			map.put("food_num", ((AbstractMenu) list.get(i)).getFoodNum());
			map.put("food_name", ((AbstractMenu) list.get(i)).getFoodName());
			map.put("menu_price", ((AbstractMenu) list.get(i)).getMenuPrice());
			map.put("menu_discount",
					((AbstractMenu) list.get(i)).getMenuDiscount());
			map.put("food_img", ((AbstractMenu) list.get(i)).getFoodImg());
			list1.add(map);
		}
		return list1;
	}

	public int search(int food_num, int res_num) {
		// TODO Auto-generated method stub
		int id = 0;
		List list_copy;
		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(Menu.class);
		cri.add(Restrictions.eq("menuResNum", res_num));
		List list = cri.list();
		list_copy = list;

		for (int i = 0; i < list_copy.size(); i++) {
			Menu menu = (Menu) list.get(i);
			// String strUserName = user.getUserName();
			// String strUserPwd = user.getUserPwd();

			int i_res_num = menu.getMenuResNum();
			System.out.println(i_res_num);
			int i_food_num = menu.getFoodNum();
			System.out.println(i_food_num);

			if ((food_num == i_food_num) && (res_num == i_res_num)) {
				id = menu.getId();
				break;
			}
		}
		return id;
	}

	public void updatemenu(int id, int food_num, String food_name, int price,
			int classes, int menu_discount, String img) {
		Menu menu = new Menu();

		Configuration config = new Configuration().configure();// ��ʼ������ȡ�����ļ�
																// hibernate,cfg,xml
		SessionFactory sessionFactory = config.buildSessionFactory();// ��ȡ������ӳ���ļ�
																		// user.hbm.xml,����sessionfactory
		Session session = sessionFactory.openSession();// ��session
		Transaction tx = null;
		menu = (Menu) session.get(Menu.class, id);
		// user.setUserName("hello");
		// user.setUserPwd("helloword!");
		menu.setId(id);
		menu.setFoodNum(food_num);
		menu.setFoodName(food_name);
		menu.setMenuPrice(price);
		menu.setMenuClasses(classes);
		menu.setMenuDiscount(menu_discount);
		menu.setFoodImg(img);
		
		try {
			tx = session.beginTransaction();
			session.update(menu);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		} finally {
			session.close();
		}
	}

	public static void main(String[] args) throws HibernateException {
		System.out.println(new ManagerDao().searchid(1));
	}

}
