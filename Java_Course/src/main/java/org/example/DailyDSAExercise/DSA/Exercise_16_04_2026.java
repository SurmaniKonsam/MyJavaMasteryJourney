package org.example.DailyDSAExercise.DSA;

import java.util.*;


public class Exercise_16_04_2026 {
    public static void createDuplicate(int ...arr){
        int writeUnique = 0;
        for(int i = 0;i<arr.length;i++){
            boolean caughtDup = false;
            for(int j = 0;j<writeUnique;j++){
                if (arr[i] == arr[j]) {
                    caughtDup = true;
                    break;
                }
            }
            if(!caughtDup){
                arr[writeUnique] = arr[i];
                writeUnique++;
            }
        }
        for(int i = 0;i<writeUnique;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //factorial Using Recursion
    public static int factorial(int number){
        if(number>0){
            return number * factorial(number-1);
        }
        return 1;
    }

    //let's provide an exit gate. This is much cleaner
    public static int factorialWithExitGate(int number){
        //exit gate.
        if(number == 0){
            return 1;
        }
        return number * factorialWithExitGate(number-1);
        /**
         * f(5)
         * 5 * f(4)
         * 5 * 4 * f(3)
         * 5 * 4 * 3 * f(2)
         * 5 * 4 * 3 * 2 * f(1)
         * 5 * 4 * 3 * 2 * 1 * f(0); f(0) -> 1. Dead end.
         * final result -> 5 * 4 * 3 * 2 * 1 * 1
         */
    }

    //Given an array, check if there exists a subset whose sum equals a target.
    public static boolean findSubsetElementSumEqualsTarget(int target, int ...arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //create duplicates
    public static void duplicatesUsingSets(int ...arr){
        Set<Integer> uniques = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            uniques.add(arr[i]);
        }

        //Wrapped in mutable why?
        //List<Integer> lstUnique = new ArrayList<>(uniques.stream().toList());
        //Can be referred this way as well
        List<Integer> lstUnique = new ArrayList<>(uniques);
        //I love Comparator.comparing and Comparator interface, kinda it clicks in my head.
        lstUnique.sort(Comparator.comparing((Integer a)->a).reversed());

        //to get in order.
        //What was the argument like -> collectionReference, arguments to compare with.
        //Collections.sort(lstUnique,(a,b)->Integer.compare(b,a)); -> this is one way.
        //lstUnique.sort((a, b) -> Integer.compare(b, a));

        for (Integer integer : lstUnique) {
            System.out.print(integer + " | ");
        }
    }



    public static void main(String[] args) {
        int[] numbers = {1,2,12,1,1,12,23,45,45,32,2,12,6,7,7,7,9,9,12,12};
        //createDuplicate(numbers);
        System.out.println();
        //duplicatesUsingSets(numbers);
        //System.out.println(factorial(5));
        //System.out.println(factorialWithExitGate(5));

        int[] nav = {3, 34, 4, 12, 5, 2};
        System.out.println(findSubsetElementSumEqualsTarget(39,nav));


    }
}
