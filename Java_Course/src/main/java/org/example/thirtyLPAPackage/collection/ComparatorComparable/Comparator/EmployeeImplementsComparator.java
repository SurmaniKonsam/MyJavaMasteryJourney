package org.example.thirtyLPAPackage.collection.ComparatorComparable.Comparator;

import java.util.*;

public class EmployeeImplementsComparator implements Comparator<EmployeeImplementsComparator>{
    //The generic return type of the comparator must be the same as the return type for the compare method
    //you are implementing.
    int age;
    String name;
    int salary;

    public EmployeeImplementsComparator(){}

    public EmployeeImplementsComparator(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compare(EmployeeImplementsComparator o1, EmployeeImplementsComparator o2){
        return Integer.compare(o1.age,o2.age);
    }

    @Override
    public String toString() {
        return "Name : "+name+" | age : "+age+" | : "+salary;
    }

    public static void main(String[] args) {
        List<EmployeeImplementsComparator> empCmp = new ArrayList<>();
        //new EmployeeImplementsComparator(29,"Sham",740000);
        empCmp.add(new EmployeeImplementsComparator(29,"Sham",74000));
        empCmp.add(new EmployeeImplementsComparator(29,"Surmani",98000));
        empCmp.add(new EmployeeImplementsComparator(21,"Uncy",72000));
        empCmp.add(new EmployeeImplementsComparator(25,"Inaina",80000));
        empCmp.add(new EmployeeImplementsComparator(260,"Sanjita",72000));

        empCmp.sort(new EmployeeImplementsComparator());

        System.out.println(empCmp);

    }
}
