package org.example.TwentyLPAPackage.Collection.HashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ConcurrentHashMapPractice {

    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> rdConcurrent = new ConcurrentHashMap<>();
        rdConcurrent.put("K",2);
        rdConcurrent.put("V",21);
        rdConcurrent.put("G",22);
        rdConcurrent.put("A",25);
        rdConcurrent.put("Key",123);


        Function<String,Integer> compute = a -> {
            if(!(rdConcurrent.containsKey(a))){
                return 12;
            }return rdConcurrent.get(a);
        };

        /**
         * “If key is NOT present → compute value and store it
         * If key IS present → return existing value”
         * Thread safe -> Only one thread uses others wait and resuses it.
         */
        rdConcurrent.computeIfAbsent("Key",compute);
        System.out.println(rdConcurrent);
    }
}
