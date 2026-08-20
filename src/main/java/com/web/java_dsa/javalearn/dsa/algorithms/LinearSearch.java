package com.web.java_dsa.javalearn.dsa.algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //     Linear Search.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        scanner.close();
    }
}
