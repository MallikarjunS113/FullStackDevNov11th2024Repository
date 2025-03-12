package com.example.invoice.serviceimpl;


import com.example.invoice.entity.Invoice;
import com.example.invoice.exception.ResourceNotFoundException;
import com.example.invoice.repository.InvoiceRepository;
import com.example.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoicesById(Long id) {
        return invoiceRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("The  Invoice number Does not exist!!!"));
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return invoiceRepository.findAll();
    }

    @Override
    public void deleteInvoice(Long id) {
        invoiceRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Customer number Does not exist!!!"));
        invoiceRepository.deleteById(id);
    }

    @Override
    public Invoice updateInvoice(Long id,Invoice invoice) {
        Invoice invoice1 = invoiceRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The customer number is not not found"));
        invoice1.setId(id);
        invoice1.setInvoiceNumber(invoice1.getInvoiceNumber());
        invoice1.setAmount(invoice1.getAmount());
        return invoiceRepository.save(invoice1);
    }

    @Override
    public Invoice getByInvoiceNumber(String invoiceNumber) {
        return invoiceRepository.findByInvoiceNumber(invoiceNumber);
    }

    @Override
    public List<Invoice> getByAmount(Double amount) {
        return invoiceRepository.findByAmount(amount);
    }

    @Override
    public List<Invoice> getByQuantity(Integer quantity) {
        return invoiceRepository.findByQuantity(quantity);
    }

    @Override
    public List<Invoice> getByTotalAmount(Double totalAmount) {
        return invoiceRepository.findByTotalAmount(totalAmount);
    }

    @Override
    public void deleteByInvoiceNumber(String invoiceNumber) {
         invoiceRepository.deleteByInvoiceNumber(invoiceNumber);
    }


}


