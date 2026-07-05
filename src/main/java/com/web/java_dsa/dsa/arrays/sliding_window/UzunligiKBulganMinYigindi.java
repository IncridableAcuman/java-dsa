package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

public class UzunligiKBulganMinYigindi {
    //   Uzunligi k bo‘lgan oynadagi minimal yig‘indini toping.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int windowSum=0,minSum;
        for (int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        minSum=windowSum;
        for (int i=k;i<arr.length;i++){
            windowSum = windowSum - arr[i-k]+arr[i];
            minSum = Math.min(minSum,windowSum);
        }
        System.out.println(minSum);
    }
}
