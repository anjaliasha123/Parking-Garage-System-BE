package com.anjali.springboot.parkinggarage.repositories;

import com.anjali.springboot.parkinggarage.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
