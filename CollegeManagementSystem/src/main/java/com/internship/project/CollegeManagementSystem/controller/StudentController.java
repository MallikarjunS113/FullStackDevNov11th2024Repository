package com.internship.project.CollegeManagementSystem.controller;


import com.internship.project.CollegeManagementSystem.entity.Student;
import com.internship.project.CollegeManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/students")
    public class StudentController {

        @Autowired
        private StudentService studentService;

        @GetMapping("/allstudent")
        public ResponseEntity<List<Student>> getAllStudents() {
            return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
        }

        @GetMapping("student/{id}")
        public ResponseEntity<Student>getStudentById(@PathVariable Long id) {
            return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.OK);
        }

        @PostMapping("/createstudent")
        public ResponseEntity<Student>createStudent(@RequestBody Student student) {
            return new ResponseEntity<>(studentService.createStudent(student),HttpStatus.OK);
        }

        @PutMapping("/student/edit/{id}")
        public ResponseEntity<Student>updateStudent(@PathVariable Long id, @RequestBody Student student) {
            return new ResponseEntity<>(studentService.modifyStudent(id,student),HttpStatus.OK);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
            studentService.deleteStudent(id);
            return new ResponseEntity<>("The student with ID"+id+"has been deleted successfully", HttpStatus.OK);
        }

    @GetMapping("studentname/{name}")
    public ResponseEntity<List<Student>>getByName(@PathVariable String name) {
        return  new ResponseEntity<>(studentService.getByName(name),HttpStatus.OK);
    }

    @GetMapping("studentemail/{email}")
    public ResponseEntity<Student>getByEmail(@PathVariable String email) {
        return  new ResponseEntity<>(studentService.getByEmail(email),HttpStatus.OK);
    }

    @GetMapping("phoneNumber/{phoneNumber}")
    public ResponseEntity<Student>getByPhoneNumber(@PathVariable String phoneNumber) {
        return  new ResponseEntity<>(studentService.getByPhoneNumber(phoneNumber),HttpStatus.OK);
    }

    @GetMapping("address/{address}")
    public ResponseEntity<List<Student>>getByAddress(@PathVariable String address) {
        return  new ResponseEntity<>(studentService.getByAddress(address),HttpStatus.OK);
    }

    @DeleteMapping("/deleteemail/{email}")
    public ResponseEntity<String> deleteByEmail(@PathVariable String email) {
        studentService.deleteByEmail(email);
        return new ResponseEntity<>("The student with email "+email+" has been deleted successfully", HttpStatus.OK);
    }
}

