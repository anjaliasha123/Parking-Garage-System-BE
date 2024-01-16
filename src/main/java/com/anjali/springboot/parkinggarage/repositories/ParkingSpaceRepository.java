package com.anjali.springboot.parkinggarage.repositories;

import com.anjali.springboot.parkinggarage.models.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
}
