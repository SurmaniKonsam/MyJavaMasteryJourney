package org.example.thirtyLPAPackage.collection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
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
        HashMapExercise hashMapExercise = new HashMapExercise();
        hashMapExercise.frequencyLetters("Appplleeealelelleiii");
    }
}
