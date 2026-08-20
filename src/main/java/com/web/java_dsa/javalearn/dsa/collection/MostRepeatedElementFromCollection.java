package com.web.java_dsa.javalearn.dsa.collection;

import java.util.*;

public class MostRepeatedElementFromCollection {
    public static void main(String[] args) {
        // Collection ichida eng ko'p takrorlangan elementni topish.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<Integer> collection = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            collection.add(element);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int element : collection){
            map.put(element,map.getOrDefault(element,0) + 1);
        }
        int maxElement = -1;
        int maxCount = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println(maxElement);
    }
}
