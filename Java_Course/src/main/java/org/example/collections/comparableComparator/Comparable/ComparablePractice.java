package org.example.collections.ComparableComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice implements Comparable<ComparablePractice>{
    String names;

    public ComparablePractice(String names) {
        this.names = names;
    }

    @Override
    public int compareTo(ComparablePractice o) {
        return o.names.length() - this.names.length();
    }

    public static void main(String[] args) {
        List<ComparablePractice> comparableList = new ArrayList<>();
        //new ComparablePractice("Ahaakkkkkk");
        comparableList.add(new ComparablePractice("Ahaakkkkkk"));
        comparableList.add(new ComparablePractice("Ahaakk"));
        comparableList.add(new ComparablePractice("Bi"));
        comparableList.add(new ComparablePractice("kkkkkkkkkkkk"));
        comparableList.add(new ComparablePractice("Zkk22222222222"));

        Collections.sort(comparableList);
        comparableList.stream().forEach(x -> System.out.println(x.names));





    }
}
