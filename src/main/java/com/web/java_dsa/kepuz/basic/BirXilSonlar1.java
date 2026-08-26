package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class BirXilSonlar1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/1453
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }
        int count=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i<j && arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
