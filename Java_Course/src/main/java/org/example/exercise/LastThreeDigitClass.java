package main.java.org.example.exercise;

public class LastThreeDigitClass {
    public static int returnLastThreeDigit(double value){
        double lowerRoundedValue = Math.round(value)*1000;
        int lowerRoundValueCasted = (int)lowerRoundedValue;

        //now get the upper value
        double upperRoundedValue = Math.abs(value*1000);
        int upperRoundedValueCasted = (int)upperRoundedValue;
        return upperRoundedValueCasted - lowerRoundValueCasted;

    }

    public static void main(String[] args) {
        System.out.println(returnLastThreeDigit(3.1756));
        System.out.println(Math.round(3.13234%10));
    }
}
