package org.example.SetterConstructorPropertyDIPackage;

import org.example.Service.EatingTypeOfAnimal;

public class Animals {
    EatingTypeOfAnimal eatingTypeOfAnimal;


    //using constructor -> dependency injection
    public Animals(EatingTypeOfAnimal eatingTypeOfAnimal){
        this.eatingTypeOfAnimal = eatingTypeOfAnimal;
    }

    public void eatingHabit(){
        eatingTypeOfAnimal.eat();
    }
}
