package com.web.java_dsa.basic.dsa.algorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            int min_idx = i;
            for (int j=i+1;j<n;j++){
                if (arr[j] < arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }

    public static void main(String[] args) {
        //     Selection Sort.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        selectionSort(arr);
        for (int x : arr){
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
