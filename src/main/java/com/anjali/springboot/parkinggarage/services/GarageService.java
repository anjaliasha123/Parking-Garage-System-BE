package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.Garage;

import java.util.List;

public interface GarageService {
    List<Garage> getAllGarages();
    Garage getGarageById(Long id);
}
