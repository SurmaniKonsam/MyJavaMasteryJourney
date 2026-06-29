package org.example.dailyDSAExercise.dsa.slidingWindow;

public class ContiguousArrayExercises {

    //finding max element out of sub-array of size k.
    public static void maxElement(int ...arr){
        int right = 0;
        int left = 0;
        //The goal is to find the max element within the current array box.
        while(right<arr.length){
            int length = (right-left)+1;
            if(length<3){
                right++;
            }else if(length==3){
                int maxElement = Integer.MIN_VALUE;
                for(int i = left;i<=right;i++){
                    maxElement = Math.max(maxElement,arr[i]);
                }
                System.out.println("Max element : "+maxElement);
                left++;
                right++;
            }
        }

        //System.out.println("Max element : "+maxElement);
    }

    public static void main(String[] args) {
        int[] mxEl = {1, 3, -1, -3, 5, 3, 6, 7};
        maxElement(mxEl);
    }
}
