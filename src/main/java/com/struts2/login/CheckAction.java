/**
 * 
 */
package com.struts2.login;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.login.dao.LoginDao;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckAction extends ActionSupport{
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute(){
		LoginDao logindao = new LoginDao();
		HttpServletResponse response=ServletActionContext.getResponse();  
        response.setContentType("text/html;charset=utf-8");  
        PrintWriter out=null;  
        try {  
            out=response.getWriter();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        boolean flag=logindao.checkName(getUsername());  
          
        if(flag){  
            out.print("flag = " + flag);
        }else{  
            out.print("flag = " + flag);
        }  
        out.flush();  
        out.close();  
        return "reg";  
    }  

}
