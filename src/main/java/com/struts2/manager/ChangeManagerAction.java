package com.struts2.manager;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException; 

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.manager.dao.ManagerDao;

public class ChangeManagerAction extends ActionSupport{
	
	
	public String getFood_num() {
		return food_num;
	}

	public void setFood_num(String food_num) {
		this.food_num = food_num;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getMenu_price() {
		return menu_price;
	}

	public void setMenu_price(String menu_price) {
		this.menu_price = menu_price;
	}

	public String getMenu_classes() {
		return menu_classes;
	}

	public void setMenu_classes(String menu_classes) {
		this.menu_classes = menu_classes;
	}

	public String getMenu_discount() {
		return menu_discount;
	}

	public void setMenu_discount(String menu_discount) {
		this.menu_discount = menu_discount;
	}

	public File getPic() {
		return pic;
	}

	public void setPic(File pic) {
		this.pic = pic;
	}

	public String getPicFileName() {
		return picFileName;
	}

	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}

	public String getPicContentType() {
		return picContentType;
	}

	public void setPicContentType(String picContentType) {
		this.picContentType = picContentType;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private int id;
	private String food_num;
	private String food_name;
	private String menu_price;
	private String menu_classes;
	private String menu_discount;
//	private String food_img;
	private File pic;     
	private String picFileName;  
	private String picContentType;  
	private InputStream inputStream;
	
	public String execute(){
		
		ManagerDao managerDao = new ManagerDao();
		ActionContext ctx = ActionContext.getContext();
		String resnum = (String) ctx.getSession().get("res_num");
		int res_num = Integer.valueOf(resnum);
		
        try {  
            //服务器的路径  
            String realpath = ServletActionContext.getServletContext().getRealPath("E:\\tools\\Web_Work\\E_Menu\\menu\\img");          
            //例如-------D:\apache-tomcat-6.0.18\webapps\struts2_upload\images       
            System.out.println("上传到服务器的地址realpath: "+realpath);   
            //具体地址+文件名  
            String lj = realpath+"\\"+picFileName;  
            System.out.println("具体的地址lujing"+lj);  
            //列如------  D:\apache-tomcat-7.0.47\webapps\dyda\shuju\15636139999[通话详单]查询_1_1.xls    
            if (pic != null) {              
                File savefile = new File(new File(realpath), picFileName);              
                if (!savefile.getParentFile().exists())   
                    savefile.getParentFile().mkdirs();    
                FileUtils.copyFile(pic, savefile);              
                ActionContext.getContext().put("message", "文件上传成功");          
            }  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
        String food_img = "img/"+picFileName;
        
        
        
        managerDao.updatemenu(getId(), Integer.valueOf(food_num), food_name, Integer.valueOf(menu_price), Integer.valueOf(menu_classes), Integer.valueOf(menu_discount), food_img);
        
        return SUCCESS;  
	}
	

	
}
