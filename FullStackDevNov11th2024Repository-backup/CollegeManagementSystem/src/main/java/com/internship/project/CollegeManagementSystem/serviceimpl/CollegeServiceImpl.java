package com.internship.project.CollegeManagementSystem.serviceimpl;


import com.internship.project.CollegeManagementSystem.entity.College;
import com.internship.project.CollegeManagementSystem.exception.ResourceNotFoundException;
import com.internship.project.CollegeManagementSystem.repository.CollegeRepository;
import com.internship.project.CollegeManagementSystem.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;


    @Override
    public College createCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    @Override
    public College getCollegeById(Long id) {
        Optional<College> college = collegeRepository.findById(id);
        return college.get();
    }

    @Override
    public College modifyCollege(Long id, College college) {
        College coll = collegeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The College number is not not found"));
        coll.setId(id);
        coll.setName(college.getName());
        coll.setAddress(college.getAddress());
        coll.setAddress(college.getAddress());
        coll.setAffiliatedUniversity(college.getAffiliatedUniversity());
        coll.setContactNumber(college.getContactNumber());
        coll.setEmail(college.getEmail());
        coll.setStudentCapacity(college.getStudentCapacity());
        coll.setFacultyCount(college.getFacultyCount());
        coll.setRankings(college.getRankings());

        return collegeRepository.save(coll);
    }

    @Override
    public void deleteCollege(Long id) {
        collegeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The College number Does not exist!!!"));
        collegeRepository.deleteById(id);
    }

    @Override
    public List<College> getByName(String name) {
        return collegeRepository.findByName(name);
    }

    @Override
    public List<College> getByAddress(String address) {
        return collegeRepository.findByAddress(address);
    }

    @Override
    public College getByRankings(String rankings) {
        return  collegeRepository.findByRankings(rankings);
    }

    @Override
    public List<College> getByAffiliatedUniversity(String affiliatedUniversity) {
        return collegeRepository.findByAffiliatedUniversity(affiliatedUniversity);
    }

    @Override
    public void deleteByContactNumber(String contactNumber) {
        collegeRepository.deleteByContactNumber(contactNumber
        );
    }

}
