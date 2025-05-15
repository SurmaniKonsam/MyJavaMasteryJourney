package main.java.org.example.concepts;

public class StringConcepts {
    String myName = "Surmani konsam";
    String random = "Bournvita";
    int add = 234;

    public void stringOperations(){
        System.out.println("My name is "+myName);
        String fetch = random.substring(3);
        String trimString = myName.trim();
        System.out.println(fetch);
        System.out.println("trimmed :"+trimString);
        String concatenateStringNumber = random+add;
        System.out.println(concatenateStringNumber);
    }

    public static void main(String[] args) {
        StringConcepts stringConcepts = new StringConcepts();
        stringConcepts.stringOperations();
    }
}
