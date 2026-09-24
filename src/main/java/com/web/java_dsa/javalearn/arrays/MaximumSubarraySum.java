package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class MaximumSubarraySum {
    // first way O(n^2) time and O(1) space
    public static int maxSubarraySum(int[] arr){
        int res = arr[0];
        int n = arr.length;
        for (int i=0;i<n;i++){
            int currentSum = 0;
            for (int j=i;j<n;j++){
                currentSum = currentSum + arr[j];

                res = Math.max(res,currentSum);
            }
        }
        return res;
    }
    public static int maxSubarraySumWithKadaneAlgorithm(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];

        for (int j : arr) {
            maxEnding = Math.max(maxEnding + j, j);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        // Massivdagi maksimal subarray yig‘indisini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        // int res = maxSubarraySum(arr); // first way
        int res = maxSubarraySumWithKadaneAlgorithm(arr);
        System.out.print(res);
    }
}
