package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.stereotype.Component;

@Component
public class MinfulnessCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "do breathing exercises 10 minutes";
    }
}
