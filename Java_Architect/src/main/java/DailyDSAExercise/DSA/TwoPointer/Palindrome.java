package DailyDSAExercise.DSA.TwoPointer;

public class Palindrome {
    static boolean checkPalindrome(int number){
        String pal = String.valueOf(number);
        String[] split  = pal.split("");
        int left = 0;
        int right = split.length-1;
        while(left<right){
            int leftValue = Integer.parseInt(split[left]);
            int rightValue = Integer.parseInt(split[right]);
            if(leftValue!=rightValue){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 1213;
        System.out.println(checkPalindrome(number));
    }
}
