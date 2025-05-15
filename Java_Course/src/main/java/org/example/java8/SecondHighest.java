package main.java.org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 50, 30, 20, 40,42, 50); // Sample list

            Optional<Integer> secondHighest = numbers.stream()
                    .distinct()                            // Remove duplicates
                    .sorted(Comparator.reverseOrder())     // Sort in descending order
                    .skip(1)                                // Skip the highest
                    .findFirst();                           // Get the second highest

            secondHighest.ifPresentOrElse(
                    n -> System.out.println("Second Highest: " + n),
                    () -> System.out.println("Second Highest not found")
            );
        }
}
