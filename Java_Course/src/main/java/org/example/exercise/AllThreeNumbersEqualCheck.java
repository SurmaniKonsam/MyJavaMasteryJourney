package main.java.org.example.exercise;

public class AllThreeNumbersEqualCheck {
    public static void printEqual(int a,int b,int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }else{
            if(b == c && c == a){
                System.out.println("All numbers are equal");
            }else if(a == b || c == a || b == c){
                System.out.println("Neither all are equal or different");
            }else{
                System.out.println("All numbers are different");
            }
        }
    }

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,-1);
        printEqual(1,1,0);
        printEqual(1,2,0);
        printEqual(1,2,1);
        printEqual(2,1,1);

    }
}
