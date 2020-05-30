package com.struts2.restaurant.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hibernate.restaurant.AbstractRestaurant;
import com.hibernate.restaurant.Restaurant;
import com.hibernate.user.HibernateSessionFactory;
import com.hibernate.user.User;

public class RestaurantDao {

	public static List listResraurant() {
		List rs = new ArrayList();
		List list;
		int a[] = RandomNum();
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		for (int i = 1; i <= 6; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Session session = HibernateSessionFactory.getSession();
			Criteria cri = session.createCriteria(Restaurant.class);
			cri.add(Restrictions.eq("id", a[i - 1]));
			// System.out.println(a[i-1]);
			list = cri.list();
			map.put("res_id", ((AbstractRestaurant) list.get(0)).getId());
			map.put("res_num", ((AbstractRestaurant) list.get(0)).getResNum());
			map.put("res_name", ((AbstractRestaurant) list.get(0)).getResName());
			map.put("res_pro", ((AbstractRestaurant) list.get(0)).getResPro());
			map.put("res_city", ((AbstractRestaurant) list.get(0)).getResCity());
			map.put("res_add", ((AbstractRestaurant) list.get(0)).getResAdd());
			map.put("res_tel", ((AbstractRestaurant) list.get(0)).getResTel());
			map.put("res_rank", ((AbstractRestaurant) list.get(0)).getResRank());
			map.put("res_img",
					((AbstractRestaurant) list.get(0)).getAddperson());
			list1.add(map);
			session.close();
		}
		// System.out.println(list1.get(0));
		// System.out.println(list1.get(1));
		// System.out.println(list1.get(2));
		// System.out.println(list1.get(3));
		// System.out.println(list1.get(4));
		// System.out.println(list1.get(5));
		return list1;

	}

	public static List SearchResraurant(String key) {
		List rs = new ArrayList();
		List list;
		int a[] = RandomNum();
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		for (int i = 1; i <= 6; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Session session = HibernateSessionFactory.getSession();
			Criteria cri = session.createCriteria(Restaurant.class);
			cri.add(Restrictions.eq("id", a[i - 1]));
			// System.out.println(a[i-1]);
			list = cri.list();
			if (((AbstractRestaurant) list.get(0)).getResName().contains(key)
					|| ((AbstractRestaurant) list.get(0)).getResPro()
							.contains(key)
					|| ((AbstractRestaurant) list.get(0)).getResCity()
							.contains(key)) {
				map.put("res_id", ((AbstractRestaurant) list.get(0)).getId());
				map.put("res_num",
						((AbstractRestaurant) list.get(0)).getResNum());
				map.put("res_name",
						((AbstractRestaurant) list.get(0)).getResName());
				map.put("res_pro",
						((AbstractRestaurant) list.get(0)).getResPro());
				map.put("res_city",
						((AbstractRestaurant) list.get(0)).getResCity());
				map.put("res_add",
						((AbstractRestaurant) list.get(0)).getResAdd());
				map.put("res_tel",
						((AbstractRestaurant) list.get(0)).getResTel());
				map.put("res_rank",
						((AbstractRestaurant) list.get(0)).getResRank());
				map.put("res_img",
						((AbstractRestaurant) list.get(0)).getAddperson());
				list1.add(map);
				session.close();
			}
		}
		return list1;

	}

	public void DealStrSearch(String key) {
		;
	}

	public static int[] RandomNum() {
		int[] a = new int[6];
		int n = 6;
		Random rand = new Random();
		boolean[] bool = new boolean[n + 1];

		int num = 0;

		for (int i = 0; i < 6; i++) {
			do {
				num = (rand.nextInt(n) + 1);

			} while (bool[num]);

			bool[num] = true;

			a[i] = num;
			// System.out.println(a[i]);
		}
		return a;
	}

	public static void main(String[] args) throws HibernateException {
		List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
		rs = SearchResraurant("姥姥家");
		System.out.println(rs);
	}

}
