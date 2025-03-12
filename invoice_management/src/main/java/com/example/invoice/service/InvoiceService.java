package com.example.invoice.service;

import com.example.invoice.entity.Invoice;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface InvoiceService {
    Invoice createInvoice(Invoice invoice);
    Invoice getInvoicesById(Long id);
    List<Invoice> getAllInvoice();
    void deleteInvoice(Long id);
    Invoice updateInvoice(Long id,Invoice invoice);

    // Finder Methods
    Invoice getByInvoiceNumber(String invoiceNumber);

    List<Invoice> getByAmount(Double amount);

    List<Invoice> getByQuantity(Integer quantity);

    List<Invoice> getByTotalAmount(Double totalAmount);


    // JPQL Methods

    void deleteByInvoiceNumber(String invoiceNumber);


}

