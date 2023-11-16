package com.example.nov17demo.Repository;

import com.example.nov17demo.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
