package com.internship.project.CollegeManagementSystem.serviceimpl;


import com.internship.project.CollegeManagementSystem.entity.Student;
import com.internship.project.CollegeManagementSystem.exception.ResourceNotFoundException;
import com.internship.project.CollegeManagementSystem.repository.StudentRepository;
import com.internship.project.CollegeManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student=studentRepository.findById(id);
        return student.get();
    }

    @Override
    public Student modifyStudent(Long id, Student student) {
        Student student1=studentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("The Student number is Does not Exist!!!"));
        student1.setId(id);
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setGender(student.getGender());
        student1.setPhoneNumber(student.getPhoneNumber());
        student1.setAddress(student.getAddress());
        student1.setCollege(student.getCollege());

        return studentRepository.save(student1);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("The Student number Does not exist!!!"));
        studentRepository.deleteById(id);

    }

    @Override
    public List<Student> getByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student getByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student getByPhoneNumber(String phoneNumber) {
        return studentRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public List<Student> getByAddress(String address) {
        return studentRepository.findByAddress(address);
    }

    @Override
    public void deleteByEmail(String email) {
        studentRepository.deleteByEmail(email);
    }
}
