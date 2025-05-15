package org.example.DependencyInjection.UsingFieldInjection;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("israeli")
public class KravMaga implements MartialArts {
    @Override
    public String art(){
        return "grappling, knee, punch and locks";
    }
}
