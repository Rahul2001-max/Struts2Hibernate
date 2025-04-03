package com.example.service;

import java.util.List;

import com.example.dao.UserDAO;
import com.example.model.User;


public class UserServiceImpl {

	UserDAO dao = new UserDAO();
	User user = new User();


	public String checkLoginDetails(String username, String password)
	{
		 List<User> users = dao.getAllUsers();
	  	  for (User emp : users) {
		        if(username.equals(emp.getUsername())) {
		        	 System.out.println("User found: " + username);
		        	if(password.equals(emp.getPassword())) {
		        		System.out.println("Login successful!");
		        		return "loginsuccess";
		        	}
		        	else {
		        		System.out.println("Incorrect password!");
		        		return "error";
		        	}
		        }
		    }
	  	  System.out.println("User not found!");
		  return "error";

	}
	
	public String saveUser(User user)
	{ 
		boolean isSaved = dao.saveUser(user);
	    if (isSaved) {
	        System.out.println("User saved successfully!");
	        return "success";
	    }
	    System.out.println("Error saving user.");
	    return "error";
		
	}
	
    public int getIdByName(String username)
    {
    	return dao.getIdByName(username);
    }
	    
	
	public User getUserBy(int id) {
		
		user = dao.getUserById(id);
		return user;
	}

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
