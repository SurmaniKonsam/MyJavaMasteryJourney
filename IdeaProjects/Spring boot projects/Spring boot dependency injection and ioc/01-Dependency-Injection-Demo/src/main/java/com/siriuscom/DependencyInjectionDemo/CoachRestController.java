package com.siriuscom.DependencyInjectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

    Coach coach;

    @Autowired
    CoachRestController(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }


    @GetMapping("/")
    public String getHomePage(){
        return "You are learning Spring boot DI and IOC";
    }


}
