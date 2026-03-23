package org.example.TwentyLPAPackage.Exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedLetters {

    //Stream version
    static void repeatedLettersStreamVersion(String word){
        word = word.toLowerCase();
        Map<Character, Long> freq =
                word.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                Collectors.counting()
                        ));
        System.out.println(freq);
    }


    static void removeDuplicates(int[] arr){
        int write = 0;
        int repeatCounts = 0;
        for(int i = 0;i< arr.length;i++){
            boolean catchDups = false;
            for(int j = 0;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    catchDups = true;
                    repeatCounts++;
                    //break;
                }
            }
            if(!catchDups){
                arr[write] = arr[i];
                System.out.println("el : "+arr[i]+" : repeat counts : "+repeatCounts);
                write++;
            }
        }
        for(int i = 0;i<write;i++){
            System.out.print(arr[i]);
        }
    }

    static void repeatedLettersUsingArray() {
        char[] intoCharArray = "Pppppprogrammiiiiiiing".toLowerCase().toCharArray();
        ArrayList<String> arList = new ArrayList<>();
        for (int i = 0; i < intoCharArray.length; i++) {
            //Check if already processed
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (intoCharArray[i] == intoCharArray[k]) {
                    alreadyProcessed = true;
                    break;
                }
            }
            if (alreadyProcessed) continue;
            int countRepetition = 1; // include itself
            for (int j = i + 1; j < intoCharArray.length; j++) {
                if (intoCharArray[i] == intoCharArray[j]) {
                    countRepetition++;
                }
            }
            arList.add(intoCharArray[i] + " : Repeated : " + countRepetition + " times | ");
        }
        arList.forEach(System.out::print);
    }

    public static void main(String[] args) {
       repeatedLettersStreamVersion("Pppppprogrammiiiiiiing");
       //repeatedLettersUsingArray();
        int[] arr = {1,1,1,2,3,3,4,5,5,7,8,9};
        removeDuplicates(arr);
    }
}
