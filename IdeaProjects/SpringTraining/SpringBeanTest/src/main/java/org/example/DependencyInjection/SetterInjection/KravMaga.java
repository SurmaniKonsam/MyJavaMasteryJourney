package org.example.DependencyInjection.SetterInjection;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("israeli-art")
public class KravMaga implements MartialArts {
    @Override
    public String art(){
        return "grappling, knee, punch and locks";
    }
}
