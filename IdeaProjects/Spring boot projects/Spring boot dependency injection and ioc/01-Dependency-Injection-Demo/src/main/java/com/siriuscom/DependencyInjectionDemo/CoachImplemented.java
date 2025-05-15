package com.siriuscom.DependencyInjectionDemo;

import org.springframework.stereotype.Component;

@Component
public class CoachImplemented implements Coach{

    @Override
    public String getDailyWorkout(){
        return "do push-ups of 20 followed by squats of 40";
    }
}
