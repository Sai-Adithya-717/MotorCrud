package com.aditya.motorcrud.Rest;


import com.aditya.motorcrud.Entity.Motors;
import com.aditya.motorcrud.Services.MotorsService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("motors/{motorId}")
    public Motors getMotors(@PathVariable int motorId){
        Motors theMotors = motorsService.findById(motorId);

        if(theMotors == null) {
            throw new RuntimeException("Motors id not Found" + motorId);
        }

        return theMotors;
    }

    @PostMapping("motors")
    public Motors addMotors(@RequestBody Motors theMotors){
        theMotors.setId(0);
        Motors dbMotors = motorsService.save(theMotors);
        return dbMotors;
    }

    @PutMapping("motors")
    public Motors updateMotors(@RequestBody Motors theMotors){
        Motors dbMotors = motorsService.save(theMotors);
        return dbMotors;
    }

    @DeleteMapping("motors/{motorsId}")
    public String DeleteMotors(@PathVariable int motorsId){
        Motors theMotors = motorsService.findById(motorsId);

        if(theMotors == null){
            throw new RuntimeException("Motor Id is not Found" + motorsId);
        }
        motorsService.deleteById(motorsId);
        return "Deleted Motor Id - " + motorsId;
    }
}
