package org.example.DependencyInjection.Qualifier;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("israeli-art-1")
public class KravMaga implements MartialArts {
    @Override
    public String art(){
        return "grappling, knee, punch and locks";
    }
}
