package com.example.project.models;
import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "product")
public class product {
    @Id
    @Column(name = "productid")
    private String productid;
    @Column(name = "productdescription")
private String productdescription;
    @Column(name = "productprice")
    private float productprice;

    public product(){

    }
    public product(String productid,String productdescription,float productprice){
        this.productid=productid;
        this.productdescription=productdescription;
        this.productprice=productprice;
    }
    public String getProductid() {
        return productid;
    }
    public void setProductidid(String productid) {
        this.productid = productid;
    }

    public String getProductdescription() {
        return productdescription;
    }
    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public float getProductprice () { return productprice; }
    public void setProductprice(float productprice) {
        this.productprice = productprice;
    }
}
