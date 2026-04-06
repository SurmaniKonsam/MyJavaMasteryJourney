package org.example.TwentyLPAPackage.Collection.Streams;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;


//Will be used to group element based on department, else age
class Employee {
    String name;
    int age;
    String department;
    int salary;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name : "+name+" | Age : "+age+" | Department : "+department;
    }

}

public class CollectorsPractice {
    public static void main(String[] args) {
        Integer[] numbers = {1,-1,2,0,-2,-5,-6,9,98,12,0,12,-999,9999};
        List<Integer> nmbToList = Arrays.asList(numbers);
        /**
         * IntSummaryStatistics
         * DoubleSummaryStatistics
         * LongSummaryStatistics
         * Only three statistics are there
         *
         */
        IntSummaryStatistics getMax = nmbToList.stream().collect(Collectors.summarizingInt(x->x));
        //System.out.println("Max : "+getMax.getMax());


        //Get Average

        DecimalFormat df = new DecimalFormat("#.00"); //This is beautiful
        //System.out.println("Average : "+df.format(getMax.getAverage()));

        //or
        //System.out.println("a : "+getMax.getAverage());
        //System.out.println("b : "+getMax.getAverage()*100);
        double getValueInDouble = (double) Math.round(getMax.getAverage() * 100) /100;
        //System.out.println(getValueInDouble);

        //or
        /**
         * What is big decimal?
         * What is the use of big decimal?
         * What does RoundingMode does?
         * What is the meaning of setScale?
         * What is HALF_UP?
         */
        /*
        System.out.println(BigDecimal.valueOf(getMax.getAverage())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue());
         */

        //Grouping
        List<Employee> lstEmp = new ArrayList<>();
        //new Employee("Drona",56,"Front End",12000000);
        lstEmp.add(new Employee("Drona",56,"Front End",12000000));
        lstEmp.add(new Employee("Yuni",56,"HR",100000));
        lstEmp.add(new Employee("Anil",56,"HR",120000));
        lstEmp.add(new Employee("David",56,"Backend",4500000));
        lstEmp.add(new Employee("Akitra",56,"Backend",12000000));
        lstEmp.add(new Employee("Ramin",56,"Devops",12000000));
        lstEmp.add(new Employee("Surmani",30,"Backend",3000000));
        lstEmp.add(new Employee("Sanjita",56,"HR",1200000));

        System.out.println(lstEmp.stream()
                .filter(x->x.department.equals("HR"))
                .collect(Collectors.groupingBy(x->x.salary>1000000)));


        //Via length, grouping it via length
        /**
         * 4 letters length grouping :
         * 4=[Name : Yuni | Age : 56 | Department : HR, Name : Anil | Age : 56 | Department : HR]
         * 5 letters length grouping:
         * Its long.
         */
        System.out.println(lstEmp.stream().collect(Collectors.groupingBy(x->x.name.length())));


        //Check how many times a letter comes.
        String letter = "Hello World Hello World hello hello";
        System.out.println(Arrays
                .stream(letter.split(" "))
                .collect(Collectors
                        .groupingBy(x->x.equalsIgnoreCase("hello"))
                ));


        //Partitioning even and odd numbers
        List<Integer> evOdd = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(evOdd.stream().collect(Collectors.partitioningBy(x->x%2==0)));
        System.out.println("grouping by : "+evOdd.stream().collect(Collectors.groupingBy(x->x%2==0)));

        //Summing int
        //Also stream(), is applied directly to list only.
        //Arrays needs to be put inside stream first, like -> Arrays.stream(ReturnType[] rtype);
        String[] fruits = {"Apple","Mango","Banana"};
        //Also, mapping -> It needs unique key, hence you can't put key with same name.
        System.out.println(Arrays
                .stream(fruits)
                .collect(Collectors.toMap(String::toUpperCase,String::length)));

        //Can I check the occurrence of a letter using stream.
        String name = "Appleepppppppeeeeaaaa";
        Map<Character, Integer> countOccurrence = getCharacterIntegerMap(name);
        System.out.println(countOccurrence);

        System.out.println(getReOccurrenceCount(name));

    }

    //Count occurrence of letter
    private static Map<Character, Integer> getCharacterIntegerMap(String name) {

        Map<Character,Integer> countOccurrence = new HashMap<>();

        for (char c : name.toLowerCase().toCharArray()) {
            /**
             * c,countOccurrence.getOrDefault(c,0)+1
             * This is beautiful what is the meaning of this.
             * It will check if the key c exist. If it does, it returns you the value of the key else
             * if the key doesn't exist it returns you 0.
             * With the logic that, all the key at the very instance will be not there in the map. We are
             * returning value 0, for the very purpose.
             * Eg: A, when checked first time, since it doesn't exist we will have it return 0.
             * Hence, we have mapped the key value with 0+1, that is now after first iteration 'A' is mapped
             * to 1, which is the default value 0+1 returned mapped.
             * On the second iteration, we already had the key mapped to value 1.
             * Hence, during second iteration it will not give us the default instead since the value exist
             * on whichever iteration, it will return us the value 1+1, and so on it will keep incrementing
             * until the iteration of the loop is finished.
             */
           countOccurrence.put(c,countOccurrence.getOrDefault(c,0)+1);
        }
        return countOccurrence;
    }

    //count occurrence using stream
    //Collectors.counting() is of return type "Long"
    static Map<Character,Integer> getReOccurrenceCount(String name){
        /**
         * Questions to be asked.
         * What does mapToObj does
         * Why are we using it with char
         * What does collectingAndThen does?
         */
        return name.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors
                        .groupingBy(Function.identity(),Collectors
                                .collectingAndThen(Collectors.counting(),Long::intValue)));
    }



}
