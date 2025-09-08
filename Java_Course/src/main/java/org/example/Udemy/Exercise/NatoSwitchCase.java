package main.java.org.example.Udemy.Exercise;

public class NatoSwitchCase {

    public static void main(String[] args) {
        System.out.println(natoAlphabets('A'));
        System.out.println(yieldNatoAlphabets('B'));
    }

    public static String natoAlphabets(char character){
        switch (character){
            case 'A':
                return "Able";
            case 'B':
                return  "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not Found";
        }
    }

    /**
     * Yield way of returning value using switch
     */
    public static String yieldNatoAlphabets(char character){
        return switch (character){
            case 'A' -> { yield "Able";}
            case 'B' -> { yield "Baker";}
            case 'C' -> {yield "Charlie";}
            case 'D' -> {yield "Dog";}
            case 'E' -> {yield "Easy";}
            default -> {
                yield "No Match Found";
            }
        };
    }
}
