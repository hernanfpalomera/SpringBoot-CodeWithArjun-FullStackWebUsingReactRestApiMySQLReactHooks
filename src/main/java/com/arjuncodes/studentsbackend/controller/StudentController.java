package com.arjuncodes.studentsbackend.controller;

import com.arjuncodes.studentsbackend.model.Student;
import com.arjuncodes.studentsbackend.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
