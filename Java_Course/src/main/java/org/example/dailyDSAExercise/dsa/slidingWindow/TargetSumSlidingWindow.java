package org.example.dailyDSAExercise.dsa.slidingWindow;

public class TargetSumSlidingWindow {

    /**
     *
     * @param target -> Target sum
     * @param arr -> array as input.
     */
    static void targetSum(int target,int ...arr){
        int leftPointer = 0;
        int siblingPointer;
        int rightPointer = arr.length-1;
        int elderPointer;
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
     * Converging two pointer theory is used here.
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

    //documenting jarvis method
    static void targetSumGetIndex(int target,int ...arr){

        /**
         * if it does have elements inside it, then we must check for two things.
         * target, targetElement, what are we trying to find?
         * Since, its two Pointer,
         * 1. be mindful two stick to only two pointers no less, no more exactly two pointers.
         * 2. the two pointers will write, move, inward from left and right based on a conditions.
         *      The condition is:
         *          1. Sum if is less than the target, the left pointer will move towards the right pointer.
         *          So, what is our understanding here, if left is moving, then right will be at halt, if right
         *          is moving, then left will be at halt. That's the complete theory.
         *          2. So the movement of the pointer is determined by if sum is less than the target, or greater than
         *          the target.
         *          3. The sum will be put inside the while loop, because the sum will keep approach towards the goal/
         *          target, and the value of sum is determined by the index or the pointer.
         *          int sum = arr[left] + arr[right];
         *          if left is moving, and right is moving the value of sum will change, and slowly,slowly it will
         *          re-unit with the love of its life. But be mindful, our goal is to find the target index, before
         *          they meet with each other. We are savage.
         *
         * 3. When they finally meet, game over, that's why its called converging, kinda think like a pointer reunion.
         * 4.
         */

        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                //sum == target, no need to traverse.
                System.out.println("index : "+left+" | index : "+right+" value sum = "+target);
                break;
            }
        }

    }

    //Remove Duplicates from Sorted Array
    static void removedDuplicatesFromUnSortedArray(int ...arr){
        int uniqueWidth = 0;
        for(int i = 0;i<arr.length;i++){
            /**
             * Be very mindful about boolean catches my dear readers.
             * Actually what's really happening is that if you don't track the state of boolean value, often times
             * the very '!' exclamation mark you use can be confusing.
             * My goto advice is, always and always use if condition for true condition, for why will you put the
             * if block for a false statement is never comprehensive. Every access gate, every permission to resource
             * is validated and given right to only and only if your state is verified, that means everything should
             * be true.
             * Hence, confusing yourself with the state like if(!uniqueElement), is absolutely makes no sense to me.
             * I will stick with this principle unless there is some higher state of comprehension which can convince
             * me otherwise.
             * But also be mindful to name your boolean variable with meaningful name.
             * Example: I have first put my boolean variable name of uniqueElement to "caughtDuplicate". So,
             * caughtDuplicate, was first assigned to false, which it should be cus we haven't caught any. Then,
             * inside if condition, if(arr[i] == arr[j]), since we have caught it if inside if condition, i put it
             * to true.
             * so when i was to create a uniqueArray out of the existing one, since we can re-write or over-write the
             * existing array value, i have to make sure if caughtDuplicate is false, means we haven't caught any
             * and the elements are unique, when I had put the boolean variable up in the if condition, it was
             * confusing to me.
             * As if, why would a if condition even execute if the condition is false.
             * So, i changed its state to -> (!caughtDuplicate) -> which states if caughtDuplicate is false, turn it
             * to true. Means, uniqueElement state must be changed to true explicitly to true, which if we had put
             * from the very start will remain true provided it never went inside the if block.
             * It's so confusing, and also that very mark of '!' its often time to confusing to me, i don't but it is.
             * Hence, points to be considered.
             * 1. name your variable well especially for boolean case, so that if it were to change its state then
             * that name justifies it.
             * 2. Try to avoid use of '!' as much as you can.
             *
             *
             */
            boolean uniqueElement = true;
            for(int j = 0;j<uniqueWidth;j++){
                if(arr[i]==arr[j]){
                    uniqueElement = false;
                    break;
                }
            }
            if(uniqueElement){
                arr[uniqueWidth] = arr[i];
                uniqueWidth++;
            }
        }
        for(int i = 0;i<uniqueWidth;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 8, 11, 15};
        //targetSum(17,numbers);
        //targetSumTwoPointer(17,numbers);

        boolean caughtDupes = false;
        //! -> will just get you the opposite of the boolean value.
        System.out.println("bool : "+!caughtDupes);

        //remove duplicate array
        int[] dupes = {2,2,3,5,1, 1, 2, 2, 3,3,3};
        removedDuplicatesFromUnSortedArray(dupes);

        //5-5-2026
        //targetSumGetIndex(10,numbers);
    }
}
