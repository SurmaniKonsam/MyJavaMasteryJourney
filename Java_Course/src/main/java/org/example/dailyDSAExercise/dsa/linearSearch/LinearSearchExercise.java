package org.example.dailyDSAExercise.dsa.linearSearch;


public class LinearSearchExercise {
    //small change to understand conflict merge

    static void findMinimumElement(int ...arr){
        //[7, 2, 9, 1, 5]
        int minimumValue = Integer.MAX_VALUE;
        for (int j : arr) {
            minimumValue = Math.min(minimumValue, j);
        }
        System.out.println("minimum value : "+minimumValue);
    }

    //find minimum value.
    static void findMaximumValue(int ...arr){
        int maxValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            maxValue = Math.max(maxValue,arr[i]);
        }

        System.out.println("max value is : "+maxValue);
    }

    public static void main(String[] args) {
        int[] minimumExercise = {7, 2, 9, 1, 5};
        findMinimumElement(minimumExercise);
        findMaximumValue(minimumExercise);
    }

}
