package com.example.invoice.service;

import com.example.invoice.entity.Customer;

import java.util.Date;
import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getByCustomerId(Long id);
    void deleteCustomer(Long id);
    Customer updateCustomer(Long id,Customer customer);

    // Finder Methods
    List<Customer> getByName(String name);

    Customer getByEmail(String email);

    List<Customer> getByAccountNumber(String accountNumber);

    List<Customer> getByShippingAddress(String shippingAddress);


    // JPQL Methods
    void deleteByEmail(String email);


}

