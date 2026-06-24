package org.example.concepts.Polymorphism.Inheritance.Abstraction;

public class Car extends Vehicle{

    public void run(){
        System.out.println("A car can run at the speed of max 140km/hr");
    }

    @Override
    public void numberOfWheels(){
        System.out.println("Car have 4 wheels");
    }



    public static void main(String[] args) {
        /*
         * Abstract class cannot be instantiated.
         * Even if Abstract class doesn't contain any abstract method, if the class is mentioned as
         * abstract, then you are done baby, you can't have its memory placed in the heap.
         */
        Vehicle vehicle = new Car();
        vehicle.numberOfWheels();
    }
}
