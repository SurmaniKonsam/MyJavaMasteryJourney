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
            System.out.println("_________________________________________");
            System.out.println("Low : "+low+" | high : "+high);
            int mid = low + (high - low) / 2; //->This needs to be remembered or memorized. Rest is easy template
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

    //#2 -> Exercise 2: 26-06-26
    //Given a sorted array of integers in ascending order, return the index of the target element.
    public static int binarySearchExTwo(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                high = mid-1;
            }else if(target>arr[mid]){
                low = mid+1;
            }
        }
        return -1;
        //minor changes
    }

    //#3 -> Exercise 3: 26-06-26
    //Given a sorted array that may contain duplicates, return the first occurrence of the target.

    /**
     * Few questions to be asked?
     * What changes if I already found the target?
     * "I found one occurrence... but is it the first one?"
     * So, how to find the answer to this?
     * Suppose:
     * 2 4 4 4 6 8
     *     ^
     *    mid
     * You found 4.
     * Can you return?
     * No.
     * Because another 4 might exist on the left.
     * So what should you do?
     * 
     * Ans:
     * In First Occurrence: Objective = Find the "earliest occurrence",
        * with the term "the earliest occurrence " itself it is implied that we are looking in for the earliest occurrence up
        * in the sorted ascending order.
        * it means the goal is to check not to if mid-index value is found,
        * rather the goal is to search for if there are any target value on the left of the occurrence,
        * and if there is reducing the high,
        * if not, then return the answer since that is our first occurrence.
     *
     */
    public static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            //answer is modified only when the target value gets equal to the arr[mid] value.
            //and since it's sorted in ascending order, therefore we are making the high reduced.
            if (arr[mid] == target) {
                answer = mid;      // Store current answer
                high = mid - 1;    // Search LEFT for an earlier occurrence
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        //System.out.println(targetElementIndex(4,arr));
        //System.out.println(binarySearch(arr,14));
        //System.out.println(1/5);
        int[] bnrSearch = {3, 7, 11, 18, 25, 31, 42};
        //System.out.println(binarySearchExTwo(25123,bnrSearch));
        int[] trgtElements = {2, 2, 4, 4, 4, 6, 8, 8, 8, 8, 18, 102};
        System.out.println(firstOccurrence(trgtElements,4));
    }
}
