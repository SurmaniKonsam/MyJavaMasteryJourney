package main.java.org.example.Udemy.Exercise;

public class NatoSwitchCase {

    public static void main(String[] args) {
        System.out.println(natoAlphabets('A'));
        System.out.println(yieldNatoAlphabets('B'));
        printDayOfWeek(8);
        System.out.println(isLeapYear(104));
//        System.out.println(getDaysInMonth(2,2020));
    }

    public static String natoAlphabets(char character){
        switch (character){
            case 'A':
                return "Able";
            case 'B':
                return  "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not Found";
        }
    }

    /**
     * Yield way of returning value using switch
     */
    public static String yieldNatoAlphabets(char character){
        return switch (character){
            case 'A' -> { yield "Able";}
            case 'B' -> { yield "Baker";}
            case 'C' -> {yield "Charlie";}
            case 'D' -> {yield "Dog";}
            case 'E' -> {yield "Easy";}
            default -> {
                yield "No Match Found";
            }
        };
    }


    /**
     * exercise yield switch exercise
     * Any methods which return a variable is called Expression.
     */
    public static String returnDayOfWeek(int day){
        return switch (day){
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> {yield "Invalid Day";}
        };
    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = returnDayOfWeek(day);
        System.out.println("Day : "+day+" : "+dayOfTheWeek);
    }

    /**
     * leap year method with yield
     */
    public static boolean isLeapYear(int year) {
        if(year>1 && year<9999){
            if(year%4 == 0) {
                if(year % 100 == 0){//checking if it's a century year
                    if(year % 400 == 0){//if it's a century year then it must be divisible by 400 as well
                        return true;
                    }else{
                        return false;
                    }
                }return true;
            }return false;
        }
        return false;
    }


    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12 || year < 1 || year > 9999)) {
            return -1;
        } else if (year % 4 == 0 && year<100) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {yield 31;}
                case 2 -> {yield 29;}
                default -> {yield 30;}
            };
        }return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {yield 31;}
                case 2 -> {yield 28;}
                default -> {yield 30;}
            };
        }
    }
