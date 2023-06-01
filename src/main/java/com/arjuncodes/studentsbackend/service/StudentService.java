package com.arjuncodes.studentsbackend.service;

import com.arjuncodes.studentsbackend.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
