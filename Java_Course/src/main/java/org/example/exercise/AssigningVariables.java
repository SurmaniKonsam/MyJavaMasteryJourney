package main.java.org.example.exercise;

public class AssigningVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("b "+b);
        System.out.println("a "+a);
        /**
         * It means the value is still retained.
         */
        double d = 23L;
        d = (byte) 3;
        System.out.println("d :"+d);
    }
}
