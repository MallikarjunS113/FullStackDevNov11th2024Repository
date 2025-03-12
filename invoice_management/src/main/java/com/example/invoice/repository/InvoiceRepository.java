package com.example.invoice.repository;

import com.example.invoice.entity.Invoice;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    // Finder Methods
    Invoice findByInvoiceNumber(String invoiceNumber);
    List<Invoice> findByAmount(Double amount);
    List<Invoice> findByQuantity(Integer quantity);
    List<Invoice> findByTotalAmount(Double totalAmount);


    // JPQL Methods
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Invoice WHERE invoiceNumber=:invoiceNumber")
    void deleteByInvoiceNumber(@Param("invoiceNumber") String invoiceNumber);



}

