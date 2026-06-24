package org.example.thirtyLPAPackage.collection.comparatorComparable.comparator;

import java.util.*;

public class ComparatorLearning {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(12,"Sam",85000,3));
        employeeList.add(new Employee(26,"Am",115000,5));
        employeeList.add(new Employee(33,"Bm",250000,8));
        employeeList.add(new Employee(38,"Tam",280000,9));
        employeeList.add(new Employee(42,"Lam",350000,12));
        employeeList.add(new Employee(48,"Ram",450000,15));
        employeeList.add(new Employee(51,"Kam",500000,20));

        Collections.sort(employeeList);
        for (Employee e: employeeList){
            //System.out.println(e);
        }

        //Sort Alphabetical order.
        String[] fruits = {"Pineable","Banana","Kiwi","Grapes","Papaya"};
        List<String> lst = Arrays.asList(fruits);
        lst.sort(String::compareTo);
        System.out.println(lst);

        //Using Comparator
        List<ComparatorEmployee> comparatorEmp = new ArrayList<>();
        comparatorEmp.add(new ComparatorEmployee(12,85000,"Sam",3));
        comparatorEmp.add(new ComparatorEmployee(12,85000,"Am",3));
        comparatorEmp.add(new ComparatorEmployee(12,85000,"Bm",3));

        //Using List comparator
        /*
        Using list, you only need to put the object reference that is (a,b).
        comparatorEmp.sort((a,b) -> {
            if(a.age == b.age){
                return a.salary - b.salary;
            }
            return 0;
        });
         */

        //using Collections class.
        Collections.sort(comparatorEmp,(a,b) ->{
            if(a.age == b.age){
                return a.salary - b.salary;
            }else{
                return a.name.compareTo(b.name);
            }
        });

        //System.out.println(comparatorEmp)

        //object reference must be given inside comparing bracks.
        //comparatorEmp.sort(Comparator.comparing((ComparatorEmployee ce) ->ce.experience));

        comparatorEmp.sort(Comparator.comparingInt((ComparatorEmployee ce)-> ce.age)
                .thenComparing(ce -> ce.experience)
                .thenComparing(ce -> ce.salary)
                .thenComparing(ce -> ce.name).reversed());

        //System.out.println(comparatorEmp);
        for(ComparatorEmployee e: comparatorEmp){
            //System.out.println(e);
        }

        //Arraylist of number
        ArrayList<Integer> arInt = new ArrayList<>();
        arInt.add(819);
        arInt.add(1);
        arInt.add(99);
        arInt.add(19);
        arInt.add(99);
        Collections.sort(arInt);
        //arInt.stream().forEach(System.out::println);
        /*Output
            1
            19
            99
            99
            819
         */

    }
}
