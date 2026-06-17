package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakrorlanuvchiElementlar {
    public static void main(String[] args) {
//        Massivdagi takrorlanuvchi elementlarni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer:arr){
            map.put(integer,map.getOrDefault(integer,0)+1);
        }
        map
                .forEach(
                        (key,value)->{
                            System.out.println("Key=" + key + " Value=" + value);
                        }
                );
        System.out.println("---------");
        Map<Integer,Long> freq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a->a,Collectors.counting()));

        freq
                .forEach(
                        (key,value)->{
                            if (value >=2){
                                System.out.print(key + " ");
                            }
                        }
                );
    }
}
