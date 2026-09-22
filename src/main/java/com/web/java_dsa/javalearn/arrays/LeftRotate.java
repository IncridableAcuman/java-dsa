package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class LeftRotate {
    public static void leftRotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        for (int i=0;i<k;i++){
            int start = arr[0];
            for (int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = start;
        }
    }
    public static void main(String[] args) {
        // Massivni k pozitsiyaga chapga rotate qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        leftRotate(arr,k);
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
