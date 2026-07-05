package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

public class UzunligiKBulganMaxYigindi {
    public static void main(String[] args) {
        // Uzunligi k bo‘lgan oynadagi maksimal yig‘indini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int windowSum=0;
        int maxSum=0;
        for (int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for (int i=k;i<arr.length;i++){
            windowSum = windowSum - arr[i-k]+arr[i];
            maxSum = Math.max(maxSum,windowSum);
        }
        System.out.println(maxSum);
    }
}
