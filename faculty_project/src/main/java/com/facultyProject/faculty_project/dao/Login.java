package com.facultyProject.faculty_project.dao;

import javax.persistence.*;

@Entity

@Table(name = "Login")
public class Login {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String login_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


}
