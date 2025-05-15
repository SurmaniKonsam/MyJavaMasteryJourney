/**
 * Main class where every class gets materialised
 */


public class Main {
    public static void main(String[] args) {
        int base = 5, x = 3;
        System.out.println ("Required Power is " + power (base, x));
        ChildInherit childInherit = new ChildInherit();
        childInherit.tellHobby();
        childInherit.tellName();

    }

    public static int power(int base,int power){
        if (power == 0)     //Base Condition
            return 1;
        return (base * power (base, power - 1));
    }
}