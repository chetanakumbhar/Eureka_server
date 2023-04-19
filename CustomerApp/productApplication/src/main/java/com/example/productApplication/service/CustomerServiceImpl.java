package com.example.productApplication.service;

import com.example.productApplication.domain.Customer;
import com.example.productApplication.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public Customer addCustomer(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return iCustomerRepository.findById(id).get();
    }
}
