package com.example.nov17demo.Services;

import com.example.nov17demo.Models.Course;
import com.example.nov17demo.Models.Department;
import com.example.nov17demo.Repository.CourseRepository;
import com.example.nov17demo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public Course createCourse(String cName, int credits){

        Course newCourse = new Course();

        newCourse.setCourse_name(cName);

        return courseRepository.save(newCourse);
    }


}
