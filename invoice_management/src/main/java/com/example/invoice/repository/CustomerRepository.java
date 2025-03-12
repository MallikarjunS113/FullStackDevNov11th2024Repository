package com.example.invoice.repository;

import com.example.invoice.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Finder Methods
    List<Customer> findByName(String name);

    Customer findByEmail(String email);

    List<Customer> findByAccountNumber(String accountNumber);

    List<Customer> findByShippingAddress(String shippingAddress);


    // JPQL Methods

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Customer WHERE email=:email")
    void deleteByEmail(@Param("email") String email);


}

