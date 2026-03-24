package org.example.TwentyLPAPackage.Collection.ComparatorComparable.ComparableExercise;

public class ComparableEmployee implements Comparable<ComparableEmployee>{
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
