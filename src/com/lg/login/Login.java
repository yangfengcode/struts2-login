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
	    
	//此处验证用户必须等hello 密码登录word才会返回成功页面。当然，真实开发中肯定不会这样写，这里只是做一个模拟。
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
	    
	//下面内容判断用户名不能为空
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
