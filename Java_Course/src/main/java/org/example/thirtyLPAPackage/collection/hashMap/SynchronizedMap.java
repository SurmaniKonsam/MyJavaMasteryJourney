package org.example.thirtyLPAPackage.collection.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("A",10);
        mp.put("B",20);
        mp.put("C",20);
        mp.put("D",20);
        mp.put("E",20);

        new Thread(()->mp.put("A",12)).start();
        new Thread(()-> mp.put("A",23)).start();
        new Thread(()-> mp.put("A",253)).start();

        for(Map.Entry<String,Integer> e: mp.entrySet()){
            //System.out.println(e.getKey()+" | "+e.getValue());
        }

        System.out.println("*****************************");


        /*
        synchronized (mp) {
            for(Map.Entry<String,Integer> e: mp.entrySet()){
                //System.out.println(e.getKey()+" | "+e.getValue());
            }
        }
        */

        Map<String,Integer> syncMp;
        syncMp = Collections.synchronizedMap(mp); //Single global lock

        /**
         * This is the classic race condition that we learnt about.
         * Three threads are competing with each other to do write operation on one key.
         * So, if there is a competition there could be a danger of data corruption.
         * Hence, concept of map locking or synchronized map comes into pictures, which
         * locks the map for one thread at one time for its write operation to execute preventing
         * data corruption.
         * The locking of the map is random, but it does so for only one thread in one time
         * Therefor we are seeing A value gets changed to 23, 253 randomly with each run operation.
         */
        new Thread(()->syncMp.put("A",12)).start();
        new Thread(()-> syncMp.put("A",23)).start();
        new Thread(()-> syncMp.put("A",253)).start();


        /**
         * Iteration for synchronized map is still unsafe, why?
         * Because, Collections.syncrhonizedMap prevents or locks write operation, but not iteration. So,
         * Iteration is still unsafe.
         * For iteration to be safe, requires manual synchronization
         */
        for(Map.Entry<String,Integer> rd: syncMp.entrySet()){
            //System.out.println(rd.getKey()+" | "+rd.getValue());
        }

        //How to do manual synchronisation
        synchronized (syncMp){
            for(Map.Entry<String,Integer> rd: syncMp.entrySet()){
                System.out.println("key : "+rd.getKey()+" | value : "+rd.getValue());
            }
            /**
             * That's how we do manual synchronisation.
             */
        }



    }
}
