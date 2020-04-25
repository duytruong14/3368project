package com.example.project.models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "transaction")
public class transaction {
    @Id
    @Column(name = "transactionid")
    private String transactionid;
    @Column(name = "employeeid")
    private String employeeid;
    @Column(name = "customerid")
    private String customerid;
    @Column(name = "productid")
    private String productid;
    @Column(name = "receiptnumber")
    private int receiptnumber;
    public transaction(){

    }
    public transaction(String transactionid,String employeeid,String customerid,String productid,int receiptnumber){
        this.transactionid=transactionid;
        this.employeeid=employeeid;
        this.customerid=customerid;
        this.productid=productid;
        this.receiptnumber=receiptnumber;
    }
    public String getTransactionid() {
        return transactionid;
    }
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(String customerid) {
        this.employeeid = employeeid;
    }

    public String getCustomerid() {
        return customerid;
    }
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getProductid() {
        return productid;
    }
    public void setProductidid(String productid) {
        this.productid = productid;
    }

    public int getReceiptnumber() {
        return receiptnumber;
    }
    public void setReceiptnumber(int productid) {
        this.receiptnumber = receiptnumber;
    }
}
