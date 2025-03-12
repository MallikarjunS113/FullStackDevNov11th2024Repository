package com.gentech.university.entity;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_university")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UniversityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private  Integer universityId;
    @Column(name = "university_name")
    private String universityName;
    @Column(name = "university_established_date")
    private Date universityEstablishedDate;
    @Column(name = "university_location")
    private String universityLocation;
    @Column(name = "university_email")
    private String universityEmail;
    @Column(name = "university_contact_number")
    private Long universityContactNumber;
    @Column(name = "university_rank")
    private Integer universityRank;
    @Column(name = "created_date")
    @CreationTimestamp
    Date createdDate;
    @Column(name = "updated_date")
    @UpdateTimestamp
    Date updatedDate;

}
