package com.web.java_dsa.javalearn.advanced.collections;

import java.util.*;

public class AscendingHashMapElments {
    public static void main(String[] args) {
        // 31. HashMap ichidagi barcha elementlarni qiymati bo‘yicha ascending tartibda chiqaring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=1;i<=n;i++){
            map.put(i,arr[i]);
        }
        map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach((entry)-> System.out.println("Key: " + entry.getKey() +
                        " - Value: " + entry.getValue()));
    }
}
