package com.example.nov17demo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;

    @Column(name="name")
    private String name;


    @Column(name="contact",nullable = false,unique = true)
    private String contact;

//    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinTable(
            name="course_student",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="course_id")
    )
    private List<Course> courses;

//    @JsonManagedReference
//    @ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,
//    CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
