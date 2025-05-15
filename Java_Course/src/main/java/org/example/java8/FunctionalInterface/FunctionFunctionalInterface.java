package main.java.org.example.java8.FunctionalInterface;

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

public class FunctionFunctionalInterface{


    /**
     * Where our code run
     * @param args -> yeah what is it -> have to study : 4:51 PM 13-05-25
     */
    public static void main(String[] args) {
        Function<Integer,Integer> rdCb = x -> x*x*x;
        System.out.println(rdCb.apply(12));

    }
}
