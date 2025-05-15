package org.example.DependencyInjection.UsingConstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mixOfAll")
public class MixOfAll {
    private Karate karate;

    private KravMaga kravMaga;

    private MixedMartialArt mixedMartialArt;

    @Autowired
    MixOfAll(Karate karate,KravMaga kravMaga,MixedMartialArt mixedMartialArt){
        this.karate = karate;
        this.mixedMartialArt = mixedMartialArt;
        this.kravMaga = kravMaga;
    }


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
