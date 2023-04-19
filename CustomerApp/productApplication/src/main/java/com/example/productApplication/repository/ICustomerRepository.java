package com.example.productApplication.repository;

import com.example.productApplication.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends MongoRepository<Customer,Integer> {
}
