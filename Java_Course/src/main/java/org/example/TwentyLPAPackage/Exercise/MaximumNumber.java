package org.example.TwentyLPAPackage.Exercise;

import java.util.Scanner;

//simple method created.
public class MaximumNumber {
    void findMaximumBetweenThreeNumber(int a,int b,int c){
        int max = 0;
        if(a>max){
            max = a;
        }if(b>max){
            max = b;
        }if(c>max){
            max = c;
        }
        System.out.println("Maximum number out of the three : "+max);
    }

    //solve via array
    static void findMaxArray(int[] arr){
        int max = 0;
        for(int val : arr){
            max = Math.max(max,val);
        }
        System.out.println("Maximum value out of the array : "+max);
    }

    //reverse a number
    static void reverseNumber(int number){
        int rev = 0;
        String myNumber = "";
        int reverse = 0;
        /*
        while(number>0){
            rev = (number%10);
            myNumber = myNumber.concat(String.valueOf(rev));
            number = number/10;
        }
         */
        while(number>0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number = number/10;
        }
        //System.out.println("rev count : "+rev);
        System.out.println("reverse : "+reverse);
        //System.out.println(myNumber);

    }

    //study this using stack to heap reference.
    static void swapNumber(int a,int b){
        System.out.println("entered number a: "+a+" b : "+b);
        //awesome concept.
        //if a = 12
        //b = 23
        //temp = a  → copies the value of a.
        /*
        a = 13
        b = a;
        c = b;
        d = c;
        b,c and d will have the copy value of a.
        means now b,c and d will have the value of a.
        if 'a' is changed, suppose changed to 23;
        then b,c and d value will remain intact.
        eg:
        a = 23;
        b = 13;
        c = 13;
        d = 13; //because b,c and d have the copied value of a.
         */
        int temp = a;
        a = b;
        System.out.println("temp : "+temp);
        b = temp;
        System.out.println(a+" "+b);
    }

    static void printFibonacciUsingArray(int numberOfTimes){
        int[] fiboArray = new int[numberOfTimes];
        for(int i = 0;i<numberOfTimes;i++){
            //System.out.print(i+" ");
            fiboArray[i] = i;
            if(i>1){
                int previousVal = fiboArray[i-2];
                int later = fiboArray[i-1];
                fiboArray[i] = previousVal + later;
            }
        }
        for (int a : fiboArray){
            System.out.print(a+" ");
        }
    }

    //without use of array
    static void printFibonacci(int numberTimes){
        /*
        Fibonacci expression
        -> fibonacciSeries[i-1]
        -> fibonacciSeries[i-2]
         */
        int a = 0; //n-1
        int b = 1; //n-2 -> both shall apply only after the first value is printed.
        for (int i = 0;i<numberTimes;i++){
            System.out.print(a+" ");
            int next = a + b; // 1 2
            a = b;
            //algorithm -> "get next, slide forward, compute again"
            b = next; //[a,b] -> print first 'a' ->  move forward -> [b,next] : next is computed before.
        }

    }

    //print armstrong
    static void printArmstrong(int number){
        int digitSquareSumNumber = 0;
        String power = String.valueOf(number);
        int armstrongPower = power.length();
        while(number>0){
            int rem = number%10;
            digitSquareSumNumber = digitSquareSumNumber+(int)Math.pow(rem,armstrongPower);
            number = number/10;
        }
        System.out.println("armstrong number : "+digitSquareSumNumber);
    }



    //another way to pass array as argument (int ...arr)
    static void findMax(int ...arr){
        int max = 0;
        for(int rd : arr){
            max = Math.max(max,rd);
        }
        System.out.println("Max value is : "+max);

    }

    static void countDigitsOfNumber(int number){
        int countDigits = 0;
        while(number%10 != 0){
            number = number%10;
            countDigits++;
        }
        System.out.println("digits count : :"+countDigits);

    }

    //print armstrong number


    public static void main(String[] args) {
        //System.out.println("Please enter your three number");
        //Scanner tk = new Scanner(System.in);
        //int a = tk.nextInt();
        //int b = tk.nextInt();
        //int c = tk.nextInt();
        //MaximumNumber maximumNumber = new MaximumNumber();
        //maximumNumber.findMaximumBetweenThreeNumber(a,b,c);

        int[] num = {90,323,1,432,23,53,1212};
        //findMaxArray(num);

        //System.out.println(Math.addExact(2,4));

        //printFibonacci(9);
        //printFibbo(9);
        //countDigitsOfNumber(345);
        System.out.println();
        //System.out.println("value : "+1224332/10);
        //reverseNumber(12345);
        //swapNumber(12,23);

        int[] findMax = {12,435,23,123,3,22,1212,9999};
        //findMax(findMax);

        //printFibonacciUsingArray(9);
        printFibonacci(9);
        //printArmstrong(1634);
    }
}
