package org.example.thirtyLPAPackage.collection.HashMap;

import java.util.*;


class Dev implements Comparable<Dev>{
    String name;
    String department;
    int salary;
    int age;

    public Dev(String name, String department, int salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Dev dev){
        if(this.department.equals(dev.department)){
            return Integer.compare(this.salary,dev.salary);
        }return this.name.compareTo(dev.name);
    }

    @Override
    public String toString(){
        return "Name : "+name+" | Age : "+age+" | Salary : "+salary;
    }

}

public class SortedMapPractice {
    public static void main(String[] args) {
        List<Dev> lst = new ArrayList<>();
        //new Dev("Surmani","IT",95000,29)
        lst.add(new Dev("Surmani","Backend",95000,30));
        lst.add(new Dev("Mani","Backend",125000,30));
        lst.add(new Dev("Aang","Devops",95000,30));
        lst.add(new Dev("Denny","HR",83000,30));

        Collections.sort(lst);

        Iterator<Dev> itr = lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        /*
        lst.sort((a,b)->{
            return Integer.compare(b.age,a.age);
        });
        System.out.println(lst);
        */

        lst.sort(Comparator.comparing((Dev d)->d.age).
                thenComparing(Comparator.comparing((Dev d)->d.salary).reversed()));

        //lst.forEach(System.out::println);


        /**
         * Used for sorting keys naturally.
         */
        SortedMap<String,Integer> srtMap = new TreeMap<>();
        srtMap.put("C",12);
        srtMap.put("A",122);
        srtMap.put("B",123);
        System.out.println(srtMap);







    }
}
