package org.example.thirtyLPAPackage.exercise;

import java.util.ArrayList;
import java.util.HashMap;
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
            for(int j = 0;j< write;j++){
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
            System.out.print(arr[i]+"|");
        }
    }

    static void repeatedLettersUsingArray() {
        char[] intoCharArray = "Ppprgriiammoooiiiipppioongaaooo".toLowerCase().toCharArray();
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
            arList.add(intoCharArray[i] + " : Repeated : " + countRepetition);
        }
        arList.forEach(System.out::println);
    }

    //jarvis approach using Map.
    void frequencyLetters(String word) {
        //Until here it's clear.
        Map<Character, Integer> freq = new HashMap<>();
        /**
         * getOrDefault(key,defaultValue);
         * Returns the value mapped to the key if present,
         * otherwise returns the default value you provide.
         */
        for (char ch : word.toLowerCase().toCharArray()) {
            freq.put(ch,
                    freq.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
       //repeatedLettersUsingArray();
       int[] arr = {1,1,1,2,4,5,5,1,1,1,1,8,9,0,0,333,2,2,2,2};
       removeDuplicates(arr);
       String name = "Appleeeinggssshhhssfxkklklklkasaaa";
       RepeatedLetters repeatedLetters = new RepeatedLetters();
       repeatedLetters.frequencyLetters(name);
    }
}
