package org.example.DailyDSAExercise.DSA.TwoPointer;

public class MaximumSubArraySize {
    //if size is fixed, definitely it must move from the 0th index.
    static int returnMaxSumSize(int size,int ...arr){
        int max = Integer.MIN_VALUE;
        int left = 0;
        int sum = 0;
        int right = 0;
        int currentLength = 0;

        while(left<arr.length){
            sum += arr[left];
            currentLength = left-right+1;
            if(currentLength==size){
                //System.out.println("current length : "+currentLength);
                max = Math.max(max,sum);
                System.out.println("Max : "+max);
                sum -= arr[right];
                right++;
                /*that's the goal -> you are moving both.
                The window is gliding forward, hence in that current time, the sum shall differ from if moved forward
                that's why we are subtracting the right index value from the sum.
                 */
            }
            left++; //movement is always monotonic.
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int size = 3;
        System.out.println(returnMaxSumSize(size,arr));
    }

}
