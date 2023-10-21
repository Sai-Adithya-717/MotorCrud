package com.aditya.motorcrud.Services;

import com.aditya.motorcrud.Dao.MotorRepository;
import com.aditya.motorcrud.Entity.Motors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotorServiceImpl implements MotorsService{

    private MotorRepository motorRepository;

    @Autowired
    public MotorServiceImpl(MotorRepository theMotorRepository){
        motorRepository = theMotorRepository;
    }
    @Override
    public List<Motors> findAll() {
        return motorRepository.findAll();
    }

    @Override
    public Motors findById(int theId) {
        Optional<Motors> result = motorRepository.findById(theId);

        Motors theMotors = null;
        if (result.isPresent()){
            theMotors = result.get();
        }
        return theMotors;
    }

    @Override
    public Motors save(Motors theMotors) {
        return motorRepository.save(theMotors);
    }

    @Override
    public Void deleteById(int theId) {
        Optional<Motors> result = motorRepository.findById(theId);

        Motors theMotors = null;
        if (result.isPresent()){
            motorRepository.deleteById(theId);
        }
        return null;
    }
}
