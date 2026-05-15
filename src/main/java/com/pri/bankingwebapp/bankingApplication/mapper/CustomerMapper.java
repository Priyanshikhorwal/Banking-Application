package com.pri.bankingwebapp.bankingApplication.mapper;

import com.pri.bankingwebapp.bankingApplication.dto.CustomerDto;
import com.pri.bankingwebapp.bankingApplication.entity.Customer;

public class CustomerMapper {

    public static Customer mapToCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone_number(customerDto.getPhoneNumber());
        return customer;
    }
}
