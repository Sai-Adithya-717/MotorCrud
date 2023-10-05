package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;

import java.util.List;

public interface MotorDao {
    List<Motors> findAll();

    Motors findById(int theId);

    Motors save(Motors theMotors);

    Void deleteById(int theId);
}
