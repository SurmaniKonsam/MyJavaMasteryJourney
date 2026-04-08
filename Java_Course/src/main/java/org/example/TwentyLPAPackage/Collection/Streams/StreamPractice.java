package org.example.TwentyLPAPackage.Collection.Streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> revLst = getStrings();
        revLst.sort(Comparator.reverseOrder());

        //Squaring and sorting number
        List<Integer> nmbers = List.of(11,4,3,2,12,99,1,1,1,0,2,32,3,3,3,3,11,4);
        List<Integer> getNm = nmbers.stream().map(x -> x*x).toList();
        for (Integer rd : getNm){
            //System.out.println(rd);
        }

        //Sum -> List<Integer> nmbers = List.of(11,4,3,2,12,99,1,1,1,0,2,32,3,3,3,3,11,4);
        int sum = nmbers.stream().reduce(0,(x,y)->x+y);
        System.out.println("Sum : "+sum);

        //or
        int sumUsingIntegerMethodRef = nmbers.stream().reduce(Integer::sum).get();
        System.out.println("Sum : "+sumUsingIntegerMethodRef);

        //Find the largest String count
        List<String> names = List.of("Strings","Rajesh","Schwarzenegger","SurmaniKonsam","Hilihlihlilhsfdimani");
        Optional<String> getLargestString = names.stream().reduce((str1,str2)->
            str1.length()>str2.length()?str1:str2
        );

        //Counting occurrence using stream.
        String name = "Hello World"; //to count L occurance
        System.out.println("l count : "+name.chars().filter(x->x=='l').count());

    }

    private static List<String> getStrings() {
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
        //Arrays.stream(dupChecks).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        /**
         * List<String> revLst = Arrays.asList(dupChecks);
         * And
         * List<String> revLst = List.Of(dupChecks);
         * They both pretty much do the same thing.
         * Comparator.reverseOrder() -> is very useful.
         */
        List<String> revLst = Arrays.asList(dupChecks);
        return revLst;
    }
}
