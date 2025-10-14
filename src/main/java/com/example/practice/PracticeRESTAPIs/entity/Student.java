package com.example.practice.PracticeRESTAPIs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//ORM Object relationship management
//Spring Data JPA uses Hibernate behind the scenes.
//This class entity will be used to create table in our Database.
//When we run this class a table is created in our database.

@Entity
@Getter
@Setter
public class Student {

    //Used to auto generate the ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
}
