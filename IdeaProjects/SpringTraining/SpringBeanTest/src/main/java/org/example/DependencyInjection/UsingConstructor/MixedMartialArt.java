package org.example.DependencyInjection.UsingConstructor;

import org.example.Service.MartialArts;
import org.springframework.stereotype.Component;

@Component("mixed")
public class MixedMartialArt implements MartialArts {
    @Override
    public String art(){
        return "mix of all martial art";
    }
}
