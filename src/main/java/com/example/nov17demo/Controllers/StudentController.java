package com.example.nov17demo.Controllers;

import com.example.nov17demo.Models.Department;
import com.example.nov17demo.Models.Student;
import com.example.nov17demo.Services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

        logger.info("Create Student API hit");

        try{
            Student newStudent = studentService.createStudent(student);

            return ResponseEntity.of(Optional.of(newStudent));
        }catch (Exception e){
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/getDepartmentInfo/{studId}")
    public ResponseEntity<Department> getDepartment(@PathVariable int studId){
        try{
            System.out.println(studId);
            Department department = studentService.getDepartmentInfo(studId);

            return ResponseEntity.of(Optional.of(department));
        }catch (Exception e){
            return ResponseEntity.status(500).build();
        }
    }
}
