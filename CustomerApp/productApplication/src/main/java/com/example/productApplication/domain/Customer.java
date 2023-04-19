package com.example.productApplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class Customer {
    @Id
    private int customerId;
    private String customerName;
    private String customerPhoneNo;
    private List<Address> addressList;
}
