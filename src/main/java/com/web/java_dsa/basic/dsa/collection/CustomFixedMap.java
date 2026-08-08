package com.web.java_dsa.basic.dsa.collection;

import java.util.*;

public class CustomFixedMap<K,V> extends AbstractMap<K,V> {
    Map<K,V> map = new HashMap<>();

    @Override
    public Set<Map.Entry<K,V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public V put(K key, V value){
        return map.put(key, value);
    }

    public static void main(String[] args) {
        CustomFixedMap<Integer,Integer> customFixedMap = new CustomFixedMap<>();
        customFixedMap.put(1,100);
        customFixedMap.put(2,200);
        for (Map.Entry<Integer,Integer> entry : customFixedMap.entrySet()){
            System.out.println("Key=" + entry.getKey() + " <-> " + "Value=" + entry.getValue());
        }
    }
}
