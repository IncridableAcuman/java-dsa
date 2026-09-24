package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class PrefixSum {
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        // Massivning prefix sum massivini hosil qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int[] prefix = prefixSum(arr);
        for (int j : prefix){
            System.out.print(j + " ");
        }
    }
}
