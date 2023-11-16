package com.example.nov17demo.Repository;

import com.example.nov17demo.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    Department findById(int dId);

}
