package com.anjali.springboot.parkinggarage.repositories;

import com.anjali.springboot.parkinggarage.models.Make;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeRepository extends JpaRepository<Make, Long> {
}
