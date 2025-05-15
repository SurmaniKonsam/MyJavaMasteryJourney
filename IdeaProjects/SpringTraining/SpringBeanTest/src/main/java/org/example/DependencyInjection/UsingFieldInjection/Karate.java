package org.example.DependencyInjection.UsingFieldInjection;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("japan")
public class Karate implements MartialArts {
    @Override
    public String art(){
        return "strike, black belt, bow and practice";
    }
}
