package com.example.productApplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private int houseNo;
    private String streetName;
    private String city;
    private String zipCode;
}
