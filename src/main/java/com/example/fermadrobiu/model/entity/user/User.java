package com.example.fermadrobiu.model.entity.user;



import com.example.fermadrobiu.model.helpers.Adress;
import com.example.fermadrobiu.model.helpers.UserName;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<UserName> firstNames = new ArrayList<>();

    private String lastName;



    @Column(unique = true)
    private String email;

    @Size(min = 7, message = "Password must be at least 7 characters long")
    private String password;

    public String getLastName() {
        return lastName;
    }
// Getters and setters, and other common fields/methods for all users
}
