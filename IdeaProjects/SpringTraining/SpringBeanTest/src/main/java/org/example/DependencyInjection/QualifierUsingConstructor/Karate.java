package org.example.DependencyInjection.QualifierUsingConstructor;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("japan-art-2")
public class Karate implements MartialArts {
    @Override
    public String art(){
        return "strike, black belt, bow and practice";
    }
}
