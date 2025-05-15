package Inheritance.StringAndStringBuilder;

public class StringMethods {

    /** 1
     * indexOf method -> string.indexOf(char character,int indexToSkip,String stringBody);
     * Exception -> What does it mean when the returned index value is "-1".
     * -1 -> It means after the characters have been skipped, it will search for the character in the remaining literals
     * if it's not found it will give you -1, else if found it will give you the index of the character to be searched.
     */
    public static void charIndexFinder(char character,int indexToSkip,String stringBody){
        String s = stringBody;
        int index = s.indexOf(character,indexToSkip);
        System.out.println(index);
    }

    /** 2
     * StringLiteral.split(",");
     * Will split the string into arrays if the string literal have the delimiter defined in the split argument.
     * i.e, (",");
     */
    public static void splitStringLiteral(){
        String literal = "Surmani,Konsam";
        String[] splitLiterals = literal.split(",");
        for (String s : splitLiterals) {
            System.out.println(s);
        }
    }

    /**
     * StringLiteral.Substring(int index); ->
     * Will give you the characters starting from the given index till last index.
     * Be mindful it will exactly give you the characters value from the index value provided in the Substring parameter.
     *
     */
    public static void subString(int index,String literal){
        System.out.println(literal.substring(index));
    }

    /**
     *
     * @param startingIndex
     * @param endIndex
     * @param literal
     * Be mindful, it has its features same as that of the SubString but with an exception, it will return you the
     * characters starting from the starting index until the literal value at "ending_Index -1"
     */
    public static void subStringWithTwoArgument(int startingIndex, int endIndex,String literal){
        System.out.println(literal.substring(startingIndex,endIndex));
    }



    public static void main(String[] args) {
        charIndexFinder('S',5,"Surmani Konsam");
        /**
         * So the output is 12.
         * Why?
         * Because if the index will start from 0 we are having total index of 13 where 'm' being the last digit at 13th index.
         * Hence, 12 because the very first occurrence of 'a' after 5 characters skipped is at index 12.
         */

        splitStringLiteral();

        subString(5,"Surmani Konsam");

        subStringWithTwoArgument(0,4,"Surmani Konsam");

        /**
         * Immutable String
         */

        String val1 = "Karan";
        val1.concat(" change");
        System.out.println(val1);
        val1 = "Arjun";
        System.out.println(val1);





    }
}
