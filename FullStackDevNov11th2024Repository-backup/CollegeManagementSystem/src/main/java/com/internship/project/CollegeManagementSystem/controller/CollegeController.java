package com.internship.project.CollegeManagementSystem.controller;


import com.internship.project.CollegeManagementSystem.entity.College;
import com.internship.project.CollegeManagementSystem.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/colleges")
    public class CollegeController {

        @Autowired
        private CollegeService collegeService;

        @GetMapping("/allcollage")
        public ResponseEntity<List<College>> getAllColleges() {
            return new ResponseEntity<>(collegeService.getAllColleges(),HttpStatus.OK);
        }

        @GetMapping("/college/{id}")
        public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
            return new ResponseEntity<>(collegeService.getCollegeById(id),HttpStatus.OK);
        }

        @PostMapping("/createcollege")
        public ResponseEntity<College> createCollege(@RequestBody College college) {
            return new ResponseEntity<>(collegeService.createCollege(college),HttpStatus.OK);
        }

        @PutMapping("collage/edit/{id}")
        public ResponseEntity<College> updateCollege(@PathVariable Long id,
                                                     @RequestBody College college)
        {
            return new ResponseEntity<>(collegeService.modifyCollege(id,college),HttpStatus.OK);
        }

        @DeleteMapping("college/delete/{id}")
        public ResponseEntity<String> deleteCollege(@PathVariable Long id) {
            collegeService.deleteCollege(id);
            return new ResponseEntity<>("The College With ID"+id+"has deleted successfully", HttpStatus.OK);
        }


        @GetMapping("/collegename/{name}")
        public ResponseEntity<List<College>> getByName(@PathVariable String name) {
            return new ResponseEntity<>(collegeService.getByName(name),HttpStatus.OK);
        }

        @GetMapping("/collegeaddress/{address}")
        public ResponseEntity<List<College>> getByAddress(@PathVariable String address) {
            return new ResponseEntity<>(collegeService.getByAddress(address),HttpStatus.OK);
        }

        @GetMapping("/collegerankings/{rankings}")
        public ResponseEntity<College> getByRankings(@PathVariable String rankings) {
            return new ResponseEntity<>(collegeService.getByRankings(rankings),HttpStatus.OK);
        }

        @GetMapping("/affiliatedUniversity/{affiliatedUniversity}")
        public ResponseEntity<List<College>> getByAffiliatedUniversity(@PathVariable String affiliatedUniversity) {
            return new ResponseEntity<>(collegeService.getByAffiliatedUniversity(affiliatedUniversity),HttpStatus.OK);
        }

        @DeleteMapping("collegecontactnumber/delete/{contactNumber}")
        public ResponseEntity<String> deleteByContactNumber(@PathVariable String contactNumber) {
            collegeService.deleteByContactNumber(contactNumber);
            return new ResponseEntity<>("The College With contact number "+contactNumber+" has deleted successfully", HttpStatus.OK);
        }
    }
