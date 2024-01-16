package com.anjali.springboot.parkinggarage.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "makes")
@Data
public class Make {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
