package main.java.org.example.Udemy.Exercise;

import java.security.spec.RSAOtherPrimeInfo;

public class NatoSwitchCase {

    public static void main(String[] args) {
//        System.out.println(natoAlphabets('A'));
//        System.out.println(yieldNatoAlphabets('B'));
//        printDayOfWeek(8);
//        System.out.println(isLeapYear(104));
//        System.out.println(getDaysInMonth(2,2020));

        /**
         * calculating dollar interest incrementing by 0.25
         * another way of incrementing -> x = x+0.25 === x += 0.25
         * condition in between acts like a gate-pass for the incremented element to run through looping.
         * it will keep looping until the middle condition specified is satisfied.
         *
         */
//        for(double x = 7.5;x<10;x+=0.25){
//            System.out.println(calculateInterest(x));
//        }

        //is prime number check
//        System.out.println(isPrime(91));
//        System.out.println("Found : "+countPrimeCounts(10,50)+" for existing for loop");

        /**
         * sum 3 and 5 divisible number from 1 to 1000
         * The number to be found must be exactly 5.
         * Get the numbers which are divisible by both 3 and 5,
         * and then get their total sum as well
         */
        int sumOfNumbers = 0;
        int countFirstThreeNumbers = 0;
        for(int r1 = 1;r1<=1000;r1++){
            if(r1%3 == 0 && r1%5==0){
                sumOfNumbers = sumOfNumbers+r1;
                System.out.println("Number divisible by both 3 and 5 : "+r1+" sum of numbers : "+sumOfNumbers);
                countFirstThreeNumbers++;
                if(countFirstThreeNumbers==5){
                    break;
                }
            }
        }


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
     * yield means to return.
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

    /**
     * 16-09-25
     * @param interestRate
     * @return
     */
    public static double calculateInterest(double interestRate){
            return 100 * (interestRate/100);
        }


    /**
     * 16-09-25
     * IsPrime method calculator
     * A prime number is a number which have only two factors 1 and itself.
     */
    public static boolean isPrime(int number) {
        //it means I can check the factor, or count the factors, if the count is greater than 2 then its composite
        //number else it's a prime number
        boolean isPrime = true;
        if(number==2){
            return true;
        }
        /**
         * starting from 2 will eliminate all the even numbers from the list expect 2 for which we have given our
         * if condition at the first.
         */
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return isPrime;
    }

    public static int countPrimeCounts(int startingRange,int maxRange){
        int counts = 0;
        /**
         * In the for loop it's not mandatory for you to provide the starting initialisation.
         * If the initialisation is known, then it can be left empty as well. Just like i did.
         */
        for(;startingRange<maxRange;startingRange++){
            if(isPrime(startingRange)) {
                System.out.println("Prime number : " + startingRange);
                counts++;
            }
            if(counts==3){
                break;
            }
        }
        return counts;
    }
}
//September 18 changes made.




