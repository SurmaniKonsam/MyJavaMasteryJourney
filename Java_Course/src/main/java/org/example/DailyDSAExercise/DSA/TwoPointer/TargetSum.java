package org.example.DailyDSAExercise.DSA.TwoPointer;

public class TargetSum {

    /**
     *
     * @param target -> Target sum
     * @param arr -> array as input.
     */
    static void targetSum(int target,int ...arr){
        int leftPointer = 0;
        int siblingPointer = 0;
        int rightPointer = arr.length-1;
        int elderPointer = 0;
        /**
         * if arr[rightPointer] > target, start from '0' index, means start from arr[leftPointer]
         */
        while(leftPointer<rightPointer){
            if(target%2==0){
                if(arr[leftPointer]%2==0){
                    elderPointer = leftPointer;
                    siblingPointer = elderPointer+1;
                    while(siblingPointer<rightPointer){
                        if(arr[siblingPointer]%2!=0){
                            siblingPointer++;
                        }else{
                            if(arr[leftPointer]+arr[siblingPointer]==target){
                                System.out.println("index : "+leftPointer+" | "+siblingPointer+" : "+target);
                                break;
                            }
                            siblingPointer++;
                        }
                    }
                }
            }else{
                //target is odd.
                if(arr[leftPointer]%2!=0){
                    elderPointer = leftPointer;
                    siblingPointer = elderPointer+1;
                    while(siblingPointer<rightPointer){
                        if(arr[siblingPointer]%2==0){
                            siblingPointer++;
                        }else{
                            if(arr[leftPointer]+arr[siblingPointer]==target){
                                System.out.println("index : "+leftPointer+" + index : "+siblingPointer+" value = "+target);
                                break;
                            }
                            siblingPointer++;
                        }
                    }
                } else{
                    //arr[leftPointer] is even
                    elderPointer = leftPointer;
                    siblingPointer = elderPointer+1;
                    while(siblingPointer<rightPointer){
                        if(arr[siblingPointer]%2==0){
                            siblingPointer++;
                        }else{
                            if(arr[leftPointer]+arr[siblingPointer]==target){
                                System.out.println("index : "+leftPointer+" + index : "+siblingPointer+" value = "+target);
                                break;
                            }
                            siblingPointer++;
                        }
                    }
                }
            }
            leftPointer++;
        }
    }

    /**
     * Jarvis method
     * Sum of arr[left] + arr[arr.length-1] if less than target, start from left,
     * else, right.
     * if equal no need to traverse.
     */
    static void targetSumTwoPointer(int target,int ...arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Index: " + (left) + " , " + (right));
                return;
            } else if (sum < target) {
                left++;   // need bigger sum, value increases when added from left.
            } else {
                right--;  // need smaller sum
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 8, 11, 15};
        targetSum(17,numbers);
        targetSumTwoPointer(17,numbers);
    }
}
