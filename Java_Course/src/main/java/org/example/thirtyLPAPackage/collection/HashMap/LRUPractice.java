package org.example.thirtyLPAPackage.collection.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCachingPractice<K,V> extends LinkedHashMap<K,V>{
    private final int capacity;
    LRUCachingPractice(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }
}


public class LRUPractice {
    public static void main(String[] args) {
        LRUCachingPractice<String,Integer> lruCache = new LRUCachingPractice<>(4);
        lruCache.put("K",12);
        lruCache.put("B",34);
        lruCache.put("L",1);
        lruCache.put("A",162);
        lruCache.put("C",11);

        lruCache.computeIfAbsent("N",(x)->{
            if(lruCache.containsKey(x)){
                return 123;
            }return lruCache.get(x);
        });

        for(Map.Entry<String,Integer> mp : lruCache.entrySet()){
            System.out.println(mp.getKey()+" | "+mp.getValue());
        }


    }
}
