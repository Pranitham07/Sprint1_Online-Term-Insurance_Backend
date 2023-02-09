package com.cg.OnlineTermInsurance.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String password;
    public Login(String password) {
        super();
        this.password = password;
    }
    public Login() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Login [id=" + id + ", password=" + password + "]";
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



 

}
    

