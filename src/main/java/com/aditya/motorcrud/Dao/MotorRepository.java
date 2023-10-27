package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotorRepository extends JpaRepository<Motors, Integer> {
    public List<Motors> findAllByOrderByLastNameAsc();
}
