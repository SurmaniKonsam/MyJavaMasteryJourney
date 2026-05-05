package org.example.Collections.Comparator;


/**
 * All the collections are part of import java.util.Collection name
 * Iterable -> Collections -> List -> ArrayList + Stack + Vector + Queue
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Compare implements Comparator<Integer> {

    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     * Just get it memorised
     * o2 - o1 -> Descending order -> how to memorise 2 never comes before 1 in natural sorting order, so if you have
     * to break the natural sorting order that is descending, then you need to put 2/second placeholder before 1/first
     * placeholder.
     * o1 - o2 -> Ascending order
     * 0 -> natural added order will be preserved means no sorting would be done.
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;

    }
}

/**
 * Yes everyone I have mastered comparator based on length of the string, and number order
 * Now, I want to know how to arrange words in order
 */
class StringComparator implements Comparator<String>{

    /**
     * Compare function as we can see, acts or behave like Function functional interface.
     */
    @Override
    public int compare(String s1,String s2){
        return s2.length() - s1.length();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();
        listOfNumber.add(9);
        listOfNumber.add(21);
        listOfNumber.add(4);
        listOfNumber.add(30);
        listOfNumber.sort(new Compare());

        //listOfNumber.sort(Comparator.comparingInt((Integer a)->a).reversed());
        //listOfNumber.sort((Integer a,Integer b)->a-b);
        //Collections.sort(listOfNumber,(Integer a,Integer b)->b-a);
        Stream<Integer> getNmb = listOfNumber.stream().filter(x->x%3==0)
                .map((x)->x*2).toList().stream();
        System.out.println(getNmb.toList());
        /**
         * if(getNumb.isPresent()){} -> short lambda version -> getNmb.ifPresent(System.out::println);
         */
        //getNmb.ifPresent(System.out::println);


        System.out.println(listOfNumber);

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Eleven");
        stringList.add("Oh");

        stringList.sort(Comparator.reverseOrder());
        //System.out.println(stringList);

        /**
         * Using lambda expression let's sort stringList again.
         */
        /*
        stringList.sort((s1,s2) -> {
            return s2.length() - s1.length();
        });
        System.out.println(stringList);

         */

    }
}
