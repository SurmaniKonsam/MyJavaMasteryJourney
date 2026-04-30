package org.example.DailyDSAExercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyQuestion {
    void enterWord(String word){
        char[] intoChar = word.toCharArray();
        Map<Character,Integer> countFrequency = new HashMap<>();

        int max = 0;
        for(Character chr : intoChar){
            //System.out.print(chr+" ");
            //String key = String.valueOf(chr).toLowerCase();
            int count = countFrequency.getOrDefault(chr,0)+1;
            countFrequency.put(chr,count);
            if (count > max) max = count;
        }

        final int compare = max;
        /**
         * How to get the key which fulfills the given predicate up in the filter.
         * entrySet() -> can be reduced to key and value.
         */
       countFrequency.entrySet().stream()
               .filter(x ->x.getValue() == compare )
               .forEach(x -> System.out.println(x.getKey()+" maximum iteration : "+x.getValue()));

    }

    public static void main(String[] args) {
        FrequencyQuestion frequencyQuestion = new FrequencyQuestion();
        frequencyQuestion.enterWord("Appllleeeeaaaaaalllllllaaaaaaaaa");
    }
}
