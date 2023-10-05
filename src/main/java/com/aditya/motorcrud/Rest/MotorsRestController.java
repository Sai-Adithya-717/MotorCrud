package com.aditya.motorcrud.Rest;


import com.aditya.motorcrud.Entity.Motors;
import com.aditya.motorcrud.Services.MotorsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class MotorsRestController {
    private MotorsService motorsService;

    //quick and dirty: inject Motors dao
    public MotorsRestController(MotorsService theMotorService){
        motorsService = theMotorService;
    }

    //explore "/motors" and return a list of motors
    @GetMapping("motors")
    public List<Motors> findAll(){
     return motorsService.findAll();
    }
}
