package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarBirElementNechtaMartaQatnashganliginiTopish {
    public static void main(String[] args) {
//        Har bir element necha marta qatnashganini hisoblang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        map
                .forEach(
                        (key,value)-> System.out.println("Key="+key+" Value="+value)
                );
    }
}
