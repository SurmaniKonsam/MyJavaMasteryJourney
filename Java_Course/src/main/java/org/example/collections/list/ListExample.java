package org.example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfInt = new ArrayList<>();
        List<Integer> myRandomList = List.of(1,43,0,5,23,42,12);
        /**
         * One way to add all the random list
         */
        listOfInt.addAll(myRandomList);
        //Another Way As Well
        List<Integer> newList = new ArrayList<>(myRandomList);
        newList.sort(null);
        newList.add(90);
        newList.add(90);
        newList.sort((x1,x2) -> x2 - x1);
        System.out.println(newList);
    }
}
