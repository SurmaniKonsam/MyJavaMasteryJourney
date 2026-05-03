package org.example.DailyDSAExercise.DSA;

/**
 * Trapped water algorithm learnt.
 */
public class TrappedWaterAlgorithm {
    static void printMaxTrappedWater(int ...arr){
        int left = 0; int right = arr.length-1; 
        System.out.println("right : "+right);
        /**
         * Initially leftMaxWall, and rightMaxWall are put zero, as a starting point
         */
        int leftMaxWall = 0, rightMaxWall = 0, waterTrapped = 0;

        //monotonic movement.
        /**
         * Means it will move forward, it will never move backward, part of being the
         * reason why we are putting it inside the while loop.
         */
        while(left<right)
        { 
            if(arr[left]<arr[right])
            {
                /**
                 * Initially, for if the starting index value, starting from left index
                 * is equal to leftMaxWall, then it will keep incrementing unless the
                 * starting ceiling has been found.
                 */
                if(arr[left]>leftMaxWall)
                {
                    /**
                     * Once, the starting ceiling has been found starting from the
                     * left index, that is the leftMaxWall has been found. The leftMaxWall
                     * will act as the water ceiling, because at that instance until traversed
                     * there are no index which has height or value greater than the
                     * currentIndex height.
                     * And also, since leftMaxWall is made to be calculated inside the
                     * arr[left]<arr[right]; the leftMaxWall will act as water ceiling.
                     * Means every index value, until its value greater than leftMax wall,
                     * will hold a unit of water.
                     * Which is:
                     * waterTrapped = waterTrapped + leftMaxWall - arr[left]{i,e the current
                     * index value};
                     *
                     */
                    leftMaxWall = arr[left]; 
                } else{
                    waterTrapped = waterTrapped + leftMaxWall - arr[left];
                }
                System.out.println("Water trapped left : "+waterTrapped);
                left++; 
            }else {
                /**
                 * If arr[left] is greater than arr[right]; traversed from right.
                 * right--; baby.
                 */
                if(arr[right]>rightMaxWall){
                    rightMaxWall = arr[right]; 
                } else{
                    /**
                     * Use of else, means if rightMaxWall is greater than arr[right];
                     * then have the water updated.
                     * Because, we have our water ceiling, defined by rightMaxWall, and
                     * any wall below have water trapped above them.
                     */
                    waterTrapped = waterTrapped + rightMaxWall - arr[right];
                }
                System.out.println("Water trapped right : "+waterTrapped); 
                right--; 
            } 
        }
        System.out.println("maximum water trapped : "+waterTrapped);
    }

    public static void main(String[] args) {
        int[] elevations = {0,0,1,2,3,6,9,0,1,5};
        printMaxTrappedWater(elevations);

    }
}
