package org.example.DependencyInjection.UsingConstructor;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("krav")
public class KravMaga implements MartialArts {
    @Override
    public String art(){
        return "grappling, knee, punch and locks";
    }
}
