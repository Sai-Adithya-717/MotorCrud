package com.aditya.motorcrud.Services;

import com.aditya.motorcrud.Entity.Motors;

import java.util.List;

public interface MotorsService {
    List<Motors> findAll();

    Motors findById(int theId);

    Motors save(Motors theMotors);

    Void deleteById(int theId);
}
