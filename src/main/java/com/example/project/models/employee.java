package com.example.project.models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "employee")
public class employee {
    @Id
    @Column(name = "employeeid")
    private String employeeid;
    @Column(name = "employeefirstname")
    private String employeefirstname;
    @Column(name = "employeelastname")
    private String employeelastname;
    public employee(){

    }
    public employee(String employeeid,String employeefirstname,String employeelastname){
        this.employeeid=employeeid;
        this.employeefirstname=employeefirstname;
        this.employeelastname=employeelastname;

    }
    public String getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeefirstname() {
        return employeefirstname;
    }
    public void setEmployeefirstname(String employeefirstname) {
        this.employeefirstname = employeefirstname;
    }

    public String getEmployeelastname() {
        return employeelastname;
    }
    public void setEmployeelastname(String employeelastname) {
        this.employeelastname = employeelastname;
    }

}
