package com.web.java_dsa.dsa.arrays.frequency_and_counting;

import java.util.Scanner;

public class BirXilElementlarKetmaKetligi {
    public static void main(String[] args) {
//        Bir xil elementlar ketma-ket necha marta kelganini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int maxStreak = 1;
        int currentStreak = 1;
        int element = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] == arr[i-1]){
                currentStreak++;
            } else {
                if (currentStreak > maxStreak){
                    maxStreak = currentStreak;
                    element = arr[i-1];
                }
                currentStreak=1;
            }
        }
        if (currentStreak > maxStreak){
            maxStreak = currentStreak;
            element = arr[arr.length - 1];
        }
        System.out.println(element);
    }
}
