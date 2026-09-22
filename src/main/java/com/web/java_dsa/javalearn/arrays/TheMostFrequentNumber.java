package com.web.java_dsa.javalearn.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheMostFrequentNumber {
    public static void main(String[] args) {
        // Massivdagi eng ko‘p uchraydigan elementni toping.
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
        int maxCount = 0,maxElement = arr[0];
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println(maxElement);
    }
}
