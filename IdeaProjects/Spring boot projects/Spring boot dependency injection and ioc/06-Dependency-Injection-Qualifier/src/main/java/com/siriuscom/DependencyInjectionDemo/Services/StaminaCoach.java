package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.stereotype.Component;

@Component
public class StaminaCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "run steady 10k";
    }
}
