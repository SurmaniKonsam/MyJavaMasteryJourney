package main.java.org.example.exercise;

public class MinutesToYearsDays {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long days;
            long years;
            long remainingDays = minutes%525600;
            if(remainingDays == 0){
                days = 0;
            }else{
                days = remainingDays/1440;
            }
            if(minutes == 0){
                years = 0;
            }else{
                years= minutes/525600;
            }
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
            //sfa
            /**
             * On path to java mastery
             */
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);
        printYearsAndDays(1440);
    }
}
