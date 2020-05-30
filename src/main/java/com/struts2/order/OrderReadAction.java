package com.struts2.order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.order.dao.OrderDao;
import com.struts2.order.dao.ReadDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderReadAction extends ActionSupport {

    public String execute() {

        ActionContext ctx = ActionContext.getContext();

        String username = (String) ctx.getSession().get("user");
        OrderDao orderdao = new OrderDao();

        ReadDao orderRead = new ReadDao();
        List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();
        rs = orderdao.listOrder(username);
        ctx.getSession().put("order_list", rs);

        return SUCCESS;
    }
}
