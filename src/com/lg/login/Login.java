package com.lg.login;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	  private String username;
	    private String password;
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	//�˴���֤�û������hello �����¼word�Ż᷵�سɹ�ҳ�档��Ȼ����ʵ�����п϶���������д������ֻ����һ��ģ�⡣
	    public String execute() throws Exception
	    {
	        if("hello".equals(this.getUsername().trim()) && "world".equals(this.getPassword().trim()))
	        {
	            return "success";
	        }
	        else
	        {
	            this.addFieldError("username", "usernmae or password error");
	            return "failer";
	        }
	        
	    }
	    
	//���������ж��û�������Ϊ��
	    @Override
	    public void validate()
	    {
	        if(null == this.getUsername() || "".equals(this.getUsername().trim()))
	        {
	            this.addFieldError("username", "username error");
	        }
	        
	        if(null == this.getPassword() || "".equals(this.getPassword().trim()))
	        {
	            this.addFieldError("password", "username error");
	        }
	    }
}
