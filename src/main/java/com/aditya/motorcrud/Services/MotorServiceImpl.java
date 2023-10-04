package com.aditya.motorcrud.Services;

import com.aditya.motorcrud.Dao.MotorDao;
import com.aditya.motorcrud.Entity.Motors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorServiceImpl implements MotorsService{

    private MotorDao motorDao;

    @Autowired
    public MotorServiceImpl(MotorDao theMotorDao){
        motorDao = theMotorDao;
    }
    @Override
    public List<Motors> findAll() {
        return motorDao.findAll();
    }
}
