package org.example.InitMethodDestroyMethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitMethodAndDestroy {

    @PostConstruct
    public void postConstructMethod(){
        System.out.println("Hello there");
    }

    public void initMethodDestroy(){
        System.out.println("learning init and destroy method!!!");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("bye bye bye!!!");
    }

    public void close() {
        System.out.println("Closing All Resources");
    }
}
