package com.anjali.springboot.parkinggarage.controllers;

import com.anjali.springboot.parkinggarage.models.Garage;
import com.anjali.springboot.parkinggarage.services.GarageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/parking")
@CrossOrigin
@AllArgsConstructor
public class GarageController {
    @Autowired
    private GarageService garageService;
    @GetMapping("/garages")
    public ResponseEntity<List<Garage>> getAllGarages(){
        List<Garage> allGarages = this.garageService.getAllGarages();
        return new ResponseEntity<>(allGarages, HttpStatus.OK);
    }
    @GetMapping("/garages/{id}")
    public ResponseEntity<Garage> getGarageById(@PathVariable("id") Long id){
        Garage garage = this.garageService.getGarageById(id);
        return new ResponseEntity<>(garage, HttpStatus.OK);
    }
}
