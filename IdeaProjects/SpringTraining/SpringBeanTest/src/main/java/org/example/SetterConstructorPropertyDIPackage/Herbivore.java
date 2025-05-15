package org.example.SetterConstructorPropertyDIPackage;

import org.example.Service.EatingTypeOfAnimal;

public class Herbivore implements EatingTypeOfAnimal {
    @Override
    public void eat(){
        System.out.println("Eats grass and plants");
    }
}
