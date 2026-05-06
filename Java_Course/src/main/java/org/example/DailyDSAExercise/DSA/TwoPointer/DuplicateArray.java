package org.example.DailyDSAExercise.DSA.TwoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateArray {


    //re-writing the array with unique elements.
    static void generateUniqueElementsArrayUnsorted(int ...arr){
        int uniqueElementsWidth = 0;
        for(int i = 0;i<arr.length;i++){
            //int[] arr = {1, 1, 2, 2, 3,4,5,6,7,7,7};
            boolean uniqueElements = true;
            /**
             * Initialization (runs once)
             * j = 0
             * 2. Condition check
             * j < uniqueElementsWidth ?
             * If true → go inside loop
             * If false → loop stops
             * Means, for the first iteration it will write our unique array, because boolean uniqueElements = true;
             * Remains true.
             */
            for(int j = 0;j<uniqueElementsWidth;j++){
                /**
                 *  j = 0, it will always compare from the first index, if will reading from the first index,
                 *  there is any element which is found duplicate or same, it will put uniqueElement = false,
                 *  and will not write it with new value.
                 *  Eg:
                 *  when int[] arr = {1, 1, 2, 2, 3,4,5,6,7,7,7};
                 *  when 'i' will be 1, value will be -> 1
                 *  'j' will always traverse from '0', therefor for the first index, uniqueElement is true because
                 *  it never went inside the loop as i = 0; j = 0, j<uniqueElement was false,
                 *  But, since uniqueElementsWidth was already incremented, for the second iteration the j will run
                 *  from j = 0; till j = 1.
                 *  at the first index j = 0; it will compare with i = 1; value.
                 *  And since it's true, it will write uniqueElements = false, and will not write uniqueArray elements.
                 *
                 *
                 */

                if(arr[i]==arr[j]){
                    uniqueElements = false;
                    break;
                }
            }
            if(uniqueElements){
                arr[uniqueElementsWidth] = arr[i];
                uniqueElementsWidth++;
            }
        }

        for(int i = 0;i<uniqueElementsWidth;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //write unique element using two pointer theory
    static void writeUniqueElement(int ...arr){
        int write = 1; //because the comparison shall be done from the second index.

        for(int read = 1;read<arr.length;read++){
            if(arr[read]!=arr[read-1]){
                arr[write] = arr[read];
                write++;
            }
        }

        for(int rd : arr){
            System.out.print(rd+" ");
        }
    }

    /*
    Fast-slow, read-write. A form of sliding window.
    One moves through entire array normally.
    Other moves to write, only if fulfilled condition.
     */
    static void readWriteUniqueArray(int ...arr){
        int write = 1;
        int read = 1;
        while(read<arr.length){
            if(arr[read]!=arr[read-1]){
                arr[write] = arr[read];
                write++;
            }
            System.out.println("read : "+read);
            read++;
        }

        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
    }


    //can't I design my own using two pointer only.
    //Since its sorted, either way its going from the left side only.


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
        int[] arr = {1,1,2,2,3,4};
        //System.out.println(returnUniqueElements(arr));
        //generateUniqueElementsArrayUnsorted(arr);
        //generateUniqueElementsArrayUnsorted(arr);
        //writeUniqueElement(arr);
        int[] rdWrite = {1,1,1,2,2,3,3,4};
        readWriteUniqueArray(rdWrite);
    }
}
