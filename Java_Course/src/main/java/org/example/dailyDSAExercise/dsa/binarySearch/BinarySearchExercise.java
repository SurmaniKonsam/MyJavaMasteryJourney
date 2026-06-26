package org.example.dailyDSAExercise.dsa.binarySearch;

public class BinarySearchExercise {
    /**
     * Given a sorted integer array in ascending order, return the index of the target.
     */
    public static int targetElementIndex(int target,int ...arr){
        int middleIndex = arr.length/2;
        //since its sorted.
        int iterativeIndex = 0;
        if(target>=arr[middleIndex]){
            iterativeIndex = middleIndex;
        }
        while(iterativeIndex<arr.length){
            if(arr[iterativeIndex]==target){
                return iterativeIndex;
            }
            iterativeIndex++;
        }
        return arr[middleIndex];
    }

    //jarvis method -> binary search : 26-06-26
    public static int binarySearch(int[] arr, int target) {
        /**
         * But i am not seeing any iteration, the iteration or pointer.
         * The index is rather returned when the middle index is exactly equal to the target.
         */
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("mid : "+mid);
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
                System.out.println("high : "+high);
            } else {
                low = mid + 1;
                System.out.println("low : "+low);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        //System.out.println(targetElementIndex(4,arr));
        System.out.println(binarySearch(arr,4));
    }
}
