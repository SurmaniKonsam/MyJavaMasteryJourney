package main.java.org.example.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 13-05-25
 */
public class PredicateClass {

    public static void main(String[] args) {

        /**
         * Predicate it's cool, its basically functional interface manifestation of if condition
         */
        Predicate<Integer> checkEven = (i) -> i%2 == 0;

        /**
         * Arrays.asList is cool for converting any list of values into list.
         */
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,8,10);

        /**
         * int[] num = {1,2,3,4,5,6,7,8,9,10};
         * Stream() works even on array of int but since the predicate defined is using Integer a wrapper class as its argument
         * int[] array needs to be boxed -> Arrays.stream(yourIntArrayReference).boxed()
         * each time to get it converted into wrapper class compatible object -> Integer == boxed.intVariables;
         */
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(num).boxed().filter(checkEven).forEach(x -> System.out.println("Even boxed number : "+x));

        /**
         * Stream() works even on array of int but since the predicate defined is using Integer a wrapper class as its argument
         * int[] array needs to be boxed each time to get it converted into wrapper class compatible object -> Integer == boxed.intVariables;
         * Predicate
         */
        numbers.stream().filter(checkEven).forEach(s -> System.out.println("Even number : "+s));

    }
}
