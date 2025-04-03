package com.example.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;  // Primary key
    private String username;
    private String password;

    // Default constructor
    public User() {}

    // Constructor with parameters (excluding id, as it's auto-generated)
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
