package com.anjali.springboot.parkinggarage.controllers;

import com.anjali.springboot.parkinggarage.models.Vehicle;
import com.anjali.springboot.parkinggarage.services.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/parking/vehicles")
@AllArgsConstructor
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    //    addVehicle: add a new vehicle for the logged in user.
    //    getVehiclesByUserId: get the logged in user vehicles.
    //    getVehicleById: get a vehicle by it’s id.
    @PostMapping
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
        Vehicle addedVehicle = this.vehicleService.addNewVehicle(vehicle);
        return new ResponseEntity<>(addedVehicle, HttpStatus.OK);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Vehicle>> getVehiclesByUserId(@PathVariable("userId") Long id){
        List<Vehicle> userVehicle = this.vehicleService.getVehicleByUserId(id);
        return new ResponseEntity<>(userVehicle, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Vehicle> getVehicleById(@RequestParam("vehicleId") String id){
        Vehicle userVehicle = this.vehicleService.getVehicleByLicensePlate(id);
        return new ResponseEntity<>(userVehicle, HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteVehicleByLicensePlate(@RequestParam("vehicleId") String id){
        this.vehicleService.deleteVehicleById(id);
        return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
    }
}
