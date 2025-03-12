package com.internship.project.CollegeManagementSystem.repository;

import com.internship.project.CollegeManagementSystem.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByName(String name);
    Student findByEmail(String email);
    Student findByPhoneNumber(String phoneNumber);
    List<Student> findByAddress(String address);

    // JPQL Methods

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Student WHERE email=:email")
    void deleteByEmail(String email);
}


