package com.anjali.springboot.parkinggarage.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "parking")
@Data
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long garageId;
    private Integer floorNumber;
    private String spotNumber;
    private Long vehicleId;
}
