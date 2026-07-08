package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

public class AvgSubarray {
    public static double[] avgSubarrays(int[] arr,int k){
        double[] res = new double[arr.length - k + 1];
        double windowSum=0;
        for (int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        res[0]=windowSum/k;
        for (int i=k;i<arr.length;i++){
            windowSum=windowSum-arr[i-k]+arr[i];
            res[i-k+1]=windowSum/k;
        }
        return res;
    }
    public static void main(String[] args) {
        // Uzunligi k bo‘lgan subarraylarning o‘rtacha qiymatini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        double[] res = avgSubarrays(arr,k);
        for (double re : res) {
            System.out.print(re + " ");
        }
    }
}
