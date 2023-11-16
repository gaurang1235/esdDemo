package com.example.nov17demo.Controllers;

import com.example.nov17demo.Models.Department;
import com.example.nov17demo.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/createDepartment")
    public ResponseEntity<Department> createDepartment(@RequestParam("department_name") String dName){
        try{
            Department newDepartment = departmentService.createDepartment(dName);

            return ResponseEntity.of(Optional.of(newDepartment));
        }catch (Exception e){
            return ResponseEntity.status(500).build();
        }
    }

    @PutMapping("/updateDepartment/{dId}")
    public ResponseEntity<Department> updateDepartment(@PathVariable int dId, @RequestParam("department_name") String name){
        try{
            Department updatedDepartment = departmentService.updateDepartment(dId, name);

            return ResponseEntity.of(Optional.of(updatedDepartment));
        }catch (Exception e){
            return ResponseEntity.status(500).build();
        }
    }


}