package org.example.thirtyLPAPackage.exercise;

public class FibonacciSeriesTest {
    static void FibonacciPrint(int numberOfTimes) {
        int a = 0;
        int b = 1;
        int countTimes = 0;
        while (countTimes < numberOfTimes) {
            System.out.print(a + "|");
            int nxt = Math.addExact(a, b);
            a = b;
            b = nxt;
            countTimes++;
        }
    }
    public static void main(String[] args){
        FibonacciPrint(9);
    }
}
