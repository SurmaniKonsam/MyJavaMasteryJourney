package DailyDSAExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentCity {
    String name;
    String city;
    int marks;

    public StudentCity(String name, String city, int marks) {
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentCity{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<StudentCity> lst = new ArrayList<>();
        //new StudentCity("A","Chennai",34);
        lst.add(new StudentCity("B","Chennai",94));
        lst.add(new StudentCity("C","Delhi",44));
        lst.add(new StudentCity("D","Delhi",45));
        lst.add(new StudentCity("E","Pune",84));
        lst.add(new StudentCity("E","Pune",54));

        lst.stream().filter(x -> x.city.equalsIgnoreCase("Chennai"))
                .sorted(Comparator.comparing((StudentCity x)->x.marks).reversed())
                .skip(1) //never knew about skip. Important one.
                .findFirst() //checks the returned result after skip(), if it exists, ifPresent will return you result.
                .ifPresentOrElse(System.out::println,()-> System.out.println("No second highest")); //this is important.
    }
}
