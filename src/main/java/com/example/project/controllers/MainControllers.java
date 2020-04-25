package com.example.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.UUID;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.models.customer;
import com.example.project.models.customerRepo;
import com.example.project.models.employee;
import com.example.project.models.employeeRepo;
import com.example.project.models.product;
import com.example.project.models.productRepo;
import com.example.project.models.transaction;
import com.example.project.models.transactionRepo;
@Controller
public class MainControllers {
    @Autowired
customerRepo CustomerRepo;
    @Autowired
employeeRepo EmployeeRepo;
    @Autowired
productRepo ProductRepo;
    @Autowired
    transactionRepo TransactionRepo;

    //Main page mapping
    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("Customerlist", CustomerRepo.findAll());
        mv.addObject("Employeelist", EmployeeRepo.findAll());
        mv.addObject("Productlist", ProductRepo.findAll());
        mv.addObject("Transactionlist", TransactionRepo.findAll());
        return mv;
    }
    @RequestMapping( value = "/viewcustomer", method = RequestMethod.GET)
    public ModelAndView Customer(){
        ModelAndView mv = new ModelAndView("viewcustomer");
        mv.addObject("Customerlist", CustomerRepo.findAll());
        return mv;
    }
    @RequestMapping( value = "/viewemployee", method = RequestMethod.GET)
    public ModelAndView Employee(){
        ModelAndView mv = new ModelAndView("viewemployee");
        mv.addObject("Employeelist", EmployeeRepo.findAll());
        return mv;
    }
    @RequestMapping( value = "/viewinventory", method = RequestMethod.GET)
    public ModelAndView Inventory(){
        ModelAndView mv = new ModelAndView("viewinventory");
        mv.addObject("Productlist", ProductRepo.findAll());
        return mv;
    }
    @RequestMapping( value = "/viewtransaction", method = RequestMethod.GET)
    public ModelAndView Transaction(){
        ModelAndView mv = new ModelAndView("viewtransaction");
        mv.addObject("Customerlist", CustomerRepo.findAll());
        mv.addObject("Employeelist", EmployeeRepo.findAll());
        mv.addObject("Productlist", ProductRepo.findAll());
        mv.addObject("Transactionlist", TransactionRepo.findAll());
        return mv;
    }





    //Customer mapping

//add customer
    @RequestMapping( value = "/addcustomer", method = RequestMethod.POST)
    public ModelAndView AddCustomer(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname){
        ModelAndView mv = new ModelAndView("redirect:/viewcustomer");
        customer c=new customer();

        c.setCustomerfirstname(firstname);
        c.setCustomerlastname(lastname);
        UUID id=UUID.randomUUID();
        String id2=id.toString();
        c.setCustomerid(id2);
        CustomerRepo.save(c);
        mv.addObject("Customerlist", CustomerRepo.findAll());
        return mv;

    }



    //delete customer
    @RequestMapping( value = "/deletecustomer/{id}", method = RequestMethod.GET)
    public ModelAndView deleteC(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("viewcustomer");
        CustomerRepo.deleteById(id);
        mv.addObject("Customerlist", CustomerRepo.findAll());
        return mv;
    }


    //Employee mapping
    //add employee
    @RequestMapping( value = "/addemployee", method = RequestMethod.POST)
    public ModelAndView AddEmployee(@RequestParam("first") String first,@RequestParam("last") String last){
        ModelAndView mv = new ModelAndView("viewemployee");
        employee e=new employee();

        e.setEmployeefirstname(first);
        e.setEmployeelastname(last);
        UUID id=UUID.randomUUID();
        String id2=id.toString();
        e.setEmployeeid(id2);
        EmployeeRepo.save(e);
        mv.addObject("Employeelist", EmployeeRepo.findAll());
        return mv;

    }

    //delete employee
    @RequestMapping( value = "/deleteemployee/{id}", method = RequestMethod.GET)
    public ModelAndView deleteE(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("viewemployee");
        EmployeeRepo.deleteById(id);
        mv.addObject("Employeelist", EmployeeRepo.findAll());
        return mv;
    }



    //Product mapping
    //add new product
    @RequestMapping( value = "/addproduct", method = RequestMethod.POST)
    public ModelAndView AddP(@RequestParam("description") String description,@RequestParam("price") float price){
        ModelAndView mv = new ModelAndView("viewinventory");
        product p=new product();

        p.setProductdescription(description);
        p.setProductprice(price);
        UUID id=UUID.randomUUID();
        String id2=id.toString();
        p.setProductidid(id2);
        ProductRepo.save(p);
        mv.addObject("Productlist", ProductRepo.findAll());
        return mv;


    }

    //delete product
    @RequestMapping( value = "/deleteproduct/{id}", method = RequestMethod.GET)
    public ModelAndView deleteP(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("viewinventory");
        ProductRepo.deleteById(id);
        mv.addObject("Productlist", ProductRepo.findAll());
        return mv;
    }
    //final check
}
