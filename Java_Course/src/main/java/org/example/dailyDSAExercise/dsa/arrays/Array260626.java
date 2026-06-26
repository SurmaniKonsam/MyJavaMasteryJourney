package org.example.dailyDSAExercise.dsa.arrays;

import java.util.Arrays;

public class Array260626 {
    /**
     * The theory of if, else-if and else block.
     * if and else if are chained.
     * Java checks the if condition.
         * If it is true, it executes the if block and skips the entire "else/else if" chain.
         * If it is false, only then does Java check the else if or else block.
         * Since else if belongs to the 'else' of the preceding if, it is never touched when the preceding if is true.
     */
    public static int[] returnConcatenateArray(int[] arr1, int[] arr2){
        int[] concatenated = new int[arr1.length+arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        for(int i = 0; i<concatenated.length;i++){
            if(arr1Index<arr1.length){
                concatenated[i] = arr1[arr1Index];
                arr1Index++;
            }
            else if(arr2Index<arr2.length){
                //then i need to push arr2 index value as well.
                concatenated[i] = arr2[arr2Index];
                arr2Index++;
            }
        }
        return concatenated;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(returnConcatenateArray(arr1, arr2)));
    }
}
