package com.springs.springs.hibernate;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
public class Employee  implements Serializable{
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    //@Id
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @NotNull
    private String name;
    private String phone;
}


