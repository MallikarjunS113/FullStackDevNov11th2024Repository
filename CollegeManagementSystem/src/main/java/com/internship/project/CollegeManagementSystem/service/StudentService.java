package com.internship.project.CollegeManagementSystem.service;


import com.internship.project.CollegeManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
        Student createStudent(Student student);
        List<Student> getAllStudents();
        Student getStudentById(Long id);
        Student modifyStudent(Long id, Student student);
        void deleteStudent(Long id);


        List<Student> getByName(String name);
        Student getByEmail(String email);
        Student getByPhoneNumber(String phoneNumber);
        List<Student> getByAddress(String address);
        void deleteByEmail(String email);
}


