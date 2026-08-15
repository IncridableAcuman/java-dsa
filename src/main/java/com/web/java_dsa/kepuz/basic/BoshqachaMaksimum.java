package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class BoshqachaMaksimum {
    public static void main(String[] args) {
        // https://kep.uz/problems/477
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int element = arr[0];
        for (int i=0;i<n;i++){
            if (arr[i] > element){
                element = arr[i];
            }
        }
        System.out.println(element);
    }
}
