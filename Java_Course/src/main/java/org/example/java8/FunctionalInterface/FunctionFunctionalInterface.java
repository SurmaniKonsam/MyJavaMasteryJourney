package org.example.java8.FunctionalInterface;

import java.util.function.Function;

/**
 * abstract method used apply()
 * Takes one argument of type given as first argument supply another result of type specified in the second argument.
 */
@FunctionalInterface
interface CubeOfNumbers {

    /**
     * This need not be used, in order to avoid reimplementing the abstract method, functional programming came into existance.
     */
    int returnCube(int whatGetsIn);
}

class ConcreteUsage implements CubeOfNumbers{
    @Override
    public int returnCube(int number){
        return number*number*number;
    }
}

public class FunctionFunctionalInterface{

    /**
     * Where our code run
     * @param args -> yeah what is it -> have to study : 4:51 PM 13-05-25
     */
    public static void main(String[] args) {
//        CubeOfNumbers cubeOfNumbers = x -> x*x*x;
        ConcreteUsage concreteUsage = new ConcreteUsage();
        Function<Integer,Integer> getValue = concreteUsage::returnCube;
        System.out.println(getValue.apply(12));

    }
}
