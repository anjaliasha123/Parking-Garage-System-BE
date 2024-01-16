package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.Garage;
import com.anjali.springboot.parkinggarage.repositories.GarageRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GarageServiceImpl implements GarageService{
    @Autowired
    private GarageRepository garageRepository;
    @Override
    public List<Garage> getAllGarages() {
        return this.garageRepository.findAll();
    }

    @Override
    public Garage getGarageById(Long id) {
        return this.garageRepository.findById(id).get();
    }
}
