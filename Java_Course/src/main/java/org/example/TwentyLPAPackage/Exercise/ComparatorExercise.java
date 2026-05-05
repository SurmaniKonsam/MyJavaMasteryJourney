package org.example.TwentyLPAPackage.Exercise;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    String department;
    int experience;
    double salary;

    public Employee(String name, String department, int experience, double salary) {
        this.name = name;
        this.department = department;
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}

public class ComparatorExercise {
    /*
    You are given a list of employees:
    Each employee has:

    name (String)
    department (String)
    experience (int)
    salary (double)

    Task
    Sort the list based on:

    1. Department (ascending, alphabetical)
    2. Within same department → experience (descending)
    3. If experience same → salary (ascending)
    4. If salary same → name (alphabetical)
     */
    public static void main(String[] args) {
        List<Employee> lst = new ArrayList<>();
        lst.add(new Employee("Nika",null,2,45000));
        lst.add(new Employee("Mika","Software",4,45000));
        lst.add(new Employee("Tika","HR",4,55000));
        lst.add(new Employee("Sika","Management",4,45000));
        lst.add(new Employee("Aika","Software",4,35000));

        //((Employee e) -> e.department)) -> This acts as a whole argument
        lst.sort(Comparator.comparing((Employee e) -> e.department)
                .thenComparing(e -> e.experience).reversed()
                .thenComparing(e -> e.salary)
                .thenComparing(e->e.salary));

        for(Employee e : lst){
            System.out.println(e);
        }
    }

}
