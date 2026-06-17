package main.java.comparableComparator.Comparator;


/**
 * All the collections are part of import java.util.Collection name
 * Iterable -> Collections -> List -> ArrayList + Stack + Vector + Queue
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        //s1.compareTo(s2); -> gets your string list in alphabetical order.
        return s1.compareTo(s2);
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
        System.out.println(listOfNumber);

        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Eleven");
        stringList.add("Ob");
        stringList.add("Oa");

        stringList.sort(new StringComparator());

        /**
         * Using lambda expression let's sort stringList again.
         */
//        stringList.sort((s1,s2) -> {
//            return s2.length() - s1.length();
//        });
        System.out.println(stringList);

    }
}
