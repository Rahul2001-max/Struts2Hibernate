package com.example.action;

import java.util.List;
import java.util.Map;

import com.example.dao.UserDAO;
import com.example.model.User;

import com.example.service.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;

public class UserAction {
    private String username;
    private String password;
    User user = new User();
  
    UserServiceImpl userService = new UserServiceImpl();


    public UserServiceImpl getUserService() {
		return userService;
	}

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

    public String userLogin()
    {
    	
  	 return userService.checkLoginDetails(user.getUsername(),user.getPassword());
  	  	
    	
    }

    public String saveUserDetails()
    {
	    User user = new User(username, password); 
	  	 return userService.saveUser(user);
  	  	
    	
    }
    
    
    public String getUserDetails() {
    	System.out.println("inside action getuserdetails");
        int id = userService.getIdByName(user.getUsername());
        System.out.println(user.getUsername()+" id : "+id);
        if (id == -1) {
            System.out.println("User not found!");
            return "error";
        }

        user = userService.getUserBy(id);  // Get DTO instead of entity

        if (user != null) {
            System.out.println("Sending to JSP - ID: " + user.getId() + ", Username: " + user.getUsername());
            Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
            requestMap.put("user", user);
            return "data";  // Forward to JSP
        }

        return "error";
    }
    
    

    public String getUsername() {
		return username;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	// Getter for Struts2

    // Setter

	// Getters and Setters
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
 
}
