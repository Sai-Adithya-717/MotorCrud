package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import com.aditya.motorcrud.Services.MotorsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/motors")
public class MotorsController {

    private MotorsService motorsService;

    public MotorsController(MotorsService theMotorsService){
        motorsService = theMotorsService;
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model theModel) {
        Motors theMotor = new Motors();
        theModel.addAttribute("motor",theMotor);
        return "motors/motor-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("motorId")int theId,Model theModel){
        Motors theMotors = motorsService.findById(theId);
        theModel.addAttribute("motor",theMotors);
        return "motors/motor-form";
    }

    @PostMapping("/save")
    public String saveMotor(@ModelAttribute("motor")Motors theMotor){
        motorsService.save(theMotor);
        return "redirect:/motors/list";
    }

    @GetMapping("/list")
    public String listMotors(Model theModel) {
        List<Motors>  theMotors = motorsService.findAll();

        theModel.addAttribute("motors",theMotors);
        return "motors/list-motors";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("motorId")int theId){
        motorsService.deleteById(theId);
        return "redirect:/motors/list";
    }

}
