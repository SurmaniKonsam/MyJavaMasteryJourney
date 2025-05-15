package org.example.SetterConstructorPropertyDIPackage;

import org.example.Service.EatingTypeOfAnimal;

public class AnimalTypeTwo {
    EatingTypeOfAnimal eatingTypeOfAnimal;

    //Using setter injection
    public void setEatingTypeOfAnimal(EatingTypeOfAnimal eatingTypeOfAnimal) {
        this.eatingTypeOfAnimal = eatingTypeOfAnimal;
    }

    public EatingTypeOfAnimal getEatingTypeOfAnimal() {
        return eatingTypeOfAnimal;
    }

    public void eatingAnimalTwo(){
        getEatingTypeOfAnimal().eat();
    }
}
