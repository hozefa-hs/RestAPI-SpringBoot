package com.example.practice.PracticeRESTAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //Creates getters and setters
public class AddStudentRequestDto {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 30, message = "Name should be of length 3 to 30 characters")
    private String name;

    @Email
    private String email;
}
