package org.example.dailyDSAExercise.dsa.binarySearch.easy;

public class BinarySearchExercise {
    /*
    Question 1 — Classic Binary Search
    Given a sorted array, return the index of the target.

    Return -1 if the target does not exist.

    Index : 0 1 2 3 4 5 6 7
    Value : 2 5 8 12 16 23 38 56

    Target: 23

    Expected Output: 5
     */
    public static int returnTargetIndex(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    //Question ->2
    /*
    Index : 0 1 2 3 4 5 6 7 8
    Value : 3 7 11 18 24 31 42 57 68
     */
    public static int returnIndex(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        //for classic binary search, low<=high, because if not last index is missed.
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                /*
                The invariant.
                "Since the array is sorted and arr[mid] < target, every element from low to mid is less than the target.
                Therefore, none of them can be the answer."
                i.e -> low = mid+1;
                 */
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }


    public static int returnIndexTwo(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                /*
                    invariant -> If arr[mid] < target, then every element in [low...mid] is
                    smaller than the target because the array is sorted.
                    Therefore, the target cannot be in that range.
                    Move right, i.e -> low = mid+1;
                 */
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static int returnTargetIndexThree(int target, int ...arr){
        //int[] arr = {5, 8, 12, 17, 21, 29, 36, 44, 58, 73};
        int low = 0;
        int high = arr.length-1;

        //After coding, tell me what happens in the very first iteration.
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
        /**
         * Explanation:
         * First,
         * We are having our first iteration until low becomes <=high. The equals to will make sure that the, the last
         * index is also validated.
         * Second,
         * So, here comes our iteration, we are first validating if the arr[mid]==target or not, if it is good, we wil
         * directly return the index of the target.
         * Else if,
         * it will then validate if the arr[mid]>target, or not. Because the array is sorted, the elements are sorted
         * in ascending order. Hence, if arr[mid]>target, it means the element from the mid till low, must have value,
         * where it is equal to the target.
         * The pros, the other element from the "mid to high", or to the right ward of the mid-element is never evaluated.
         * Thus, our invariant  will keep evaluating to the left side of the mid-element, and then when finally
         * our arr[mid] is reduced to zero, it will have its value equal to the target, and then we will have our index
         * returned.
         */
    }

    //practice until the pattern gets imprint in your subconscious.
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        System.out.println(returnTargetIndex(263,arr));
        int[] arr1 = {3, 7, 11, 18, 24, 31, 42, 57, 68};
        System.out.println(returnIndex(18,arr1));
        int[] arr2 = {4, 9, 13, 18, 25, 31, 40, 52, 67, 81};
        System.out.println(returnIndexTwo(67,arr2));
        int[] arr3 = {5, 8, 12, 17, 21, 29, 36, 44, 58, 73};
        System.out.println(returnTargetIndexThree(5,arr3));


    }
}
