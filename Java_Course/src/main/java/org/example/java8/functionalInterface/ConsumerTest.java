package main.java.org.example.java8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerTest {
    /**
     * Consumer -> consumes and input, only one input, then generate you an output of void type.
     * @param args
     */
    public static void main(String[] args) {
        Consumer<Integer> numberIs = x -> System.out.println("Number is "+x);
        numberIs.accept(90);
    }

}
