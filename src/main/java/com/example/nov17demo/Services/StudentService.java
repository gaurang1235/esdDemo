package com.example.nov17demo.Services;

import com.example.nov17demo.Models.Department;
import com.example.nov17demo.Models.Student;
import com.example.nov17demo.Repository.DepartmentRepository;
import com.example.nov17demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public Student createStudent(Student student){
//        Department department = departmentRepository.findById(deptId);
//
//        Student newStudent = new Student();
//
//        newStudent.setName(name);
//        newStudent.setContact(contact);
//        newStudent.setDepartment(department);


//        return studentRepository.save(newStudent);

        return studentRepository.save(student);
    }


    public Department getDepartmentInfo(int studId) {

        Student student = studentRepository.findStudent(studId);

        return student.getDepartment();
    }
}
