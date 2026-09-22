package com.web.java_dsa.javalearn.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingElements {
    public static void nonRepeatingElements(int[] arr){
        int max=arr[0];
        for (Integer integer : arr){
            if (integer > max){
                max = integer;
            }
        }

        int[] counterArr = new int[max + 1];
        for (int j : arr) {
            counterArr[j]++;
        }
        for (int j : arr) {
            if (counterArr[j] == 1) {
                System.out.print(j + " ");
            }
        }
    }
    public static void main(String[] args) {
        // Takrorlanmaydigan elementlarni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        /*
        // first way with Map
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer integer : arr){
            map.put(integer,map.getOrDefault(integer,0) + 1);
        }
        map
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue() == 1)
                .forEach(entry-> System.out.println(entry.getKey() + " "));

         */
        //second way
        nonRepeatingElements(arr);
    }
}
