package com.internship.project.CollegeManagementSystem.repository;



import com.internship.project.CollegeManagementSystem.entity.College;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CollegeRepository extends JpaRepository<College, Long> {

    List<College> findByName(String name);
    List<College> findByAddress(String address);
    College findByRankings(String rankings);
    List<College> findByAffiliatedUniversity(String affiliatedUniversity);

    //  JPQL Methods
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM College WHERE contactNumber=:contactNumber")
    void deleteByContactNumber(String contactNumber);
}

