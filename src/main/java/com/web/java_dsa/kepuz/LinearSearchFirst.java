package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class LinearSearchFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
