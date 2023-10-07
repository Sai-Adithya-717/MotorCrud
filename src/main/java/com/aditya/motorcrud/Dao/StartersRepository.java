package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import com.aditya.motorcrud.Entity.Starters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StartersRepository extends JpaRepository<Motors,Integer> {
}
