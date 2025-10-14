package com.example.practice.PracticeRESTAPIs.service;

import com.example.practice.PracticeRESTAPIs.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);
}
