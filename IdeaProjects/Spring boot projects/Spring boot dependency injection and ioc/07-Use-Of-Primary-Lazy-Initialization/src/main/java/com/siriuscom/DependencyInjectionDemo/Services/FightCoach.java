package com.siriuscom.DependencyInjectionDemo.Services;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FightCoach implements Coach{
    public FightCoach() {
        System.out.println("Class : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "do grappling 40 minutes with towel";
    }
}
