package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StartersRepository extends JpaRepository<Motors,Integer> {
}
