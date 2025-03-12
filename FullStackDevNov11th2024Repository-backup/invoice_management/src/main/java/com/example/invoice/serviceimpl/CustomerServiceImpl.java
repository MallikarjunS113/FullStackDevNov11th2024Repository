package com.example.invoice.serviceimpl;

import com.example.invoice.entity.Customer;
import com.example.invoice.exception.ResourceNotFoundException;
import com.example.invoice.repository.CustomerRepository;
import com.example.invoice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getByCustomerId(Long id) {
        return customerRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The  Customer number Does not exist!!!"));
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Customer number Does not exist!!!"));
        customerRepository.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer customer1 = customerRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The customer number is not not found"));
        customer1.setName(customer1.getName());
        customer1.setEmail(customer1.getEmail());
        return customerRepository.save(customer1);
    }

    @Override
    public List<Customer> getByName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public Customer getByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public List<Customer> getByAccountNumber(String accountNumber) {
        return customerRepository.findByAccountNumber(accountNumber);
    }


    @Override
    public List<Customer> getByShippingAddress(String shippingAddress) {
        return customerRepository.findByShippingAddress(shippingAddress);
    }

    @Override
    public void deleteByEmail(String email) {
        customerRepository.deleteByEmail(email);
    }
}

