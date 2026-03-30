package org.example.TwentyLPAPackage.Collection.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        while(i<11){
            lst.add(i);
            i++;
        }


        Stream<Integer> str = lst.stream();
        /*
        Stream<Integer> str = lst.stream();
        Predicate<Integer> getEven = x -> x%2 == 0;
        Predicate<Integer> greaterThanTwo = x -> x>2;
        Predicate<Integer> combinedLogic = getEven.and(greaterThanTwo);
        Consumer<Integer> printOut = System.out::println;

        str.filter(combinedLogic).forEach(printOut);
         */

        //It indeed is a declarative statement.
        /*
        lst.stream()
                .filter(x->x%2==0)
                .filter(x -> x>2)
                .forEach(System.out::println);

         */


        String[] dupChecks = {"Sham","Kari","Nina","Ilina","Jack","Jack","Sham"};
        Arrays.stream(dupChecks).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        /**
         * List<String> revLst = Arrays.asList(dupChecks);
         * And
         * List<String> revLst = List.Of(dupChecks);
         * They both pretty much do the same thing.
         * Comparator.reverseOrder() -> is very useful.
         */
        List<String> revLst = Arrays.asList(dupChecks);
        revLst.sort(Comparator.reverseOrder());







    }
}
