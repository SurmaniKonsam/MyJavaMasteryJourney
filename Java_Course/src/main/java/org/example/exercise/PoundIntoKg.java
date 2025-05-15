package main.java.org.example.exercise;

public class PoundIntoKg {
    public double poundIntoKgConversion(double pound){
        return pound*0.4535;
    }

    public static void main(String[] args) {
        PoundIntoKg pound = new PoundIntoKg();
        System.out.println(pound.poundIntoKgConversion(23));
    }
}
