package com.example.practice.PracticeRESTAPIs.service.impl;

import com.example.practice.PracticeRESTAPIs.dto.StudentDto;
import com.example.practice.PracticeRESTAPIs.entity.Student;
import com.example.practice.PracticeRESTAPIs.repository.StudentRepository;
import com.example.practice.PracticeRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    //This constructor is same as @RequiredArgsConstructor annotation.
//    public StudentServiceImpl(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id " + id));
        StudentDto studentDto = modelMapper.map(student, StudentDto.class);
        return studentDto;
    }
}

