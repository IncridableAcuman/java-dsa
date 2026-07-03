package com.web.java_dsa.kepuz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModeOfNumbers {
    public static void main(String[] args) {
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
        int element = arr[0];
        int count = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() > count){
                count = entry.getValue();
                element = entry.getKey();
            }
        }
        System.out.println(element);
    }
}
