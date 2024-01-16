package com.anjali.springboot.parkinggarage.repositories;

import com.anjali.springboot.parkinggarage.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByUserId(Long id);
    Vehicle findByLicensePlate(String plateNumber);
}
