package com.example.practice.PracticeRESTAPIs.controller;

import com.example.practice.PracticeRESTAPIs.dto.StudentDto;
import com.example.practice.PracticeRESTAPIs.entity.Student;
import com.example.practice.PracticeRESTAPIs.repository.StudentRepository;
import com.example.practice.PracticeRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {


    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

}

















