package com.anjali.springboot.parkinggarage.repositories;

import com.anjali.springboot.parkinggarage.models.Garage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<Garage, Long> {
}
