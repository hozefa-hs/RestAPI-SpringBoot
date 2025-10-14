package com.example.practice.PracticeRESTAPIs.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Creates getters and setters
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;

    //Constructor is already made by @AllArgsConstructor
//    public StudentDto(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
}
