package com.example.fermadrobiu.model.entity.user;



import com.example.fermadrobiu.model.helpers.Adress;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ArrayList<String> firstNames;
    private String lastName;



    @Column(unique = true)
    private String email;

    @Size(min = 7, message = "Password must be at least 7 characters long")
    private String password;

    // Getters and setters, and other common fields/methods for all users
}
