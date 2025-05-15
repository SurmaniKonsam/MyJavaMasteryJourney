package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class StaminaCoach implements Coach {

    public StaminaCoach() {
        System.out.println("Class : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "run steady 10k";
    }
}
