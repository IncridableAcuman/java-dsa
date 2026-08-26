package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class InversiyalarSoni1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/1296
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }
        int count=0;
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                if (arr[i] > 2 * arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
