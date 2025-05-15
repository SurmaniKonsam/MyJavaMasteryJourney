package org.example.SetterConstructorPropertyDIPackage;

import org.example.Service.EatingTypeOfAnimal;

public class Carnivore implements EatingTypeOfAnimal {
    @Override
    public void eat(){
        System.out.println("Eats flesh");
    }
}
