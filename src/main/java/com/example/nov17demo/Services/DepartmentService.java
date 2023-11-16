package com.example.nov17demo.Services;

import com.example.nov17demo.Models.Course;
import com.example.nov17demo.Models.Department;
import com.example.nov17demo.Models.Student;
import com.example.nov17demo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(String dName){
        Department newDepartment = new Department();
        newDepartment.setDname(dName);

        return departmentRepository.save(newDepartment);
    }

    public Department fetchDepartment(int dId){
        return departmentRepository.findById(dId);
    }

    public List<Student> fetchStudents(int dId){
        Department department = fetchDepartment(dId);

        return department.getStudents();
    }

    public Department updateDepartment(int dId, String name){

        Department department = fetchDepartment(dId);

        department.setDname(name);

        return departmentRepository.save(department);
    }
}
