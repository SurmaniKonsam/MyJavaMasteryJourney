package org.example.thirtyLPAPackage.collection.Streams.Collectors;

import java.util.HashMap;
import java.util.Map;


public class FrequencyWord {
    static int getWordCount(){
        return (int) "Apppplllllleeeee".chars().filter(x->x== 'p').count();
    }

    //using map
    static void countRepeatedLetter(String name,char character){
        Map<Character,Integer> countFreq = new HashMap<>();
        for (char c : name.toLowerCase().toCharArray()) {
            if(c==character){
                countFreq.put(c,countFreq.getOrDefault(c,0)+1);
            }
        }

        System.out.println(countFreq);
    }


    public static void main(String[] args) {
        System.out.println(getWordCount());
        countRepeatedLetter("PAapppplllllleeeee",'p');

    }
}
