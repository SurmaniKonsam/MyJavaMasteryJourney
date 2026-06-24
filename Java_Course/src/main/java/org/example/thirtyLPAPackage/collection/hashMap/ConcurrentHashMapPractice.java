package org.example.thirtyLPAPackage.collection.hashMap;

import java.util.Map;
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

        System.out.println(rdConcurrent.getOrDefault("K",0)+1);

        for(Map.Entry<String,Integer> rd: rdConcurrent.entrySet()){
            System.out.println(rd.getKey()+" | "+rd.getValue());
        }


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
        //System.out.println(rdConcurrent);

        double avg = 123213;
        double placeTwo = avg/100;
        //System.out.println(placeTwo);

    }
}
