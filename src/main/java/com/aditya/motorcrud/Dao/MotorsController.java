package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import com.aditya.motorcrud.Services.MotorsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/motors")
public class MotorsController {

    private MotorsService motorsService;

    public MotorsController(MotorsService theMotorsService){
        motorsService = theMotorsService;
    }

    @GetMapping("/list")
    public String listMotors(Model theModel) {
        List<Motors>  theMotors = motorsService.findAll();

        theModel.addAttribute("motors",theMotors);
        return "motors/list-motors";
    }

}
