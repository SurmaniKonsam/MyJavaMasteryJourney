package org.example.DependencyInjection.QualifierUsingConstructor;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("israeli-art-2")
public class KravMaga implements MartialArts {
    @Override
    public String art(){
        return "grappling, knee, punch and locks";
    }
}
