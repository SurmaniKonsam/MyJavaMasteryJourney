package org.example.thirtyLPAPackage.collection.HashMap;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;

    LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }
}


public class LinkedHashMapConcept {
    public static void main(String[] args) {
        LRUCache<Integer,String> lruCache = new LRUCache<>(3);
        lruCache.put(1, "A"); // [1]
        lruCache.put(2, "B"); // [1,2]
        lruCache.put(3, "C"); // [1,2,3]
        lruCache.get(1);      // [2,3,1]
        lruCache.put(4, "D"); // removes 2 → [3,1,4]
        lruCache.get(3);      // [1,4,3]
        lruCache.put(5, "E"); // removes 1 → [4,3,5]
        System.out.println(lruCache); //{4=D, 3=C, 5=E}

    }


}
