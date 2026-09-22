package com.web.java_dsa.javalearn.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ANumberThatAppearsOnce {
    public static void main(String[] args) {
        // Massivda faqat bir marta uchraydigan elementni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer : arr){
            map.put(integer,map.getOrDefault(integer,0) + 1);
        }
        /* // first way
        int element = arr[0];
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                element = entry.getKey();
            }
        }
        System.out.println(element);

         */
        // second way
        map
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue() == 1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
