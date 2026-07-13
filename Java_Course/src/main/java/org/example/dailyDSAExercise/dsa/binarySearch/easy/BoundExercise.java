package org.example.dailyDSAExercise.dsa.binarySearch.easy;

import com.sun.security.jgss.GSSUtil;

public class BoundExercise {
    /*
        Given a sorted array, return the index of the first element that is greater than or equal to the target.

        If no such element exists, return arr.length.

        Index : 0 1 2 3  4  5  6  7
        Value : 2 5 8 12 17 21 29 35

        Target: 13

        Expected Output: 4
     */
    public static int lowerBoundIndex(int target, int ...arr) {
        int low = 0;
        int high = arr.length - 1;
        int lowerBoundIndex = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lowerBoundIndex = mid;
                high = mid - 1;
            }else {
                System.out.println("here first");
                low = mid + 1;
            }
        }
        return lowerBoundIndex;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 17, 21, 29, 35};
        System.out.println(lowerBoundIndex(17,arr));
    }
}
