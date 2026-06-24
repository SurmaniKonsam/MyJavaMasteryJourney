package org.example.concepts.polymorphism.inheritance.abstraction;

abstract public class Vehicle {

    //abstract method must be defined in abstract class.
    //abstract void run();

    //So this method belongs primarily to the parent abstract class only.
    void numberOfWheels(){
        System.out.println("Parent class");
    }
}
