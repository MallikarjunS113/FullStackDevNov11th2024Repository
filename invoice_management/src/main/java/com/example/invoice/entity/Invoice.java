package com.example.invoice.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.math.BigDecimal;
import java.util.Date;


@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "invoiceNumber")
    private String invoiceNumber;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "email")
    private String email;

    @Column(name = "unitPrice")
    private String unitPrice;

    @Column(name = "totalAmount")
    private Double totalAmount;

    @Column(name = "paymentStatus")
    private String paymentStatus;


    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date", nullable = false, updatable = true)
    private Date updatedDate;

    public Invoice() {

    }

    public Invoice(Long id, String invoiceNumber, Double amount, Integer quantity, String email, String unitPrice, Double totalAmount, String paymentStatus, Date createdDate, Date updatedDate) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.quantity = quantity;
        this.email = email;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Invoice(String invoiceNumber, Double amount, Integer quantity, String email, String unitPrice, Double totalAmount, String paymentStatus, Date createdDate, Date updatedDate) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.quantity = quantity;
        this.email = email;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount)
    {
        this.amount = amount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}





