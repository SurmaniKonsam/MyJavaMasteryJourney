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

    /**
     * First occurrence -> 27-06-26 -> #1
     * Brainstormed
     * 1. Last occurrence, means keep pushing right, extreme right of any duplicate elements.
     * 2. high -> must be changed to low = mid+1; if found keep search right.
     * 3. Also last occurrence of number means, if found get the index, also if duplicate exist, keep pushing right,
     * pushing right means -> low = mid+1; check if
     */
    public static int lastOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            //answer is modified only when the target value gets equal to the arr[mid] value.
            //and since it's sorted in ascending order, therefore we are making the high reduced.
            if (arr[mid] == target) {
                answer = mid;      // Store current answer
                low = mid + 1;    // Search right for last occurrence
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return answer;
    }

    /**
     * LowerBound -> 27-06-26 -> #2
     * UpperBound -> Is not clear.
     */

    /**
     * Search Insert Position -> 27-06-26 #3
     * Given a sorted array of distinct integers and a target, return:
         * the index if the target exists.
         * otherwise, return the index where it should be inserted to maintain sorted order.
         * The insertion must always happen before the arr[mid], index, means it must always
         * search the left end of the array from the arr[mid] as high point.
     * This needs to be studied rather more deep.
     */
    public static int getInsertionIndex(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        int answer = -1;
        while(low<=high){
           int mid = low + (high-low)/2;
           if(target<=arr[mid]){
               answer = mid;
               high = mid-1;
           }else{
               low = mid+1;
           }
        }
        return answer;
    }

    /**
     * An Anomaly.
     * Search in Rotated Sorted Array -> 27-06-26 -> #4
         * Problem
         * A sorted array has been rotated at an unknown pivot.
         * Find the index of the target.
         * If it doesn't exist,
             * return -1.
         * 30 '40' 50 5 10 20
         * 4 5 6 7 8 9 10 0 1 2 3
     */
    public static int returnRotatedIndex(int target, int ...arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            //System.out.println("mid : "+mid);
            if(target == arr[mid]){
                return mid;
            }else if((arr[low]<=arr[mid]) && (target>arr[mid])){
                //left array is sorted
                if(target<arr[mid]){
                    high = mid-1;
                }else if(target>arr[mid]){
                    low = mid+1;
                }
            }else {
                System.out.println("Search right");
                //search right
                if(arr[mid]==target){
                    return mid;
                }
            }
        }
        return -1;
    }

    //jarvis way -> 27-06-26 -> #4
    public static int jarvisSearchRotatedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // Left half is sorted -> he hadn't used else here, means this will get run
            // as first if block, if the block above doesn't get work out.
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1; //here we are pushing right.
                }
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target < arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }

    //binary search -> #5 -> trying to deduce my own algorithm.
    public static int returnIndexTargetRotatedArray(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            //System.out.println("mid : " +mid);
            if(target==arr[mid]){
                return mid;
            }
            /*
            If, target belongs to the sorted half, check in this block.
             */
            if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<arr[mid]){
                    high = mid-1;
                }else{
                    //Means target is out of the left sorted array.
                    System.out.println("arr["+mid+"] : "+arr[mid]+" | target : "+target);
                    low = mid+1;
                }
            }else{
                if(target>arr[mid] && target<arr[high]) {
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }

        }
        return -1;
    }

    //rotated array -> 28-06-26.
    /*
    Find the index of the target. Return -1 if not found.
    Index : 0  1  2  3  4  5  6
    Value : 15 18 2 3 6 12 14
    Target
        6
    Expected Output:
        4
     */
    public static int findRotateArrayIndex(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            //it will get inside this if block no matter what, if the first mid-index value is not found.
            if(arr[mid]<=arr[high]){
                //sorted right side
                if(target>arr[mid] && target<=arr[high]){
                    //Inclusive of the boundary.
                    low = mid+1;
                }else{
                    //push off to left side.
                    high = mid-1;
                }
            }else{
                //Move to the left.
                if(target<arr[mid] && target>=arr[low]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    /*
        Date -> 28-06-26
        Find Minimum in Rotated Sorted Array -
        Problem

        Find the minimum element.

        Index : 0 1 2 3 4 5 6
        Value : 4 5 6 7 0 1 2
     */
    public static int minIndexRotatedArray(int ...arr){
        //for sorted array its easy.
        int low = 0;
        int high = arr.length-1;
        int minimumElement = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]<minimumElement){
                minimumElement = Math.min(arr[mid],minimumElement);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return minimumElement;
    }

    /*
        Date -> 28-06-26
        Find maximum element in a sorted array.
     */
    public static int maxIndexRotatedArray(int ...arr){
        //for sorted array its easy.
        int low = 0;
        int high = arr.length-1;
        int maxElement = Integer.MIN_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            //sorted, max element will be found in extreme end.
            if(arr[mid]>=maxElement){
                maxElement = Math.max(arr[mid],maxElement);
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return maxElement;
    }


    public static int returnPeakValue(int a, int b, int c){
        return b;
    }

    /*
        Peak Value.
        What does peak value mean?
        ->   Peak -> check right and left value.
        If peak is greater than both right and left, then its peak value.
        Else,
        For boundary elements, we only compare with the existing neighbor
            That is Either
                Right side only if extreme left.
                Left side only if extreme right.
        One understanding -> mid is always the deciding index.
     */
    public static int peakValue(int ...arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int prev = mid - 1;
            int nxt = mid + 1;
            if(arr[mid]>arr[prev]){
                low = mid+1;
            }else if(arr[mid]<arr[prev]){
                high = mid-1;
            }
            else if(arr[mid]>arr[prev] && arr[mid]>arr[nxt]){
                return arr[mid];
            }
        }
        return -1;
    }

    //lower bound -> greater than or equal, nearest neighbour, if sorted usually proceed to move to right.
    public static int lowerBoundIndex(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        int answer = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                answer = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return answer;
    }

    public static int upperBound(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        int answer = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target){
                answer = mid;
                high = mid-1;
            }else{
                low = mid+1;
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
        int[] trgtElements = {2, 2, 4, 4, 4, 6, 8, 8, 8, 8, 8, 8, 8, 18, 102};
        //System.out.println(firstOccurrence(trgtElements,44124123));
        //System.out.println(lastOccurrence(trgtElements,8)); //expected answer -> 4
        int[] arrLB = {1, 3, 5, 6, 7, 7, 10, 11, 11, 16};
        //System.out.println(returnLowerBoundIndex(8,arrLB));
        int[] arrUB = {1,3,5,7,9};
        //System.out.println(returnUpperBoundIndex(123,arrUB));
        //System.out.println(getInsertionIndex(2,arrUB));
        //30 40 50 5 10 20
        int[] rotatedArr = {30, 40, 50, 55, 60, 70, 80, 90, 5, 10, 20};
        //[30, 40, 50, 55, 60, 70|mid]; let's solve this.
        //System.out.println(returnRotatedIndex(5,rotatedArr));
        //System.out.println(jarvisSearchRotatedArray(rotatedArr,10));
        //System.out.println(returnIndexTargetRotatedArray(10,rotatedArr));
        int[] arrRt = {15, 18, 2, 3, 6, 12, 14};
        //System.out.println(findRotateArrayIndex(15,arrRt));
        int[] arrMin = {-1, 3, 7, 11, 15, 19, 24, 28, 32, 37, 41};
        //System.out.println(minIndexRotatedArray(arrMin));
        //System.out.println(maxIndexRotatedArray(arrMin));
        int[] peaks =  {1, 2, 1, 3, 3, 7};
        /**
         * what should be the flow?
         * -> get mid
         * -> check if it's greater than the neighbouring element ->
             * If it is return it;
         * -> else check if prev index is negative -> if it is then compare the mid-value with the next value only.
             * If, mid-value is greater than the next, then return it, else -> low = mid+1;
         * -> else check if next index is out of bound -> if it is then compare the mid-value with the prev only.
             * If, mid-value is greater than the prev, then return it, else -> high = mid-1;
         *
         */
        //System.out.println(peakValue(peaks));

        int[] lb = {2, 4, 6, 8, 8, 10, 12, 14, 16};
        //System.out.println(lowerBoundIndex(13,lb));
        //System.out.println(upperBound(17,lb));
        int[] lstOcr = {1, 2, 2, 2, 5};
        System.out.println(lastOccurrence(lstOcr,2));
    }
}
