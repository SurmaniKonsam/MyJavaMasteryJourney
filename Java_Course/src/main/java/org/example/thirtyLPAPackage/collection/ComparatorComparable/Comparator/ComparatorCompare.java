package org.example.thirtyLPAPackage.collection.ComparatorComparable.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorCompare {
    int age;
    String name;
    double grade;

    public ComparatorCompare(int age, String name,double grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    /**
     * So compare is used basically for only list of one type it could be either
     * Integer
     * Double anything
     * But not on object.
     *  int compare(T o1, T o2); -> Compares two int object.
     *  Could be used at List of same Object Type. -> List<Integer></Integer>
     *
     */

    @Override
    public String toString() {
        return "{ Name : " +name+
                "| age : " + age+" | Grade : "+grade+" }";
    }

    public static void main(String[] args) {
        List<ComparatorCompare> lstComp = new ArrayList<>();
        //new ComparatorCompare(21,"Ja")
        lstComp.add(new ComparatorCompare(21,"Charlie",3.5));
        lstComp.add(new ComparatorCompare(22,"Backie",3.6));
        lstComp.add(new ComparatorCompare(23,"Sam",3.4));
        lstComp.add(new ComparatorCompare(24,"Sam",3.7));
        lstComp.add(new ComparatorCompare(25,"Sin",3.9));

        /*
        lstComp.sort((a,b)->{
            return a.name.compareTo(b.name);
        });
         */

        /*
        lstComp.sort((a,b)->{
            return a.name.length() - b.name.length();
        });
         */

        //Using Comparator.comparing
        /**
         * Using Comparator.comparing back again in thenComparing chained, if we want that
         * chained to be reversed.
         * If not then it will by default go to natural sorting order which is ascending
         * order.
         */
        /*
        lstComp.sort(Comparator.comparing((ComparatorCompare ce)->ce.name)
                .thenComparing(Comparator.comparing((ComparatorCompare ce) -> ce.age)).reversed());
         */
        //sorting by name
        lstComp.sort(Comparator.comparing((ComparatorCompare ce)->ce.name)
                .thenComparing(ce -> ce.age));

        //Sort by grade
        lstComp.sort(Comparator.comparingDouble((ComparatorCompare ce) -> ce.grade));

        //Another method brute force approach pure logic
        /**
         * if returns -> +1 -> descending order
         * if returns -> -1 -> ascending order
         * if returns -> 0 -> same
         */

        lstComp.sort((a,b)->{
            if(a.grade > b.grade){
                return 1;
                //return -1; then descending
            }else if(a.grade < b.grade){
                return -1;
                //return 1; then ascending
            }return 0;
        });

        lstComp.stream().forEach(System.out::println);



    }
}
