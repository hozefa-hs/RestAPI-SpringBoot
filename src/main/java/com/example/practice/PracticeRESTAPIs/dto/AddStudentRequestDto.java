package com.example.practice.PracticeRESTAPIs.dto;

import lombok.Data;

@Data //Creates getters and setters
public class AddStudentRequestDto {
    private Long id;
    private String name;
    private String email;
}
