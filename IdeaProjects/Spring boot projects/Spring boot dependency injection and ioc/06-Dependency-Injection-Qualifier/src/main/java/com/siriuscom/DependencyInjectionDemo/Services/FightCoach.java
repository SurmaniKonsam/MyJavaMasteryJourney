package com.siriuscom.DependencyInjectionDemo.Services;


import org.springframework.stereotype.Component;

@Component
public class FightCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "do grappling 40 minutes with towel";
    }
}
