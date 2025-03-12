package com.example.invoice.controller;

import com.example.invoice.entity.Invoice;
import com.example.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/createinvoice")
    public ResponseEntity<Invoice>createInvoice(@PathVariable Long id, @RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceService.createInvoice(invoice),HttpStatus.OK);
    }

    @GetMapping("/invoice/{id}")
    public ResponseEntity<Invoice>getByInvoicesId(@PathVariable Long invoiceId) {
            return new ResponseEntity<>(invoiceService.getInvoicesById(invoiceId),HttpStatus.OK);
    }

    @GetMapping("/invoiceall")
    public ResponseEntity<List<Invoice>>getAllInvoice() {
        return new ResponseEntity<>(invoiceService.getAllInvoice(),HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Invoice>updateInvoice(@PathVariable Long id, @RequestBody Invoice invoice) {
        invoice.setId(id);
        return new ResponseEntity<>(invoiceService.updateInvoice(id,invoice),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>deleteInvoice(@PathVariable Long id) {
        invoiceService.deleteInvoice(id);
        return new ResponseEntity<>("The Invoice With ID"+id+"has deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/invoicenumber/{invoiceNumber}")
    public ResponseEntity<Invoice>getByInvoiceNumber(@PathVariable String invoiceNumber) {
        return new ResponseEntity<>(invoiceService.getByInvoiceNumber(invoiceNumber),HttpStatus.OK);
    }

    @GetMapping("/amount/{amount}")
    public ResponseEntity<List<Invoice>>getByAmount(@PathVariable Double amount) {
        return new ResponseEntity<>(invoiceService.getByAmount(amount),HttpStatus.OK);
    }

    @GetMapping("/quantity/{quantity}")
    public ResponseEntity<List<Invoice>>getByQuantity(Integer quantity) {
        return new ResponseEntity<>(invoiceService.getByQuantity(quantity),HttpStatus.OK);
    }


    @GetMapping("/totalAmount/{totalAmount}")
    public ResponseEntity<List<Invoice>> getByTotalAmount(Double totalAmount) {
        return new ResponseEntity<>(invoiceService.getByTotalAmount(totalAmount),HttpStatus.OK);
    }

    @DeleteMapping("/deleteinvoicenumber/{invoiceNumber}")
    public ResponseEntity<String>deleteByInvoiceNumber(@PathVariable String invoiceNumber) {
        invoiceService.deleteByInvoiceNumber(invoiceNumber);
        return new ResponseEntity<>("The Invoice With Number"+invoiceNumber+"has deleted successfully", HttpStatus.OK);
    }
}

