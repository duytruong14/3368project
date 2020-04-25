package com.example.project.models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "customer")
public class customer {
    @Id
    @Column(name = "customerid")
    private String customerid;
    @Column(name = "customerfirstname")
    private String customerfirstname;
    @Column(name = "customerlastname")
    private String customerlastname;
    public customer(){

    }
    public customer(String customerfirstname,String customerlastname,String customerid){
        this.customerid=customerid;
        this.customerfirstname=customerfirstname;
        this.customerlastname=customerlastname;

    }
    public String getCustomerid() { return customerid; }
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }
    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public String getCustomerlastname() {
        return customerlastname;
    }
    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname;
    }

}

