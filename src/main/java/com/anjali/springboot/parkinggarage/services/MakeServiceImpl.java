package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.Make;
import com.anjali.springboot.parkinggarage.repositories.MakeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MakeServiceImpl implements MakeService{
    @Autowired
    private MakeRepository makeRepository;
    @Override
    public List<Make> getAllMakes() {
        return this.makeRepository.findAll();
    }
}
