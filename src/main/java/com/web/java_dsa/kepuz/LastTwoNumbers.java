package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class LastTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}
