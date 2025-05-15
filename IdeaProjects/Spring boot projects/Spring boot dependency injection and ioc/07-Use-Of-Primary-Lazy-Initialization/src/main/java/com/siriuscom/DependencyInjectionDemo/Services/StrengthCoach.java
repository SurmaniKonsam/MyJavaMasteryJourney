package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class StrengthCoach implements Coach{

    public StrengthCoach() {
        System.out.println("Class : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "do push-ups of 20, pull-ups of 20 followed by squats of 40";
    }
}
