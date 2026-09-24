package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class MaxDifference {
    public static int maxDiff(int[] arr){
        int maxDifference = arr[1] - arr[0];
        int minElement = arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i] - minElement > maxDifference){
                maxDifference = arr[i] - minElement;
            }
            if (arr[i] < minElement){
                minElement = arr[i];
            }
        }
        return maxDifference;
    }
    public static void main(String[] args) {
        // Massivdagi maksimal farqni toping: arr[j] - arr[i], j > i.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int res = maxDiff(arr);
        System.out.println(res);
    }
}
