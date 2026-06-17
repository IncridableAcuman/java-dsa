package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DublicateElementlarniUchirish {
    public static void main(String[] args) {
//        Duplicate elementlarni chiqarib tashlang.
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer:arr){
            map.put(integer,map.getOrDefault(integer,0)+1);
        }
        map.entrySet().removeIf(entry->entry.getValue()==2);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
    }
}
