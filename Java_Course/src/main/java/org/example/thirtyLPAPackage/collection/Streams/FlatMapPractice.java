package org.example.thirtyLPAPackage.collection.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapPractice {
    public static void main(String[] args) {
        List<List<List<Integer>>> lst = new ArrayList<>();
        List<Integer> peel = List.of(1,2,3,4,5,6,7,8,9);
        List<List<Integer>> peelTwo = List.of(peel);
        lst.add(peelTwo);
        //let's peel it now
        System.out.println(lst);
        Stream<Integer> str = lst.stream()
                .flatMap(List::stream)
                .flatMap(List::stream);

        //Got a basic understanding.
        //System.out.println(str.toList());

        //Practice Question One
        List<List<String>> data = List.of(
                List.of("apple", "banana"),
                List.of("cat"),
                List.of("dog", "elephant")
        );

        //So flat map is used as starting operation to detangle, or peel of all the complex layer into simple
        //layer, so that we can perform operation on.
        Stream<String> flat = data.stream().flatMap(List::stream).map(String::toUpperCase).toList().stream();
        System.out.println(flat.toList());

    }
}
