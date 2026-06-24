package org.example.DailyDSAExercise.DSA.TwoPointer;

import java.util.Arrays;

public class ExercisesTwoPointer {
    //remove duplicates from the array, no new array must be defined. -> 1
    static void removeDuplicates(int ...arr){
        int readDuplicates = 0;
        int writeUniques = 1;
        while(readDuplicates!=arr.length-1){
            if(arr[readDuplicates+1]!=arr[readDuplicates]){
                arr[writeUniques] = arr[readDuplicates+1];
                writeUniques++;
            }
            readDuplicates++;
        }

        for(int read = 0;read<writeUniques;read++){
            System.out.print(arr[read]+"|");
        }
    }

    //my solution -> 2.1. Date : 24-06-26
    static void moveZeroesToEnd(int ...arr){
        int readNonZero = 0;
        int writeNonZero = 0;
        while(readNonZero<arr.length){
            if(arr[readNonZero]!=0){
                arr[writeNonZero] = arr[readNonZero];
                writeNonZero++;
            }

            //Here i am breaking the window prowess.
            /**
             * See carefully, the window is kept or created only for the sole purpose of extracting
             * the non-zero value out of the array. But i am breaking its integrity by introducing
             * another if condition, which might corrupt the window purpose at the first place.
             * So, preserve or write the values first for which the window was created,
             * and then later introduce another window to clean the data properly.
             * Which was then later introduced in jarvis algorithm.
             */
            if(readNonZero>writeNonZero){
                arr[readNonZero] = 0;
            }
            readNonZero++;
        }

        for(int a: arr){
            System.out.print(a+"|");
        }

    }



    /**
     * The solution.
     * 1. Iteration -> preserve useful data
     * 2. Iteration -> write the remaining zero value.
     * Conclusion : {
     * Protect useful data first.
     * Modify leftovers later.
     * }
     */
    //move zeroes to the end. -> 2 -> jarvis solution. -> 24-06-2026
    static void moveZeroesToEndJarvisWay(int ...arr){
        int readNonZero = 0;
        int writeNonZero = 0;
        while(readNonZero<arr.length){
            if(arr[readNonZero]!=0){
                arr[writeNonZero] = arr[readNonZero];
                writeNonZero++;
            }
            readNonZero++;
        }
        while(writeNonZero<arr.length){
            arr[writeNonZero] = 0;
            writeNonZero++;
        }

        for(int a: arr){
            System.out.print(a+"|");
        }
    }

    //Third problem. 24-06-2026. Squares of a Sorted Array
    //Using two pointer.

    /**
     * Tips : pointers are only answering : Who is the largest remaining square?
     * Be mindful, the below algorithm works best and only for sorted algorithm.
     * We have worked on ascending order over here.
     * If descending just change the invariants that is: leftPointerSquareValue<rightPointerSquareValue
     */
    static void squareOfSortedArray(int ...arr){
        /**
         * i can use the converging two pointer theory iteration, to move from
         */
        int leftPointer = 0;
        int writeSorter = arr.length-1;
        int rightPointer = arr.length-1;
        int[] squareSortedArray = new int[arr.length];
        while(leftPointer<=rightPointer){
           int leftPointerSquareValue = arr[leftPointer] * arr[leftPointer];
           int rightPointerSquareValue = arr[rightPointer] * arr[rightPointer];
           //for ascending order -> leftPointerSquareValue>rightPointerSquareValue
            //descending order -> have the invariant change -> rightPointerSquareValue<leftPointerSquareValue.
            //If its descending order, then have the largest square value placed in the last.
           if(leftPointerSquareValue<rightPointerSquareValue){
               squareSortedArray[writeSorter] = rightPointerSquareValue;
               rightPointer--;
           }else{
               squareSortedArray[writeSorter] = rightPointerSquareValue;
               leftPointer++;
           }
           writeSorter--;
        }

        for(int a: squareSortedArray){
            System.out.print(a+" | ");
        }

    }

    static void swap(int leftIndex, int rightIndex,int leftSquareValue, int rightSquareValue,int[] arr){
       arr[leftIndex] = rightSquareValue;
       arr[rightIndex] = leftSquareValue;
    }

    //Descending order sorting. 24-06-26
    static void sortArrayViaStreamDescending(int ...sorted){
        for(int i = 0;i<(sorted.length)/2;i++){
            int temp = sorted[i];
            /*Why -i, is used, because with each iteration, the last index will
            keep reducing with the continuous increment of the starting index.
            In conclusion its working like mirror index.
                i | last index
                0 | 10
                1 | 9
                2 | 8
                3 | 7
                4 | 6
                5 | 5
                its also very useful in star making pattern.
             */
            sorted[i] = sorted[sorted.length-1-i];
            sorted[sorted.length-1-i] = temp;
        }
        for(int a: sorted){
            System.out.print(a+" | ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        //removeDuplicates(arr);
        int[] arrWithZero = {0,1,0,3,12,3,4,0,0,1,1,1,1,0};
        //moveZeroesToEnd(arrWithZero);
        int[] arrSqr = {6,4,4,1,-2,-8,-12,};
        squareOfSortedArray(arrSqr);

        int[] practicingSorting = {9,2,-1,11,0,12,43,-12,0,0,1};
        //int[] sorted = Arrays.stream(practicingSorting).sorted().toArray();
        //can we customize it.
        int[] sorted = Arrays.stream(practicingSorting).sorted().toArray();
        //Let's have this sorted in descending order.
        //sortArrayViaStreamDescending(sorted);

    }
}
