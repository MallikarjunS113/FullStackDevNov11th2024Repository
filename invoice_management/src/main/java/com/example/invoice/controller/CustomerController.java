package com.example.invoice.controller;


import com.example.invoice.entity.Customer;
import com.example.invoice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/createcustomer")
    public ResponseEntity<Customer>createCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer),HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getByCustomerId(@PathVariable Long id){
        return new ResponseEntity<>(customerService.getByCustomerId(id),HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Customer>updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customer.setId(id);
        return new ResponseEntity<>(customerService.updateCustomer(id,customer),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<>("The Customer With ID"+id+"has deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/customername/{name}")
    public ResponseEntity<List<Customer>> getByName(@PathVariable String name){
        return new ResponseEntity<>(customerService.getByName(name),HttpStatus.OK);
    }

    @GetMapping("/customeremail/{email}")
    public ResponseEntity<Customer> getByEmail(@PathVariable String email){
        return new ResponseEntity<>(customerService.getByEmail(email),HttpStatus.OK);
    }

    @DeleteMapping("/deleteemail/{email}")
    public ResponseEntity<String> deleteByEmail(@PathVariable String email) {
        customerService.deleteByEmail(email);
        return new ResponseEntity<>("The Customer With email"+email+"has deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/accountNumber/{accountNumber}")
    public ResponseEntity<List<Customer>>getByAccountNumber(String accountNumber) {
        return new ResponseEntity<>(customerService.getByAccountNumber(accountNumber),HttpStatus.OK);
    }

    @GetMapping("/shippingAddress/{shippingAddress}")
    public ResponseEntity<List<Customer>>getByShippingAddress(String shippingAddress) {
        return new ResponseEntity<>(customerService.getByShippingAddress(shippingAddress),HttpStatus.OK);
    }

}

