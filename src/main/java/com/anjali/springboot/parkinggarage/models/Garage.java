package com.anjali.springboot.parkinggarage.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "garages")
@Data
public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer floors;

}
