package com.struts2.waiter.dao;

import com.hibernate.order.AbstractOrder;
import com.hibernate.order.Order;
import com.hibernate.user.HibernateSessionFactory;
import com.struts2.list.dao.ListSelectDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WaiterView {
	
	public static List listOrder(String username) {
		List rs = new ArrayList();
		List list;
		List list_copy;
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(Order.class);
		cri.add(Restrictions.eq("ordWaiterName", username));
		list = cri.list();
		list_copy = list;

		for (int i = 0; i < list_copy.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("order_num", ((AbstractOrder) list.get(i)).getOrdNum());
			map.put("order_res_num",
					((AbstractOrder) list.get(i)).getOrdResNum());
			map.put("order_res",ListSelectDao.select(((AbstractOrder) list.get(i)).getOrdResNum()));
			map.put("order_date", ((AbstractOrder) list.get(i)).getOrdDate());
			map.put("order_people", ((AbstractOrder) list.get(i)).getOrdNumber());
			map.put("order_user", ((AbstractOrder) list.get(i)).getOrdDate());
			map.put("order_price", ((AbstractOrder) list.get(i)).getOrdDate());
			list1.add(map);
		}

		return list1;
	}
}
