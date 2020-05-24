package com.struts2.waiter.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.hibernate.order.AbstractOrder;
import com.hibernate.order.Order;
import com.hibernate.user.HibernateSessionFactory;
import com.struts2.list.dao.ListSelectDao;

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
			map.put("order_num", ((AbstractOrder) list.get(i)).getOrdNum());//订单号
			map.put("order_res_num",
					((AbstractOrder) list.get(i)).getOrdResNum());
			
			//存放饭店名称
			map.put("order_res",ListSelectDao.select(((AbstractOrder) list.get(i)).getOrdResNum()));
			map.put("order_date", ((AbstractOrder) list.get(i)).getOrdDate());//订单日期
			map.put("order_people", ((AbstractOrder) list.get(i)).getOrdNumber());//订单要吃饭的人数
			map.put("order_user", ((AbstractOrder) list.get(i)).getOrdDate());//订单人
			map.put("order_price", ((AbstractOrder) list.get(i)).getOrdDate());//订单总价

			list1.add(map);
		}

		return list1;
	}
}
