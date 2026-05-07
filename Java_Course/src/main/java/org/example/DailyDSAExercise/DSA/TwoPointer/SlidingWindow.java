package org.example.DailyDSAExercise.DSA.TwoPointer;

public class SlidingWindow {

    //get minimum length of the sub-array, whose sum is equal to the target.
    static int returnTheShortestLength(int target,int ...arr){
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                int currentLength = right - left + 1;
                minLength = Math.min(minLength, currentLength);
                sum -= arr[left];
                left++;
            }
        }
        return minLength;
    }

    //return the maximum length
    static int returnTheLargestLength(int target,int ...arr){
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int currentLength;
        //{2,1,5,2,3,2};
        while(right<arr.length){
            sum +=arr[right];
            //System.out.println("sum = "+sum);
            if(sum>target){
                //we need to remove element
                //System.out.println("left value : "+arr[left]+" | right value : "+arr[right]);
                sum -=arr[left];
                left++;
                currentLength = (right-left)+1;
                max = Math.max(max,currentLength);
            }else if(sum==target){
                currentLength = (right-left)+1;
                max = Math.max(max,currentLength);
            }
            right++;
        }
        return max;
    }

    //longest sub-string my custom understanding
    static int returnLongestSubstring(int target, int ...arr){
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = Integer.MIN_VALUE;
        while(left<arr.length) {
            sum += arr[left];
            while (sum <= target) {
                /*it will keep expanding, unless its sum or the element inside the contiguous domain expands enough
                to have sum>target.
                */
                sum += arr[right];
                //after adding the next element, check the length
                int currentLength = (right - left) + 1;
                maxLength = Math.max(maxLength, currentLength);
                right++;
            }
            left++;
        }
        return maxLength;
    }



    public static void main(String[] args) {
        //System.out.println(Integer.MIN_VALUE);
        int[] arr = {0,1,2,6,0,2,0,0,1,8};
        /**
         * target = 3 | 2,0,0,0,1 -> length = 4+1  = 5 ->'5' is min length now, sum = 3.
         * right++; 5, 3+5 = 8, get inside the if condition, remove arr[left] = 2, 8-2 = 6; length = 6; Math.min()
         *  keeps the value to 3.
         * left++, left = 1; value = 0; sum = sum+arr[right]; sum = 6+2 = 8; 8>3; reduce left, left now is 1; value = 0;
         * length = 7; Math.min() keeps the value to 3.
         * left has moved, get the shortest length, index is 1 now, length is 6 now.
         * right index 6,value = 2, sum is 6; 6-0 = 6, is still six, since 6>3,left = 2;value = 0
         * right index 7,value = 3, 6-0, left = 3;value = 0,
         * right index = 8; value = 2;
         *
         */
        //System.out.println(returnTheShortestLength(3,arr));
        int[] arr2 = {1,1,0,0,0,0,0,1,5,2,3,2,1};
        //System.out.println(returnTheLargestLength(3,arr2));
        System.out.println(returnLongestSubstring(10,arr2));
    }
}
