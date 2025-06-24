package main.java.org.example.java8.FunctionalInterface;

import java.util.function.Supplier;

/**
 * Supplier lets' you return a result of type specified in the Supplier</Generic_Return_Type>.
 * Yes, it only lets you return a result, it's like a getter in the world of functional interface.
 */
public class SupplierExample {
    public static void main(String[] args) {
        /**
         * Supplier, takes in the argument of return type. Be very mindful it doesn't take the input type parameter, rather it tells you that
         * the oil which you are putting inside (parameter), is what you get in your food that is the return type result.
         * Simple -> Supplier, takes in the argument of return type. That is if you are returning 9, then the return type should be Integer.
         * Hence, the parameter to be provided to the supplier would be Integer.
         * And no input parameter during the lambda expression.
         */
        Supplier<Integer> supplySqr = () -> 9;
        System.out.println("number : "+supplySqr.get());
    }
}
