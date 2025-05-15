package com.siriuscom.DependencyInjectionDemo.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EssayCoach implements Coach{


    public EssayCoach() {
        System.out.println("Class : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "swim 100 metres 4 times with 10 minutes break";
    }
}
