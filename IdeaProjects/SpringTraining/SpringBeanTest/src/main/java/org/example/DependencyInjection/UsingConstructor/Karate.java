package org.example.DependencyInjection.UsingConstructor;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("black")
public class Karate implements MartialArts {
    @Override
    public String art(){
        return "strike, black belt, bow and practice";
    }
}
