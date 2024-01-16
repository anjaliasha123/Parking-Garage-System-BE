package com.anjali.springboot.parkinggarage.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long makeId;
    private String licensePlate;
    private String color;
    private Long userId;
}
