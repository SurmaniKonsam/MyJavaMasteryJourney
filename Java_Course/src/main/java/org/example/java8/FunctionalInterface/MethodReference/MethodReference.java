package main.java.org.example.java8.FunctionalInterface.MethodReference;


import java.util.function.BiFunction;
import java.util.function.Function;


/**
 * - A functional interface should have only one abstract method.
 * - Can have as many static or default method.
 * - Static method cannot be abstract that is it must have its implementation.
 * - Same goes for default method as well.
 * - Functional interface in functional programming has its abstract method get implemented in lambda expression.
 * - Lambda expression is a first class citizen can have its state transferred, tossed, passed, used as data which in a later cause can be used in
 * while studying stream where we need data to be manipulated on.
 */
@FunctionalInterface
interface AnotherExample{
    int differenceOfNumber(int a,int b);
}

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
         * <R> – the type of the result, that the functional interface would return.
         * In MethodReference you don't need to define the argument value as well before the lambda sign ->
         */
        BiFunction<Integer,Integer,Integer> biFunctionSum = MethodReference::sum; //Refers to the static method to be called using ::.
        System.out.println("sum : "+biFunctionSum.apply(20,29));
        /**
         * BiFunction works only on static method of the class
         * Does it work on the Function functional interface as well. Should I check on Math class
         */
        Function<Integer,Integer> square = MethodReference::squareOfNumber;
        System.out.println(square.apply(9));

        /**but first you need to define implementation for the functional interface.
         * Implementation is absolute for every functional interface, you need to define how the abstract method will behaviour
         * Behavior can be then passed as argument, data instances such as Runnable or other custom define method which invokes or takes functional
         * interface as argument hence termed as first class citizen
         */
        AnotherExample anotherExample = (x,y) -> x-y;
        BiFunction<Integer,Integer,Integer> difference = anotherExample::differenceOfNumber;
        System.out.println("First class citizen return : "+returnsFunctionalInterface((x,y) -> x-y,9,5));
        System.out.println("via using function reference :"+difference.apply(8,2));

    }

    /**
     * Method which takes functional interface as argument
     */
    public static int returnsFunctionalInterface(AnotherExample anotherExample,int a,int b){
        return anotherExample.differenceOfNumber(a,b);
    }


}
