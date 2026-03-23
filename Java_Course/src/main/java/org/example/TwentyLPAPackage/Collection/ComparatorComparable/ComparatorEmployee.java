package org.example.TwentyLPAPackage.Collection.ComparatorComparable;

public class ComparatorEmployee {
    int age;
    int salary;
    String name;
    int experience;

    public ComparatorEmployee(int age, int salary, String name, int experience) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.experience = experience;
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
