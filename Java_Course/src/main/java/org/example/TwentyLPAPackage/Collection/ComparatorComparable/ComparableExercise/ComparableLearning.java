package org.example.TwentyLPAPackage.Collection.ComparatorComparable.ComparableExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableLearning {
    public static void main(String[] args) {
        List<ComparableEmployee> lstCmp = new ArrayList<>();
        //new ComparableEmployee(24,60000,"Jany",3);
        lstCmp.add(new ComparableEmployee(24,60000,"Jany",3));
        lstCmp.add(new ComparableEmployee(25,80000,"Any",3));
        lstCmp.add(new ComparableEmployee(24,70000,"Ati",3));
        lstCmp.add(new ComparableEmployee(26,60000,"Bulma",3));
        lstCmp.add(new ComparableEmployee(27,90000,"Trunks",3));

        Collections.sort(lstCmp);
        for (ComparableEmployee ce : lstCmp){
            System.out.println(ce);
        }
    }
}
