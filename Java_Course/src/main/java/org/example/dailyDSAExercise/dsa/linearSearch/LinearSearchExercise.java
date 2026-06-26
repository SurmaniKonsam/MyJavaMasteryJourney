package org.example.dailyDSAExercise.dsa.linearSearch;


public class LinearSearchExercise {
    static void findMinimumElement(int ...arr){
        //[7, 2, 9, 1, 5]
        int minimumValue = Integer.MAX_VALUE;
        for (int j : arr) {
            minimumValue = Math.min(minimumValue, j);
        }
        System.out.println("minimum value : "+minimumValue);
    }

    //find minimum value.
    static void findMaximumValue(int ...arr){
        int maxValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            maxValue = Math.max(maxValue,arr[i]);
        }

        System.out.println("max value is : "+maxValue);
    }

    //static void find second largest element -> 25-06-26 #1
    static void findSecondLargestElement(int ...arr){
        int secondLargestElement = Integer.MIN_VALUE;
        int largestElement = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>largestElement){
                /**
                 * used to store recurring largest element if found in consecutive iterations
                 */
                secondLargestElement = largestElement;
                largestElement = num;
            }else if(num>secondLargestElement && num<largestElement){
                secondLargestElement = num;
            }
        }
        System.out.println("Second largest element : "+secondLargestElement);
    }

    //linear search : if arrays are sorted -> 25-06-26 #2
    static boolean sortedArraysAscending(int ...arr){
        //if arr[n+1] > arr[n] = return true
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }
        }
        return true;
    }

    //linear search : descending order -> 25-06-26 #3
    static boolean isSortedDescendingOrder(int ...arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                return false;
            }
        }
        return true;
    }

    //linear search : first occurrence of target -> 25-06-26 #4
    static int checkFirstOccurrence(int target,int ...arr){
        //searching linearly.
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //linear search : count frequency of target -> 25-06-26 #5
    static int countFrequencyOfTarget(int target,int ...arr){
        int countFrequency = 0;
        for (int j : arr) {
            if (j == target) {
                countFrequency++;
            }
        }
        return countFrequency;
    }

    //linear search : Best Time to Buy and Sell Stock -> 25-06-26 #6
    /**
     * Constraints:
     * You are given an array prices, where prices[i] is the stock price on the iᵗʰ day.
     *  So, ith or index is the day, and arr[ith] is the price of the stock on that day or on that index.
     *
     */
    static int buyAndSellStock(int dayOfBuying,int ...arr){
        /*
        have to calculate maximum profit.
        means difference from the day bought or the difference of the value at the index, with the greatest difference
        between the remaining elements.
        Means -> Math.max(would be found out).
        if difference returns -1 or is equal to 0, then no profit.
        */
        int stockBought = arr[dayOfBuying];
        int profitMargin;
        int getProfit = 0;
        for(int i = dayOfBuying+1;i<arr.length;i++){
            profitMargin = arr[i]-stockBought;
            if(profitMargin<0){
                continue;
            }
            if(profitMargin>0){
                getProfit = Math.max(getProfit,profitMargin);
            }
        }
        return getProfit;
    }

    //let's play with this.
    public static int whileLogic(int target,int low, int high, int ...arr){
        while(low<=high){
            if(arr[low]==target){
                return low;
            }
            low++;
        }
        return -1;
    }

    public static int checkTheTargetElement(int target,int ...arr){
        int low = 0;
        int high = arr.length-1;
        int mid = low + (high-low)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            high = mid-1;
            return whileLogic(target,low,high,arr);
        }else{
            low = mid+1;
            return whileLogic(target,low,high,arr);
        }

    }

    public static void main(String[] args) {
        int[] minimumExercise = {7, 2, 9, 1, 5};
        //findMinimumElement(minimumExercise);
        //findMaximumValue(minimumExercise);
        int[] secondLargest = {2,3,123,123,1,23,312,310};
        //findSecondLargestElement(secondLargest);
        int[] sorted = {123123123,0,1,1,1,2,3,4,4,4,12,1213};
        //System.out.println(sortedArraysAscending(sorted));
        int[] desc = {1,98, 91, 87, 82, 76, 69, 63, 58, 52, 47, 41, 35, 29, 22, 16, 9, 3};
        //System.out.println(isSortedDescendingOrder(desc));
        int[] firstOccurrence = {58, 52, 47, 41, 35, 29, 22, 16, 9, 3};
        //System.out.println(checkFirstOccurrence(421,firstOccurrence));
        int[] countFreq = {5, 2, 8, 5, 1, 2, 9, 5, 3, 8, 2, 7, 1, 5, 4};
        int[] noElements = {};
        //System.out.println(countFrequencyOfTarget(52314123,noElements));
        int[] profitMargin = {7,1,5,3,6,8};
        //System.out.println(buyAndSellStock(2,profitMargin));

        int[] sortedElement = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(checkTheTargetElement(10,sortedElement));

    }

}
