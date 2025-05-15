package com.siriuscom.DependencyInjectionDemo.Controller;

import com.siriuscom.DependencyInjectionDemo.Services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

    @Autowired
    Coach coach;

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }


    @GetMapping("/")
    public String getHomePage(){
        return "You are learning Spring boot DI and IOC using field injection!!!";
    }


}
