package org.example.DependencyInjection.QualifierUsingConstructor;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("usa-sport-2")
public class MixedMartialArt implements MartialArts {
    @Override
    public String art(){
        return "mix of all martial art";
    }
}
