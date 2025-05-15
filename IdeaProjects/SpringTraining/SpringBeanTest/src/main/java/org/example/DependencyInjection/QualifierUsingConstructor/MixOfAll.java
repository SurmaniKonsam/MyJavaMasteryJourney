package org.example.DependencyInjection.QualifierUsingConstructor;


import org.example.Service.MartialArts;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mixOfAllQualifier-2")
public class MixOfAll {
    MartialArts martialArts;

    public MixOfAll(@Qualifier("japan-art-2") MartialArts martialArts){
        this.martialArts = martialArts;
    }

    public void art(){
        System.out.println(martialArts.art());
    }
}
