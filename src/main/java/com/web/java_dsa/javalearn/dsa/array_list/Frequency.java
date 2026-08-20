package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        // Frequency hisoblang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : list){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int maxElement = 0;
        int maxCount=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (entry.getValue() > maxCount){
               maxCount = entry.getValue();
               maxElement = entry.getKey();
           }
        }
        System.out.println(maxElement);
    }
}
