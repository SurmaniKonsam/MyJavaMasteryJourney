package org.example.DailyDSAExercise.DSA.TwoPointer;

/**
 * Trapped water algorithm learnt.
 */
public class TrappedWaterAlgorithm {
    static void printMaxTrappedWater(int ...arr){
        int left = 0;
        int right = arr.length-1;
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

    //again tapped water question
    static void getMaxTappedWater(int ...arr){
        int left = 0;
        int right = arr.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;
        while(left<right){
            if(arr[left]<arr[right]){
                if(arr[left]>leftMax){
                    /*current highest ceiling, water will spill.
                    Also be mindful, the height of the ceiling must be computer from the first index
                    itself.
                    */
                    leftMax = arr[left];
                }else{
                    trappedWater = trappedWater+leftMax-arr[left];
                    left++;
                }
            }
            else{
                if(arr[right]>rightMax){
                    rightMax = arr[right];
                }else{
                    trappedWater = trappedWater + rightMax-arr[right];
                    right--;
                }
            }
        }

        System.out.println("Max trapped water : "+trappedWater);
    }

    //container with most water
    static int maxWater(int ...arr){
        int left = 0;
        int right = arr.length - 1;

        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);

            int area = width * height;
            maxArea = Math.max(maxArea, area);

            // move smaller side
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    //calculate max water holding in an elevation.
    static int maxWaterContainer(int ...arr){
        int left = 0;
        int right = arr.length-1;
        int maxWater = 0;
        /**
         * The logic here, is not about what is the unit of the water
         * an elevation can hold like in the trapped water concept.
         * In maxWaterHolding capacity, we are actively looking across
         * the elevations, whether from the starting elevation till
         * the end elevation what is the maximum water that the
         * elevations can hold. It is done so via using the
         * area formula for a rectangle.
         * The concept hides itself with rectangle, because the water
         * spills from the smaller wall, the smaller wall until the
         * point touched to the outer wall will get you a straight
         * line or width determined via x-y axis.
         * i.e, int width = right-left;
         * And min height between the two elevation will get you
         * the max water content hold, determined by the min height
         * boundary.
         * Hence, the area will get you the maximum water that a two
         * elevation can hold.
         * int area = Math.min(arr[left],arr[right])*width;
         * The pointers -> left and right, will keep moving until
         * met, and with each iteration they will get you the maxWater
         * content, out of all the iteration, if inside math function,
         * Math.max(max,calculatedWater); none is greater than the
         * max content, then it will return you the max water hold
         * between two elevations or two indices.
         */
        while(left<right){
            int width = right - left;
            int height = Math.min(arr[left],arr[right]);
            int area = width * height;
            maxWater = Math.max(maxWater,area);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxWater;
    }

    /**
     * Practice time 2:12 PM
     * 23-06-26
     */
    public void practiceTrappedWaterContainer(int ...arr){
        int leftIndex = 0;
        int rightIndex = arr.length-1;
        int trappedWaterContainer = 0;
        int leftWall = 0;
        int rightWall = 0;
        while(leftIndex<rightIndex){
            if(arr[leftIndex]<arr[rightIndex]){
                if(arr[leftIndex]>leftWall){
                    leftWall = arr[leftIndex];
                }else{
                    trappedWaterContainer += (leftWall-arr[leftIndex]);
                    System.out.println("trapped water value : "+trappedWaterContainer);
                    leftIndex++;
                }
            }else{
                if(arr[rightIndex]>rightWall){
                    rightWall = arr[rightIndex];
                }else{
                    trappedWaterContainer += (rightWall-arr[rightIndex]);
                    rightIndex--;
                }
            }
        }
        System.out.println("Trapped water over the arrays of ceiling : "+trappedWaterContainer);
    }

    /**
     * Practice maximum water container.
     * Invariants are the condition,
     * which are if Wall, if less than the arr[leftIndex] or arr[rightIndex]
     * and leftIndex<rightIndex will always be used for closing the loop.
     */
    public void practiceMaxWaterContained(int ...arr){
        int leftIndex = 0;
        int rightIndex = arr.length-1;
        int wall;
        int maxDistanceBetweenLeftAndRightWall;
        int maximumWaterContained = 0;
        while(leftIndex<rightIndex){
            wall = Math.min(arr[leftIndex],arr[rightIndex]);
            if(arr[leftIndex]<arr[rightIndex]){
                //compute first -> then reduce
                    maxDistanceBetweenLeftAndRightWall = (rightIndex-leftIndex);
                    maximumWaterContained = maximumWaterContained+(wall*maxDistanceBetweenLeftAndRightWall);
                    leftIndex++;
            }else{
                maxDistanceBetweenLeftAndRightWall = (rightIndex-leftIndex);
                maximumWaterContained += (wall*maxDistanceBetweenLeftAndRightWall);
                rightIndex--;
            }
        }

        System.out.println("Maximum water contained : "+maximumWaterContained);
    }

    public static void main(String[] args) {
        int[] elevations = {1,8,6,2,5,4,8,3,7};
        //printMaxTrappedWater(elevations);
        int[] waterElevation = {1,8,6,2,5,4,8,3,7};
        //getMaxTappedWater(waterElevation);
        //System.out.println(maxWater(waterElevation));

        //System.out.println(Math.max(9,1232));
        //System.out.println("max water hold : "+maxWaterContainer(waterElevation));
        //System.out.println(0>0);
        int[] arr = {3,2,2,4};
        TrappedWaterAlgorithm trappedWaterAlgorithm = new TrappedWaterAlgorithm();
        //trappedWaterAlgorithm.practiceTrappedWaterContainer(arr);
        trappedWaterAlgorithm.practiceMaxWaterContained(arr);

    }
}
