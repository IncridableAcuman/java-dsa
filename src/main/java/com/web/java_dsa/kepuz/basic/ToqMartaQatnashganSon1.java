package com.web.java_dsa.kepuz.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ToqMartaQatnashganSon1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/603
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : arr){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int element=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (entry.getValue()%2==1){
               element = entry.getKey();
           }
        }
        System.out.println(element);
    }
}
