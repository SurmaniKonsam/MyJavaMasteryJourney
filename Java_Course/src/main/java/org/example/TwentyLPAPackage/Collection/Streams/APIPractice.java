package org.example.TwentyLPAPackage.Collection.Streams;

import java.util.function.Function;

public class APIPractice {
    public static void main(String[] args) {
        /**
         * What does Function.identity().apply(input); does?
         * returns a function that returns its input as-is.
         * Means, the input will be returned as output.
         * What is boxed?
         * What is primitiveTypeStream?
         * What is IntStream, LongStream, why do we use it?
         */
        System.out.println(Function.identity().apply("A"));
    }
}
