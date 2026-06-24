package org.example.thirtyLPAPackage.collection.streams.collectors;

import java.util.*;

public class CollectorExercises {
    public static void main(String[] args) {
        List<List<String>> data = List.of(
                List.of("A", "B"),
                List.of("C"),
                List.of("D", "E")
        );

        System.out.println(data.stream().flatMap(Collection::stream).toList());
    }
}
