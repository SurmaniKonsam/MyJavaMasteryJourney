package org.example.DependencyInjection.UsingFieldInjection;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("USA")
public class MixedMartialArt implements MartialArts {
    @Override
    public String art(){
        return "mix of all martial art";
    }
}
