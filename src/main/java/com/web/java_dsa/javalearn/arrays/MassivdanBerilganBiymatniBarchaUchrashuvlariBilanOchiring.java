package com.web.java_dsa.javalearn.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MassivdanBerilganBiymatniBarchaUchrashuvlariBilanOchiring {
    public static void main(String[] args) {
        // Massivdan berilgan qiymatni barcha uchrashuvlari bilan o‘chiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer : arr){
            map.put(integer,map.getOrDefault(integer,0) + 1);
        }
        map
                .entrySet()
                .removeIf(entry-> entry.getKey() == k);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
    }
}
