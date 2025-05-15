package org.example.DependencyInjection.Qualifier;


import org.example.Service.MartialArts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mixOfAllQualifier")
public class MixOfAll {

    @Autowired
    @Qualifier("japan-art-1")
    MartialArts martialArts;

    public void art(){
        System.out.println(martialArts.art());
    }
}
