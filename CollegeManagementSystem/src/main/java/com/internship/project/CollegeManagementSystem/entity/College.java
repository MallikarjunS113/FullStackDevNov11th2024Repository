package com.internship.project.CollegeManagementSystem.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_college")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "college_name")
    private String name;

    @Column(name = "college_address")
    private String address;

    @Column(name = "affiliatedUniversity")
    private String affiliatedUniversity;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "studentCapacity")
    private Integer studentCapacity;

    @Column(name = "facultyCount")
    private Integer facultyCount;

    @Column(name = "rankings")
    private String rankings;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date", nullable = false, updatable = true)
    private Date updatedDate;


    public College(){

    }

    public College(Long id, String name, String address, String affiliatedUniversity, String contactNumber, String email, Integer studentCapacity, Integer facultyCount, String rankings, Date createdDate, Date updatedDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.affiliatedUniversity = affiliatedUniversity;
        this.contactNumber = contactNumber;
        this.email = email;
        this.studentCapacity = studentCapacity;
        this.facultyCount = facultyCount;
        this.rankings = rankings;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public College(String name, String address, String affiliatedUniversity, String contactNumber, String email, Integer studentCapacity, Integer facultyCount, String rankings, Date createdDate, Date updatedDate) {
        this.name = name;
        this.address = address;
        this.affiliatedUniversity = affiliatedUniversity;
        this.contactNumber = contactNumber;
        this.email = email;
        this.studentCapacity = studentCapacity;
        this.facultyCount = facultyCount;
        this.rankings = rankings;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAffiliatedUniversity() {
        return affiliatedUniversity;
    }

    public void setAffiliatedUniversity(String affiliatedUniversity) {
        this.affiliatedUniversity = affiliatedUniversity;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public Integer getFacultyCount() {
        return facultyCount;
    }

    public void setFacultyCount(Integer facultyCount) {
        this.facultyCount = facultyCount;
    }

    public String getRankings() {
        return rankings;
    }

    public void setRankings(String rankings) {
        this.rankings = rankings;
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

