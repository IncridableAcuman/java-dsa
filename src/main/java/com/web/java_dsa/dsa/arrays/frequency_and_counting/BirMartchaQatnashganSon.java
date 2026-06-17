package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirMartchaQatnashganSon {
    public static void main(String[] args) {
//        Faqat bir marta qatnashgan elementlarni chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer : arr){
            map.put(integer,map.getOrDefault(integer,0)+1);
        }
        int singleElement = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() == 1){
                singleElement = entry.getKey();
            }
        }
        System.out.println(singleElement);
    }
}
