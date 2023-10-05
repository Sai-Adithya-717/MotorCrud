package com.aditya.motorcrud.Rest;


import com.aditya.motorcrud.Dao.MotorDao;
import com.aditya.motorcrud.Entity.Motors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class MotorsRestController {

    private MotorDao motorDao;

    //quick and dirty: inject Motors dao
    public MotorsRestController(MotorDao theMotorDao){
        motorDao = theMotorDao;
    }

    //explore "/motors" and return a list of motors
    @GetMapping("Motors")
    public List<Motors> findAll(){
     return motorDao.findAll();
    }
}
