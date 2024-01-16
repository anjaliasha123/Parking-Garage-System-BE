package com.anjali.springboot.parkinggarage.repositories;

import com.anjali.springboot.parkinggarage.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {
}
