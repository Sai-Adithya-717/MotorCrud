package com.aditya.motorcrud.Services;

import com.aditya.motorcrud.Dao.MotorDao;
import com.aditya.motorcrud.Entity.Motors;
import jakarta.transaction.Transactional;
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

    @Override
    public Motors findById(int theId) {
        return motorDao.findById(theId);
    }

    @Transactional
    @Override
    public Motors save(Motors theMotors) {
        return motorDao.save(theMotors);
    }

    @Transactional
    @Override
    public Void deleteById(int theId) {
        return motorDao.deleteById(theId);
    }
}
