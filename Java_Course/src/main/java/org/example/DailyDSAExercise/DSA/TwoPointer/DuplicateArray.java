package org.example.DailyDSAExercise.DSA.TwoPointer;

import java.util.Arrays;

public class DuplicateArray {




    static int returnUniqueElements(int ...arr){
        if(arr.length==0) return 0;

        int write = 1;

        for(int read = 1;read<arr.length;read++){
            if(arr[read]!=arr[read-1]){
                //only writes when its unique, or not equal to the previous index,
                arr[write] = arr[read];
               write++;
            }
            //write++;
        }

        //Arrays.stream(arr).forEach(System.out::print);
        for(int i = 0; i < write; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return write;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3,4,5,6,7,7,7,7,7};
        System.out.println(returnUniqueElements(arr));
    }
}
