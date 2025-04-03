package com.example.dao;

import com.example.model.User;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {
    private static SessionFactory factory;
    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public boolean saveUser(User user) {
        Session session = factory.openSession();
        Transaction tx = null;
        boolean success = false;
        try {
            tx = session.beginTransaction();
            session.save(user);
            tx.commit();
            success = true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return success;
    }
    

    public List<User> getAllUsers() {
        List<User> userList = null;
        Transaction transaction = null;

        try (Session session = factory.openSession()) {
            transaction = session.beginTransaction();
            userList = session.createQuery("FROM User", User.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return userList;
    }
    
    public User getUserById(int id)
    {
    	Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        User user = session.get(User.class, id);
        if (user != null) {
            System.out.println("Fetched User: ID = " + user.getId() + ", Username = " + user.getUsername() + ", Password = " + user.getPassword());
        } else {
            System.out.println("User not found with ID: " + id);
        }
        tx.commit();
        session.close();
        return user;
    }
    
    public int getIdByName(String username)
	{	Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();
	    User user = session.createQuery("FROM User WHERE username = :username", User.class)
                .setParameter("username", username)
                .uniqueResult();
    	
    	return (user != null) ? user.getId() : -1;  // Return -1 if user not found
    }
}
