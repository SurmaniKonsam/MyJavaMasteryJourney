package org.example.DependencyInjection.Qualifier;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("japan-art-1")
public class Karate implements MartialArts {
    @Override
    public String art(){
        return "strike, black belt, bow and practice";
    }
}
