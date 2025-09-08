package main.java.org.example.Collections.Array;

class Fruits{
    void fun(){
        System.out.println("Fruits are fun and healthy to eat");
    }
}

class Apple extends Fruits{
    void fun(){
        System.out.println("Apple is fun to eat");
    }

    void eat(){
        System.out.println("Eat Apple");
    }
}

class Mango extends Apple{
    void fun(){
        System.out.println("Mango are fun to eat");
    }
}

public class ArrayClass {
    public static void main(String[] args){
        Object[] objects  = new Object[3];
        Fruits fruits = new Fruits();
        Apple apple = new Apple();
        Mango mango =  new Mango();
        objects[0] = fruits;
        objects[1] = apple;
        objects[2] = mango;

        for(Object object : objects){
            if(object instanceof Fruits){

            }
        }

    }
}
