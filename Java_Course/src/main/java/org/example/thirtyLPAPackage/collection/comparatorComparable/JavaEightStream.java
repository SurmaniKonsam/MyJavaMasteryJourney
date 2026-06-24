package org.example.thirtyLPAPackage.collection.comparatorComparable;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeDummy {
    String name;
    int experience;

    EmployeeDummy(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}


public class JavaEightStream {
        public static void main(String[] args) {

            List<EmployeeDummy> list = new ArrayList<>();
            list.add(new EmployeeDummy("Rahul", 3));
            list.add(new EmployeeDummy("Anita", 6));
            list.add(new EmployeeDummy("Kiran", 5));
            list.add(new EmployeeDummy("Sneha", 2));

            // Predicate → filter
            Predicate<EmployeeDummy> experienced = e -> e.experience > 4;

            // Function → transform
            Function<EmployeeDummy, String> transform = x -> {
                if(experienced.test(x)){
                    return x.name+" experience : "+x.experience;
                }return "Not eligible";
            };

            // Consumer → print
            Consumer<String> printer = System.out::println;

            // Stream pipeline
            list.stream()
                    .filter(experienced)        // Predicate
                    .map(transform)             // Function
                    .forEach(printer);          // Consumer
        }

}
