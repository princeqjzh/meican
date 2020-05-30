package com.struts2.menu.dao;

import com.hibernate.menu.AbstractMenu;
import com.hibernate.menu.Menu;
import com.hibernate.user.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuDao {
	public static List listMenu(int res_num) {
		List rs = new ArrayList();
		List list;
		List list_copy;
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		
		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(Menu.class);
		cri.add(Restrictions.eq("menuResNum", res_num));
		list = cri.list();
		list_copy = list;
		
		
		
		for (int i=0; i<list_copy.size(); i++){
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
		return list1;
	}
	

	public static void main(String[] args) throws HibernateException{
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = listMenu(10001);

		System.out.println(rs.get(0));
	}
}
