package com.example.productApplication.service;

import com.example.productApplication.domain.Customer;

import java.util.List;

public interface ICustomerService {
    public Customer addCustomer(Customer customer);
    public Customer getCustomer(int id);
}
