package org.example.thirtyLPAPackage.collection.comparatorComparable.comparator;


public class Employee implements Comparable<Employee> {
    int age;
    String employeeName;
    int salary;
    int experience;

    public Employee(int age, String employeeName, int salary, int experience){
        this.age = age;
        this.employeeName = employeeName;
        this.salary = salary;
        this.experience = experience;
    }

    /*
    using int age
    @Override
    public int compareTo(Employee e){
        return this.age - e.age;
    }*/

    //using name only, alphabetical order
    @Override
    public int compareTo(Employee e){
        return this.employeeName.compareTo(e.employeeName);
    }


    @Override
    public String toString(){
        return "name : "+this.employeeName+" age: "+this.age+" : experience : "+this.experience;
    }


}

