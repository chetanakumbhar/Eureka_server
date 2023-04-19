package com.example.productApplication.controller;

import com.example.productApplication.domain.Customer;
import com.example.productApplication.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    //      http://localhost:8081/api/v1/add-customer        [post]
    @PostMapping("/add-customer")
    public ResponseEntity addCustomer(@RequestBody Customer customer)
    {
        return new ResponseEntity<>(iCustomerService.addCustomer(customer), HttpStatus.CREATED);
    }
    //      http://localhost:8081/api/v1/get-customer         [Get]
    @GetMapping("/get-customer")
    public ResponseEntity getCustomer(HttpServletRequest httpServletRequest)
    {
        int id =(int) httpServletRequest.getAttribute("attr1");
        return new ResponseEntity(iCustomerService.getCustomer(id),HttpStatus.OK);
    }
}
