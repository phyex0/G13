package com.mycompany.g13.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(unique=true)
    private String phoneNumber;
    private String name;
    private long star;

    public Client() {}

    public Client(String phoneNumber, String name, long star) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.star=star;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getStar() {
        return star;
    }

    public void setStar(long star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Client{" + "phoneNumber=" + phoneNumber + ", name=" + name + ", star=" + star + '}';
    }
    
  
}
