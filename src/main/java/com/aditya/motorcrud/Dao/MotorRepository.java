package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorRepository extends JpaRepository<Motors, Integer> {
}
