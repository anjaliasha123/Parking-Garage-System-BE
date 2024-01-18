package com.anjali.springboot.parkinggarage.controllers;

import com.anjali.springboot.parkinggarage.models.ParkingSpace;
import com.anjali.springboot.parkinggarage.services.ParkingSpaceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/parking/space")
@AllArgsConstructor
@CrossOrigin
public class ParkingSpaceController {
    @Autowired
    private ParkingSpaceService parkingSpaceService;

    @PostMapping
    public ResponseEntity<ParkingSpace> addNewParkingSpace(@RequestBody ParkingSpace parkingSpace){
        ParkingSpace saved = this.parkingSpaceService.addParkingSpace(parkingSpace);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<ParkingSpace>> getParkingSpaceByUserId(@RequestParam("user") Long userId){
        List<ParkingSpace> spaces = this.parkingSpaceService.getParkingSpacesByUserId(userId);
        return new ResponseEntity<>(spaces, HttpStatus.OK);
    }
    @DeleteMapping("/{parkingSpaceId}")
    public ResponseEntity<Map<String, String>> deleteParkingSpaceById(@PathVariable("parkingSpaceId") Long parkingSpaceId){
        this.parkingSpaceService.deleteParkingSpace(parkingSpaceId);
        Map<String, String> map = new HashMap<>();
        map.put("status","Successfully deleted parking space");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
