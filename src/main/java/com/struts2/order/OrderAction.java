package com.struts2.order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.order.dao.OrderDao;
import com.struts2.order.dao.ResWaitDao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class OrderAction extends ActionSupport {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private int people;
    private String time;

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String execute() {
        int order_people = 0;
        order_people = Integer.valueOf(getPeople());
        String order_time = getTime();

        Cookie[] cookies;
        HttpServletRequest request = ServletActionContext.getRequest();
        cookies = request.getCookies();
        int res_num = 0, total = 0;

        ActionContext ctx = ActionContext.getContext();

        int order_num = (Integer) ctx.getSession().get("ordernum");
        String username = (String) ctx.getSession().get("user");

        res_num = (Integer) ctx.getSession().get("res_num");
        total = (Integer) ctx.getSession().get("total");

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("res_num")) {
                String temp = (String) cookie.getValue();
                res_num = Integer.valueOf(temp);
            }
            if (cookie.getName().equals("total")) {
                String temp1 = (String) cookie.getValue();
                total = Integer.valueOf(temp1);
            }
        }
        OrderDao oderdao = new OrderDao();
        ResWaitDao res = new ResWaitDao();
        String namewaiter = res.reswaiter(res_num);
        oderdao.AddOrder(order_num, total, res_num, order_people, username,
                order_time, namewaiter);

        return SUCCESS;

    }

}
