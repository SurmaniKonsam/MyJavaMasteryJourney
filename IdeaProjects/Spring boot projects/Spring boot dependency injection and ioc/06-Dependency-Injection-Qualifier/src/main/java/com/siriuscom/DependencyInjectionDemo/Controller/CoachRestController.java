package com.siriuscom.DependencyInjectionDemo.Controller;

import com.siriuscom.DependencyInjectionDemo.Services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

    Coach coach;

    @Autowired
    CoachRestController(@Qualifier("staminaCoach") Coach coach){
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }


    @GetMapping("/")
    public String getHomePage(){
        return "You are learning Spring boot DI and IOC using field injection!!!";
    }


}
