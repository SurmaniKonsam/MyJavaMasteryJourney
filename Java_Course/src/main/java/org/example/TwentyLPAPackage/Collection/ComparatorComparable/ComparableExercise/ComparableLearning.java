package org.example.TwentyLPAPackage.Collection.ComparatorComparable.ComparableExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableEmployee implements Comparable<ComparableEmployee>{
    int age;
    int salary;
    String name;
    int experience;

    public ComparableEmployee(int age, int salary, String name, int experience) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.experience = experience;
    }

    //compareTo will return either 0,-1,1

    /**
     * Only one method exist in Comparable Interface -> public int compareTo(T o);.
     * That aon
     */
    @Override
    public int compareTo(ComparableEmployee ce){
        return this.name.compareTo(ce.name);
    }

    @Override
    public String toString() {
        return "Employee : {" +
                "Age = " + age +
                ", salary =" +salary +
                ", Experience ="+experience+
                ", Name ="+name;
    }
}

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
