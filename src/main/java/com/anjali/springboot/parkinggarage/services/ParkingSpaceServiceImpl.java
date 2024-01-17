package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.ParkingSpace;
import com.anjali.springboot.parkinggarage.repositories.ParkingSpaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParkingSpaceServiceImpl implements ParkingSpaceService{
    @Autowired
    private ParkingSpaceRepository parkingSpaceRepository;
    @Override
    public ParkingSpace addParkingSpace(ParkingSpace parkingSpace) {
        return this.parkingSpaceRepository.save(parkingSpace);
    }

    @Override
    public List<ParkingSpace> getParkingSpacesByUserId(Long userId) {
        List<ParkingSpace> spaces = this.parkingSpaceRepository.findByUserId(userId);
        return spaces;
    }

    @Override
    public void deleteParkingSpace(Long parkingSpaceId) {
        this.parkingSpaceRepository.deleteById(parkingSpaceId);
    }
}
