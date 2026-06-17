package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivElementlariUrtachasi {
    public static void main(String[] args) {
//        Massiv elementlarining o‘rtacha qiymatini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}
