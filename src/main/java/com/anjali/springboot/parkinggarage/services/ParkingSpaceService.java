package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.ParkingSpace;

import java.util.List;

public interface ParkingSpaceService {
//    Parking Space:
//    addParkingSpace: adds a new parking space for a registered car.
//            getParkingSpacesByUserId: get a parking space by it’s id.
//    deleteParkingSpace: deletes a parking space.
    ParkingSpace addParkingSpace(ParkingSpace parkingSpace);
    List<ParkingSpace> getParkingSpacesByUserId(Long userId);
    void deleteParkingSpace(Long parkingSpaceId);
}
