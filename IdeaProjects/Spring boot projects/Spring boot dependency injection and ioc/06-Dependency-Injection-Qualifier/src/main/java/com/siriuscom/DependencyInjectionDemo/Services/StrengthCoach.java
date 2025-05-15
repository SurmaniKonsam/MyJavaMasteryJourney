package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.stereotype.Component;

@Component
public class StrengthCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "do push-ups of 20, pull-ups of 20 followed by squats of 40";
    }
}
