package main.java.org.example.java8.FunctionalInterface;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Method reference via class -> static method.
 * 13-05-25
 */
public class MethodReference {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int squareOfNumber(int a){
        return a*a;
    }

    public static void main(String[] args) {
        /**
         *<T> – the type of the first argument to the function
         * <U> – the type of the second argument to the function
         * <R> – the type of the result of the function
         * In MethodReference you don't need to define the argument value as well before the lambda sign ->
         */
        BiFunction<Integer,Integer,Integer> biFunctionSum = MethodReference::sum; //Refers to the static method to be called using ::.
        System.out.println("sum : "+biFunctionSum.apply(20,29));
        /**
         * BiFunction works only on static method of the class
         * Does it work on the Function functional interface as well. Should i check on Math class
         */
        Function<Integer,Integer> square = MethodReference::squareOfNumber;
        System.out.println(square.apply(9));

    }
}
