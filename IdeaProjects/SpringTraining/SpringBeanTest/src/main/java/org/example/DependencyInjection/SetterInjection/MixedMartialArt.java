package org.example.DependencyInjection.SetterInjection;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("usa-sport")
public class MixedMartialArt implements MartialArts {
    @Override
    public String art(){
        return "mix of all martial art";
    }
}
