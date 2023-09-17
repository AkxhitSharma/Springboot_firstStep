package com.assignment.assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userModel{

    @Id
    public int aid;
    public String name ;
    public String email;
    public String password;

    public void setaid(int aid){
        this.aid=aid;
    }

    public void setname(String name){
        this.name=name;
    }

    public void setemail(String email){
        this.email=email;
    }
    public void setpassword(String password){
        this.password=password;
    }



}
