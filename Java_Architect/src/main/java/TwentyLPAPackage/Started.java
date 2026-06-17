package TwentyLPAPackage;

import java.util.Scanner;

//Date -> 13-03-2026
public class Started {
    /**
     * @param args
     * Learning command line argument -> String[] args
     * String[] args is actually an argument which takes in value from the command line.
     * Example typical command line, command looks like this:
     * java className ValueToBePassed.
     * The "valueToBePassed" is actually the value which shall be referenced via args[0] or in layman term
     * args[0] value will be equal to "valueToBePassed".
     * But intellij gets us other option to test the working principle of String[] args.
     * For you to pass in value from the command line, you can go to editConfiguration -> then go to
     * "Program Arguments" -> Pass in your value, the value to be passed will be separated into array index
     * depending upon how many value have you passed
     * Eg if the Program Arguments value is : Hi I Am Backend Expert
     * We would have:
     * args[0] = Hi, args[1] = I, args[2] = Am, args[3] = Backend, args[4] = Expert.
     * System.out.println(args[0]) = Hi
     * That's how String[] args works.
     * And also, The JVM requires the exact method signature to identify the entry point of the program.
     * Which is "public static void main(String[] args) -> without this the jvm won't run.
     * Without these the jvm will say : Main method not found
     */
    public static void main(String[] args){
        System.out.println("what is the value inside : "+args[0]);
        Scanner enterValue = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = enterValue.nextInt();
        /**
         * Switch case are used only for constant value with the switch block like
         * switch(number or char){
         * case 1:
         * return or sout
         * case 2:
         * return or sout
         * defaut:
         * return or sout
         * As you can see 1,2,3 etc are all constant.
         */
        switch (number){
            case 2:
                System.out.println("2");
                return;
            default:
                System.out.println("Is Not 2");
        }
    }
}
