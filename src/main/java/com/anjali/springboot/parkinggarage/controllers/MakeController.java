package com.anjali.springboot.parkinggarage.controllers;

import com.anjali.springboot.parkinggarage.models.Make;
import com.anjali.springboot.parkinggarage.services.MakeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/parking")
@AllArgsConstructor
public class MakeController {
    @Autowired
    private MakeService makeService;
    @GetMapping("/makes")
    public ResponseEntity<List<Make>> getAllVehicleMakes(){
        List<Make> makes = this.makeService.getAllMakes();
        return new ResponseEntity<>(makes, HttpStatus.OK);
    }
}
