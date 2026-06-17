package DailyDSAExercise.DSA.TwoPointer;

public class SlidingWindow {

    //get minimum length of the sub-array, whose sum is equal to the target.
    //dynamic window
    //Smallest Subarray with Sum ≥ Target
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
                //it keeps reducing the sum,until sum<target,
                //when it does it will get out of the loop for next iteration.
                left++;
            }
        }
        return minLength;
    }

    //longest sub-string my custom understanding

    /**
     * Whenever the window becomes valid (sum == target),
     * evaluate whether this is the longest valid subarray seen so far.
     */
    static int returnLongestSubstring(int target, int ...arr){
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;
        while(right<arr.length){
            sum += arr[right];
            while(sum>target){
                sum -= arr[left];
                left++;
            }if(sum == target){
                int currentLength = (right-left)+1;
                maxLength = Math.max(maxLength,currentLength);
            }
            right++;
        }
        return maxLength;
    }

    //fixed window




    public static void main(String[] args) {
        //System.out.println(Integer.MIN_VALUE);
        //int[] arr = {0,1,2,6,0,2,0,0,1,8};
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
        //System.out.println(returnLongestSubstring(10,arr2));
        System.out.println(returnTheShortestLength(7,arr2));
    }
}
