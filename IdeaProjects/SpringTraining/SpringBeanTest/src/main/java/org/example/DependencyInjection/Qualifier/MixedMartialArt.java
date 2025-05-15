package org.example.DependencyInjection.Qualifier;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("usa-sport-1")
public class MixedMartialArt implements MartialArts {
    @Override
    public String art(){
        return "mix of all martial art";
    }
}
