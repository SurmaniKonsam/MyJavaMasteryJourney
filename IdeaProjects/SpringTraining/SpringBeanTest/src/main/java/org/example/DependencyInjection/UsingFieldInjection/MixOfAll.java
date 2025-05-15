package org.example.DependencyInjection.UsingFieldInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mixOfAllFieldInjection")
public class MixOfAll {
    @Autowired
    private Karate karate;

    @Autowired
    private KravMaga kravMaga;

    @Autowired
    private MixedMartialArt mixedMartialArt;

    public void mixedArt(){
        System.out.println(mixedMartialArt.art());
    }

    public void kravMagaArt(){
        System.out.println(kravMaga.art());
    }

    public void karateArt(){
        System.out.println(karate.art());
    }
}
