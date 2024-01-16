package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.Vehicle;

import java.util.List;

public interface VehicleService {
//    addVehicle: add a new vehicle for the logged in user.
//    getVehiclesByUserId: get the logged in user vehicles.
//    getVehicleById: get a vehicle by it’s id.
    Vehicle addNewVehicle(Vehicle vehicle);
    List<Vehicle> getVehicleByUserId(Long id);
    Vehicle getVehicleByLicensePlate(String licensePlate);
    void deleteVehicleById(String licensePlate);
}
