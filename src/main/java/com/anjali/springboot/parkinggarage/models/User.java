package com.anjali.springboot.parkinggarage.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.repository.Modifying;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
