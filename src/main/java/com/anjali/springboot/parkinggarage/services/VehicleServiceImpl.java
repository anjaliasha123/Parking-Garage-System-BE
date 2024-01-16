package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.Vehicle;
import com.anjali.springboot.parkinggarage.repositories.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService{
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicle addNewVehicle(Vehicle vehicle) {
        Vehicle newVehicle = this.vehicleRepository.save(vehicle);
        return newVehicle;
    }

    @Override
    public List<Vehicle> getVehicleByUserId(Long id) {
        List<Vehicle> vehicles = this.vehicleRepository.findByUserId(id);
        return vehicles;
    }

    @Override
    public Vehicle getVehicleByLicensePlate(String licensePlate) {
        Vehicle vehicle = this.vehicleRepository.findByLicensePlate(licensePlate);
        return vehicle;
    }

    @Override
    public void deleteVehicleById(String licensePlate) {
        Long id = this.getVehicleByLicensePlate(licensePlate).getId();
        this.vehicleRepository.deleteById(id);
    }
}
