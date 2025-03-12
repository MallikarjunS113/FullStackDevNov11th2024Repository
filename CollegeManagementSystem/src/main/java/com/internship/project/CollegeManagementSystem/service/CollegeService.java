package com.internship.project.CollegeManagementSystem.service;


import com.internship.project.CollegeManagementSystem.entity.College;

import java.util.List;

public interface CollegeService {
        College createCollege(College college);
        List<College> getAllColleges();
        College getCollegeById(Long id);
        College modifyCollege(Long id, College college);
        void deleteCollege(Long id);


        List<College> getByName(String name);
        List<College> getByAddress(String address);
        College getByRankings(String rankings);
        List<College> getByAffiliatedUniversity(String affiliatedUniversity);
        void deleteByContactNumber(String contactNumber);
}

