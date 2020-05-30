package com.struts2.order.dao;

import com.hibernate.user.HibernateSessionFactory;
import com.hibernate.user.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ResWaitDao {
    public String reswaiter(int res_num) {
        String name = null;
        try {
            Session session = HibernateSessionFactory.getSession();
            Criteria cri = session.createCriteria(User.class);
            cri.add(Restrictions.eq("userRes", res_num));
            List list = cri.list();
            if (list != null && list.size() != 0) {
                User user = (User) list.get(0);
                if (user.getUserSign() == 2)
                    name = user.getUserName();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ;
        }

        return name;
    }
}
