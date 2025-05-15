package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MinfulnessCoach implements Coach {
    public MinfulnessCoach() {
        System.out.println("Class : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "do breathing exercises 10 minutes";
    }
}
