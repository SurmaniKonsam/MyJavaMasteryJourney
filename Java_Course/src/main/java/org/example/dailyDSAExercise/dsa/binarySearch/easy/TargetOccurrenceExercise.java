package org.example.dailyDSAExercise.dsa.binarySearch.easy;

public class TargetOccurrenceExercise {
    /*
    Problem statement:
        Given a sorted array with duplicates, return the index of the "first occurrence" of the target.
        Return -1 if the target does not exist.

        mid = low + (high-low)/2;

        Index : 0 1 2 3 4 5 6 7 8 9
        Value : 2 4 4 4 7 9 9 12 15 18
     */
    public static int returnFirstOccurrence(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        int firstOccurrence = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                firstOccurrence = mid;
                high = mid-1;
            }
            else if(arr[mid]>target){
                /*
                Why do we not return immediately when arr[mid] == target?
                -> Because, in a sorted and duplicate elements, we could be expecting a duplicate elements, which
                might have had its first occurrence.
                -> Our goal in the first occurrence is not to get the target element index, but to get the first element
                which has its value equal to the target element.
                What invariant changes compared to Classic Binary Search?
                -> So, here unlike our usual binary search operation, where we are searching for mid-element if equal
                to the target element, we are storing the state of the first occurrence of the mid-index element if
                equal to the target element, if we have found the mid-index, then we are search for an expected duplicate
                element, to the left side of the found mid-element.
                Conclusion, have you got the target element -> yes, okay store the index, let's search to the left of
                your side, if we can find another one, because its sorted and there could be similar dup element to
                have occurred therefore search for the left side of the target occurrence.
                Why is high = mid - 1 still safe after finding the target?
                 */
                high = mid-1;
            }else if(arr[mid]<target){
                /*
                Else, target element is greater than the mid-index found, hence go for the right.
                 */
                low = mid+1;
            }
        }
        return firstOccurrence;
    }

    /*
    Last occurrence.
    Given a sorted array with duplicates, return the index of the last occurrence of the target.

    Return -1 if the target does not exist.

    Index : 0 1 2 3 4 5 6 7 8 9
    Value : 3 5 5 5 8 10 10 14 18 20

    Target: 10

    Expected Output: 6
     */
    public static int lastOccurrence(int target, int ...arr){
        int low = 0;
        int high = arr.length-1;
        int lastOccurrence = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                /*
                What is the only invariant that changes compared to First Occurrence?
                -> The only invariant which changes is, if the target is found, keep moving right.
                because a similar element could be expected to the right side of the target element, considering our
                element is sorted. Therefore, our invariant have changed to low = mid+1;
                Why is low = mid + 1 safe after finding the target?
                -> because, elements are sorted, and a similar element starting from the mid-index found for the target
                element could be found.
                 */
                lastOccurrence = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }else if(arr[mid]<target){
                /*
                Else, target element is greater than the mid-index found, hence go for the right.
                 */
                low = mid+1;
            }
        }
        return lastOccurrence;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 7, 9, 9, 12, 15, 18};
        //System.out.println(returnFirstOccurrence(99,arr));
        int[] arr2 = {3, 5, 5, 5, 8, 10, 10, 14, 18, 20};
        System.out.println(lastOccurrence(103,arr2));

    }
}
